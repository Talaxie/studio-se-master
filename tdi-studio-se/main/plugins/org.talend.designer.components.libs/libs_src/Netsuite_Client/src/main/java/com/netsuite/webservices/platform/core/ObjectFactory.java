
package com.netsuite.webservices.platform.core;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.netsuite.webservices.platform.core package. 
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

    private final static QName _Status_QNAME = new QName("urn:core_2014_2.platform.webservices.netsuite.com", "status");
    private final static QName _WsRoleList_QNAME = new QName("urn:core_2014_2.platform.webservices.netsuite.com", "wsRoleList");
    private final static QName _Record_QNAME = new QName("urn:core_2014_2.platform.webservices.netsuite.com", "record");
    private final static QName _SearchRecord_QNAME = new QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchRecord");
    private final static QName _SearchRecordBasic_QNAME = new QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchRecordBasic");
    private final static QName _SearchRowBasic_QNAME = new QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchRowBasic");
    private final static QName _SearchResult_QNAME = new QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchResult");
    private final static QName _AsyncStatusResult_QNAME = new QName("urn:core_2014_2.platform.webservices.netsuite.com", "asyncStatusResult");
    private final static QName _GetAllResult_QNAME = new QName("urn:core_2014_2.platform.webservices.netsuite.com", "getAllResult");
    private final static QName _GetSavedSearchResult_QNAME = new QName("urn:core_2014_2.platform.webservices.netsuite.com", "getSavedSearchResult");
    private final static QName _GetCustomizationIdResult_QNAME = new QName("urn:core_2014_2.platform.webservices.netsuite.com", "getCustomizationIdResult");
    private final static QName _GetSelectValueResult_QNAME = new QName("urn:core_2014_2.platform.webservices.netsuite.com", "getSelectValueResult");
    private final static QName _RecordList_QNAME = new QName("urn:core_2014_2.platform.webservices.netsuite.com", "recordList");
    private final static QName _SearchRowList_QNAME = new QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchRowList");
    private final static QName _RecordRefList_QNAME = new QName("urn:core_2014_2.platform.webservices.netsuite.com", "recordRefList");
    private final static QName _BaseRef_QNAME = new QName("urn:core_2014_2.platform.webservices.netsuite.com", "baseRef");
    private final static QName _BaseRefList_QNAME = new QName("urn:core_2014_2.platform.webservices.netsuite.com", "baseRefList");
    private final static QName _CustomizationRefList_QNAME = new QName("urn:core_2014_2.platform.webservices.netsuite.com", "customizationRefList");
    private final static QName _InitializeRefList_QNAME = new QName("urn:core_2014_2.platform.webservices.netsuite.com", "initializeRefList");
    private final static QName _GetItemAvailabilityResult_QNAME = new QName("urn:core_2014_2.platform.webservices.netsuite.com", "getItemAvailabilityResult");
    private final static QName _GetBudgetExchangeRateResult_QNAME = new QName("urn:core_2014_2.platform.webservices.netsuite.com", "getBudgetExchangeRateResult");
    private final static QName _GetConsolidatedExchangeRateResult_QNAME = new QName("urn:core_2014_2.platform.webservices.netsuite.com", "getConsolidatedExchangeRateResult");
    private final static QName _GetCurrencyRateResult_QNAME = new QName("urn:core_2014_2.platform.webservices.netsuite.com", "getCurrencyRateResult");
    private final static QName _GetDataCenterUrlsResult_QNAME = new QName("urn:core_2014_2.platform.webservices.netsuite.com", "getDataCenterUrlsResult");
    private final static QName _GetPostingTransactionSummaryResult_QNAME = new QName("urn:core_2014_2.platform.webservices.netsuite.com", "getPostingTransactionSummaryResult");
    private final static QName _GetServerTimeResult_QNAME = new QName("urn:core_2014_2.platform.webservices.netsuite.com", "getServerTimeResult");
    private final static QName _DeletedRecordList_QNAME = new QName("urn:core_2014_2.platform.webservices.netsuite.com", "deletedRecordList");
    private final static QName _GetDeletedResult_QNAME = new QName("urn:core_2014_2.platform.webservices.netsuite.com", "getDeletedResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.netsuite.webservices.platform.core
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Status }
     * 
     */
    public Status createStatus() {
        return new Status();
    }

    /**
     * Create an instance of {@link WsRoleList }
     * 
     */
    public WsRoleList createWsRoleList() {
        return new WsRoleList();
    }

    /**
     * Create an instance of {@link SearchResult }
     * 
     */
    public SearchResult createSearchResult() {
        return new SearchResult();
    }

    /**
     * Create an instance of {@link AsyncStatusResult }
     * 
     */
    public AsyncStatusResult createAsyncStatusResult() {
        return new AsyncStatusResult();
    }

    /**
     * Create an instance of {@link GetAllResult }
     * 
     */
    public GetAllResult createGetAllResult() {
        return new GetAllResult();
    }

    /**
     * Create an instance of {@link GetSavedSearchResult }
     * 
     */
    public GetSavedSearchResult createGetSavedSearchResult() {
        return new GetSavedSearchResult();
    }

    /**
     * Create an instance of {@link GetCustomizationIdResult }
     * 
     */
    public GetCustomizationIdResult createGetCustomizationIdResult() {
        return new GetCustomizationIdResult();
    }

    /**
     * Create an instance of {@link GetSelectValueResult }
     * 
     */
    public GetSelectValueResult createGetSelectValueResult() {
        return new GetSelectValueResult();
    }

    /**
     * Create an instance of {@link RecordList }
     * 
     */
    public RecordList createRecordList() {
        return new RecordList();
    }

    /**
     * Create an instance of {@link SearchRowList }
     * 
     */
    public SearchRowList createSearchRowList() {
        return new SearchRowList();
    }

    /**
     * Create an instance of {@link RecordRefList }
     * 
     */
    public RecordRefList createRecordRefList() {
        return new RecordRefList();
    }

    /**
     * Create an instance of {@link BaseRefList }
     * 
     */
    public BaseRefList createBaseRefList() {
        return new BaseRefList();
    }

    /**
     * Create an instance of {@link CustomizationRefList }
     * 
     */
    public CustomizationRefList createCustomizationRefList() {
        return new CustomizationRefList();
    }

    /**
     * Create an instance of {@link InitializeRefList }
     * 
     */
    public InitializeRefList createInitializeRefList() {
        return new InitializeRefList();
    }

    /**
     * Create an instance of {@link GetItemAvailabilityResult }
     * 
     */
    public GetItemAvailabilityResult createGetItemAvailabilityResult() {
        return new GetItemAvailabilityResult();
    }

    /**
     * Create an instance of {@link GetBudgetExchangeRateResult }
     * 
     */
    public GetBudgetExchangeRateResult createGetBudgetExchangeRateResult() {
        return new GetBudgetExchangeRateResult();
    }

    /**
     * Create an instance of {@link GetConsolidatedExchangeRateResult }
     * 
     */
    public GetConsolidatedExchangeRateResult createGetConsolidatedExchangeRateResult() {
        return new GetConsolidatedExchangeRateResult();
    }

    /**
     * Create an instance of {@link GetCurrencyRateResult }
     * 
     */
    public GetCurrencyRateResult createGetCurrencyRateResult() {
        return new GetCurrencyRateResult();
    }

    /**
     * Create an instance of {@link GetDataCenterUrlsResult }
     * 
     */
    public GetDataCenterUrlsResult createGetDataCenterUrlsResult() {
        return new GetDataCenterUrlsResult();
    }

    /**
     * Create an instance of {@link GetPostingTransactionSummaryResult }
     * 
     */
    public GetPostingTransactionSummaryResult createGetPostingTransactionSummaryResult() {
        return new GetPostingTransactionSummaryResult();
    }

    /**
     * Create an instance of {@link GetServerTimeResult }
     * 
     */
    public GetServerTimeResult createGetServerTimeResult() {
        return new GetServerTimeResult();
    }

    /**
     * Create an instance of {@link DeletedRecordList }
     * 
     */
    public DeletedRecordList createDeletedRecordList() {
        return new DeletedRecordList();
    }

    /**
     * Create an instance of {@link GetDeletedResult }
     * 
     */
    public GetDeletedResult createGetDeletedResult() {
        return new GetDeletedResult();
    }

    /**
     * Create an instance of {@link Passport }
     * 
     */
    public Passport createPassport() {
        return new Passport();
    }

    /**
     * Create an instance of {@link SsoPassport }
     * 
     */
    public SsoPassport createSsoPassport() {
        return new SsoPassport();
    }

    /**
     * Create an instance of {@link SsoCredentials }
     * 
     */
    public SsoCredentials createSsoCredentials() {
        return new SsoCredentials();
    }

    /**
     * Create an instance of {@link ChangePassword }
     * 
     */
    public ChangePassword createChangePassword() {
        return new ChangePassword();
    }

    /**
     * Create an instance of {@link ChangeEmail }
     * 
     */
    public ChangeEmail createChangeEmail() {
        return new ChangeEmail();
    }

    /**
     * Create an instance of {@link StatusDetail }
     * 
     */
    public StatusDetail createStatusDetail() {
        return new StatusDetail();
    }

    /**
     * Create an instance of {@link WsRole }
     * 
     */
    public WsRole createWsRole() {
        return new WsRole();
    }

    /**
     * Create an instance of {@link NullField }
     * 
     */
    public NullField createNullField() {
        return new NullField();
    }

    /**
     * Create an instance of {@link RecordRef }
     * 
     */
    public RecordRef createRecordRef() {
        return new RecordRef();
    }

    /**
     * Create an instance of {@link Duration }
     * 
     */
    public Duration createDuration() {
        return new Duration();
    }

    /**
     * Create an instance of {@link CustomRecordRef }
     * 
     */
    public CustomRecordRef createCustomRecordRef() {
        return new CustomRecordRef();
    }

    /**
     * Create an instance of {@link CustomizationRef }
     * 
     */
    public CustomizationRef createCustomizationRef() {
        return new CustomizationRef();
    }

    /**
     * Create an instance of {@link InitializeRecord }
     * 
     */
    public InitializeRecord createInitializeRecord() {
        return new InitializeRecord();
    }

    /**
     * Create an instance of {@link InitializeRef }
     * 
     */
    public InitializeRef createInitializeRef() {
        return new InitializeRef();
    }

    /**
     * Create an instance of {@link InitializeAuxRef }
     * 
     */
    public InitializeAuxRef createInitializeAuxRef() {
        return new InitializeAuxRef();
    }

    /**
     * Create an instance of {@link UpdateInviteeStatusReference }
     * 
     */
    public UpdateInviteeStatusReference createUpdateInviteeStatusReference() {
        return new UpdateInviteeStatusReference();
    }

    /**
     * Create an instance of {@link GetAllRecord }
     * 
     */
    public GetAllRecord createGetAllRecord() {
        return new GetAllRecord();
    }

    /**
     * Create an instance of {@link GetSavedSearchRecord }
     * 
     */
    public GetSavedSearchRecord createGetSavedSearchRecord() {
        return new GetSavedSearchRecord();
    }

    /**
     * Create an instance of {@link CustomizationType }
     * 
     */
    public CustomizationType createCustomizationType() {
        return new CustomizationType();
    }

    /**
     * Create an instance of {@link ListOrRecordRef }
     * 
     */
    public ListOrRecordRef createListOrRecordRef() {
        return new ListOrRecordRef();
    }

    /**
     * Create an instance of {@link LongCustomFieldRef }
     * 
     */
    public LongCustomFieldRef createLongCustomFieldRef() {
        return new LongCustomFieldRef();
    }

    /**
     * Create an instance of {@link DoubleCustomFieldRef }
     * 
     */
    public DoubleCustomFieldRef createDoubleCustomFieldRef() {
        return new DoubleCustomFieldRef();
    }

    /**
     * Create an instance of {@link BooleanCustomFieldRef }
     * 
     */
    public BooleanCustomFieldRef createBooleanCustomFieldRef() {
        return new BooleanCustomFieldRef();
    }

    /**
     * Create an instance of {@link StringCustomFieldRef }
     * 
     */
    public StringCustomFieldRef createStringCustomFieldRef() {
        return new StringCustomFieldRef();
    }

    /**
     * Create an instance of {@link DateCustomFieldRef }
     * 
     */
    public DateCustomFieldRef createDateCustomFieldRef() {
        return new DateCustomFieldRef();
    }

    /**
     * Create an instance of {@link SelectCustomFieldRef }
     * 
     */
    public SelectCustomFieldRef createSelectCustomFieldRef() {
        return new SelectCustomFieldRef();
    }

    /**
     * Create an instance of {@link MultiSelectCustomFieldRef }
     * 
     */
    public MultiSelectCustomFieldRef createMultiSelectCustomFieldRef() {
        return new MultiSelectCustomFieldRef();
    }

    /**
     * Create an instance of {@link CustomFieldList }
     * 
     */
    public CustomFieldList createCustomFieldList() {
        return new CustomFieldList();
    }

    /**
     * Create an instance of {@link SearchBooleanField }
     * 
     */
    public SearchBooleanField createSearchBooleanField() {
        return new SearchBooleanField();
    }

    /**
     * Create an instance of {@link SearchStringField }
     * 
     */
    public SearchStringField createSearchStringField() {
        return new SearchStringField();
    }

    /**
     * Create an instance of {@link SearchLongField }
     * 
     */
    public SearchLongField createSearchLongField() {
        return new SearchLongField();
    }

    /**
     * Create an instance of {@link SearchTextNumberField }
     * 
     */
    public SearchTextNumberField createSearchTextNumberField() {
        return new SearchTextNumberField();
    }

    /**
     * Create an instance of {@link SearchDoubleField }
     * 
     */
    public SearchDoubleField createSearchDoubleField() {
        return new SearchDoubleField();
    }

    /**
     * Create an instance of {@link SearchDateField }
     * 
     */
    public SearchDateField createSearchDateField() {
        return new SearchDateField();
    }

    /**
     * Create an instance of {@link SearchEnumMultiSelectField }
     * 
     */
    public SearchEnumMultiSelectField createSearchEnumMultiSelectField() {
        return new SearchEnumMultiSelectField();
    }

    /**
     * Create an instance of {@link SearchMultiSelectField }
     * 
     */
    public SearchMultiSelectField createSearchMultiSelectField() {
        return new SearchMultiSelectField();
    }

    /**
     * Create an instance of {@link SearchBooleanCustomField }
     * 
     */
    public SearchBooleanCustomField createSearchBooleanCustomField() {
        return new SearchBooleanCustomField();
    }

    /**
     * Create an instance of {@link SearchStringCustomField }
     * 
     */
    public SearchStringCustomField createSearchStringCustomField() {
        return new SearchStringCustomField();
    }

    /**
     * Create an instance of {@link SearchLongCustomField }
     * 
     */
    public SearchLongCustomField createSearchLongCustomField() {
        return new SearchLongCustomField();
    }

    /**
     * Create an instance of {@link SearchDoubleCustomField }
     * 
     */
    public SearchDoubleCustomField createSearchDoubleCustomField() {
        return new SearchDoubleCustomField();
    }

    /**
     * Create an instance of {@link SearchDateCustomField }
     * 
     */
    public SearchDateCustomField createSearchDateCustomField() {
        return new SearchDateCustomField();
    }

    /**
     * Create an instance of {@link SearchEnumMultiSelectCustomField }
     * 
     */
    public SearchEnumMultiSelectCustomField createSearchEnumMultiSelectCustomField() {
        return new SearchEnumMultiSelectCustomField();
    }

    /**
     * Create an instance of {@link SearchMultiSelectCustomField }
     * 
     */
    public SearchMultiSelectCustomField createSearchMultiSelectCustomField() {
        return new SearchMultiSelectCustomField();
    }

    /**
     * Create an instance of {@link SearchCustomFieldList }
     * 
     */
    public SearchCustomFieldList createSearchCustomFieldList() {
        return new SearchCustomFieldList();
    }

    /**
     * Create an instance of {@link SearchColumnBooleanField }
     * 
     */
    public SearchColumnBooleanField createSearchColumnBooleanField() {
        return new SearchColumnBooleanField();
    }

    /**
     * Create an instance of {@link SearchColumnStringField }
     * 
     */
    public SearchColumnStringField createSearchColumnStringField() {
        return new SearchColumnStringField();
    }

    /**
     * Create an instance of {@link SearchColumnLongField }
     * 
     */
    public SearchColumnLongField createSearchColumnLongField() {
        return new SearchColumnLongField();
    }

    /**
     * Create an instance of {@link SearchColumnTextNumberField }
     * 
     */
    public SearchColumnTextNumberField createSearchColumnTextNumberField() {
        return new SearchColumnTextNumberField();
    }

    /**
     * Create an instance of {@link SearchColumnDoubleField }
     * 
     */
    public SearchColumnDoubleField createSearchColumnDoubleField() {
        return new SearchColumnDoubleField();
    }

    /**
     * Create an instance of {@link SearchColumnDateField }
     * 
     */
    public SearchColumnDateField createSearchColumnDateField() {
        return new SearchColumnDateField();
    }

    /**
     * Create an instance of {@link SearchColumnEnumSelectField }
     * 
     */
    public SearchColumnEnumSelectField createSearchColumnEnumSelectField() {
        return new SearchColumnEnumSelectField();
    }

    /**
     * Create an instance of {@link SearchColumnSelectField }
     * 
     */
    public SearchColumnSelectField createSearchColumnSelectField() {
        return new SearchColumnSelectField();
    }

    /**
     * Create an instance of {@link SearchColumnBooleanCustomField }
     * 
     */
    public SearchColumnBooleanCustomField createSearchColumnBooleanCustomField() {
        return new SearchColumnBooleanCustomField();
    }

    /**
     * Create an instance of {@link SearchColumnStringCustomField }
     * 
     */
    public SearchColumnStringCustomField createSearchColumnStringCustomField() {
        return new SearchColumnStringCustomField();
    }

    /**
     * Create an instance of {@link SearchColumnLongCustomField }
     * 
     */
    public SearchColumnLongCustomField createSearchColumnLongCustomField() {
        return new SearchColumnLongCustomField();
    }

    /**
     * Create an instance of {@link SearchColumnDoubleCustomField }
     * 
     */
    public SearchColumnDoubleCustomField createSearchColumnDoubleCustomField() {
        return new SearchColumnDoubleCustomField();
    }

    /**
     * Create an instance of {@link SearchColumnDateCustomField }
     * 
     */
    public SearchColumnDateCustomField createSearchColumnDateCustomField() {
        return new SearchColumnDateCustomField();
    }

    /**
     * Create an instance of {@link SearchColumnEnumMultiSelectCustomField }
     * 
     */
    public SearchColumnEnumMultiSelectCustomField createSearchColumnEnumMultiSelectCustomField() {
        return new SearchColumnEnumMultiSelectCustomField();
    }

    /**
     * Create an instance of {@link SearchColumnSelectCustomField }
     * 
     */
    public SearchColumnSelectCustomField createSearchColumnSelectCustomField() {
        return new SearchColumnSelectCustomField();
    }

    /**
     * Create an instance of {@link SearchColumnMultiSelectCustomField }
     * 
     */
    public SearchColumnMultiSelectCustomField createSearchColumnMultiSelectCustomField() {
        return new SearchColumnMultiSelectCustomField();
    }

    /**
     * Create an instance of {@link SearchColumnCustomFieldList }
     * 
     */
    public SearchColumnCustomFieldList createSearchColumnCustomFieldList() {
        return new SearchColumnCustomFieldList();
    }

    /**
     * Create an instance of {@link ItemAvailabilityFilter }
     * 
     */
    public ItemAvailabilityFilter createItemAvailabilityFilter() {
        return new ItemAvailabilityFilter();
    }

    /**
     * Create an instance of {@link ItemAvailability }
     * 
     */
    public ItemAvailability createItemAvailability() {
        return new ItemAvailability();
    }

    /**
     * Create an instance of {@link ItemAvailabilityList }
     * 
     */
    public ItemAvailabilityList createItemAvailabilityList() {
        return new ItemAvailabilityList();
    }

    /**
     * Create an instance of {@link BudgetExchangeRateFilter }
     * 
     */
    public BudgetExchangeRateFilter createBudgetExchangeRateFilter() {
        return new BudgetExchangeRateFilter();
    }

    /**
     * Create an instance of {@link BudgetExchangeRate }
     * 
     */
    public BudgetExchangeRate createBudgetExchangeRate() {
        return new BudgetExchangeRate();
    }

    /**
     * Create an instance of {@link BudgetExchangeRateList }
     * 
     */
    public BudgetExchangeRateList createBudgetExchangeRateList() {
        return new BudgetExchangeRateList();
    }

    /**
     * Create an instance of {@link ConsolidatedExchangeRateFilter }
     * 
     */
    public ConsolidatedExchangeRateFilter createConsolidatedExchangeRateFilter() {
        return new ConsolidatedExchangeRateFilter();
    }

    /**
     * Create an instance of {@link ConsolidatedExchangeRate }
     * 
     */
    public ConsolidatedExchangeRate createConsolidatedExchangeRate() {
        return new ConsolidatedExchangeRate();
    }

    /**
     * Create an instance of {@link ConsolidatedExchangeRateList }
     * 
     */
    public ConsolidatedExchangeRateList createConsolidatedExchangeRateList() {
        return new ConsolidatedExchangeRateList();
    }

    /**
     * Create an instance of {@link CurrencyRateFilter }
     * 
     */
    public CurrencyRateFilter createCurrencyRateFilter() {
        return new CurrencyRateFilter();
    }

    /**
     * Create an instance of {@link CurrencyRate }
     * 
     */
    public CurrencyRate createCurrencyRate() {
        return new CurrencyRate();
    }

    /**
     * Create an instance of {@link CurrencyRateList }
     * 
     */
    public CurrencyRateList createCurrencyRateList() {
        return new CurrencyRateList();
    }

    /**
     * Create an instance of {@link DataCenterUrls }
     * 
     */
    public DataCenterUrls createDataCenterUrls() {
        return new DataCenterUrls();
    }

    /**
     * Create an instance of {@link PostingTransactionSummaryField }
     * 
     */
    public PostingTransactionSummaryField createPostingTransactionSummaryField() {
        return new PostingTransactionSummaryField();
    }

    /**
     * Create an instance of {@link PostingTransactionSummaryFilter }
     * 
     */
    public PostingTransactionSummaryFilter createPostingTransactionSummaryFilter() {
        return new PostingTransactionSummaryFilter();
    }

    /**
     * Create an instance of {@link PostingTransactionSummary }
     * 
     */
    public PostingTransactionSummary createPostingTransactionSummary() {
        return new PostingTransactionSummary();
    }

    /**
     * Create an instance of {@link PostingTransactionSummaryList }
     * 
     */
    public PostingTransactionSummaryList createPostingTransactionSummaryList() {
        return new PostingTransactionSummaryList();
    }

    /**
     * Create an instance of {@link GetSelectValueFieldDescription }
     * 
     */
    public GetSelectValueFieldDescription createGetSelectValueFieldDescription() {
        return new GetSelectValueFieldDescription();
    }

    /**
     * Create an instance of {@link GetSelectValueFilter }
     * 
     */
    public GetSelectValueFilter createGetSelectValueFilter() {
        return new GetSelectValueFilter();
    }

    /**
     * Create an instance of {@link GetSelectFilterByFieldValueList }
     * 
     */
    public GetSelectFilterByFieldValueList createGetSelectFilterByFieldValueList() {
        return new GetSelectFilterByFieldValueList();
    }

    /**
     * Create an instance of {@link GetSelectFilterByFieldValue }
     * 
     */
    public GetSelectFilterByFieldValue createGetSelectFilterByFieldValue() {
        return new GetSelectFilterByFieldValue();
    }

    /**
     * Create an instance of {@link DeletedRecord }
     * 
     */
    public DeletedRecord createDeletedRecord() {
        return new DeletedRecord();
    }

    /**
     * Create an instance of {@link GetDeletedFilter }
     * 
     */
    public GetDeletedFilter createGetDeletedFilter() {
        return new GetDeletedFilter();
    }

    /**
     * Create an instance of {@link AttachContactReference }
     * 
     */
    public AttachContactReference createAttachContactReference() {
        return new AttachContactReference();
    }

    /**
     * Create an instance of {@link AttachBasicReference }
     * 
     */
    public AttachBasicReference createAttachBasicReference() {
        return new AttachBasicReference();
    }

    /**
     * Create an instance of {@link DetachBasicReference }
     * 
     */
    public DetachBasicReference createDetachBasicReference() {
        return new DetachBasicReference();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:core_2014_2.platform.webservices.netsuite.com", name = "status")
    public JAXBElement<Status> createStatus(Status value) {
        return new JAXBElement<Status>(_Status_QNAME, Status.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsRoleList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:core_2014_2.platform.webservices.netsuite.com", name = "wsRoleList")
    public JAXBElement<WsRoleList> createWsRoleList(WsRoleList value) {
        return new JAXBElement<WsRoleList>(_WsRoleList_QNAME, WsRoleList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Record }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:core_2014_2.platform.webservices.netsuite.com", name = "record")
    public JAXBElement<Record> createRecord(Record value) {
        return new JAXBElement<Record>(_Record_QNAME, Record.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:core_2014_2.platform.webservices.netsuite.com", name = "searchRecord")
    public JAXBElement<SearchRecord> createSearchRecord(SearchRecord value) {
        return new JAXBElement<SearchRecord>(_SearchRecord_QNAME, SearchRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchRecordBasic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:core_2014_2.platform.webservices.netsuite.com", name = "searchRecordBasic")
    public JAXBElement<SearchRecordBasic> createSearchRecordBasic(SearchRecordBasic value) {
        return new JAXBElement<SearchRecordBasic>(_SearchRecordBasic_QNAME, SearchRecordBasic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchRowBasic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:core_2014_2.platform.webservices.netsuite.com", name = "searchRowBasic")
    public JAXBElement<SearchRowBasic> createSearchRowBasic(SearchRowBasic value) {
        return new JAXBElement<SearchRowBasic>(_SearchRowBasic_QNAME, SearchRowBasic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:core_2014_2.platform.webservices.netsuite.com", name = "searchResult")
    public JAXBElement<SearchResult> createSearchResult(SearchResult value) {
        return new JAXBElement<SearchResult>(_SearchResult_QNAME, SearchResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsyncStatusResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:core_2014_2.platform.webservices.netsuite.com", name = "asyncStatusResult")
    public JAXBElement<AsyncStatusResult> createAsyncStatusResult(AsyncStatusResult value) {
        return new JAXBElement<AsyncStatusResult>(_AsyncStatusResult_QNAME, AsyncStatusResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:core_2014_2.platform.webservices.netsuite.com", name = "getAllResult")
    public JAXBElement<GetAllResult> createGetAllResult(GetAllResult value) {
        return new JAXBElement<GetAllResult>(_GetAllResult_QNAME, GetAllResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSavedSearchResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:core_2014_2.platform.webservices.netsuite.com", name = "getSavedSearchResult")
    public JAXBElement<GetSavedSearchResult> createGetSavedSearchResult(GetSavedSearchResult value) {
        return new JAXBElement<GetSavedSearchResult>(_GetSavedSearchResult_QNAME, GetSavedSearchResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomizationIdResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:core_2014_2.platform.webservices.netsuite.com", name = "getCustomizationIdResult")
    public JAXBElement<GetCustomizationIdResult> createGetCustomizationIdResult(GetCustomizationIdResult value) {
        return new JAXBElement<GetCustomizationIdResult>(_GetCustomizationIdResult_QNAME, GetCustomizationIdResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSelectValueResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:core_2014_2.platform.webservices.netsuite.com", name = "getSelectValueResult")
    public JAXBElement<GetSelectValueResult> createGetSelectValueResult(GetSelectValueResult value) {
        return new JAXBElement<GetSelectValueResult>(_GetSelectValueResult_QNAME, GetSelectValueResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecordList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:core_2014_2.platform.webservices.netsuite.com", name = "recordList")
    public JAXBElement<RecordList> createRecordList(RecordList value) {
        return new JAXBElement<RecordList>(_RecordList_QNAME, RecordList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchRowList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:core_2014_2.platform.webservices.netsuite.com", name = "searchRowList")
    public JAXBElement<SearchRowList> createSearchRowList(SearchRowList value) {
        return new JAXBElement<SearchRowList>(_SearchRowList_QNAME, SearchRowList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecordRefList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:core_2014_2.platform.webservices.netsuite.com", name = "recordRefList")
    public JAXBElement<RecordRefList> createRecordRefList(RecordRefList value) {
        return new JAXBElement<RecordRefList>(_RecordRefList_QNAME, RecordRefList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:core_2014_2.platform.webservices.netsuite.com", name = "baseRef")
    public JAXBElement<BaseRef> createBaseRef(BaseRef value) {
        return new JAXBElement<BaseRef>(_BaseRef_QNAME, BaseRef.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseRefList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:core_2014_2.platform.webservices.netsuite.com", name = "baseRefList")
    public JAXBElement<BaseRefList> createBaseRefList(BaseRefList value) {
        return new JAXBElement<BaseRefList>(_BaseRefList_QNAME, BaseRefList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomizationRefList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:core_2014_2.platform.webservices.netsuite.com", name = "customizationRefList")
    public JAXBElement<CustomizationRefList> createCustomizationRefList(CustomizationRefList value) {
        return new JAXBElement<CustomizationRefList>(_CustomizationRefList_QNAME, CustomizationRefList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitializeRefList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:core_2014_2.platform.webservices.netsuite.com", name = "initializeRefList")
    public JAXBElement<InitializeRefList> createInitializeRefList(InitializeRefList value) {
        return new JAXBElement<InitializeRefList>(_InitializeRefList_QNAME, InitializeRefList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemAvailabilityResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:core_2014_2.platform.webservices.netsuite.com", name = "getItemAvailabilityResult")
    public JAXBElement<GetItemAvailabilityResult> createGetItemAvailabilityResult(GetItemAvailabilityResult value) {
        return new JAXBElement<GetItemAvailabilityResult>(_GetItemAvailabilityResult_QNAME, GetItemAvailabilityResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBudgetExchangeRateResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:core_2014_2.platform.webservices.netsuite.com", name = "getBudgetExchangeRateResult")
    public JAXBElement<GetBudgetExchangeRateResult> createGetBudgetExchangeRateResult(GetBudgetExchangeRateResult value) {
        return new JAXBElement<GetBudgetExchangeRateResult>(_GetBudgetExchangeRateResult_QNAME, GetBudgetExchangeRateResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConsolidatedExchangeRateResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:core_2014_2.platform.webservices.netsuite.com", name = "getConsolidatedExchangeRateResult")
    public JAXBElement<GetConsolidatedExchangeRateResult> createGetConsolidatedExchangeRateResult(GetConsolidatedExchangeRateResult value) {
        return new JAXBElement<GetConsolidatedExchangeRateResult>(_GetConsolidatedExchangeRateResult_QNAME, GetConsolidatedExchangeRateResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrencyRateResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:core_2014_2.platform.webservices.netsuite.com", name = "getCurrencyRateResult")
    public JAXBElement<GetCurrencyRateResult> createGetCurrencyRateResult(GetCurrencyRateResult value) {
        return new JAXBElement<GetCurrencyRateResult>(_GetCurrencyRateResult_QNAME, GetCurrencyRateResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDataCenterUrlsResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:core_2014_2.platform.webservices.netsuite.com", name = "getDataCenterUrlsResult")
    public JAXBElement<GetDataCenterUrlsResult> createGetDataCenterUrlsResult(GetDataCenterUrlsResult value) {
        return new JAXBElement<GetDataCenterUrlsResult>(_GetDataCenterUrlsResult_QNAME, GetDataCenterUrlsResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPostingTransactionSummaryResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:core_2014_2.platform.webservices.netsuite.com", name = "getPostingTransactionSummaryResult")
    public JAXBElement<GetPostingTransactionSummaryResult> createGetPostingTransactionSummaryResult(GetPostingTransactionSummaryResult value) {
        return new JAXBElement<GetPostingTransactionSummaryResult>(_GetPostingTransactionSummaryResult_QNAME, GetPostingTransactionSummaryResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServerTimeResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:core_2014_2.platform.webservices.netsuite.com", name = "getServerTimeResult")
    public JAXBElement<GetServerTimeResult> createGetServerTimeResult(GetServerTimeResult value) {
        return new JAXBElement<GetServerTimeResult>(_GetServerTimeResult_QNAME, GetServerTimeResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletedRecordList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:core_2014_2.platform.webservices.netsuite.com", name = "deletedRecordList")
    public JAXBElement<DeletedRecordList> createDeletedRecordList(DeletedRecordList value) {
        return new JAXBElement<DeletedRecordList>(_DeletedRecordList_QNAME, DeletedRecordList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeletedResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:core_2014_2.platform.webservices.netsuite.com", name = "getDeletedResult")
    public JAXBElement<GetDeletedResult> createGetDeletedResult(GetDeletedResult value) {
        return new JAXBElement<GetDeletedResult>(_GetDeletedResult_QNAME, GetDeletedResult.class, null, value);
    }

}
