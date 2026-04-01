
package com.netsuite.webservices.setup.customization;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.netsuite.webservices.setup.customization package. 
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

    private final static QName _CustomRecord_QNAME = new QName("urn:customization_2014_2.setup.webservices.netsuite.com", "CustomRecord");
    private final static QName _CustomRecordSearch_QNAME = new QName("urn:customization_2014_2.setup.webservices.netsuite.com", "customRecordSearch");
    private final static QName _CustomList_QNAME = new QName("urn:customization_2014_2.setup.webservices.netsuite.com", "CustomList");
    private final static QName _CustomRecordType_QNAME = new QName("urn:customization_2014_2.setup.webservices.netsuite.com", "CustomRecordType");
    private final static QName _EntityCustomField_QNAME = new QName("urn:customization_2014_2.setup.webservices.netsuite.com", "EntityCustomField");
    private final static QName _CrmCustomField_QNAME = new QName("urn:customization_2014_2.setup.webservices.netsuite.com", "CrmCustomField");
    private final static QName _OtherCustomField_QNAME = new QName("urn:customization_2014_2.setup.webservices.netsuite.com", "OtherCustomField");
    private final static QName _ItemCustomField_QNAME = new QName("urn:customization_2014_2.setup.webservices.netsuite.com", "ItemCustomField");
    private final static QName _TransactionBodyCustomField_QNAME = new QName("urn:customization_2014_2.setup.webservices.netsuite.com", "TransactionBodyCustomField");
    private final static QName _TransactionColumnCustomField_QNAME = new QName("urn:customization_2014_2.setup.webservices.netsuite.com", "TransactionColumnCustomField");
    private final static QName _ItemOptionCustomField_QNAME = new QName("urn:customization_2014_2.setup.webservices.netsuite.com", "ItemOptionCustomField");
    private final static QName _CustomRecordCustomField_QNAME = new QName("urn:customization_2014_2.setup.webservices.netsuite.com", "CustomRecordCustomField");
    private final static QName _ItemNumberCustomField_QNAME = new QName("urn:customization_2014_2.setup.webservices.netsuite.com", "itemNumberCustomField");
    private final static QName _CustomListSearch_QNAME = new QName("urn:customization_2014_2.setup.webservices.netsuite.com", "customListSearch");
    private final static QName _AppDefinition_QNAME = new QName("urn:customization_2014_2.setup.webservices.netsuite.com", "appDefinition");
    private final static QName _AppDefinitionSearch_QNAME = new QName("urn:customization_2014_2.setup.webservices.netsuite.com", "appDefinitionSearch");
    private final static QName _AppPackage_QNAME = new QName("urn:customization_2014_2.setup.webservices.netsuite.com", "appPackage");
    private final static QName _AppPackageSearch_QNAME = new QName("urn:customization_2014_2.setup.webservices.netsuite.com", "appPackageSearch");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.netsuite.webservices.setup.customization
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CustomRecord }
     * 
     */
    public CustomRecord createCustomRecord() {
        return new CustomRecord();
    }

    /**
     * Create an instance of {@link CustomRecordSearch }
     * 
     */
    public CustomRecordSearch createCustomRecordSearch() {
        return new CustomRecordSearch();
    }

    /**
     * Create an instance of {@link CustomList }
     * 
     */
    public CustomList createCustomList() {
        return new CustomList();
    }

    /**
     * Create an instance of {@link CustomRecordType }
     * 
     */
    public CustomRecordType createCustomRecordType() {
        return new CustomRecordType();
    }

    /**
     * Create an instance of {@link EntityCustomField }
     * 
     */
    public EntityCustomField createEntityCustomField() {
        return new EntityCustomField();
    }

    /**
     * Create an instance of {@link CrmCustomField }
     * 
     */
    public CrmCustomField createCrmCustomField() {
        return new CrmCustomField();
    }

    /**
     * Create an instance of {@link OtherCustomField }
     * 
     */
    public OtherCustomField createOtherCustomField() {
        return new OtherCustomField();
    }

    /**
     * Create an instance of {@link ItemCustomField }
     * 
     */
    public ItemCustomField createItemCustomField() {
        return new ItemCustomField();
    }

    /**
     * Create an instance of {@link TransactionBodyCustomField }
     * 
     */
    public TransactionBodyCustomField createTransactionBodyCustomField() {
        return new TransactionBodyCustomField();
    }

    /**
     * Create an instance of {@link TransactionColumnCustomField }
     * 
     */
    public TransactionColumnCustomField createTransactionColumnCustomField() {
        return new TransactionColumnCustomField();
    }

    /**
     * Create an instance of {@link ItemOptionCustomField }
     * 
     */
    public ItemOptionCustomField createItemOptionCustomField() {
        return new ItemOptionCustomField();
    }

    /**
     * Create an instance of {@link CustomRecordCustomField }
     * 
     */
    public CustomRecordCustomField createCustomRecordCustomField() {
        return new CustomRecordCustomField();
    }

    /**
     * Create an instance of {@link ItemNumberCustomField }
     * 
     */
    public ItemNumberCustomField createItemNumberCustomField() {
        return new ItemNumberCustomField();
    }

    /**
     * Create an instance of {@link CustomListSearch }
     * 
     */
    public CustomListSearch createCustomListSearch() {
        return new CustomListSearch();
    }

    /**
     * Create an instance of {@link AppDefinition }
     * 
     */
    public AppDefinition createAppDefinition() {
        return new AppDefinition();
    }

    /**
     * Create an instance of {@link AppDefinitionSearch }
     * 
     */
    public AppDefinitionSearch createAppDefinitionSearch() {
        return new AppDefinitionSearch();
    }

    /**
     * Create an instance of {@link AppPackage }
     * 
     */
    public AppPackage createAppPackage() {
        return new AppPackage();
    }

    /**
     * Create an instance of {@link AppPackageSearch }
     * 
     */
    public AppPackageSearch createAppPackageSearch() {
        return new AppPackageSearch();
    }

    /**
     * Create an instance of {@link CustomRecordSearchAdvanced }
     * 
     */
    public CustomRecordSearchAdvanced createCustomRecordSearchAdvanced() {
        return new CustomRecordSearchAdvanced();
    }

    /**
     * Create an instance of {@link CustomRecordSearchRow }
     * 
     */
    public CustomRecordSearchRow createCustomRecordSearchRow() {
        return new CustomRecordSearchRow();
    }

    /**
     * Create an instance of {@link CustomListCustomValue }
     * 
     */
    public CustomListCustomValue createCustomListCustomValue() {
        return new CustomListCustomValue();
    }

    /**
     * Create an instance of {@link CustomListCustomValueList }
     * 
     */
    public CustomListCustomValueList createCustomListCustomValueList() {
        return new CustomListCustomValueList();
    }

    /**
     * Create an instance of {@link CustomListTranslations }
     * 
     */
    public CustomListTranslations createCustomListTranslations() {
        return new CustomListTranslations();
    }

    /**
     * Create an instance of {@link CustomListTranslationsList }
     * 
     */
    public CustomListTranslationsList createCustomListTranslationsList() {
        return new CustomListTranslationsList();
    }

    /**
     * Create an instance of {@link CustomRecordTypeFieldList }
     * 
     */
    public CustomRecordTypeFieldList createCustomRecordTypeFieldList() {
        return new CustomRecordTypeFieldList();
    }

    /**
     * Create an instance of {@link CustomRecordTypeTabs }
     * 
     */
    public CustomRecordTypeTabs createCustomRecordTypeTabs() {
        return new CustomRecordTypeTabs();
    }

    /**
     * Create an instance of {@link CustomRecordTypeTabsList }
     * 
     */
    public CustomRecordTypeTabsList createCustomRecordTypeTabsList() {
        return new CustomRecordTypeTabsList();
    }

    /**
     * Create an instance of {@link CustomRecordTypeForms }
     * 
     */
    public CustomRecordTypeForms createCustomRecordTypeForms() {
        return new CustomRecordTypeForms();
    }

    /**
     * Create an instance of {@link CustomRecordTypeFormsList }
     * 
     */
    public CustomRecordTypeFormsList createCustomRecordTypeFormsList() {
        return new CustomRecordTypeFormsList();
    }

    /**
     * Create an instance of {@link CustomRecordTypeOnlineForms }
     * 
     */
    public CustomRecordTypeOnlineForms createCustomRecordTypeOnlineForms() {
        return new CustomRecordTypeOnlineForms();
    }

    /**
     * Create an instance of {@link CustomRecordTypeOnlineFormsList }
     * 
     */
    public CustomRecordTypeOnlineFormsList createCustomRecordTypeOnlineFormsList() {
        return new CustomRecordTypeOnlineFormsList();
    }

    /**
     * Create an instance of {@link CustomRecordTypePermissions }
     * 
     */
    public CustomRecordTypePermissions createCustomRecordTypePermissions() {
        return new CustomRecordTypePermissions();
    }

    /**
     * Create an instance of {@link CustomRecordTypePermissionsList }
     * 
     */
    public CustomRecordTypePermissionsList createCustomRecordTypePermissionsList() {
        return new CustomRecordTypePermissionsList();
    }

    /**
     * Create an instance of {@link CustomRecordTypeLinks }
     * 
     */
    public CustomRecordTypeLinks createCustomRecordTypeLinks() {
        return new CustomRecordTypeLinks();
    }

    /**
     * Create an instance of {@link CustomRecordTypeLinksList }
     * 
     */
    public CustomRecordTypeLinksList createCustomRecordTypeLinksList() {
        return new CustomRecordTypeLinksList();
    }

    /**
     * Create an instance of {@link CustomRecordTypeManagers }
     * 
     */
    public CustomRecordTypeManagers createCustomRecordTypeManagers() {
        return new CustomRecordTypeManagers();
    }

    /**
     * Create an instance of {@link CustomRecordTypeManagersList }
     * 
     */
    public CustomRecordTypeManagersList createCustomRecordTypeManagersList() {
        return new CustomRecordTypeManagersList();
    }

    /**
     * Create an instance of {@link CustomRecordTypeChildren }
     * 
     */
    public CustomRecordTypeChildren createCustomRecordTypeChildren() {
        return new CustomRecordTypeChildren();
    }

    /**
     * Create an instance of {@link CustomRecordTypeChildrenList }
     * 
     */
    public CustomRecordTypeChildrenList createCustomRecordTypeChildrenList() {
        return new CustomRecordTypeChildrenList();
    }

    /**
     * Create an instance of {@link CustomRecordTypeParents }
     * 
     */
    public CustomRecordTypeParents createCustomRecordTypeParents() {
        return new CustomRecordTypeParents();
    }

    /**
     * Create an instance of {@link CustomRecordTypeParentsList }
     * 
     */
    public CustomRecordTypeParentsList createCustomRecordTypeParentsList() {
        return new CustomRecordTypeParentsList();
    }

    /**
     * Create an instance of {@link CustomRecordTypeTranslations }
     * 
     */
    public CustomRecordTypeTranslations createCustomRecordTypeTranslations() {
        return new CustomRecordTypeTranslations();
    }

    /**
     * Create an instance of {@link CustomRecordTypeTranslationsList }
     * 
     */
    public CustomRecordTypeTranslationsList createCustomRecordTypeTranslationsList() {
        return new CustomRecordTypeTranslationsList();
    }

    /**
     * Create an instance of {@link CustomRecordTypeSublists }
     * 
     */
    public CustomRecordTypeSublists createCustomRecordTypeSublists() {
        return new CustomRecordTypeSublists();
    }

    /**
     * Create an instance of {@link CustomRecordTypeSublistsList }
     * 
     */
    public CustomRecordTypeSublistsList createCustomRecordTypeSublistsList() {
        return new CustomRecordTypeSublistsList();
    }

    /**
     * Create an instance of {@link EntityCustomFieldFilter }
     * 
     */
    public EntityCustomFieldFilter createEntityCustomFieldFilter() {
        return new EntityCustomFieldFilter();
    }

    /**
     * Create an instance of {@link EntityCustomFieldFilterList }
     * 
     */
    public EntityCustomFieldFilterList createEntityCustomFieldFilterList() {
        return new EntityCustomFieldFilterList();
    }

    /**
     * Create an instance of {@link FldFilterSelList }
     * 
     */
    public FldFilterSelList createFldFilterSelList() {
        return new FldFilterSelList();
    }

    /**
     * Create an instance of {@link CrmCustomFieldFilter }
     * 
     */
    public CrmCustomFieldFilter createCrmCustomFieldFilter() {
        return new CrmCustomFieldFilter();
    }

    /**
     * Create an instance of {@link CrmCustomFieldFilterList }
     * 
     */
    public CrmCustomFieldFilterList createCrmCustomFieldFilterList() {
        return new CrmCustomFieldFilterList();
    }

    /**
     * Create an instance of {@link OtherCustomFieldFilter }
     * 
     */
    public OtherCustomFieldFilter createOtherCustomFieldFilter() {
        return new OtherCustomFieldFilter();
    }

    /**
     * Create an instance of {@link OtherCustomFieldFilterList }
     * 
     */
    public OtherCustomFieldFilterList createOtherCustomFieldFilterList() {
        return new OtherCustomFieldFilterList();
    }

    /**
     * Create an instance of {@link ItemCustomFieldFilter }
     * 
     */
    public ItemCustomFieldFilter createItemCustomFieldFilter() {
        return new ItemCustomFieldFilter();
    }

    /**
     * Create an instance of {@link ItemCustomFieldFilterList }
     * 
     */
    public ItemCustomFieldFilterList createItemCustomFieldFilterList() {
        return new ItemCustomFieldFilterList();
    }

    /**
     * Create an instance of {@link TransactionBodyCustomFieldFilter }
     * 
     */
    public TransactionBodyCustomFieldFilter createTransactionBodyCustomFieldFilter() {
        return new TransactionBodyCustomFieldFilter();
    }

    /**
     * Create an instance of {@link TransactionBodyCustomFieldFilterList }
     * 
     */
    public TransactionBodyCustomFieldFilterList createTransactionBodyCustomFieldFilterList() {
        return new TransactionBodyCustomFieldFilterList();
    }

    /**
     * Create an instance of {@link TransactionColumnCustomFieldFilter }
     * 
     */
    public TransactionColumnCustomFieldFilter createTransactionColumnCustomFieldFilter() {
        return new TransactionColumnCustomFieldFilter();
    }

    /**
     * Create an instance of {@link TransactionColumnCustomFieldFilterList }
     * 
     */
    public TransactionColumnCustomFieldFilterList createTransactionColumnCustomFieldFilterList() {
        return new TransactionColumnCustomFieldFilterList();
    }

    /**
     * Create an instance of {@link ItemsList }
     * 
     */
    public ItemsList createItemsList() {
        return new ItemsList();
    }

    /**
     * Create an instance of {@link ItemOptionCustomFieldFilter }
     * 
     */
    public ItemOptionCustomFieldFilter createItemOptionCustomFieldFilter() {
        return new ItemOptionCustomFieldFilter();
    }

    /**
     * Create an instance of {@link ItemOptionCustomFieldFilterList }
     * 
     */
    public ItemOptionCustomFieldFilterList createItemOptionCustomFieldFilterList() {
        return new ItemOptionCustomFieldFilterList();
    }

    /**
     * Create an instance of {@link CustomRecordCustomFieldFilter }
     * 
     */
    public CustomRecordCustomFieldFilter createCustomRecordCustomFieldFilter() {
        return new CustomRecordCustomFieldFilter();
    }

    /**
     * Create an instance of {@link CustomRecordCustomFieldFilterList }
     * 
     */
    public CustomRecordCustomFieldFilterList createCustomRecordCustomFieldFilterList() {
        return new CustomRecordCustomFieldFilterList();
    }

    /**
     * Create an instance of {@link CustomFieldRoleAccess }
     * 
     */
    public CustomFieldRoleAccess createCustomFieldRoleAccess() {
        return new CustomFieldRoleAccess();
    }

    /**
     * Create an instance of {@link CustomFieldRoleAccessList }
     * 
     */
    public CustomFieldRoleAccessList createCustomFieldRoleAccessList() {
        return new CustomFieldRoleAccessList();
    }

    /**
     * Create an instance of {@link CustomFieldDepartmentAccess }
     * 
     */
    public CustomFieldDepartmentAccess createCustomFieldDepartmentAccess() {
        return new CustomFieldDepartmentAccess();
    }

    /**
     * Create an instance of {@link CustomFieldDepartmentAccessList }
     * 
     */
    public CustomFieldDepartmentAccessList createCustomFieldDepartmentAccessList() {
        return new CustomFieldDepartmentAccessList();
    }

    /**
     * Create an instance of {@link CustomFieldSubAccess }
     * 
     */
    public CustomFieldSubAccess createCustomFieldSubAccess() {
        return new CustomFieldSubAccess();
    }

    /**
     * Create an instance of {@link CustomFieldSubAccessList }
     * 
     */
    public CustomFieldSubAccessList createCustomFieldSubAccessList() {
        return new CustomFieldSubAccessList();
    }

    /**
     * Create an instance of {@link LanguageValue }
     * 
     */
    public LanguageValue createLanguageValue() {
        return new LanguageValue();
    }

    /**
     * Create an instance of {@link LanguageValueList }
     * 
     */
    public LanguageValueList createLanguageValueList() {
        return new LanguageValueList();
    }

    /**
     * Create an instance of {@link CustomFieldTranslations }
     * 
     */
    public CustomFieldTranslations createCustomFieldTranslations() {
        return new CustomFieldTranslations();
    }

    /**
     * Create an instance of {@link CustomFieldTranslationsList }
     * 
     */
    public CustomFieldTranslationsList createCustomFieldTranslationsList() {
        return new CustomFieldTranslationsList();
    }

    /**
     * Create an instance of {@link ItemNumberCustomFieldFilter }
     * 
     */
    public ItemNumberCustomFieldFilter createItemNumberCustomFieldFilter() {
        return new ItemNumberCustomFieldFilter();
    }

    /**
     * Create an instance of {@link ItemNumberCustomFieldFilterList }
     * 
     */
    public ItemNumberCustomFieldFilterList createItemNumberCustomFieldFilterList() {
        return new ItemNumberCustomFieldFilterList();
    }

    /**
     * Create an instance of {@link CustomListSearchAdvanced }
     * 
     */
    public CustomListSearchAdvanced createCustomListSearchAdvanced() {
        return new CustomListSearchAdvanced();
    }

    /**
     * Create an instance of {@link CustomListSearchRow }
     * 
     */
    public CustomListSearchRow createCustomListSearchRow() {
        return new CustomListSearchRow();
    }

    /**
     * Create an instance of {@link AppDefinitionPackages }
     * 
     */
    public AppDefinitionPackages createAppDefinitionPackages() {
        return new AppDefinitionPackages();
    }

    /**
     * Create an instance of {@link AppDefinitionPackagesList }
     * 
     */
    public AppDefinitionPackagesList createAppDefinitionPackagesList() {
        return new AppDefinitionPackagesList();
    }

    /**
     * Create an instance of {@link AppDefinitionSearchAdvanced }
     * 
     */
    public AppDefinitionSearchAdvanced createAppDefinitionSearchAdvanced() {
        return new AppDefinitionSearchAdvanced();
    }

    /**
     * Create an instance of {@link AppDefinitionSearchRow }
     * 
     */
    public AppDefinitionSearchRow createAppDefinitionSearchRow() {
        return new AppDefinitionSearchRow();
    }

    /**
     * Create an instance of {@link AppPackageSearchAdvanced }
     * 
     */
    public AppPackageSearchAdvanced createAppPackageSearchAdvanced() {
        return new AppPackageSearchAdvanced();
    }

    /**
     * Create an instance of {@link AppPackageSearchRow }
     * 
     */
    public AppPackageSearchRow createAppPackageSearchRow() {
        return new AppPackageSearchRow();
    }

    /**
     * Create an instance of {@link CustomRecordTranslations }
     * 
     */
    public CustomRecordTranslations createCustomRecordTranslations() {
        return new CustomRecordTranslations();
    }

    /**
     * Create an instance of {@link CustomRecordTranslationsList }
     * 
     */
    public CustomRecordTranslationsList createCustomRecordTranslationsList() {
        return new CustomRecordTranslationsList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:customization_2014_2.setup.webservices.netsuite.com", name = "CustomRecord")
    public JAXBElement<CustomRecord> createCustomRecord(CustomRecord value) {
        return new JAXBElement<CustomRecord>(_CustomRecord_QNAME, CustomRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomRecordSearch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:customization_2014_2.setup.webservices.netsuite.com", name = "customRecordSearch")
    public JAXBElement<CustomRecordSearch> createCustomRecordSearch(CustomRecordSearch value) {
        return new JAXBElement<CustomRecordSearch>(_CustomRecordSearch_QNAME, CustomRecordSearch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:customization_2014_2.setup.webservices.netsuite.com", name = "CustomList")
    public JAXBElement<CustomList> createCustomList(CustomList value) {
        return new JAXBElement<CustomList>(_CustomList_QNAME, CustomList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomRecordType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:customization_2014_2.setup.webservices.netsuite.com", name = "CustomRecordType")
    public JAXBElement<CustomRecordType> createCustomRecordType(CustomRecordType value) {
        return new JAXBElement<CustomRecordType>(_CustomRecordType_QNAME, CustomRecordType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityCustomField }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:customization_2014_2.setup.webservices.netsuite.com", name = "EntityCustomField")
    public JAXBElement<EntityCustomField> createEntityCustomField(EntityCustomField value) {
        return new JAXBElement<EntityCustomField>(_EntityCustomField_QNAME, EntityCustomField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrmCustomField }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:customization_2014_2.setup.webservices.netsuite.com", name = "CrmCustomField")
    public JAXBElement<CrmCustomField> createCrmCustomField(CrmCustomField value) {
        return new JAXBElement<CrmCustomField>(_CrmCustomField_QNAME, CrmCustomField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherCustomField }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:customization_2014_2.setup.webservices.netsuite.com", name = "OtherCustomField")
    public JAXBElement<OtherCustomField> createOtherCustomField(OtherCustomField value) {
        return new JAXBElement<OtherCustomField>(_OtherCustomField_QNAME, OtherCustomField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemCustomField }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:customization_2014_2.setup.webservices.netsuite.com", name = "ItemCustomField")
    public JAXBElement<ItemCustomField> createItemCustomField(ItemCustomField value) {
        return new JAXBElement<ItemCustomField>(_ItemCustomField_QNAME, ItemCustomField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionBodyCustomField }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:customization_2014_2.setup.webservices.netsuite.com", name = "TransactionBodyCustomField")
    public JAXBElement<TransactionBodyCustomField> createTransactionBodyCustomField(TransactionBodyCustomField value) {
        return new JAXBElement<TransactionBodyCustomField>(_TransactionBodyCustomField_QNAME, TransactionBodyCustomField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionColumnCustomField }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:customization_2014_2.setup.webservices.netsuite.com", name = "TransactionColumnCustomField")
    public JAXBElement<TransactionColumnCustomField> createTransactionColumnCustomField(TransactionColumnCustomField value) {
        return new JAXBElement<TransactionColumnCustomField>(_TransactionColumnCustomField_QNAME, TransactionColumnCustomField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemOptionCustomField }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:customization_2014_2.setup.webservices.netsuite.com", name = "ItemOptionCustomField")
    public JAXBElement<ItemOptionCustomField> createItemOptionCustomField(ItemOptionCustomField value) {
        return new JAXBElement<ItemOptionCustomField>(_ItemOptionCustomField_QNAME, ItemOptionCustomField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomRecordCustomField }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:customization_2014_2.setup.webservices.netsuite.com", name = "CustomRecordCustomField")
    public JAXBElement<CustomRecordCustomField> createCustomRecordCustomField(CustomRecordCustomField value) {
        return new JAXBElement<CustomRecordCustomField>(_CustomRecordCustomField_QNAME, CustomRecordCustomField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemNumberCustomField }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:customization_2014_2.setup.webservices.netsuite.com", name = "itemNumberCustomField")
    public JAXBElement<ItemNumberCustomField> createItemNumberCustomField(ItemNumberCustomField value) {
        return new JAXBElement<ItemNumberCustomField>(_ItemNumberCustomField_QNAME, ItemNumberCustomField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomListSearch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:customization_2014_2.setup.webservices.netsuite.com", name = "customListSearch")
    public JAXBElement<CustomListSearch> createCustomListSearch(CustomListSearch value) {
        return new JAXBElement<CustomListSearch>(_CustomListSearch_QNAME, CustomListSearch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:customization_2014_2.setup.webservices.netsuite.com", name = "appDefinition")
    public JAXBElement<AppDefinition> createAppDefinition(AppDefinition value) {
        return new JAXBElement<AppDefinition>(_AppDefinition_QNAME, AppDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppDefinitionSearch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:customization_2014_2.setup.webservices.netsuite.com", name = "appDefinitionSearch")
    public JAXBElement<AppDefinitionSearch> createAppDefinitionSearch(AppDefinitionSearch value) {
        return new JAXBElement<AppDefinitionSearch>(_AppDefinitionSearch_QNAME, AppDefinitionSearch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppPackage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:customization_2014_2.setup.webservices.netsuite.com", name = "appPackage")
    public JAXBElement<AppPackage> createAppPackage(AppPackage value) {
        return new JAXBElement<AppPackage>(_AppPackage_QNAME, AppPackage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppPackageSearch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:customization_2014_2.setup.webservices.netsuite.com", name = "appPackageSearch")
    public JAXBElement<AppPackageSearch> createAppPackageSearch(AppPackageSearch value) {
        return new JAXBElement<AppPackageSearch>(_AppPackageSearch_QNAME, AppPackageSearch.class, null, value);
    }

}
