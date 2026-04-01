/*
 * XML Type:  discount
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Discount
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML discount(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface Discount extends com.microsoft.schemas.crm._2006.webservices.BusinessEntity
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Discount.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("discount0a3ftype");
    
    /**
     * Gets the "amount" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getAmount();
    
    /**
     * True if has "amount" element
     */
    boolean isSetAmount();
    
    /**
     * Sets the "amount" element
     */
    void setAmount(com.microsoft.schemas.crm._2006.webservices.CrmMoney amount);
    
    /**
     * Appends and returns a new empty "amount" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewAmount();
    
    /**
     * Unsets the "amount" element
     */
    void unsetAmount();
    
    /**
     * Gets the "amount_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getAmountBase();
    
    /**
     * True if has "amount_base" element
     */
    boolean isSetAmountBase();
    
    /**
     * Sets the "amount_base" element
     */
    void setAmountBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney amountBase);
    
    /**
     * Appends and returns a new empty "amount_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewAmountBase();
    
    /**
     * Unsets the "amount_base" element
     */
    void unsetAmountBase();
    
    /**
     * Gets the "createdby" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getCreatedby();
    
    /**
     * True if has "createdby" element
     */
    boolean isSetCreatedby();
    
    /**
     * Sets the "createdby" element
     */
    void setCreatedby(com.microsoft.schemas.crm._2006.webservices.Lookup createdby);
    
    /**
     * Appends and returns a new empty "createdby" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewCreatedby();
    
    /**
     * Unsets the "createdby" element
     */
    void unsetCreatedby();
    
    /**
     * Gets the "createdon" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime getCreatedon();
    
    /**
     * True if has "createdon" element
     */
    boolean isSetCreatedon();
    
    /**
     * Sets the "createdon" element
     */
    void setCreatedon(com.microsoft.schemas.crm._2006.webservices.CrmDateTime createdon);
    
    /**
     * Appends and returns a new empty "createdon" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewCreatedon();
    
    /**
     * Unsets the "createdon" element
     */
    void unsetCreatedon();
    
    /**
     * Gets the "discountid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key getDiscountid();
    
    /**
     * True if has "discountid" element
     */
    boolean isSetDiscountid();
    
    /**
     * Sets the "discountid" element
     */
    void setDiscountid(com.microsoft.schemas.crm._2006.webservices.Key discountid);
    
    /**
     * Appends and returns a new empty "discountid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key addNewDiscountid();
    
    /**
     * Unsets the "discountid" element
     */
    void unsetDiscountid();
    
    /**
     * Gets the "discounttypeid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getDiscounttypeid();
    
    /**
     * True if has "discounttypeid" element
     */
    boolean isSetDiscounttypeid();
    
    /**
     * Sets the "discounttypeid" element
     */
    void setDiscounttypeid(com.microsoft.schemas.crm._2006.webservices.Lookup discounttypeid);
    
    /**
     * Appends and returns a new empty "discounttypeid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewDiscounttypeid();
    
    /**
     * Unsets the "discounttypeid" element
     */
    void unsetDiscounttypeid();
    
    /**
     * Gets the "exchangerate" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDecimal getExchangerate();
    
    /**
     * True if has "exchangerate" element
     */
    boolean isSetExchangerate();
    
    /**
     * Sets the "exchangerate" element
     */
    void setExchangerate(com.microsoft.schemas.crm._2006.webservices.CrmDecimal exchangerate);
    
    /**
     * Appends and returns a new empty "exchangerate" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDecimal addNewExchangerate();
    
    /**
     * Unsets the "exchangerate" element
     */
    void unsetExchangerate();
    
    /**
     * Gets the "highquantity" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDecimal getHighquantity();
    
    /**
     * True if has "highquantity" element
     */
    boolean isSetHighquantity();
    
    /**
     * Sets the "highquantity" element
     */
    void setHighquantity(com.microsoft.schemas.crm._2006.webservices.CrmDecimal highquantity);
    
    /**
     * Appends and returns a new empty "highquantity" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDecimal addNewHighquantity();
    
    /**
     * Unsets the "highquantity" element
     */
    void unsetHighquantity();
    
    /**
     * Gets the "importsequencenumber" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getImportsequencenumber();
    
    /**
     * True if has "importsequencenumber" element
     */
    boolean isSetImportsequencenumber();
    
    /**
     * Sets the "importsequencenumber" element
     */
    void setImportsequencenumber(com.microsoft.schemas.crm._2006.webservices.CrmNumber importsequencenumber);
    
    /**
     * Appends and returns a new empty "importsequencenumber" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewImportsequencenumber();
    
    /**
     * Unsets the "importsequencenumber" element
     */
    void unsetImportsequencenumber();
    
    /**
     * Gets the "isamounttype" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIsamounttype();
    
    /**
     * True if has "isamounttype" element
     */
    boolean isSetIsamounttype();
    
    /**
     * Sets the "isamounttype" element
     */
    void setIsamounttype(com.microsoft.schemas.crm._2006.webservices.CrmBoolean isamounttype);
    
    /**
     * Appends and returns a new empty "isamounttype" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIsamounttype();
    
    /**
     * Unsets the "isamounttype" element
     */
    void unsetIsamounttype();
    
    /**
     * Gets the "lowquantity" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDecimal getLowquantity();
    
    /**
     * True if has "lowquantity" element
     */
    boolean isSetLowquantity();
    
    /**
     * Sets the "lowquantity" element
     */
    void setLowquantity(com.microsoft.schemas.crm._2006.webservices.CrmDecimal lowquantity);
    
    /**
     * Appends and returns a new empty "lowquantity" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDecimal addNewLowquantity();
    
    /**
     * Unsets the "lowquantity" element
     */
    void unsetLowquantity();
    
    /**
     * Gets the "modifiedby" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getModifiedby();
    
    /**
     * True if has "modifiedby" element
     */
    boolean isSetModifiedby();
    
    /**
     * Sets the "modifiedby" element
     */
    void setModifiedby(com.microsoft.schemas.crm._2006.webservices.Lookup modifiedby);
    
    /**
     * Appends and returns a new empty "modifiedby" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewModifiedby();
    
    /**
     * Unsets the "modifiedby" element
     */
    void unsetModifiedby();
    
    /**
     * Gets the "modifiedon" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime getModifiedon();
    
    /**
     * True if has "modifiedon" element
     */
    boolean isSetModifiedon();
    
    /**
     * Sets the "modifiedon" element
     */
    void setModifiedon(com.microsoft.schemas.crm._2006.webservices.CrmDateTime modifiedon);
    
    /**
     * Appends and returns a new empty "modifiedon" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewModifiedon();
    
    /**
     * Unsets the "modifiedon" element
     */
    void unsetModifiedon();
    
    /**
     * Gets the "organizationid" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getOrganizationid();
    
    /**
     * True if has "organizationid" element
     */
    boolean isSetOrganizationid();
    
    /**
     * Sets the "organizationid" element
     */
    void setOrganizationid(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier organizationid);
    
    /**
     * Appends and returns a new empty "organizationid" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewOrganizationid();
    
    /**
     * Unsets the "organizationid" element
     */
    void unsetOrganizationid();
    
    /**
     * Gets the "overriddencreatedon" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime getOverriddencreatedon();
    
    /**
     * True if has "overriddencreatedon" element
     */
    boolean isSetOverriddencreatedon();
    
    /**
     * Sets the "overriddencreatedon" element
     */
    void setOverriddencreatedon(com.microsoft.schemas.crm._2006.webservices.CrmDateTime overriddencreatedon);
    
    /**
     * Appends and returns a new empty "overriddencreatedon" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewOverriddencreatedon();
    
    /**
     * Unsets the "overriddencreatedon" element
     */
    void unsetOverriddencreatedon();
    
    /**
     * Gets the "percentage" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDecimal getPercentage();
    
    /**
     * True if has "percentage" element
     */
    boolean isSetPercentage();
    
    /**
     * Sets the "percentage" element
     */
    void setPercentage(com.microsoft.schemas.crm._2006.webservices.CrmDecimal percentage);
    
    /**
     * Appends and returns a new empty "percentage" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDecimal addNewPercentage();
    
    /**
     * Unsets the "percentage" element
     */
    void unsetPercentage();
    
    /**
     * Gets the "statuscode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Status getStatuscode();
    
    /**
     * True if has "statuscode" element
     */
    boolean isSetStatuscode();
    
    /**
     * Sets the "statuscode" element
     */
    void setStatuscode(com.microsoft.schemas.crm._2006.webservices.Status statuscode);
    
    /**
     * Appends and returns a new empty "statuscode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Status addNewStatuscode();
    
    /**
     * Unsets the "statuscode" element
     */
    void unsetStatuscode();
    
    /**
     * Gets the "transactioncurrencyid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getTransactioncurrencyid();
    
    /**
     * True if has "transactioncurrencyid" element
     */
    boolean isSetTransactioncurrencyid();
    
    /**
     * Sets the "transactioncurrencyid" element
     */
    void setTransactioncurrencyid(com.microsoft.schemas.crm._2006.webservices.Lookup transactioncurrencyid);
    
    /**
     * Appends and returns a new empty "transactioncurrencyid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewTransactioncurrencyid();
    
    /**
     * Unsets the "transactioncurrencyid" element
     */
    void unsetTransactioncurrencyid();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2007.webservices.Discount newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.Discount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Discount newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.Discount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.Discount parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Discount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Discount parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Discount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.Discount parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Discount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Discount parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Discount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Discount parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Discount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Discount parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Discount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Discount parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Discount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Discount parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Discount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Discount parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Discount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Discount parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Discount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Discount parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Discount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Discount parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Discount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Discount parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Discount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Discount parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Discount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Discount parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Discount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Discount parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Discount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
