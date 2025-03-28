// ============================================================================
//
// Copyright (C) 2022-2023 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.core.ui.webService;

import java.awt.BorderLayout;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Paths;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.channels.Channels;
import java.nio.channels.Pipe;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.cert.CertificateException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509TrustManager;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.HttpEntity;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Display;
import org.talend.core.prefs.ITalendCorePrefConstants;
import org.talend.core.ui.CoreUIPlugin;
import org.talend.utils.json.JSONArray;
import org.talend.utils.json.JSONException;
import org.talend.utils.json.JSONObject;

import java.awt.FlowLayout;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.FileLocator;
import org.osgi.framework.FrameworkUtil;
import javax.swing.*;

public class Webhook {

    private static final Logger LOGGER = Logger.getLogger(Webhook.class);

    private static String deilinkBackUrl = "https://admin.back.deilink.fr:19066";
    private JFrame frame;

    public static HashMap<String, String> export(String fileLocation, String Projet, String Sequenceur, String version, String NexusRepo, IProgressMonitor monitor) {
        IProgressMonitor pMonitor = new NullProgressMonitor();
        if (monitor != null) {
            pMonitor = monitor;
        }

        HashMap<String, String> jobData = null;
        try {
            // Nexus
            if (CoreUIPlugin.getDefault().getPreferenceStore().getBoolean(ITalendCorePrefConstants.WEBHOOK_NEXUS_ENABLED)) {
                pMonitor.setTaskName("Export vers nexus...");
                pMonitor.worked(2);
                nexusPostJob(fileLocation, Projet, Sequenceur, version, NexusRepo);
            }

            // EtlTool
            if (CoreUIPlugin.getDefault().getPreferenceStore().getBoolean(ITalendCorePrefConstants.WEBHOOK_ETLTOOL_ENABLED)) {
                pMonitor.setTaskName("Export vers EtlTool : send file...");
                pMonitor.worked(3);
                sendFile(fileLocation);
                pMonitor.setTaskName("Export vers EtlTool : check archive...");
                pMonitor.worked(4);
                jobData = JobArchiveCheck(fileLocation);
                pMonitor.setTaskName("Export vers EtlTool : deploy job...");
                pMonitor.worked(5);
                Deploy(jobData);
            }

            // Script
            if (CoreUIPlugin.getDefault().getPreferenceStore().getBoolean(ITalendCorePrefConstants.WEBHOOK_SCRIPT_ENABLED)) {
                pMonitor.setTaskName("Export by script...");
                pMonitor.worked(6);
                scriptExport(fileLocation, Projet, Sequenceur, version);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return jobData;
    }

    // EtlTool

    public static Boolean backTest(String backHost, String login, String password) {
        Boolean result = false;
        try {
            String serviceUrl = backHost + "/api/Test/BackTest";
            String finalToken = Login(login, password, backHost);
            if (LOGGER.isInfoEnabled()) {
                LOGGER.info("finalToken: " + finalToken);
            }

            JSONObject paramJson = new JSONObject();
            paramJson.put("app", "Talaxie");

            HttpClient client = getHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(serviceUrl))
                .setHeader("Content-Type","application/json")
                .setHeader("Authorization", "Bearer " + finalToken)
                .POST(HttpRequest.BodyPublishers.ofString(paramJson.toString()))
                .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            JSONObject responseBodyJson = new JSONObject(response.body());
            if (
                responseBodyJson.has("success") &&
                responseBodyJson.getBoolean("success")
            ) {
                result = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            if (LOGGER.isInfoEnabled()) {
                LOGGER.info("backTest error: " + e);
            }
        }

        return result;
    }

    public static String sendFile(String fileLocation) {
        String result = "";
        try {
            String serviceUrl = CoreUIPlugin.getDefault().getPreferenceStore().getString(ITalendCorePrefConstants.WEBHOOK_ETLTOOL_BACK_HOST) + "/upload";
            String finalToken = Login(CoreUIPlugin.getDefault().getPreferenceStore().getString(ITalendCorePrefConstants.WEBHOOK_ETLTOOL_LOGIN), CoreUIPlugin.getDefault().getPreferenceStore().getString(ITalendCorePrefConstants.WEBHOOK_ETLTOOL_PASSWORD), "");
            HttpEntity httpEntity = MultipartEntityBuilder.create()
                .addPart("file", new FileBody(new File(fileLocation)))
                .build();
            Pipe pipe = Pipe.open();
            new Thread(() -> {
                try (OutputStream outputStream = Channels.newOutputStream(pipe.sink())) {
                    httpEntity.writeTo(outputStream);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();
            HttpClient client = getHttpClient();
            HttpRequest request = HttpRequest.newBuilder(new URI(serviceUrl))
                .setHeader("Authorization", "Bearer " + finalToken)
                .header("Content-Type", httpEntity.getContentType().getValue())
                .POST(BodyPublishers.ofInputStream(() -> Channels.newInputStream(pipe.source()))).build();
            HttpResponse<String> responseBody = client.send(request, BodyHandlers.ofString(StandardCharsets.UTF_8));
            result = responseBody.body();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    public static HashMap<String, String> JobArchiveCheck(String fileLocation) {
        HashMap<String, String> jobData = new HashMap<String, String>();
        try {
            String serviceUrl = CoreUIPlugin.getDefault().getPreferenceStore().getString(ITalendCorePrefConstants.WEBHOOK_ETLTOOL_BACK_HOST) + "/api/Job/JobArchiveCheck";
            String finalToken = Login(CoreUIPlugin.getDefault().getPreferenceStore().getString(ITalendCorePrefConstants.WEBHOOK_ETLTOOL_LOGIN), CoreUIPlugin.getDefault().getPreferenceStore().getString(ITalendCorePrefConstants.WEBHOOK_ETLTOOL_PASSWORD), "");
            String fileName = Paths.get(fileLocation).getFileName().toString();

            JSONObject paramJson = new JSONObject();
            paramJson.put("FileName", fileName);

            HttpClient client = getHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(serviceUrl))
                .setHeader("Content-Type","application/json")
                .setHeader("Authorization", "Bearer " + finalToken)
                .POST(HttpRequest.BodyPublishers.ofString(paramJson.toString()))
                .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            JSONObject responseBodyJson = new JSONObject(response.body());
            if (
                responseBodyJson.has("success") &&
                responseBodyJson.getBoolean("success")
            ) {
                jobData.put("Projet", responseBodyJson.getString("Projet"));
                jobData.put("Sequenceur", responseBodyJson.getString("Sequenceur"));
                jobData.put("JobVersion", responseBodyJson.getString("JobVersion"));
                jobData.put("TalendVersion", responseBodyJson.getString("TalendVersion"));
                jobData.put("context", responseBodyJson.getString("context"));
                jobData.put("fileName", fileName);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return jobData;
    }

    public static Boolean Deploy(HashMap<String, String> jobData) {
        Boolean result = false;

        try {
            String serviceUrl = CoreUIPlugin.getDefault().getPreferenceStore().getString(ITalendCorePrefConstants.WEBHOOK_ETLTOOL_BACK_HOST) + "/api/Livraison/Deploy";
            String finalToken = Login(CoreUIPlugin.getDefault().getPreferenceStore().getString(ITalendCorePrefConstants.WEBHOOK_ETLTOOL_LOGIN), CoreUIPlugin.getDefault().getPreferenceStore().getString(ITalendCorePrefConstants.WEBHOOK_ETLTOOL_PASSWORD), "");

            JSONObject paramJson = new JSONObject();
            paramJson.put("FileName", jobData.get("fileName"));
            paramJson.put("Origin", "Temp");
            paramJson.put("Target", "ref_DEV");
            paramJson.put("Projet", jobData.get("Projet"));
            paramJson.put("Sequenceur", jobData.get("Sequenceur"));

            HttpClient client = getHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(serviceUrl))
                .setHeader("Content-Type","application/json")
                .setHeader("Authorization", "Bearer " + finalToken)
                .POST(HttpRequest.BodyPublishers.ofString(paramJson.toString()))
                .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            JSONObject responseBodyJson = new JSONObject(response.body());
            if (
                responseBodyJson.has("success") &&
                responseBodyJson.getBoolean("success")
            ) {
                result = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    public static String getJobUrl(HashMap<String, String> jobData) {
        String jobURL = CoreUIPlugin.getDefault().getPreferenceStore().getString(ITalendCorePrefConstants.WEBHOOK_ETLTOOL_FRONT_HOST) + "/#/Job/View/";
        jobURL += "?Environnement=ref_DEV";
        jobURL += "&Projet=" + jobData.get("Projet");
        jobURL += "&Sequenceur=" + jobData.get("Sequenceur");
        jobURL += "&JobNom=" + jobData.get("Sequenceur");
        return jobURL;
    }

	public static List<HashMap<String, String>> codeReviewAnalyseText(String JobType, String JobName, String xmlText) {
        List<HashMap<String, String>> codereviewItems = new ArrayList<>();

		JSONObject paramJson = new JSONObject();
		try {
			paramJson.put("JobType", JobType);
			paramJson.put("JobName", JobName);
			paramJson.put("xmlText", xmlText);
		} catch (JSONException e) {
			e.printStackTrace();
		}

		try {
            String serviceUrl = CoreUIPlugin.getDefault().getPreferenceStore().getString(ITalendCorePrefConstants.WEBHOOK_ETLTOOL_BACK_HOST) + "/api/Job/CodeReviewAnalyseText";
            String finalToken = Login(CoreUIPlugin.getDefault().getPreferenceStore().getString(ITalendCorePrefConstants.WEBHOOK_ETLTOOL_LOGIN), CoreUIPlugin.getDefault().getPreferenceStore().getString(ITalendCorePrefConstants.WEBHOOK_ETLTOOL_PASSWORD), "");
            HttpClient client = getHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(serviceUrl))
                .setHeader("Content-Type","application/json")
                .setHeader("Authorization", "Bearer " + finalToken)
                .POST(HttpRequest.BodyPublishers.ofString(paramJson.toString()))
                .build();
            HttpResponse<String> response;

			response = client.send(request, HttpResponse.BodyHandlers.ofString());
			JSONObject responseBodyJson = new JSONObject(response.body());
			if (
				responseBodyJson.has("success") &&
				responseBodyJson.getBoolean("success")
			) {
				JSONArray errorList = responseBodyJson.getJSONObject("data").getJSONArray("errorList");
				for (int i = 0; i < errorList.length(); i++) {
					JSONObject error = errorList.getJSONObject(i);
					JSONObject codeReviewRule = error.getJSONObject("CodeReviewRule");
					HashMap<String, String> codereviewItem = new HashMap<String, String>();
					codereviewItem.put("Type", String.valueOf(codeReviewRule.getInt("Type")));
					codereviewItem.put("Titre", codeReviewRule.getString("Titre"));
					codereviewItem.put("Description", codeReviewRule.getString("Description"));
					codereviewItem.put("Url", codeReviewRule.getString("Url"));
					if (error.has("UNIQUE_NAME")) {
						codereviewItem.put("UNIQUE_NAME", error.getString("UNIQUE_NAME"));
					} else {
						codereviewItem.put("UNIQUE_NAME", "");
					}
					if (error.has("componentName")) {
						codereviewItem.put("componentName", error.getString("componentName"));
					} else {
						codereviewItem.put("componentName", "");
					}
					codereviewItems.add(codereviewItem);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return codereviewItems;
	}

	public static List<HashMap<String, String>> projetTree(String Environnement, String Projet, String Type) {
        List<HashMap<String, String>> jobs = new ArrayList<>();

		JSONObject paramJson = new JSONObject();
		try {
			paramJson.put("Environnement", Environnement);
			paramJson.put("Projet", Projet);
			paramJson.put("Type", Type);
		} catch (JSONException e) {
			e.printStackTrace();
		}

		try {
            String serviceUrl = CoreUIPlugin.getDefault().getPreferenceStore().getString(ITalendCorePrefConstants.WEBHOOK_ETLTOOL_BACK_HOST) + "/api/Job/ProjetTree";
            String finalToken = Login(CoreUIPlugin.getDefault().getPreferenceStore().getString(ITalendCorePrefConstants.WEBHOOK_ETLTOOL_LOGIN), CoreUIPlugin.getDefault().getPreferenceStore().getString(ITalendCorePrefConstants.WEBHOOK_ETLTOOL_PASSWORD), "");

            HttpClient client = getHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(serviceUrl))
                .setHeader("Content-Type","application/json")
                .setHeader("Authorization", "Bearer " + finalToken)
                .POST(HttpRequest.BodyPublishers.ofString(paramJson.toString()))
                .build();
            HttpResponse<String> response;

			response = client.send(request, HttpResponse.BodyHandlers.ofString());
			JSONObject responseBodyJson = new JSONObject(response.body());
			if (
				responseBodyJson.has("success") &&
				responseBodyJson.getBoolean("success")
			) {
				JSONArray jobJsons = responseBodyJson.getJSONArray("data");
				for (int i = 0; i < jobJsons.length(); i++) {
					JSONObject jobJson = jobJsons.getJSONObject(i);
					HashMap<String, String> job = new HashMap<String, String>();
					job.put("Sequenceur", jobJson.getString("Sequenceur"));
					job.put("Type", jobJson.getString("Type"));
					jobs.add(job);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
            if (LOGGER.isInfoEnabled()) {
                LOGGER.info("Error projetTree");
                LOGGER.info(e);
            }
		}

		return jobs;
	}

	public static HashMap<String, String> JobArchiveGet(String Environnement, String Projet, String Sequenceur, String Type) {
        HashMap<String, String> job = new HashMap<String, String>();

		JSONObject paramJson = new JSONObject();
		try {
			paramJson.put("Environnement", Environnement);
			paramJson.put("Projet", Projet);
			paramJson.put("Sequenceur", Sequenceur);
			paramJson.put("Type", Type);
		} catch (JSONException e) {
			e.printStackTrace();
		}

		try {
            // Get job inforamtion into EtlTool
            String serviceUrl = CoreUIPlugin.getDefault().getPreferenceStore().getString(ITalendCorePrefConstants.WEBHOOK_ETLTOOL_BACK_HOST) + "/api/Job/JobArchiveGet";
            String finalToken = Login(CoreUIPlugin.getDefault().getPreferenceStore().getString(ITalendCorePrefConstants.WEBHOOK_ETLTOOL_LOGIN), CoreUIPlugin.getDefault().getPreferenceStore().getString(ITalendCorePrefConstants.WEBHOOK_ETLTOOL_PASSWORD), "");
            HttpClient client = getHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(serviceUrl))
                .setHeader("Content-Type","application/json")
                .setHeader("Authorization", "Bearer " + finalToken)
                .POST(HttpRequest.BodyPublishers.ofString(paramJson.toString()))
                .build();
            HttpResponse<String> response;

			response = client.send(request, HttpResponse.BodyHandlers.ofString());
			JSONObject responseBodyJson = new JSONObject(response.body());
			if (
				responseBodyJson.has("success") &&
				responseBodyJson.getBoolean("success")
			) {
				JSONObject jobJson = responseBodyJson.getJSONObject("data");
                job.put("JobLocation", jobJson.getString("JobLocation"));
                job.put("Path", jobJson.getString("Path"));
                job.put("fileUrl", CoreUIPlugin.getDefault().getPreferenceStore().getString(ITalendCorePrefConstants.WEBHOOK_ETLTOOL_BACK_HOST) + "/" + jobJson.getString("Path"));
            }

            // Get job archive
            String fileUrl = job.get("fileUrl");
            String workspaceLocation = ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString();
            String jobZipPath = workspaceLocation + File.separator + Sequenceur + ".zip";
            job.put("jobZipPath", jobZipPath);
            downloadFile(fileUrl, jobZipPath);
        } catch (Exception e) {
            e.printStackTrace();
            if (LOGGER.isInfoEnabled()) {
                LOGGER.info("Error JobArchiveGet");
                LOGGER.info(e);
            }
        }

		return job;
	}

    public static String Login(String login, String password, String backHost) {
        String finalToken = "";

        try {
            if (backHost == null || backHost.trim().isEmpty()) {
                backHost = ITalendCorePrefConstants.WEBHOOK_ETLTOOL_BACK_HOST;
            }

            String serviceUrl = CoreUIPlugin.getDefault().getPreferenceStore().getString(ITalendCorePrefConstants.WEBHOOK_ETLTOOL_BACK_HOST) + "/api/User/Login";

            JSONObject paramJson = new JSONObject();
            paramJson.put("username", login);
            paramJson.put("password", password);

            HttpClient client = getHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(serviceUrl))
                .setHeader("Content-Type","application/json")
                .setHeader("Authorization", "Bearer " + finalToken)
                .POST(HttpRequest.BodyPublishers.ofString(paramJson.toString()))
                .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            JSONObject responseBodyJson = new JSONObject(response.body());
            if (
                responseBodyJson.has("success") &&
                responseBodyJson.getBoolean("success")
            ) {
                finalToken = responseBodyJson.getString("Token");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return finalToken;
    }

    // Nexus

	public static List<HashMap<String, String>> nexusGetItems() {
        List<HashMap<String, String>> items = new ArrayList<>();

        String serviceUrl = CoreUIPlugin.getDefault().getPreferenceStore().getString(ITalendCorePrefConstants.WEBHOOK_NEXUS_HOST) + "/service/rest/v1/components";
        serviceUrl += "?repository=" + CoreUIPlugin.getDefault().getPreferenceStore().getString(ITalendCorePrefConstants.WEBHOOK_NEXUS_RELEASE_REPO);

        if (LOGGER.isInfoEnabled()) {
            LOGGER.info("serviceUrl");
            LOGGER.info(serviceUrl);
        }

		try {
            String continuationToken = nexusGetItems(serviceUrl, items);
            while (!continuationToken.equals("")) {  
                continuationToken = nexusGetItems(serviceUrl + "&continuationToken=" + continuationToken, items);
            }
		} catch (Exception e) {
			e.printStackTrace();
            if (LOGGER.isInfoEnabled()) {
                LOGGER.info("Error nexusGetItems");
                LOGGER.info(e);
            }
		}

        if (LOGGER.isInfoEnabled()) {
            LOGGER.info("items");
            LOGGER.info(items);
        }

		return items;
	}

    public static String nexusGetItems(String serviceUrl, List<HashMap<String, String>> items) {
        String continuationToken = "";
        try {
            String groupId = CoreUIPlugin.getDefault().getPreferenceStore().getString(ITalendCorePrefConstants.WEBHOOK_NEXUS_GROUP_ID);
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(serviceUrl))
                .GET()
                .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String body = response.body().replace("\"blobCreated\" : null,", "");
            JSONObject responseBodyJson = new JSONObject(body);

            if (responseBodyJson.has("items")) {
            JSONArray itemJsons = responseBodyJson.getJSONArray("items");
            for (int i = 0; i < itemJsons.length(); i++) {
                JSONObject itemJson = itemJsons.getJSONObject(i);
                if (
                    !itemJson.has("group") ||
                    !itemJson.getString("group").equals(groupId)
                ) {
                continue;
                }
                JSONObject assetZipJson = null;
                if (itemJson.has("assets")) {
                JSONArray assetJsons = itemJson.getJSONArray("assets");
                for (int j = 0; j < assetJsons.length(); j++) {
                    JSONObject assetJson = assetJsons.getJSONObject(j);
                    String downloadUrl = assetJson.getString("downloadUrl");
                    if (downloadUrl.toLowerCase().endsWith(".zip")) {
                        assetZipJson = assetJson;
                    }
                }
                }
                if (assetZipJson != null) {
                HashMap<String, String> item = new HashMap<String, String>();
                item.put("id", itemJson.getString("id"));
                item.put("Sequenceur", itemJson.getString("name"));
                item.put("group", itemJson.getString("group"));
                item.put("version", itemJson.getString("version"));
                item.put("name", itemJson.getString("name"));
                item.put("repository", itemJson.getString("repository"));
                item.put("format", itemJson.getString("format"));
                item.put("fileSize", String.valueOf(assetZipJson.getInt("fileSize")));
                item.put("downloadUrl", assetZipJson.getString("downloadUrl"));
                item.put("lastModified", assetZipJson.getString("lastModified"));
                items.add(item);
                }
            }
            }

            if (responseBodyJson.has("continuationToken")) {
            continuationToken = responseBodyJson.getString("continuationToken");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return continuationToken;
    }

    public static void nexusPostJob(String fileLocation, String Projet, String Sequenceur, String version, String NexusRepo) {
        try {
            String serviceUrl = CoreUIPlugin.getDefault().getPreferenceStore().getString(ITalendCorePrefConstants.WEBHOOK_NEXUS_HOST) + "/service/rest/v1/components";
            if (NexusRepo.equals("Snapshot")) {
                serviceUrl += "?repository=" + CoreUIPlugin.getDefault().getPreferenceStore().getString(ITalendCorePrefConstants.WEBHOOK_NEXUS_SNAPSHOT_REPO);
            } else {
                serviceUrl += "?repository=" + CoreUIPlugin.getDefault().getPreferenceStore().getString(ITalendCorePrefConstants.WEBHOOK_NEXUS_RELEASE_REPO);
            }
            String username = CoreUIPlugin.getDefault().getPreferenceStore().getString(ITalendCorePrefConstants.WEBHOOK_NEXUS_LOGIN);
            String password = CoreUIPlugin.getDefault().getPreferenceStore().getString(ITalendCorePrefConstants.WEBHOOK_NEXUS_PASSWORD);
            String credential = new String(Base64.getEncoder().encode((username + ":" + password).getBytes()));
            String groupId = CoreUIPlugin.getDefault().getPreferenceStore().getString(ITalendCorePrefConstants.WEBHOOK_NEXUS_GROUP_ID);

            // Construire le corps de la requête multipart/form-data
            java.nio.file.Path filePath = java.nio.file.Paths.get(fileLocation);
            byte[] fileBytes = java.nio.file.Files.readAllBytes(filePath);
            String boundary = "----WebKitFormBoundary" + System.currentTimeMillis();

            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(serviceUrl))
                .header("Content-Type", "multipart/form-data; boundary=" + boundary)
                .header("Authorization", "Basic " + credential)
                .POST(nexusBuildMultipartBody(fileBytes, boundary, Projet, Sequenceur, version, groupId))
                .build();

            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println("statusCode : " + response.statusCode());
            System.out.println("body : " + response.body());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static HttpRequest.BodyPublisher nexusBuildMultipartBody(byte[] fileBytes, String boundary, String Projet, String Sequenceur, String version, String groupId) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        String CRLF = "\r\n";

        // Partie 1 : Fichier
        out.write(("--" + boundary + CRLF).getBytes());
        out.write(("Content-Disposition: form-data; name=\"maven2.asset1\"; filename=\"ETL00_000_Template.zip\"" + CRLF).getBytes());
        out.write(("Content-Type: application/zip" + CRLF + CRLF).getBytes());
        out.write(fileBytes);
        out.write(CRLF.getBytes());

        // Partie 2 : Autres paramètres
        out.write(("--" + boundary + CRLF).getBytes());
        out.write(("Content-Disposition: form-data; name=\"maven2.groupId\"" + CRLF + CRLF).getBytes());
        out.write(groupId.getBytes());
        out.write(CRLF.getBytes());

        out.write(("--" + boundary + CRLF).getBytes());
        out.write(("Content-Disposition: form-data; name=\"maven2.artifactId\"" + CRLF + CRLF).getBytes());
        out.write(Sequenceur.getBytes());
        out.write(CRLF.getBytes());

        out.write(("--" + boundary + CRLF).getBytes());
        out.write(("Content-Disposition: form-data; name=\"maven2.version\"" + CRLF + CRLF).getBytes());
        out.write(version.getBytes());
        out.write(CRLF.getBytes());

        out.write(("--" + boundary + CRLF).getBytes());
        out.write(("Content-Disposition: form-data; name=\"maven2.asset1.extension\"" + CRLF + CRLF).getBytes());
        out.write("zip".getBytes());
        out.write(CRLF.getBytes());

        out.write(("--" + boundary + CRLF).getBytes());
        out.write(("Content-Disposition: form-data; name=\"maven2.generate-pom\"" + CRLF + CRLF).getBytes());
        out.write("true".getBytes());
        out.write((CRLF + "--" + boundary + "--" + CRLF).getBytes());

        return HttpRequest.BodyPublishers.ofByteArray(out.toByteArray());
    }

    public static String nexusArchiveGet(String downloadUrl, String Sequenceur) {
        String jobZipPath = "";
		try {
            String workspaceLocation = ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString();
            jobZipPath = workspaceLocation + File.separator + Sequenceur + ".zip";
            downloadFile(downloadUrl, jobZipPath);
        } catch (Exception e) {
            e.printStackTrace();
            if (LOGGER.isInfoEnabled()) {
                LOGGER.info("Error nexusArchiveGet");
                LOGGER.info(e);
            }
        }
        return jobZipPath;
    }

    // Script

    public static boolean scriptExport(String fileLocation, String Projet, String Sequenceur, String version) {
        String scriptLocation = CoreUIPlugin.getDefault().getPreferenceStore().getString(ITalendCorePrefConstants.WEBHOOK_SCRIPT_BUILD_LOCATION);
        try {
        	List<String> args = new ArrayList<>();
        	args.add(Projet);
        	args.add(Sequenceur);
        	args.add(version);
        	args.add(fileLocation);
            scriptStart(scriptLocation, args);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public static boolean scriptStart(String scriptLocation, List<String> args) {
        try {
            ProcessBuilder pb = new ProcessBuilder(scriptLocation);
            pb.command().addAll(args);
            Process p = pb.start();
            p.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    // Deilink
	public static List<HashMap<String, String>> marketplaceComponents(String search) {
        List<HashMap<String, String>> components = new ArrayList<>();

		try {
            String serviceUrl = deilinkBackUrl + "/api/Marketplace/components";

            JSONObject filterJson = new JSONObject();
            if (search != null && !search.equals("")) {
                filterJson.put("name_LIKE", search);
            }
            JSONObject paramJson = new JSONObject();
            paramJson.put("filter", filterJson);

            HttpClient client = getHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(serviceUrl))
                .setHeader("Content-Type","application/json")
                .POST(HttpRequest.BodyPublishers.ofString(paramJson.toString()))
                .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            JSONObject responseBodyJson = new JSONObject(response.body());
            if (
                responseBodyJson.has("success") &&
                responseBodyJson.getBoolean("success")
            ) {
				JSONArray componentJsons = responseBodyJson.getJSONArray("data");
				for (int i = 0; i < componentJsons.length(); i++) {
					JSONObject componentJson = componentJsons.getJSONObject(i);
					HashMap<String, String> component = new HashMap<String, String>();
					component.put("id", String.valueOf(componentJson.getString("id")));
					component.put("name", componentJson.getString("name"));
					component.put("description", componentJson.getString("description"));
					component.put("version", componentJson.getString("version"));
					component.put("releaseDate", componentJson.getString("releaseDate"));
					component.put("author", componentJson.getString("author"));
					component.put("image", componentJson.getString("image"));
					component.put("origine", componentJson.getString("origine"));
					component.put("url", componentJson.getString("url"));
					component.put("urlZip", componentJson.getString("urlZip"));
					component.put("type", componentJson.getString("type"));
					component.put("urlArchive", componentJson.getString("urlArchive"));
                    components.add(component);
				}
            }
		} catch (Exception e) {
			e.printStackTrace();
            if (LOGGER.isInfoEnabled()) {
                LOGGER.info("Error marketplaceComponents");
                LOGGER.info(e);
            }
		}

		return components;
	}

	public static HashMap<String, String> marketplaceComponentArchiveGet(String id) {
        HashMap<String, String> component = new HashMap<String, String>();

		JSONObject paramJson = new JSONObject();
		try {
			paramJson.put("id", id);
		} catch (JSONException e) {
			e.printStackTrace();
		}

		try {
            String serviceUrl = deilinkBackUrl + "/api/Marketplace/componentArchiveGet";
            HttpClient client = getHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(serviceUrl))
                .setHeader("Content-Type","application/json")
                .POST(HttpRequest.BodyPublishers.ofString(paramJson.toString()))
                .build();
            HttpResponse<String> response;

			response = client.send(request, HttpResponse.BodyHandlers.ofString());
			JSONObject responseBodyJson = new JSONObject(response.body());
			if (
				responseBodyJson.has("success") &&
				responseBodyJson.getBoolean("success")
			) {
				JSONObject componentJson = responseBodyJson.getJSONObject("data");
                component.put("name", componentJson.getString("name"));
                component.put("path", componentJson.getString("path"));
                component.put("fileUrl", deilinkBackUrl + "/" + componentJson.getString("path"));
            }

            // Get component archive
            String fileUrl = component.get("fileUrl");
            String workspaceLocation = ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString();
            String componentZipPath = workspaceLocation + File.separator + component.get("name") + ".zip";
            component.put("componentZipPath", componentZipPath);
            downloadFile(fileUrl, componentZipPath);
        } catch (Exception e) {
            e.printStackTrace();
            if (LOGGER.isInfoEnabled()) {
                LOGGER.info("Error componentArchiveGet");
                LOGGER.info(e);
            }
        }

		return component;
	}

    // Autre

    public static void downloadFile(String fileUrl, String savePath) throws IOException, NoSuchAlgorithmException, KeyManagementException {
        // Désactiver la vérification du certificat SSL
        SSLContext sslContext = SSLContext.getInstance("SSL");
        sslContext.init(null, new TrustManager[]{new X509TrustManager() {
            public X509Certificate[] getAcceptedIssuers() {
                return null;
            }
            public void checkClientTrusted(X509Certificate[] certs, String authType) {
            }

            public void checkServerTrusted(X509Certificate[] certs, String authType) {
            }
        }}, new java.security.SecureRandom());

        HttpsURLConnection.setDefaultSSLSocketFactory(sslContext.getSocketFactory());

        // Télécharger le fichier comme avant
        URL url = new URL(fileUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        try (InputStream in = new BufferedInputStream(connection.getInputStream());
            FileOutputStream out = new FileOutputStream(savePath)) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
        } catch (Exception e) {
            e.printStackTrace();
            if (LOGGER.isInfoEnabled()) {
                LOGGER.info("Error projetTree");
                LOGGER.info(e);
            }
        } finally {
            connection.disconnect();
        }
    }

    public static Image getImageFromWeb(String url, Display display) {
		try {
            // Disable certificate verification
	        TrustManager[] trustAllCerts = new TrustManager[] {
                new X509TrustManager() {
                    public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                        return null;
                    }
                    public void checkClientTrusted(
                        java.security.cert.X509Certificate[] certs, String authType) {
                    }
                    public void checkServerTrusted(
                        java.security.cert.X509Certificate[] certs, String authType) {
                    }
                }
            };

            SSLContext sc = SSLContext.getInstance("SSL");
            sc.init(null, trustAllCerts, new java.security.SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

            // Now you can make the HTTPS connection
            URL imageUrl = new URL(url);
            HttpsURLConnection conn = (HttpsURLConnection) imageUrl.openConnection();
            ImageData imageData = new ImageData(imageUrl.openStream());
            return new Image(display, imageData);
		} catch (Exception e) {
			e.printStackTrace();
		}
        return null;
    }

    public void loadingDialogOpen() {
        /*
		frame = new JFrame("Loading...");
        frame.setIconImage(new ImageIcon(FileLocator.find(FrameworkUtil.getBundle(Webhook.class), new Path("icons/talend-picto-small.png"), null)).getImage());
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setSize(250, 250);
        frame.getContentPane().setBackground(java.awt.Color.WHITE);
        frame.getRootPane().setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(70, 97, 125)));
        frame.setResizable(false);
        frame.setUndecorated(true);
        frame.setLocationRelativeTo(null);
        JLabel gifLabel = new JLabel(new ImageIcon(FileLocator.find(FrameworkUtil.getBundle(Webhook.class), new Path("icons/spinne2.gif"), null)), JLabel.CENTER);
        frame.add(gifLabel, BorderLayout.CENTER);
        JLabel textLabel = new JLabel("wait...");
        textLabel.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(textLabel, BorderLayout.SOUTH);
        textLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 20, 0));
        frame.setVisible(true);
        */
    }

    public void loadingDialogClose() {
        /*
        frame.dispose();
        */
    }

    public static String postTest() {
        String serviceUrl = CoreUIPlugin.getDefault().getPreferenceStore().getString(ITalendCorePrefConstants.WEBHOOK_ETLTOOL_BACK_HOST) + "/api/Test/debug";
        String finalToken = Login(CoreUIPlugin.getDefault().getPreferenceStore().getString(ITalendCorePrefConstants.WEBHOOK_ETLTOOL_LOGIN), CoreUIPlugin.getDefault().getPreferenceStore().getString(ITalendCorePrefConstants.WEBHOOK_ETLTOOL_PASSWORD), "");
        // serviceUrl = "http://localhost:9010/api/Test/debug";
        // finalToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJVc2VySWQiOjEsIklkZW50aWZpYW50IjoiYWRtaW4iLCJQc2V1ZG8iOiJBZG1pbiIsIlJvbGVJZCI6MSwiQWNjZXNzR3JvdXBJRCI6MCwiaWF0IjoxNjk5OTUyODc5fQ.lVK7WoyXE8t_gCYZRrfAXku6R6g_Wu18SI0QPTKjJTI";

        String result = "";
        try {
            HttpClient client = getHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(serviceUrl))
                .setHeader("Content-Type","application/json")
                .setHeader("Authorization", "Bearer " + finalToken)
                .POST(HttpRequest.BodyPublishers.ofString("{\"test\": \"123456azerty\"}"))
                .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("postTest : " + response.statusCode());
            // result = response.body();
            JSONObject responseBodyJson = new JSONObject(response.body());
            if (responseBodyJson.has("data")) {
                result = responseBodyJson.getString("data");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    public static String test() {
      String message = "";
      message += "WEBHOOK_ETLTOOL_FRONT_HOST: " + CoreUIPlugin.getDefault().getPreferenceStore().getString(ITalendCorePrefConstants.WEBHOOK_ETLTOOL_FRONT_HOST) + "\n";
      message += "WEBHOOK_ETLTOOL_BACK_HOST: " + CoreUIPlugin.getDefault().getPreferenceStore().getString(ITalendCorePrefConstants.WEBHOOK_ETLTOOL_BACK_HOST) + "\n";
      message += "WEBHOOK_ETLTOOL_LOGIN: " + CoreUIPlugin.getDefault().getPreferenceStore().getString(ITalendCorePrefConstants.WEBHOOK_ETLTOOL_LOGIN) + "\n";

      return message;
    }

    public static HttpClient getHttpClient() {
        HttpClient client = null;

            try {
            TrustManager[] trustAllCerts = new TrustManager[] {
            new X509TrustManager() {
                public X509Certificate[] getAcceptedIssuers() {
                return null;
                }

                public void checkClientTrusted(X509Certificate[] certs, String authType) {
                }

                public void checkServerTrusted(X509Certificate[] certs, String authType) {
                }
            }
            };

            SSLContext sslContext = SSLContext.getInstance("TLS");
            sslContext.init(null, trustAllCerts, new java.security.SecureRandom());

            client = HttpClient.newBuilder()
                .sslContext(sslContext)
                .build();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return client;
    }
}
