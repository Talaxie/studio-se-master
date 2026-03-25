<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.1"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<xsl:variable name="ucase"
			select="'ABCDEFGHIJKLMNOPQRSTUVWXYZ'" />
		<xsl:variable name="lcase"
			select="'abcdefghijklmnopqrstuvwxyz'" />
		<html>
			<head>
				<title><xsl:value-of select="/project/@i18n.analysis.generated.documetation" /></title>
				<style type="text/css">
					@page { size: letter; } 
					SPAN.special { font:12pt black; } 
					TABLE.properties { width:95%; } 
					TD.propname { width:30%; font:bold; } 
					TR.profont { font:bold; }
					TD.propval { width:70%; } 
					TD.dependtype { width:20%;} 
					TD.dependloc { width:60%; } 
					TABLE.cols {width:90%; } 
					TD.constraint { width:20%; font:bold; }
					H3.hand { cursor:hand; } 
					img.bordercolor {border-color:#AFCA00; } 
					.FONTSTYLE {font-family:Arial, Helvetica, sans-serif;} 
					.LINKSTYLE {TEXT-DECORATION:none}
					a:hover {TEXT-DECORATION:underline}
					.TITLESTYLE {font-size: 26px; color: #818181;}
					.TOPTITLESTYLE {font-size: 40px; color: #818181;}
					.TABLECOLUMNSTYLE {font-family: Arial, Helvetica,sans-serif; color: #818181; background-color:#E6E6E6;align: center} 
					tr {page-break-inside: avoid}
				</style>
			</head>
			<body>
				<br />
				<table border="0" cellspacing="0" width="90%"
					class="FONTSTYLE" summary="Analysis&#160;documentation">
					<tr valign="top">
						<!--<td width="15%" rowspan="2" align="center"></td> -->
						<td  align="center">
							<a href="{project/@link}">
								<img src="{project/@logo}" border="0"
									align="bottom" alt="" />
							</a>
						</td>
						<!-- <td width="1%" rowspan="2" align="center"></td> -->
						<td class="TOPTITLESTYLE">
							<xsl:value-of select="/project/@docType" />
						</td>
					</tr>
					<tr valign="top">
						<td height="20" align="center" valign="top" class="TITLESTYLE">
							<xsl:value-of select="/project/@company" />
						</td>
						<td height="20" align="left" valign="top"
							class="TITLESTYLE">
							<xsl:value-of select="/project/@title" />
						</td>
					</tr>
				</table>
				<br />
				<br />
				<table border="1" width="90%" cellpadding="0"
					cellspacing="0" style="border-collapse: collapse"
					bordercolor="#111111" class="FONTSTYLE" summary="">
					<tr valign="top">
						<td align="center" width="25%"
							class="TABLECOLUMNSTYLE">
							<xsl:value-of select="/project/@i18n.analysis.project.name" />
						</td>
						<td align="center" width="25%"
							class="FONTSTYLE">
							<xsl:value-of select="/project/@name" />
						</td>
						<td align="center" width="25%"
							class="TABLECOLUMNSTYLE">
							<xsl:value-of select="/project/@i18n.analysis.generated.date" />
						</td>
						<td align="center" width="25%">
							<xsl:value-of
								select="/project/@generatedDate" />
						</td>
					</tr>
					<tr>
						<td align="center" width="25%"
							class="TABLECOLUMNSTYLE">
							<xsl:value-of select="/project/@i18n.analysis.author" />
						</td>
						<td align="center" width="25%">
							<xsl:value-of select="/project/@author" />
						</td>
						<td align="center" width="25%"
							class="TABLECOLUMNSTYLE">
							<xsl:value-of
								select="/project/@versionName" />
						</td>
						<td align="center" width="25%"
							class="FONTSTYLE">
							<xsl:value-of select="/project/@version" />
						</td>
					</tr>
				</table>
				<h2 class="FONTSTYLE"><xsl:value-of select="/project/@i18n.analysis.summary" /></h2>
				<div class="FONTSTYLE">
					<b>
						<a href="#ProjectDescription">
							<xsl:value-of select="/project/@i18n.analysis.project.description" />
						</a>
					</b>
				</div>
				<div class="FONTSTYLE">
					<b>
						<a href="#AnalysisPreviewPicture">
							<xsl:value-of select="/project/@i18n.analysis.analysis.preview.picture" />
						</a>
					</b>
				</div>
				<xsl:variable name="analysis" select="/project/analysis" />
				<br />
				<br />
				<!-- Project Description-->
				<!--HR-->
				<h2 class="FONTSTYLE">
					<a name="#ProjectDescription">
						<xsl:value-of select="/project/@i18n.analysis.project.description" />
					</a>
				</h2>
				<br />
				<table border="1" width="90%" class="FONTSTYLE"
					cellpadding="0" cellspacing="0"
					style="border-collapse: collapse; padding-left:10mm;"
					bordercolor="#111111" summary="">
					<tr>
						<th align="left" width="30%"
							class="TABLECOLUMNSTYLE">
							<xsl:value-of select="/project/@i18n.analysis.properties" />
						</th>
						<th align="left" class="TABLECOLUMNSTYLE">
							<xsl:value-of select="/project/@i18n.analysis.values" />
						</th>
					</tr>
					<tr>
						<td class="FONTSTYLE" align="left"><xsl:value-of select="/project/@i18n.analysis.name" /></td>
						<td class="FONTSTYLE" align="left">
							<xsl:value-of select="/project/@name" />
						</td>
					</tr>
					<tr>
						<td class="FONTSTYLE" align="left"><xsl:value-of select="/project/@i18n.analysis.language" /></td>
						<td class="FONTSTYLE" align="left">
							<xsl:value-of select="/project/@language" />
						</td>
					</tr>
					<tr>
						<td class="FONTSTYLE" align="left">
							<xsl:value-of select="/project/@i18n.analysis.description" />
						</td>
						<td class="FONTSTYLE" align="left">
							<pre>
								<xsl:value-of
									select="/project/pro-description" disable-output-escaping="yes" />
							</pre>
						</td>
					</tr>
				</table>
				<br />
				<br />
				<!-- Project Description-->
				<!--HR-->
				<xsl:variable name="analysisPreviewPicture"
					select="$analysis/preview/@picture" />
				<xsl:if test="string-length($analysisPreviewPicture)!=0">
					<h2 class="FONTSTYLE">
						<a name="#AnalysisPreviewPicture">
							<xsl:value-of select="/project/@i18n.analysis.analysis.preview.picture" />
						</a>
					</h2>
					<br />
					<div class="FONTSTYLE" align="center">
						<img src="{$analysisPreviewPicture}" usemap="#analysismap"
							alt="No image available" class="bordercolor" />
							<map id="analysismap" name="analysismap"/>
					</div>
				</xsl:if>
				<br />
				<br />
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>
