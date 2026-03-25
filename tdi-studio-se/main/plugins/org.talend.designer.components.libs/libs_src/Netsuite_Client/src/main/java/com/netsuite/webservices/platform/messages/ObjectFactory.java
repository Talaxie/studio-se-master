
package com.netsuite.webservices.platform.messages;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.netsuite.webservices.platform.core.Passport;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.netsuite.webservices.platform.messages package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ApplicationInfo_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "applicationInfo");
    private final static QName _PartnerInfo_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "partnerInfo");
    private final static QName _DocumentInfo_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "documentInfo");
    private final static QName _Preferences_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "preferences");
    private final static QName _SearchPreferences_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "searchPreferences");
    private final static QName _Passport_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "passport");
    private final static QName _SessionResponse_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "sessionResponse");
    private final static QName _WriteResponse_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "writeResponse");
    private final static QName _ReadResponse_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "readResponse");
    private final static QName _WriteResponseList_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "writeResponseList");
    private final static QName _ReadResponseList_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "readResponseList");
    private final static QName _LoginResponse_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "loginResponse");
    private final static QName _SsoLoginResponse_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "ssoLoginResponse");
    private final static QName _MapSsoResponse_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "mapSsoResponse");
    private final static QName _ChangePasswordResponse_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "changePasswordResponse");
    private final static QName _ChangeEmailResponse_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "changeEmailResponse");
    private final static QName _LogoutResponse_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "logoutResponse");
    private final static QName _AddResponse_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "addResponse");
    private final static QName _AddListResponse_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "addListResponse");
    private final static QName _UpdateResponse_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "updateResponse");
    private final static QName _UpdateListResponse_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "updateListResponse");
    private final static QName _UpsertResponse_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "upsertResponse");
    private final static QName _UpsertListResponse_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "upsertListResponse");
    private final static QName _DeleteResponse_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "deleteResponse");
    private final static QName _DeleteListResponse_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "deleteListResponse");
    private final static QName _SearchResponse_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "searchResponse");
    private final static QName _SearchMoreResponse_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "searchMoreResponse");
    private final static QName _SearchMoreWithIdResponse_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "searchMoreWithIdResponse");
    private final static QName _SearchNextResponse_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "searchNextResponse");
    private final static QName _GetResponse_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "getResponse");
    private final static QName _GetListResponse_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "getListResponse");
    private final static QName _GetAllResponse_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "getAllResponse");
    private final static QName _GetSavedSearchResponse_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "getSavedSearchResponse");
    private final static QName _GetCustomizationIdResponse_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "getCustomizationIdResponse");
    private final static QName _InitializeResponse_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "initializeResponse");
    private final static QName _InitializeListResponse_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "initializeListResponse");
    private final static QName _GetSelectValueResponse_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "getSelectValueResponse");
    private final static QName _GetItemAvailabilityResponse_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "getItemAvailabilityResponse");
    private final static QName _GetBudgetExchangeRateResponse_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "getBudgetExchangeRateResponse");
    private final static QName _GetConsolidatedExchangeRateResponse_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "getConsolidatedExchangeRateResponse");
    private final static QName _GetCurrencyRateResponse_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "getCurrencyRateResponse");
    private final static QName _GetDataCenterUrlsResponse_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "getDataCenterUrlsResponse");
    private final static QName _GetPostingTransactionSummaryResponse_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "getPostingTransactionSummaryResponse");
    private final static QName _GetServerTimeResponse_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "getServerTimeResponse");
    private final static QName _AttachResponse_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "attachResponse");
    private final static QName _DetachResponse_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "detachResponse");
    private final static QName _UpdateInviteeStatusResponse_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "updateInviteeStatusResponse");
    private final static QName _UpdateInviteeStatusListResponse_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "updateInviteeStatusListResponse");
    private final static QName _AsyncAddListResponse_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "asyncAddListResponse");
    private final static QName _AsyncUpdateListResponse_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "asyncUpdateListResponse");
    private final static QName _AsyncUpsertListResponse_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "asyncUpsertListResponse");
    private final static QName _AsyncDeleteListResponse_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "asyncDeleteListResponse");
    private final static QName _AsyncGetListResponse_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "asyncGetListResponse");
    private final static QName _AsyncInitializeListResponse_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "asyncInitializeListResponse");
    private final static QName _AsyncSearchResponse_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "asyncSearchResponse");
    private final static QName _CheckAsyncStatusResponse_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "checkAsyncStatusResponse");
    private final static QName _GetAsyncResultResponse_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "getAsyncResultResponse");
    private final static QName _AsyncResult_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "asyncResult");
    private final static QName _AsyncAddListResult_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "asyncAddListResult");
    private final static QName _AsyncUpdateListResult_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "asyncUpdateListResult");
    private final static QName _AsyncUpsertListResult_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "asyncUpsertListResult");
    private final static QName _AsyncDeleteListResult_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "asyncDeleteListResult");
    private final static QName _AsyncGetListResult_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "asyncGetListResult");
    private final static QName _AsyncInitializeListResult_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "asyncInitializeListResult");
    private final static QName _AsyncSearchResult_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "asyncSearchResult");
    private final static QName _GetDeletedResponse_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "getDeletedResponse");
    private final static QName _Login_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "login");
    private final static QName _SsoLogin_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "ssoLogin");
    private final static QName _MapSso_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "mapSso");
    private final static QName _ChangePassword_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "changePassword");
    private final static QName _ChangeEmail_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "changeEmail");
    private final static QName _Logout_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "logout");
    private final static QName _Add_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "add");
    private final static QName _Delete_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "delete");
    private final static QName _Search_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "search");
    private final static QName _SearchMore_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "searchMore");
    private final static QName _SearchMoreWithId_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "searchMoreWithId");
    private final static QName _SearchNext_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "searchNext");
    private final static QName _Update_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "update");
    private final static QName _Upsert_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "upsert");
    private final static QName _AddList_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "addList");
    private final static QName _DeleteList_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "deleteList");
    private final static QName _UpdateList_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "updateList");
    private final static QName _UpsertList_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "upsertList");
    private final static QName _Get_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "get");
    private final static QName _GetList_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "getList");
    private final static QName _GetAll_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "getAll");
    private final static QName _GetSavedSearch_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "getSavedSearch");
    private final static QName _GetCustomizationId_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "getCustomizationId");
    private final static QName _Initialize_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "initialize");
    private final static QName _InitializeList_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "initializeList");
    private final static QName _GetSelectValue_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "getSelectValue");
    private final static QName _GetItemAvailability_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "getItemAvailability");
    private final static QName _GetBudgetExchangeRate_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "getBudgetExchangeRate");
    private final static QName _GetConsolidatedExchangeRate_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "getConsolidatedExchangeRate");
    private final static QName _GetCurrencyRate_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "getCurrencyRate");
    private final static QName _GetDataCenterUrls_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "getDataCenterUrls");
    private final static QName _GetPostingTransactionSummary_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "getPostingTransactionSummary");
    private final static QName _GetServerTime_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "getServerTime");
    private final static QName _Attach_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "attach");
    private final static QName _Detach_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "detach");
    private final static QName _UpdateInviteeStatus_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "updateInviteeStatus");
    private final static QName _UpdateInviteeStatusList_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "updateInviteeStatusList");
    private final static QName _AsyncAddList_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "asyncAddList");
    private final static QName _AsyncUpdateList_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "asyncUpdateList");
    private final static QName _AsyncUpsertList_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "asyncUpsertList");
    private final static QName _AsyncDeleteList_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "asyncDeleteList");
    private final static QName _AsyncGetList_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "asyncGetList");
    private final static QName _AsyncInitializeList_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "asyncInitializeList");
    private final static QName _AsyncSearch_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "asyncSearch");
    private final static QName _CheckAsyncStatus_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "checkAsyncStatus");
    private final static QName _GetAsyncResult_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "getAsyncResult");
    private final static QName _GetDeleted_QNAME = new QName("urn:messages_2014_2.platform.webservices.netsuite.com", "getDeleted");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.netsuite.webservices.platform.messages
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ApplicationInfo }
     * 
     */
    public ApplicationInfo createApplicationInfo() {
        return new ApplicationInfo();
    }

    /**
     * Create an instance of {@link PartnerInfo }
     * 
     */
    public PartnerInfo createPartnerInfo() {
        return new PartnerInfo();
    }

    /**
     * Create an instance of {@link DocumentInfo }
     * 
     */
    public DocumentInfo createDocumentInfo() {
        return new DocumentInfo();
    }

    /**
     * Create an instance of {@link Preferences }
     * 
     */
    public Preferences createPreferences() {
        return new Preferences();
    }

    /**
     * Create an instance of {@link SearchPreferences }
     * 
     */
    public SearchPreferences createSearchPreferences() {
        return new SearchPreferences();
    }

    /**
     * Create an instance of {@link SessionResponse }
     * 
     */
    public SessionResponse createSessionResponse() {
        return new SessionResponse();
    }

    /**
     * Create an instance of {@link WriteResponse }
     * 
     */
    public WriteResponse createWriteResponse() {
        return new WriteResponse();
    }

    /**
     * Create an instance of {@link ReadResponse }
     * 
     */
    public ReadResponse createReadResponse() {
        return new ReadResponse();
    }

    /**
     * Create an instance of {@link WriteResponseList }
     * 
     */
    public WriteResponseList createWriteResponseList() {
        return new WriteResponseList();
    }

    /**
     * Create an instance of {@link ReadResponseList }
     * 
     */
    public ReadResponseList createReadResponseList() {
        return new ReadResponseList();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link SsoLoginResponse }
     * 
     */
    public SsoLoginResponse createSsoLoginResponse() {
        return new SsoLoginResponse();
    }

    /**
     * Create an instance of {@link MapSsoResponse }
     * 
     */
    public MapSsoResponse createMapSsoResponse() {
        return new MapSsoResponse();
    }

    /**
     * Create an instance of {@link ChangePasswordResponse }
     * 
     */
    public ChangePasswordResponse createChangePasswordResponse() {
        return new ChangePasswordResponse();
    }

    /**
     * Create an instance of {@link ChangeEmailResponse }
     * 
     */
    public ChangeEmailResponse createChangeEmailResponse() {
        return new ChangeEmailResponse();
    }

    /**
     * Create an instance of {@link LogoutResponse }
     * 
     */
    public LogoutResponse createLogoutResponse() {
        return new LogoutResponse();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link AddListResponse }
     * 
     */
    public AddListResponse createAddListResponse() {
        return new AddListResponse();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link UpdateListResponse }
     * 
     */
    public UpdateListResponse createUpdateListResponse() {
        return new UpdateListResponse();
    }

    /**
     * Create an instance of {@link UpsertResponse }
     * 
     */
    public UpsertResponse createUpsertResponse() {
        return new UpsertResponse();
    }

    /**
     * Create an instance of {@link UpsertListResponse }
     * 
     */
    public UpsertListResponse createUpsertListResponse() {
        return new UpsertListResponse();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link DeleteListResponse }
     * 
     */
    public DeleteListResponse createDeleteListResponse() {
        return new DeleteListResponse();
    }

    /**
     * Create an instance of {@link SearchResponse }
     * 
     */
    public SearchResponse createSearchResponse() {
        return new SearchResponse();
    }

    /**
     * Create an instance of {@link SearchMoreResponse }
     * 
     */
    public SearchMoreResponse createSearchMoreResponse() {
        return new SearchMoreResponse();
    }

    /**
     * Create an instance of {@link SearchMoreWithIdResponse }
     * 
     */
    public SearchMoreWithIdResponse createSearchMoreWithIdResponse() {
        return new SearchMoreWithIdResponse();
    }

    /**
     * Create an instance of {@link SearchNextResponse }
     * 
     */
    public SearchNextResponse createSearchNextResponse() {
        return new SearchNextResponse();
    }

    /**
     * Create an instance of {@link GetResponse }
     * 
     */
    public GetResponse createGetResponse() {
        return new GetResponse();
    }

    /**
     * Create an instance of {@link GetListResponse }
     * 
     */
    public GetListResponse createGetListResponse() {
        return new GetListResponse();
    }

    /**
     * Create an instance of {@link GetAllResponse }
     * 
     */
    public GetAllResponse createGetAllResponse() {
        return new GetAllResponse();
    }

    /**
     * Create an instance of {@link GetSavedSearchResponse }
     * 
     */
    public GetSavedSearchResponse createGetSavedSearchResponse() {
        return new GetSavedSearchResponse();
    }

    /**
     * Create an instance of {@link GetCustomizationIdResponse }
     * 
     */
    public GetCustomizationIdResponse createGetCustomizationIdResponse() {
        return new GetCustomizationIdResponse();
    }

    /**
     * Create an instance of {@link InitializeResponse }
     * 
     */
    public InitializeResponse createInitializeResponse() {
        return new InitializeResponse();
    }

    /**
     * Create an instance of {@link InitializeListResponse }
     * 
     */
    public InitializeListResponse createInitializeListResponse() {
        return new InitializeListResponse();
    }

    /**
     * Create an instance of {@link GetSelectValueResponse }
     * 
     */
    public GetSelectValueResponse createGetSelectValueResponse() {
        return new GetSelectValueResponse();
    }

    /**
     * Create an instance of {@link GetItemAvailabilityResponse }
     * 
     */
    public GetItemAvailabilityResponse createGetItemAvailabilityResponse() {
        return new GetItemAvailabilityResponse();
    }

    /**
     * Create an instance of {@link GetBudgetExchangeRateResponse }
     * 
     */
    public GetBudgetExchangeRateResponse createGetBudgetExchangeRateResponse() {
        return new GetBudgetExchangeRateResponse();
    }

    /**
     * Create an instance of {@link GetConsolidatedExchangeRateResponse }
     * 
     */
    public GetConsolidatedExchangeRateResponse createGetConsolidatedExchangeRateResponse() {
        return new GetConsolidatedExchangeRateResponse();
    }

    /**
     * Create an instance of {@link GetCurrencyRateResponse }
     * 
     */
    public GetCurrencyRateResponse createGetCurrencyRateResponse() {
        return new GetCurrencyRateResponse();
    }

    /**
     * Create an instance of {@link GetDataCenterUrlsResponse }
     * 
     */
    public GetDataCenterUrlsResponse createGetDataCenterUrlsResponse() {
        return new GetDataCenterUrlsResponse();
    }

    /**
     * Create an instance of {@link GetPostingTransactionSummaryResponse }
     * 
     */
    public GetPostingTransactionSummaryResponse createGetPostingTransactionSummaryResponse() {
        return new GetPostingTransactionSummaryResponse();
    }

    /**
     * Create an instance of {@link GetServerTimeResponse }
     * 
     */
    public GetServerTimeResponse createGetServerTimeResponse() {
        return new GetServerTimeResponse();
    }

    /**
     * Create an instance of {@link AttachResponse }
     * 
     */
    public AttachResponse createAttachResponse() {
        return new AttachResponse();
    }

    /**
     * Create an instance of {@link DetachResponse }
     * 
     */
    public DetachResponse createDetachResponse() {
        return new DetachResponse();
    }

    /**
     * Create an instance of {@link UpdateInviteeStatusResponse }
     * 
     */
    public UpdateInviteeStatusResponse createUpdateInviteeStatusResponse() {
        return new UpdateInviteeStatusResponse();
    }

    /**
     * Create an instance of {@link UpdateInviteeStatusListResponse }
     * 
     */
    public UpdateInviteeStatusListResponse createUpdateInviteeStatusListResponse() {
        return new UpdateInviteeStatusListResponse();
    }

    /**
     * Create an instance of {@link AsyncStatusResponse }
     * 
     */
    public AsyncStatusResponse createAsyncStatusResponse() {
        return new AsyncStatusResponse();
    }

    /**
     * Create an instance of {@link GetAsyncResultResponse }
     * 
     */
    public GetAsyncResultResponse createGetAsyncResultResponse() {
        return new GetAsyncResultResponse();
    }

    /**
     * Create an instance of {@link AsyncAddListResult }
     * 
     */
    public AsyncAddListResult createAsyncAddListResult() {
        return new AsyncAddListResult();
    }

    /**
     * Create an instance of {@link AsyncUpdateListResult }
     * 
     */
    public AsyncUpdateListResult createAsyncUpdateListResult() {
        return new AsyncUpdateListResult();
    }

    /**
     * Create an instance of {@link AsyncUpsertListResult }
     * 
     */
    public AsyncUpsertListResult createAsyncUpsertListResult() {
        return new AsyncUpsertListResult();
    }

    /**
     * Create an instance of {@link AsyncDeleteListResult }
     * 
     */
    public AsyncDeleteListResult createAsyncDeleteListResult() {
        return new AsyncDeleteListResult();
    }

    /**
     * Create an instance of {@link AsyncGetListResult }
     * 
     */
    public AsyncGetListResult createAsyncGetListResult() {
        return new AsyncGetListResult();
    }

    /**
     * Create an instance of {@link AsyncInitializeListResult }
     * 
     */
    public AsyncInitializeListResult createAsyncInitializeListResult() {
        return new AsyncInitializeListResult();
    }

    /**
     * Create an instance of {@link AsyncSearchResult }
     * 
     */
    public AsyncSearchResult createAsyncSearchResult() {
        return new AsyncSearchResult();
    }

    /**
     * Create an instance of {@link GetDeletedResponse }
     * 
     */
    public GetDeletedResponse createGetDeletedResponse() {
        return new GetDeletedResponse();
    }

    /**
     * Create an instance of {@link LoginRequest }
     * 
     */
    public LoginRequest createLoginRequest() {
        return new LoginRequest();
    }

    /**
     * Create an instance of {@link SsoLoginRequest }
     * 
     */
    public SsoLoginRequest createSsoLoginRequest() {
        return new SsoLoginRequest();
    }

    /**
     * Create an instance of {@link MapSsoRequest }
     * 
     */
    public MapSsoRequest createMapSsoRequest() {
        return new MapSsoRequest();
    }

    /**
     * Create an instance of {@link ChangePasswordRequest }
     * 
     */
    public ChangePasswordRequest createChangePasswordRequest() {
        return new ChangePasswordRequest();
    }

    /**
     * Create an instance of {@link ChangeEmailRequest }
     * 
     */
    public ChangeEmailRequest createChangeEmailRequest() {
        return new ChangeEmailRequest();
    }

    /**
     * Create an instance of {@link LogoutRequest }
     * 
     */
    public LogoutRequest createLogoutRequest() {
        return new LogoutRequest();
    }

    /**
     * Create an instance of {@link AddRequest }
     * 
     */
    public AddRequest createAddRequest() {
        return new AddRequest();
    }

    /**
     * Create an instance of {@link DeleteRequest }
     * 
     */
    public DeleteRequest createDeleteRequest() {
        return new DeleteRequest();
    }

    /**
     * Create an instance of {@link SearchRequest }
     * 
     */
    public SearchRequest createSearchRequest() {
        return new SearchRequest();
    }

    /**
     * Create an instance of {@link SearchMoreRequest }
     * 
     */
    public SearchMoreRequest createSearchMoreRequest() {
        return new SearchMoreRequest();
    }

    /**
     * Create an instance of {@link SearchMoreWithIdRequest }
     * 
     */
    public SearchMoreWithIdRequest createSearchMoreWithIdRequest() {
        return new SearchMoreWithIdRequest();
    }

    /**
     * Create an instance of {@link SearchNextRequest }
     * 
     */
    public SearchNextRequest createSearchNextRequest() {
        return new SearchNextRequest();
    }

    /**
     * Create an instance of {@link UpdateRequest }
     * 
     */
    public UpdateRequest createUpdateRequest() {
        return new UpdateRequest();
    }

    /**
     * Create an instance of {@link UpsertRequest }
     * 
     */
    public UpsertRequest createUpsertRequest() {
        return new UpsertRequest();
    }

    /**
     * Create an instance of {@link AddListRequest }
     * 
     */
    public AddListRequest createAddListRequest() {
        return new AddListRequest();
    }

    /**
     * Create an instance of {@link DeleteListRequest }
     * 
     */
    public DeleteListRequest createDeleteListRequest() {
        return new DeleteListRequest();
    }

    /**
     * Create an instance of {@link UpdateListRequest }
     * 
     */
    public UpdateListRequest createUpdateListRequest() {
        return new UpdateListRequest();
    }

    /**
     * Create an instance of {@link UpsertListRequest }
     * 
     */
    public UpsertListRequest createUpsertListRequest() {
        return new UpsertListRequest();
    }

    /**
     * Create an instance of {@link GetRequest }
     * 
     */
    public GetRequest createGetRequest() {
        return new GetRequest();
    }

    /**
     * Create an instance of {@link GetListRequest }
     * 
     */
    public GetListRequest createGetListRequest() {
        return new GetListRequest();
    }

    /**
     * Create an instance of {@link GetAllRequest }
     * 
     */
    public GetAllRequest createGetAllRequest() {
        return new GetAllRequest();
    }

    /**
     * Create an instance of {@link GetSavedSearchRequest }
     * 
     */
    public GetSavedSearchRequest createGetSavedSearchRequest() {
        return new GetSavedSearchRequest();
    }

    /**
     * Create an instance of {@link GetCustomizationIdRequest }
     * 
     */
    public GetCustomizationIdRequest createGetCustomizationIdRequest() {
        return new GetCustomizationIdRequest();
    }

    /**
     * Create an instance of {@link InitializeRequest }
     * 
     */
    public InitializeRequest createInitializeRequest() {
        return new InitializeRequest();
    }

    /**
     * Create an instance of {@link InitializeListRequest }
     * 
     */
    public InitializeListRequest createInitializeListRequest() {
        return new InitializeListRequest();
    }

    /**
     * Create an instance of {@link GetSelectValueRequest }
     * 
     */
    public GetSelectValueRequest createGetSelectValueRequest() {
        return new GetSelectValueRequest();
    }

    /**
     * Create an instance of {@link GetItemAvailabilityRequest }
     * 
     */
    public GetItemAvailabilityRequest createGetItemAvailabilityRequest() {
        return new GetItemAvailabilityRequest();
    }

    /**
     * Create an instance of {@link GetBudgetExchangeRateRequest }
     * 
     */
    public GetBudgetExchangeRateRequest createGetBudgetExchangeRateRequest() {
        return new GetBudgetExchangeRateRequest();
    }

    /**
     * Create an instance of {@link GetConsolidatedExchangeRateRequest }
     * 
     */
    public GetConsolidatedExchangeRateRequest createGetConsolidatedExchangeRateRequest() {
        return new GetConsolidatedExchangeRateRequest();
    }

    /**
     * Create an instance of {@link GetCurrencyRateRequest }
     * 
     */
    public GetCurrencyRateRequest createGetCurrencyRateRequest() {
        return new GetCurrencyRateRequest();
    }

    /**
     * Create an instance of {@link GetDataCenterUrlsRequest }
     * 
     */
    public GetDataCenterUrlsRequest createGetDataCenterUrlsRequest() {
        return new GetDataCenterUrlsRequest();
    }

    /**
     * Create an instance of {@link GetPostingTransactionSummaryRequest }
     * 
     */
    public GetPostingTransactionSummaryRequest createGetPostingTransactionSummaryRequest() {
        return new GetPostingTransactionSummaryRequest();
    }

    /**
     * Create an instance of {@link GetServerTimeRequest }
     * 
     */
    public GetServerTimeRequest createGetServerTimeRequest() {
        return new GetServerTimeRequest();
    }

    /**
     * Create an instance of {@link AttachRequest }
     * 
     */
    public AttachRequest createAttachRequest() {
        return new AttachRequest();
    }

    /**
     * Create an instance of {@link DetachRequest }
     * 
     */
    public DetachRequest createDetachRequest() {
        return new DetachRequest();
    }

    /**
     * Create an instance of {@link UpdateInviteeStatusRequest }
     * 
     */
    public UpdateInviteeStatusRequest createUpdateInviteeStatusRequest() {
        return new UpdateInviteeStatusRequest();
    }

    /**
     * Create an instance of {@link UpdateInviteeStatusListRequest }
     * 
     */
    public UpdateInviteeStatusListRequest createUpdateInviteeStatusListRequest() {
        return new UpdateInviteeStatusListRequest();
    }

    /**
     * Create an instance of {@link AsyncAddListRequest }
     * 
     */
    public AsyncAddListRequest createAsyncAddListRequest() {
        return new AsyncAddListRequest();
    }

    /**
     * Create an instance of {@link AsyncUpdateListRequest }
     * 
     */
    public AsyncUpdateListRequest createAsyncUpdateListRequest() {
        return new AsyncUpdateListRequest();
    }

    /**
     * Create an instance of {@link AsyncUpsertListRequest }
     * 
     */
    public AsyncUpsertListRequest createAsyncUpsertListRequest() {
        return new AsyncUpsertListRequest();
    }

    /**
     * Create an instance of {@link AsyncDeleteListRequest }
     * 
     */
    public AsyncDeleteListRequest createAsyncDeleteListRequest() {
        return new AsyncDeleteListRequest();
    }

    /**
     * Create an instance of {@link AsyncGetListRequest }
     * 
     */
    public AsyncGetListRequest createAsyncGetListRequest() {
        return new AsyncGetListRequest();
    }

    /**
     * Create an instance of {@link AsyncInitializeListRequest }
     * 
     */
    public AsyncInitializeListRequest createAsyncInitializeListRequest() {
        return new AsyncInitializeListRequest();
    }

    /**
     * Create an instance of {@link AsyncSearchRequest }
     * 
     */
    public AsyncSearchRequest createAsyncSearchRequest() {
        return new AsyncSearchRequest();
    }

    /**
     * Create an instance of {@link CheckAsyncStatusRequest }
     * 
     */
    public CheckAsyncStatusRequest createCheckAsyncStatusRequest() {
        return new CheckAsyncStatusRequest();
    }

    /**
     * Create an instance of {@link GetAsyncResultRequest }
     * 
     */
    public GetAsyncResultRequest createGetAsyncResultRequest() {
        return new GetAsyncResultRequest();
    }

    /**
     * Create an instance of {@link GetDeletedRequest }
     * 
     */
    public GetDeletedRequest createGetDeletedRequest() {
        return new GetDeletedRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplicationInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "applicationInfo")
    public JAXBElement<ApplicationInfo> createApplicationInfo(ApplicationInfo value) {
        return new JAXBElement<ApplicationInfo>(_ApplicationInfo_QNAME, ApplicationInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartnerInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "partnerInfo")
    public JAXBElement<PartnerInfo> createPartnerInfo(PartnerInfo value) {
        return new JAXBElement<PartnerInfo>(_PartnerInfo_QNAME, PartnerInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "documentInfo")
    public JAXBElement<DocumentInfo> createDocumentInfo(DocumentInfo value) {
        return new JAXBElement<DocumentInfo>(_DocumentInfo_QNAME, DocumentInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Preferences }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "preferences")
    public JAXBElement<Preferences> createPreferences(Preferences value) {
        return new JAXBElement<Preferences>(_Preferences_QNAME, Preferences.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchPreferences }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "searchPreferences")
    public JAXBElement<SearchPreferences> createSearchPreferences(SearchPreferences value) {
        return new JAXBElement<SearchPreferences>(_SearchPreferences_QNAME, SearchPreferences.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Passport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "passport")
    public JAXBElement<Passport> createPassport(Passport value) {
        return new JAXBElement<Passport>(_Passport_QNAME, Passport.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SessionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "sessionResponse")
    public JAXBElement<SessionResponse> createSessionResponse(SessionResponse value) {
        return new JAXBElement<SessionResponse>(_SessionResponse_QNAME, SessionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WriteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "writeResponse")
    public JAXBElement<WriteResponse> createWriteResponse(WriteResponse value) {
        return new JAXBElement<WriteResponse>(_WriteResponse_QNAME, WriteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "readResponse")
    public JAXBElement<ReadResponse> createReadResponse(ReadResponse value) {
        return new JAXBElement<ReadResponse>(_ReadResponse_QNAME, ReadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WriteResponseList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "writeResponseList")
    public JAXBElement<WriteResponseList> createWriteResponseList(WriteResponseList value) {
        return new JAXBElement<WriteResponseList>(_WriteResponseList_QNAME, WriteResponseList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadResponseList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "readResponseList")
    public JAXBElement<ReadResponseList> createReadResponseList(ReadResponseList value) {
        return new JAXBElement<ReadResponseList>(_ReadResponseList_QNAME, ReadResponseList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SsoLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "ssoLoginResponse")
    public JAXBElement<SsoLoginResponse> createSsoLoginResponse(SsoLoginResponse value) {
        return new JAXBElement<SsoLoginResponse>(_SsoLoginResponse_QNAME, SsoLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapSsoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "mapSsoResponse")
    public JAXBElement<MapSsoResponse> createMapSsoResponse(MapSsoResponse value) {
        return new JAXBElement<MapSsoResponse>(_MapSsoResponse_QNAME, MapSsoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangePasswordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "changePasswordResponse")
    public JAXBElement<ChangePasswordResponse> createChangePasswordResponse(ChangePasswordResponse value) {
        return new JAXBElement<ChangePasswordResponse>(_ChangePasswordResponse_QNAME, ChangePasswordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeEmailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "changeEmailResponse")
    public JAXBElement<ChangeEmailResponse> createChangeEmailResponse(ChangeEmailResponse value) {
        return new JAXBElement<ChangeEmailResponse>(_ChangeEmailResponse_QNAME, ChangeEmailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "logoutResponse")
    public JAXBElement<LogoutResponse> createLogoutResponse(LogoutResponse value) {
        return new JAXBElement<LogoutResponse>(_LogoutResponse_QNAME, LogoutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "addListResponse")
    public JAXBElement<AddListResponse> createAddListResponse(AddListResponse value) {
        return new JAXBElement<AddListResponse>(_AddListResponse_QNAME, AddListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "updateResponse")
    public JAXBElement<UpdateResponse> createUpdateResponse(UpdateResponse value) {
        return new JAXBElement<UpdateResponse>(_UpdateResponse_QNAME, UpdateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "updateListResponse")
    public JAXBElement<UpdateListResponse> createUpdateListResponse(UpdateListResponse value) {
        return new JAXBElement<UpdateListResponse>(_UpdateListResponse_QNAME, UpdateListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpsertResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "upsertResponse")
    public JAXBElement<UpsertResponse> createUpsertResponse(UpsertResponse value) {
        return new JAXBElement<UpsertResponse>(_UpsertResponse_QNAME, UpsertResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpsertListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "upsertListResponse")
    public JAXBElement<UpsertListResponse> createUpsertListResponse(UpsertListResponse value) {
        return new JAXBElement<UpsertListResponse>(_UpsertListResponse_QNAME, UpsertListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "deleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "deleteListResponse")
    public JAXBElement<DeleteListResponse> createDeleteListResponse(DeleteListResponse value) {
        return new JAXBElement<DeleteListResponse>(_DeleteListResponse_QNAME, DeleteListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "searchResponse")
    public JAXBElement<SearchResponse> createSearchResponse(SearchResponse value) {
        return new JAXBElement<SearchResponse>(_SearchResponse_QNAME, SearchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchMoreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "searchMoreResponse")
    public JAXBElement<SearchMoreResponse> createSearchMoreResponse(SearchMoreResponse value) {
        return new JAXBElement<SearchMoreResponse>(_SearchMoreResponse_QNAME, SearchMoreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchMoreWithIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "searchMoreWithIdResponse")
    public JAXBElement<SearchMoreWithIdResponse> createSearchMoreWithIdResponse(SearchMoreWithIdResponse value) {
        return new JAXBElement<SearchMoreWithIdResponse>(_SearchMoreWithIdResponse_QNAME, SearchMoreWithIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchNextResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "searchNextResponse")
    public JAXBElement<SearchNextResponse> createSearchNextResponse(SearchNextResponse value) {
        return new JAXBElement<SearchNextResponse>(_SearchNextResponse_QNAME, SearchNextResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "getResponse")
    public JAXBElement<GetResponse> createGetResponse(GetResponse value) {
        return new JAXBElement<GetResponse>(_GetResponse_QNAME, GetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "getListResponse")
    public JAXBElement<GetListResponse> createGetListResponse(GetListResponse value) {
        return new JAXBElement<GetListResponse>(_GetListResponse_QNAME, GetListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "getAllResponse")
    public JAXBElement<GetAllResponse> createGetAllResponse(GetAllResponse value) {
        return new JAXBElement<GetAllResponse>(_GetAllResponse_QNAME, GetAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSavedSearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "getSavedSearchResponse")
    public JAXBElement<GetSavedSearchResponse> createGetSavedSearchResponse(GetSavedSearchResponse value) {
        return new JAXBElement<GetSavedSearchResponse>(_GetSavedSearchResponse_QNAME, GetSavedSearchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomizationIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "getCustomizationIdResponse")
    public JAXBElement<GetCustomizationIdResponse> createGetCustomizationIdResponse(GetCustomizationIdResponse value) {
        return new JAXBElement<GetCustomizationIdResponse>(_GetCustomizationIdResponse_QNAME, GetCustomizationIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitializeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "initializeResponse")
    public JAXBElement<InitializeResponse> createInitializeResponse(InitializeResponse value) {
        return new JAXBElement<InitializeResponse>(_InitializeResponse_QNAME, InitializeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitializeListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "initializeListResponse")
    public JAXBElement<InitializeListResponse> createInitializeListResponse(InitializeListResponse value) {
        return new JAXBElement<InitializeListResponse>(_InitializeListResponse_QNAME, InitializeListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSelectValueResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "getSelectValueResponse")
    public JAXBElement<GetSelectValueResponse> createGetSelectValueResponse(GetSelectValueResponse value) {
        return new JAXBElement<GetSelectValueResponse>(_GetSelectValueResponse_QNAME, GetSelectValueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemAvailabilityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "getItemAvailabilityResponse")
    public JAXBElement<GetItemAvailabilityResponse> createGetItemAvailabilityResponse(GetItemAvailabilityResponse value) {
        return new JAXBElement<GetItemAvailabilityResponse>(_GetItemAvailabilityResponse_QNAME, GetItemAvailabilityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBudgetExchangeRateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "getBudgetExchangeRateResponse")
    public JAXBElement<GetBudgetExchangeRateResponse> createGetBudgetExchangeRateResponse(GetBudgetExchangeRateResponse value) {
        return new JAXBElement<GetBudgetExchangeRateResponse>(_GetBudgetExchangeRateResponse_QNAME, GetBudgetExchangeRateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConsolidatedExchangeRateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "getConsolidatedExchangeRateResponse")
    public JAXBElement<GetConsolidatedExchangeRateResponse> createGetConsolidatedExchangeRateResponse(GetConsolidatedExchangeRateResponse value) {
        return new JAXBElement<GetConsolidatedExchangeRateResponse>(_GetConsolidatedExchangeRateResponse_QNAME, GetConsolidatedExchangeRateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrencyRateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "getCurrencyRateResponse")
    public JAXBElement<GetCurrencyRateResponse> createGetCurrencyRateResponse(GetCurrencyRateResponse value) {
        return new JAXBElement<GetCurrencyRateResponse>(_GetCurrencyRateResponse_QNAME, GetCurrencyRateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDataCenterUrlsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "getDataCenterUrlsResponse")
    public JAXBElement<GetDataCenterUrlsResponse> createGetDataCenterUrlsResponse(GetDataCenterUrlsResponse value) {
        return new JAXBElement<GetDataCenterUrlsResponse>(_GetDataCenterUrlsResponse_QNAME, GetDataCenterUrlsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPostingTransactionSummaryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "getPostingTransactionSummaryResponse")
    public JAXBElement<GetPostingTransactionSummaryResponse> createGetPostingTransactionSummaryResponse(GetPostingTransactionSummaryResponse value) {
        return new JAXBElement<GetPostingTransactionSummaryResponse>(_GetPostingTransactionSummaryResponse_QNAME, GetPostingTransactionSummaryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServerTimeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "getServerTimeResponse")
    public JAXBElement<GetServerTimeResponse> createGetServerTimeResponse(GetServerTimeResponse value) {
        return new JAXBElement<GetServerTimeResponse>(_GetServerTimeResponse_QNAME, GetServerTimeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttachResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "attachResponse")
    public JAXBElement<AttachResponse> createAttachResponse(AttachResponse value) {
        return new JAXBElement<AttachResponse>(_AttachResponse_QNAME, AttachResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetachResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "detachResponse")
    public JAXBElement<DetachResponse> createDetachResponse(DetachResponse value) {
        return new JAXBElement<DetachResponse>(_DetachResponse_QNAME, DetachResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateInviteeStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "updateInviteeStatusResponse")
    public JAXBElement<UpdateInviteeStatusResponse> createUpdateInviteeStatusResponse(UpdateInviteeStatusResponse value) {
        return new JAXBElement<UpdateInviteeStatusResponse>(_UpdateInviteeStatusResponse_QNAME, UpdateInviteeStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateInviteeStatusListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "updateInviteeStatusListResponse")
    public JAXBElement<UpdateInviteeStatusListResponse> createUpdateInviteeStatusListResponse(UpdateInviteeStatusListResponse value) {
        return new JAXBElement<UpdateInviteeStatusListResponse>(_UpdateInviteeStatusListResponse_QNAME, UpdateInviteeStatusListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsyncStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "asyncAddListResponse")
    public JAXBElement<AsyncStatusResponse> createAsyncAddListResponse(AsyncStatusResponse value) {
        return new JAXBElement<AsyncStatusResponse>(_AsyncAddListResponse_QNAME, AsyncStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsyncStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "asyncUpdateListResponse")
    public JAXBElement<AsyncStatusResponse> createAsyncUpdateListResponse(AsyncStatusResponse value) {
        return new JAXBElement<AsyncStatusResponse>(_AsyncUpdateListResponse_QNAME, AsyncStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsyncStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "asyncUpsertListResponse")
    public JAXBElement<AsyncStatusResponse> createAsyncUpsertListResponse(AsyncStatusResponse value) {
        return new JAXBElement<AsyncStatusResponse>(_AsyncUpsertListResponse_QNAME, AsyncStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsyncStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "asyncDeleteListResponse")
    public JAXBElement<AsyncStatusResponse> createAsyncDeleteListResponse(AsyncStatusResponse value) {
        return new JAXBElement<AsyncStatusResponse>(_AsyncDeleteListResponse_QNAME, AsyncStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsyncStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "asyncGetListResponse")
    public JAXBElement<AsyncStatusResponse> createAsyncGetListResponse(AsyncStatusResponse value) {
        return new JAXBElement<AsyncStatusResponse>(_AsyncGetListResponse_QNAME, AsyncStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsyncStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "asyncInitializeListResponse")
    public JAXBElement<AsyncStatusResponse> createAsyncInitializeListResponse(AsyncStatusResponse value) {
        return new JAXBElement<AsyncStatusResponse>(_AsyncInitializeListResponse_QNAME, AsyncStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsyncStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "asyncSearchResponse")
    public JAXBElement<AsyncStatusResponse> createAsyncSearchResponse(AsyncStatusResponse value) {
        return new JAXBElement<AsyncStatusResponse>(_AsyncSearchResponse_QNAME, AsyncStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsyncStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "checkAsyncStatusResponse")
    public JAXBElement<AsyncStatusResponse> createCheckAsyncStatusResponse(AsyncStatusResponse value) {
        return new JAXBElement<AsyncStatusResponse>(_CheckAsyncStatusResponse_QNAME, AsyncStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAsyncResultResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "getAsyncResultResponse")
    public JAXBElement<GetAsyncResultResponse> createGetAsyncResultResponse(GetAsyncResultResponse value) {
        return new JAXBElement<GetAsyncResultResponse>(_GetAsyncResultResponse_QNAME, GetAsyncResultResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsyncResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "asyncResult")
    public JAXBElement<AsyncResult> createAsyncResult(AsyncResult value) {
        return new JAXBElement<AsyncResult>(_AsyncResult_QNAME, AsyncResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsyncAddListResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "asyncAddListResult")
    public JAXBElement<AsyncAddListResult> createAsyncAddListResult(AsyncAddListResult value) {
        return new JAXBElement<AsyncAddListResult>(_AsyncAddListResult_QNAME, AsyncAddListResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsyncUpdateListResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "asyncUpdateListResult")
    public JAXBElement<AsyncUpdateListResult> createAsyncUpdateListResult(AsyncUpdateListResult value) {
        return new JAXBElement<AsyncUpdateListResult>(_AsyncUpdateListResult_QNAME, AsyncUpdateListResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsyncUpsertListResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "asyncUpsertListResult")
    public JAXBElement<AsyncUpsertListResult> createAsyncUpsertListResult(AsyncUpsertListResult value) {
        return new JAXBElement<AsyncUpsertListResult>(_AsyncUpsertListResult_QNAME, AsyncUpsertListResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsyncDeleteListResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "asyncDeleteListResult")
    public JAXBElement<AsyncDeleteListResult> createAsyncDeleteListResult(AsyncDeleteListResult value) {
        return new JAXBElement<AsyncDeleteListResult>(_AsyncDeleteListResult_QNAME, AsyncDeleteListResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsyncGetListResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "asyncGetListResult")
    public JAXBElement<AsyncGetListResult> createAsyncGetListResult(AsyncGetListResult value) {
        return new JAXBElement<AsyncGetListResult>(_AsyncGetListResult_QNAME, AsyncGetListResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsyncInitializeListResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "asyncInitializeListResult")
    public JAXBElement<AsyncInitializeListResult> createAsyncInitializeListResult(AsyncInitializeListResult value) {
        return new JAXBElement<AsyncInitializeListResult>(_AsyncInitializeListResult_QNAME, AsyncInitializeListResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsyncSearchResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "asyncSearchResult")
    public JAXBElement<AsyncSearchResult> createAsyncSearchResult(AsyncSearchResult value) {
        return new JAXBElement<AsyncSearchResult>(_AsyncSearchResult_QNAME, AsyncSearchResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeletedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "getDeletedResponse")
    public JAXBElement<GetDeletedResponse> createGetDeletedResponse(GetDeletedResponse value) {
        return new JAXBElement<GetDeletedResponse>(_GetDeletedResponse_QNAME, GetDeletedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "login")
    public JAXBElement<LoginRequest> createLogin(LoginRequest value) {
        return new JAXBElement<LoginRequest>(_Login_QNAME, LoginRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SsoLoginRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "ssoLogin")
    public JAXBElement<SsoLoginRequest> createSsoLogin(SsoLoginRequest value) {
        return new JAXBElement<SsoLoginRequest>(_SsoLogin_QNAME, SsoLoginRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapSsoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "mapSso")
    public JAXBElement<MapSsoRequest> createMapSso(MapSsoRequest value) {
        return new JAXBElement<MapSsoRequest>(_MapSso_QNAME, MapSsoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangePasswordRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "changePassword")
    public JAXBElement<ChangePasswordRequest> createChangePassword(ChangePasswordRequest value) {
        return new JAXBElement<ChangePasswordRequest>(_ChangePassword_QNAME, ChangePasswordRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeEmailRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "changeEmail")
    public JAXBElement<ChangeEmailRequest> createChangeEmail(ChangeEmailRequest value) {
        return new JAXBElement<ChangeEmailRequest>(_ChangeEmail_QNAME, ChangeEmailRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogoutRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "logout")
    public JAXBElement<LogoutRequest> createLogout(LogoutRequest value) {
        return new JAXBElement<LogoutRequest>(_Logout_QNAME, LogoutRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "add")
    public JAXBElement<AddRequest> createAdd(AddRequest value) {
        return new JAXBElement<AddRequest>(_Add_QNAME, AddRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "delete")
    public JAXBElement<DeleteRequest> createDelete(DeleteRequest value) {
        return new JAXBElement<DeleteRequest>(_Delete_QNAME, DeleteRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "search")
    public JAXBElement<SearchRequest> createSearch(SearchRequest value) {
        return new JAXBElement<SearchRequest>(_Search_QNAME, SearchRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchMoreRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "searchMore")
    public JAXBElement<SearchMoreRequest> createSearchMore(SearchMoreRequest value) {
        return new JAXBElement<SearchMoreRequest>(_SearchMore_QNAME, SearchMoreRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchMoreWithIdRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "searchMoreWithId")
    public JAXBElement<SearchMoreWithIdRequest> createSearchMoreWithId(SearchMoreWithIdRequest value) {
        return new JAXBElement<SearchMoreWithIdRequest>(_SearchMoreWithId_QNAME, SearchMoreWithIdRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchNextRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "searchNext")
    public JAXBElement<SearchNextRequest> createSearchNext(SearchNextRequest value) {
        return new JAXBElement<SearchNextRequest>(_SearchNext_QNAME, SearchNextRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "update")
    public JAXBElement<UpdateRequest> createUpdate(UpdateRequest value) {
        return new JAXBElement<UpdateRequest>(_Update_QNAME, UpdateRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpsertRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "upsert")
    public JAXBElement<UpsertRequest> createUpsert(UpsertRequest value) {
        return new JAXBElement<UpsertRequest>(_Upsert_QNAME, UpsertRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddListRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "addList")
    public JAXBElement<AddListRequest> createAddList(AddListRequest value) {
        return new JAXBElement<AddListRequest>(_AddList_QNAME, AddListRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteListRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "deleteList")
    public JAXBElement<DeleteListRequest> createDeleteList(DeleteListRequest value) {
        return new JAXBElement<DeleteListRequest>(_DeleteList_QNAME, DeleteListRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateListRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "updateList")
    public JAXBElement<UpdateListRequest> createUpdateList(UpdateListRequest value) {
        return new JAXBElement<UpdateListRequest>(_UpdateList_QNAME, UpdateListRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpsertListRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "upsertList")
    public JAXBElement<UpsertListRequest> createUpsertList(UpsertListRequest value) {
        return new JAXBElement<UpsertListRequest>(_UpsertList_QNAME, UpsertListRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "get")
    public JAXBElement<GetRequest> createGet(GetRequest value) {
        return new JAXBElement<GetRequest>(_Get_QNAME, GetRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "getList")
    public JAXBElement<GetListRequest> createGetList(GetListRequest value) {
        return new JAXBElement<GetListRequest>(_GetList_QNAME, GetListRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "getAll")
    public JAXBElement<GetAllRequest> createGetAll(GetAllRequest value) {
        return new JAXBElement<GetAllRequest>(_GetAll_QNAME, GetAllRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSavedSearchRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "getSavedSearch")
    public JAXBElement<GetSavedSearchRequest> createGetSavedSearch(GetSavedSearchRequest value) {
        return new JAXBElement<GetSavedSearchRequest>(_GetSavedSearch_QNAME, GetSavedSearchRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomizationIdRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "getCustomizationId")
    public JAXBElement<GetCustomizationIdRequest> createGetCustomizationId(GetCustomizationIdRequest value) {
        return new JAXBElement<GetCustomizationIdRequest>(_GetCustomizationId_QNAME, GetCustomizationIdRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitializeRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "initialize")
    public JAXBElement<InitializeRequest> createInitialize(InitializeRequest value) {
        return new JAXBElement<InitializeRequest>(_Initialize_QNAME, InitializeRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitializeListRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "initializeList")
    public JAXBElement<InitializeListRequest> createInitializeList(InitializeListRequest value) {
        return new JAXBElement<InitializeListRequest>(_InitializeList_QNAME, InitializeListRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSelectValueRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "getSelectValue")
    public JAXBElement<GetSelectValueRequest> createGetSelectValue(GetSelectValueRequest value) {
        return new JAXBElement<GetSelectValueRequest>(_GetSelectValue_QNAME, GetSelectValueRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemAvailabilityRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "getItemAvailability")
    public JAXBElement<GetItemAvailabilityRequest> createGetItemAvailability(GetItemAvailabilityRequest value) {
        return new JAXBElement<GetItemAvailabilityRequest>(_GetItemAvailability_QNAME, GetItemAvailabilityRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBudgetExchangeRateRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "getBudgetExchangeRate")
    public JAXBElement<GetBudgetExchangeRateRequest> createGetBudgetExchangeRate(GetBudgetExchangeRateRequest value) {
        return new JAXBElement<GetBudgetExchangeRateRequest>(_GetBudgetExchangeRate_QNAME, GetBudgetExchangeRateRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConsolidatedExchangeRateRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "getConsolidatedExchangeRate")
    public JAXBElement<GetConsolidatedExchangeRateRequest> createGetConsolidatedExchangeRate(GetConsolidatedExchangeRateRequest value) {
        return new JAXBElement<GetConsolidatedExchangeRateRequest>(_GetConsolidatedExchangeRate_QNAME, GetConsolidatedExchangeRateRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrencyRateRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "getCurrencyRate")
    public JAXBElement<GetCurrencyRateRequest> createGetCurrencyRate(GetCurrencyRateRequest value) {
        return new JAXBElement<GetCurrencyRateRequest>(_GetCurrencyRate_QNAME, GetCurrencyRateRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDataCenterUrlsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "getDataCenterUrls")
    public JAXBElement<GetDataCenterUrlsRequest> createGetDataCenterUrls(GetDataCenterUrlsRequest value) {
        return new JAXBElement<GetDataCenterUrlsRequest>(_GetDataCenterUrls_QNAME, GetDataCenterUrlsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPostingTransactionSummaryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "getPostingTransactionSummary")
    public JAXBElement<GetPostingTransactionSummaryRequest> createGetPostingTransactionSummary(GetPostingTransactionSummaryRequest value) {
        return new JAXBElement<GetPostingTransactionSummaryRequest>(_GetPostingTransactionSummary_QNAME, GetPostingTransactionSummaryRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServerTimeRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "getServerTime")
    public JAXBElement<GetServerTimeRequest> createGetServerTime(GetServerTimeRequest value) {
        return new JAXBElement<GetServerTimeRequest>(_GetServerTime_QNAME, GetServerTimeRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttachRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "attach")
    public JAXBElement<AttachRequest> createAttach(AttachRequest value) {
        return new JAXBElement<AttachRequest>(_Attach_QNAME, AttachRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetachRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "detach")
    public JAXBElement<DetachRequest> createDetach(DetachRequest value) {
        return new JAXBElement<DetachRequest>(_Detach_QNAME, DetachRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateInviteeStatusRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "updateInviteeStatus")
    public JAXBElement<UpdateInviteeStatusRequest> createUpdateInviteeStatus(UpdateInviteeStatusRequest value) {
        return new JAXBElement<UpdateInviteeStatusRequest>(_UpdateInviteeStatus_QNAME, UpdateInviteeStatusRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateInviteeStatusListRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "updateInviteeStatusList")
    public JAXBElement<UpdateInviteeStatusListRequest> createUpdateInviteeStatusList(UpdateInviteeStatusListRequest value) {
        return new JAXBElement<UpdateInviteeStatusListRequest>(_UpdateInviteeStatusList_QNAME, UpdateInviteeStatusListRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsyncAddListRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "asyncAddList")
    public JAXBElement<AsyncAddListRequest> createAsyncAddList(AsyncAddListRequest value) {
        return new JAXBElement<AsyncAddListRequest>(_AsyncAddList_QNAME, AsyncAddListRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsyncUpdateListRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "asyncUpdateList")
    public JAXBElement<AsyncUpdateListRequest> createAsyncUpdateList(AsyncUpdateListRequest value) {
        return new JAXBElement<AsyncUpdateListRequest>(_AsyncUpdateList_QNAME, AsyncUpdateListRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsyncUpsertListRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "asyncUpsertList")
    public JAXBElement<AsyncUpsertListRequest> createAsyncUpsertList(AsyncUpsertListRequest value) {
        return new JAXBElement<AsyncUpsertListRequest>(_AsyncUpsertList_QNAME, AsyncUpsertListRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsyncDeleteListRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "asyncDeleteList")
    public JAXBElement<AsyncDeleteListRequest> createAsyncDeleteList(AsyncDeleteListRequest value) {
        return new JAXBElement<AsyncDeleteListRequest>(_AsyncDeleteList_QNAME, AsyncDeleteListRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsyncGetListRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "asyncGetList")
    public JAXBElement<AsyncGetListRequest> createAsyncGetList(AsyncGetListRequest value) {
        return new JAXBElement<AsyncGetListRequest>(_AsyncGetList_QNAME, AsyncGetListRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsyncInitializeListRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "asyncInitializeList")
    public JAXBElement<AsyncInitializeListRequest> createAsyncInitializeList(AsyncInitializeListRequest value) {
        return new JAXBElement<AsyncInitializeListRequest>(_AsyncInitializeList_QNAME, AsyncInitializeListRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsyncSearchRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "asyncSearch")
    public JAXBElement<AsyncSearchRequest> createAsyncSearch(AsyncSearchRequest value) {
        return new JAXBElement<AsyncSearchRequest>(_AsyncSearch_QNAME, AsyncSearchRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckAsyncStatusRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "checkAsyncStatus")
    public JAXBElement<CheckAsyncStatusRequest> createCheckAsyncStatus(CheckAsyncStatusRequest value) {
        return new JAXBElement<CheckAsyncStatusRequest>(_CheckAsyncStatus_QNAME, CheckAsyncStatusRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAsyncResultRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "getAsyncResult")
    public JAXBElement<GetAsyncResultRequest> createGetAsyncResult(GetAsyncResultRequest value) {
        return new JAXBElement<GetAsyncResultRequest>(_GetAsyncResult_QNAME, GetAsyncResultRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeletedRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages_2014_2.platform.webservices.netsuite.com", name = "getDeleted")
    public JAXBElement<GetDeletedRequest> createGetDeleted(GetDeletedRequest value) {
        return new JAXBElement<GetDeletedRequest>(_GetDeleted_QNAME, GetDeletedRequest.class, null, value);
    }

}
