<?xml version="1.0" encoding="UTF-8"?>
<wsdl:definitions xmlns:s0="http://microsoft.com/wsdl/types/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:s3="http://schemas.microsoft.com/crm/2006/WebServices" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://schemas.microsoft.com/crm/2007/WebServices" xmlns:s4="http://schemas.microsoft.com/crm/2006/Scheduling" xmlns:s1="http://schemas.microsoft.com/crm/2006/CoreTypes" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:s2="http://schemas.microsoft.com/crm/2006/Query" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:s5="http://schemas.microsoft.com/crm/2007/CoreTypes" targetNamespace="http://schemas.microsoft.com/crm/2007/WebServices" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://microsoft.com/wsdl/types/">
      <s:simpleType name="guid">
        <s:restriction base="s:string">
          <s:pattern value="[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}"/>
        </s:restriction>
      </s:simpleType>
    </s:schema>
    <s:schema elementFormDefault="qualified" targetNamespace="http://schemas.microsoft.com/crm/2006/CoreTypes">
      <s:import namespace="http://microsoft.com/wsdl/types/"/>
      <s:simpleType name="AccessRights">
        <s:list>
          <s:simpleType>
            <s:restriction base="s:string">
              <s:enumeration value="ReadAccess"/>
              <s:enumeration value="WriteAccess"/>
              <s:enumeration value="AppendAccess"/>
              <s:enumeration value="AppendToAccess"/>
              <s:enumeration value="CreateAccess"/>
              <s:enumeration value="DeleteAccess"/>
              <s:enumeration value="ShareAccess"/>
              <s:enumeration value="AssignAccess"/>
            </s:restriction>
          </s:simpleType>
        </s:list>
      </s:simpleType>
      <s:complexType name="Moniker">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="Id" type="s0:guid"/>
          <s:element minOccurs="0" maxOccurs="1" name="Name" type="s:string"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="PrincipalAccess">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Principal" type="s1:SecurityPrincipal"/>
          <s:element minOccurs="1" maxOccurs="1" name="AccessMask" type="s1:AccessRights"/>
        </s:sequence>
      </s:complexType>
      <s:simpleType name="PrivilegeDepth">
        <s:restriction base="s:string">
          <s:enumeration value="Basic"/>
          <s:enumeration value="Local"/>
          <s:enumeration value="Deep"/>
          <s:enumeration value="Global"/>
        </s:restriction>
      </s:simpleType>
      <s:simpleType name="PropagationOwnershipOptions">
        <s:restriction base="s:string">
          <s:enumeration value="None"/>
          <s:enumeration value="Caller"/>
          <s:enumeration value="ListMemberOwner"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="RolePrivilege">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="Depth" type="s1:PrivilegeDepth"/>
          <s:element minOccurs="1" maxOccurs="1" name="PrivilegeId" type="s0:guid"/>
        </s:sequence>
      </s:complexType>
      <s:simpleType name="RollupType">
        <s:restriction base="s:string">
          <s:enumeration value="None"/>
          <s:enumeration value="Related"/>
          <s:enumeration value="Extended"/>
        </s:restriction>
      </s:simpleType>
      <s:simpleType name="RouteType">
        <s:restriction base="s:string">
          <s:enumeration value="Auto"/>
          <s:enumeration value="User"/>
          <s:enumeration value="Queue"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="SecurityPrincipal">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="PrincipalId" type="s0:guid"/>
          <s:element minOccurs="1" maxOccurs="1" name="Type" type="s1:SecurityPrincipalType"/>
        </s:sequence>
      </s:complexType>
      <s:simpleType name="SecurityPrincipalType">
        <s:restriction base="s:string">
          <s:enumeration value="User"/>
          <s:enumeration value="Team"/>
        </s:restriction>
      </s:simpleType>
    </s:schema>
    <s:schema elementFormDefault="qualified" targetNamespace="http://schemas.microsoft.com/crm/2006/Query">
      <s:complexType name="AllColumns">
        <s:complexContent mixed="false">
          <s:extension base="s2:ColumnSetBase"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ArrayOfAnyType">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="Value" nillable="true"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfConditionExpression">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="Condition" type="s2:ConditionExpression"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfFilterExpression">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="Filter" type="s2:FilterExpression"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfLinkEntity">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="LinkEntity" type="s2:LinkEntity"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfOrderExpression">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="Order" type="s2:OrderExpression"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfString">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="Attribute" type="s:string"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="ColumnSet">
        <s:complexContent mixed="false">
          <s:extension base="s2:ColumnSetBase">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="Attributes" type="s2:ArrayOfString"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ColumnSetBase" abstract="true"/>
      <s:complexType name="ConditionExpression">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="AttributeName" type="s:string"/>
          <s:element minOccurs="1" maxOccurs="1" name="Operator" type="s2:ConditionOperator"/>
          <s:element minOccurs="0" maxOccurs="1" name="Values" type="s2:ArrayOfAnyType"/>
        </s:sequence>
      </s:complexType>
      <s:simpleType name="ConditionOperator">
        <s:restriction base="s:string">
          <s:enumeration value="Equal"/>
          <s:enumeration value="NotEqual"/>
          <s:enumeration value="GreaterThan"/>
          <s:enumeration value="LessThan"/>
          <s:enumeration value="GreaterEqual"/>
          <s:enumeration value="LessEqual"/>
          <s:enumeration value="Like"/>
          <s:enumeration value="NotLike"/>
          <s:enumeration value="In"/>
          <s:enumeration value="NotIn"/>
          <s:enumeration value="Between"/>
          <s:enumeration value="NotBetween"/>
          <s:enumeration value="Null"/>
          <s:enumeration value="NotNull"/>
          <s:enumeration value="Yesterday"/>
          <s:enumeration value="Today"/>
          <s:enumeration value="Tomorrow"/>
          <s:enumeration value="Last7Days"/>
          <s:enumeration value="Next7Days"/>
          <s:enumeration value="LastWeek"/>
          <s:enumeration value="ThisWeek"/>
          <s:enumeration value="NextWeek"/>
          <s:enumeration value="LastMonth"/>
          <s:enumeration value="ThisMonth"/>
          <s:enumeration value="NextMonth"/>
          <s:enumeration value="On"/>
          <s:enumeration value="OnOrBefore"/>
          <s:enumeration value="OnOrAfter"/>
          <s:enumeration value="LastYear"/>
          <s:enumeration value="ThisYear"/>
          <s:enumeration value="NextYear"/>
          <s:enumeration value="LastXHours"/>
          <s:enumeration value="NextXHours"/>
          <s:enumeration value="LastXDays"/>
          <s:enumeration value="NextXDays"/>
          <s:enumeration value="LastXWeeks"/>
          <s:enumeration value="NextXWeeks"/>
          <s:enumeration value="LastXMonths"/>
          <s:enumeration value="NextXMonths"/>
          <s:enumeration value="LastXYears"/>
          <s:enumeration value="NextXYears"/>
          <s:enumeration value="EqualUserId"/>
          <s:enumeration value="NotEqualUserId"/>
          <s:enumeration value="EqualBusinessId"/>
          <s:enumeration value="NotEqualBusinessId"/>
          <s:enumeration value="EqualUserLanguage"/>
          <s:enumeration value="NotOn"/>
          <s:enumeration value="OlderThanXMonths"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="FilterExpression">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="FilterOperator" type="s2:LogicalOperator"/>
          <s:element minOccurs="0" maxOccurs="1" name="Conditions" type="s2:ArrayOfConditionExpression"/>
          <s:element minOccurs="0" maxOccurs="1" name="Filters" type="s2:ArrayOfFilterExpression"/>
        </s:sequence>
      </s:complexType>
      <s:simpleType name="JoinOperator">
        <s:restriction base="s:string">
          <s:enumeration value="Inner"/>
          <s:enumeration value="LeftOuter"/>
          <s:enumeration value="Natural"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="LinkEntity">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="LinkFromAttributeName" type="s:string"/>
          <s:element minOccurs="0" maxOccurs="1" name="LinkFromEntityName" type="s:string"/>
          <s:element minOccurs="0" maxOccurs="1" name="LinkToEntityName" type="s:string"/>
          <s:element minOccurs="0" maxOccurs="1" name="LinkToAttributeName" type="s:string"/>
          <s:element minOccurs="1" maxOccurs="1" name="JoinOperator" type="s2:JoinOperator"/>
          <s:element minOccurs="0" maxOccurs="1" name="LinkCriteria" type="s2:FilterExpression"/>
          <s:element minOccurs="0" maxOccurs="1" name="LinkEntities" type="s2:ArrayOfLinkEntity"/>
        </s:sequence>
      </s:complexType>
      <s:simpleType name="LogicalOperator">
        <s:restriction base="s:string">
          <s:enumeration value="And"/>
          <s:enumeration value="Or"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="OrderExpression">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="AttributeName" type="s:string"/>
          <s:element minOccurs="1" maxOccurs="1" name="OrderType" type="s2:OrderType"/>
        </s:sequence>
      </s:complexType>
      <s:simpleType name="OrderType">
        <s:restriction base="s:string">
          <s:enumeration value="Ascending"/>
          <s:enumeration value="Descending"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="PagingInfo">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="PageNumber" type="s:int"/>
          <s:element minOccurs="1" maxOccurs="1" name="Count" type="s:int"/>
          <s:element minOccurs="0" maxOccurs="1" name="PagingCookie" type="s:string"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="QueryBase" abstract="true">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="EntityName" type="s:string"/>
          <s:element minOccurs="0" maxOccurs="1" name="ColumnSet" type="s2:ColumnSetBase"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="QueryByAttribute">
        <s:complexContent mixed="false">
          <s:extension base="s2:QueryBase">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="Attributes" type="s2:ArrayOfString"/>
              <s:element minOccurs="0" maxOccurs="1" name="Values" type="s2:ArrayOfAnyType"/>
              <s:element minOccurs="0" maxOccurs="1" name="PageInfo" type="s2:PagingInfo"/>
              <s:element minOccurs="0" maxOccurs="1" name="Orders" type="s2:ArrayOfOrderExpression"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="QueryExpression">
        <s:complexContent mixed="false">
          <s:extension base="s2:QueryBase">
            <s:sequence>
              <s:element minOccurs="1" maxOccurs="1" name="Distinct" type="s:boolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="PageInfo" type="s2:PagingInfo"/>
              <s:element minOccurs="0" maxOccurs="1" name="LinkEntities" type="s2:ArrayOfLinkEntity"/>
              <s:element minOccurs="0" maxOccurs="1" name="Criteria" type="s2:FilterExpression"/>
              <s:element minOccurs="0" maxOccurs="1" name="Orders" type="s2:ArrayOfOrderExpression"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
    </s:schema>
    <s:schema elementFormDefault="qualified" targetNamespace="http://schemas.microsoft.com/crm/2006/WebServices">
      <s:import namespace="http://microsoft.com/wsdl/types/"/>
      <s:element name="BusinessEntity" type="s3:BusinessEntity"/>
      <s:element name="BusinessEntityCollection" type="s3:BusinessEntityCollection"/>
      <s:element name="DuplicateCollection" type="s3:BusinessEntityCollection"/>
      <s:element name="Entity" type="s3:BusinessEntity"/>
      <s:complexType name="ArrayOfBusinessEntity">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="BusinessEntity" type="s3:BusinessEntity"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfDynamicEntity">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="DynamicEntity" type="s3:DynamicEntity"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="BusinessEntity" abstract="true"/>
      <s:complexType name="BusinessEntityCollection">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="BusinessEntities" type="s3:ArrayOfBusinessEntity"/>
        </s:sequence>
        <s:attribute name="EntityName" type="s:string"/>
        <s:attribute name="MoreRecords" type="s:boolean" use="required"/>
        <s:attribute name="PagingCookie" type="s:string"/>
        <s:attribute name="Version" type="s:string"/>
      </s:complexType>
      <s:complexType name="CrmBoolean">
        <s:simpleContent>
          <s:extension base="s:boolean">
            <s:attribute name="IsNull" type="s:boolean"/>
            <s:attribute name="name" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="CrmBooleanProperty">
        <s:complexContent mixed="false">
          <s:extension base="s3:Property">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="Value" type="s3:CrmBoolean"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="CrmDateTime">
        <s:simpleContent>
          <s:extension base="s:string">
            <s:attribute name="IsNull" type="s:boolean"/>
            <s:attribute name="date" type="s:string"/>
            <s:attribute name="time" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="CrmDateTimeProperty">
        <s:complexContent mixed="false">
          <s:extension base="s3:Property">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="Value" type="s3:CrmDateTime"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="CrmDecimal">
        <s:simpleContent>
          <s:extension base="s:decimal">
            <s:attribute name="IsNull" type="s:boolean"/>
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="CrmDecimalProperty">
        <s:complexContent mixed="false">
          <s:extension base="s3:Property">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="Value" type="s3:CrmDecimal"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="CrmFloat">
        <s:simpleContent>
          <s:extension base="s:double">
            <s:attribute name="IsNull" type="s:boolean"/>
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="CrmFloatProperty">
        <s:complexContent mixed="false">
          <s:extension base="s3:Property">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="Value" type="s3:CrmFloat"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="CrmMoney">
        <s:simpleContent>
          <s:extension base="s:decimal">
            <s:attribute name="IsNull" type="s:boolean"/>
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="CrmMoneyProperty">
        <s:complexContent mixed="false">
          <s:extension base="s3:Property">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="Value" type="s3:CrmMoney"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="CrmNumber">
        <s:simpleContent>
          <s:extension base="s:int">
            <s:attribute name="IsNull" type="s:boolean"/>
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="CrmNumberProperty">
        <s:complexContent mixed="false">
          <s:extension base="s3:Property">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="Value" type="s3:CrmNumber"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="CrmReference" abstract="true">
        <s:simpleContent>
          <s:extension base="s0:guid">
            <s:attribute name="IsNull" type="s:boolean"/>
            <s:attribute name="name" type="s:string"/>
            <s:attribute name="type" type="s:string"/>
            <s:attribute name="dsc" type="s:int"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="Customer">
        <s:simpleContent>
          <s:extension base="s3:CrmReference"/>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="CustomerProperty">
        <s:complexContent mixed="false">
          <s:extension base="s3:Property">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="Value" type="s3:Customer"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="DynamicEntity">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="Properties">
                <s:complexType>
                  <s:sequence>
                    <s:element minOccurs="0" maxOccurs="unbounded" name="Property" nillable="true" type="s3:Property"/>
                  </s:sequence>
                </s:complexType>
              </s:element>
            </s:sequence>
            <s:attribute name="Name" type="s:string"/>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="DynamicEntityArrayProperty">
        <s:complexContent mixed="false">
          <s:extension base="s3:Property">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="Value" type="s3:ArrayOfDynamicEntity"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="EntityNameReference">
        <s:simpleContent>
          <s:extension base="s:string">
            <s:attribute name="IsNull" type="s:boolean"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="EntityNameReferenceProperty">
        <s:complexContent mixed="false">
          <s:extension base="s3:Property">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="Value" type="s3:EntityNameReference"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="Key">
        <s:simpleContent>
          <s:extension base="s0:guid"/>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="KeyProperty">
        <s:complexContent mixed="false">
          <s:extension base="s3:Property">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="Value" type="s3:Key"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="Lookup">
        <s:simpleContent>
          <s:extension base="s3:CrmReference"/>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="LookupProperty">
        <s:complexContent mixed="false">
          <s:extension base="s3:Property">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="Value" type="s3:Lookup"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="Owner">
        <s:simpleContent>
          <s:extension base="s3:CrmReference"/>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="OwnerProperty">
        <s:complexContent mixed="false">
          <s:extension base="s3:Property">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="Value" type="s3:Owner"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="Picklist">
        <s:simpleContent>
          <s:extension base="s:int">
            <s:attribute name="IsNull" type="s:boolean"/>
            <s:attribute name="name" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="PicklistProperty">
        <s:complexContent mixed="false">
          <s:extension base="s3:Property">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="Value" type="s3:Picklist"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="Property" abstract="true">
        <s:attribute name="Name" type="s:string"/>
      </s:complexType>
      <s:complexType name="StateProperty">
        <s:complexContent mixed="false">
          <s:extension base="s3:Property">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="Value" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="Status">
        <s:simpleContent>
          <s:extension base="s:int">
            <s:attribute name="IsNull" type="s:boolean"/>
            <s:attribute name="name" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="StatusProperty">
        <s:complexContent mixed="false">
          <s:extension base="s3:Property">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="Value" type="s3:Status"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="StringProperty">
        <s:complexContent mixed="false">
          <s:extension base="s3:Property">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="Value" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:simpleType name="TargetFieldType">
        <s:restriction base="s:string">
          <s:enumeration value="All"/>
          <s:enumeration value="ValidForCreate"/>
          <s:enumeration value="ValidForUpdate"/>
          <s:enumeration value="ValidForRead"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="UniqueIdentifier">
        <s:simpleContent>
          <s:extension base="s0:guid">
            <s:attribute name="IsNull" type="s:boolean"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="UniqueIdentifierProperty">
        <s:complexContent mixed="false">
          <s:extension base="s3:Property">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="Value" type="s3:UniqueIdentifier"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
    </s:schema>
    <s:schema elementFormDefault="qualified" targetNamespace="http://schemas.microsoft.com/crm/2006/Scheduling">
      <s:import namespace="http://microsoft.com/wsdl/types/"/>
      <s:import namespace="http://schemas.microsoft.com/crm/2006/WebServices"/>
      <s:complexType name="AppointmentProposal">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Start" type="s3:CrmDateTime"/>
          <s:element minOccurs="0" maxOccurs="1" name="End" type="s3:CrmDateTime"/>
          <s:element minOccurs="1" maxOccurs="1" name="SiteId" type="s0:guid"/>
          <s:element minOccurs="0" maxOccurs="1" name="SiteName" type="s:string"/>
          <s:element minOccurs="0" maxOccurs="1" name="ProposalParties" type="s4:ArrayOfProposalParty"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="AppointmentRequest">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="ServiceId" type="s0:guid"/>
          <s:element minOccurs="1" maxOccurs="1" name="AnchorOffset" type="s:int"/>
          <s:element minOccurs="1" maxOccurs="1" name="UserTimeZoneCode" type="s:int"/>
          <s:element minOccurs="1" maxOccurs="1" name="RecurrenceDuration" type="s:int"/>
          <s:element minOccurs="1" maxOccurs="1" name="RecurrenceTimeZoneCode" type="s:int"/>
          <s:element minOccurs="0" maxOccurs="1" name="AppointmentsToIgnore" type="s4:ArrayOfAppointmentsToIgnore"/>
          <s:element minOccurs="0" maxOccurs="1" name="RequiredResources" type="s4:ArrayOfRequiredResource"/>
          <s:element minOccurs="0" maxOccurs="1" name="SearchWindowStart" type="s3:CrmDateTime"/>
          <s:element minOccurs="0" maxOccurs="1" name="SearchWindowEnd" type="s3:CrmDateTime"/>
          <s:element minOccurs="0" maxOccurs="1" name="SearchRecurrenceStart" type="s3:CrmDateTime"/>
          <s:element minOccurs="0" maxOccurs="1" name="SearchRecurrenceRule" type="s:string"/>
          <s:element minOccurs="1" maxOccurs="1" name="Duration" type="s:int"/>
          <s:element minOccurs="0" maxOccurs="1" name="Constraints" type="s4:ArrayOfConstraintRelation"/>
          <s:element minOccurs="0" maxOccurs="1" name="Objectives" type="s4:ArrayOfObjectiveRelation"/>
          <s:element minOccurs="1" maxOccurs="1" name="Direction" type="s4:SearchDirection"/>
          <s:element minOccurs="1" maxOccurs="1" name="NumberOfResults" type="s:int"/>
          <s:element minOccurs="0" maxOccurs="1" name="Sites" type="s4:ArrayOfGuid"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="AppointmentsToIgnore">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Appointments" type="s4:ArrayOfGuid"/>
          <s:element minOccurs="1" maxOccurs="1" name="ResourceId" type="s0:guid"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfAppointmentProposal">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="AppointmentProposal" nillable="true" type="s4:AppointmentProposal"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfAppointmentsToIgnore">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="AppointmentsToIgnore" nillable="true" type="s4:AppointmentsToIgnore"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfConstraintRelation">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="ConstraintRelation" nillable="true" type="s4:ConstraintRelation"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfErrorInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="ErrorInfo" nillable="true" type="s4:ErrorInfo"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfGuid">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="guid" type="s0:guid"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfObjectiveRelation">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="ObjectiveRelation" nillable="true" type="s4:ObjectiveRelation"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfProposalParty">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="ProposalParty" nillable="true" type="s4:ProposalParty"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfRequiredResource">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="RequiredResource" nillable="true" type="s4:RequiredResource"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfResourceInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="ResourceInfo" nillable="true" type="s4:ResourceInfo"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="ConstraintRelation">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="ObjectId" type="s0:guid"/>
          <s:element minOccurs="0" maxOccurs="1" name="ConstraintType" type="s:string"/>
          <s:element minOccurs="0" maxOccurs="1" name="Constraints" type="s:string"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="ErrorInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="ResourceList" type="s4:ArrayOfResourceInfo"/>
          <s:element minOccurs="0" maxOccurs="1" name="ErrorCode" type="s:string"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="ObjectiveRelation">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="ResourceSpecId" type="s0:guid"/>
          <s:element minOccurs="0" maxOccurs="1" name="ObjectiveExpression" type="s:string"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="ProposalParty">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="ResourceId" type="s0:guid"/>
          <s:element minOccurs="1" maxOccurs="1" name="ResourceSpecId" type="s0:guid"/>
          <s:element minOccurs="0" maxOccurs="1" name="DisplayName" type="s:string"/>
          <s:element minOccurs="0" maxOccurs="1" name="EntityName" type="s:string"/>
          <s:element minOccurs="1" maxOccurs="1" name="EffortRequired" type="s:double"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="RequiredResource">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="ResourceId" type="s0:guid"/>
          <s:element minOccurs="1" maxOccurs="1" name="ResourceSpecId" type="s0:guid"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="ResourceInfo">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="Id" type="s0:guid"/>
          <s:element minOccurs="0" maxOccurs="1" name="DisplayName" type="s:string"/>
          <s:element minOccurs="0" maxOccurs="1" name="EntityName" type="s:string"/>
        </s:sequence>
      </s:complexType>
      <s:simpleType name="SearchDirection">
        <s:restriction base="s:string">
          <s:enumeration value="Forward"/>
          <s:enumeration value="Backward"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="SearchResults">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Proposals" type="s4:ArrayOfAppointmentProposal"/>
          <s:element minOccurs="0" maxOccurs="1" name="TraceInfo" type="s4:TraceInfo"/>
        </s:sequence>
      </s:complexType>
      <s:simpleType name="SubCode">
        <s:restriction base="s:string">
          <s:enumeration value="Unspecified"/>
          <s:enumeration value="Schedulable"/>
          <s:enumeration value="Committed"/>
          <s:enumeration value="Uncommitted"/>
          <s:enumeration value="Break"/>
          <s:enumeration value="Holiday"/>
          <s:enumeration value="Vacation"/>
          <s:enumeration value="Appointment"/>
          <s:enumeration value="ResourceStartTime"/>
          <s:enumeration value="ResourceServiceRestriction"/>
          <s:enumeration value="ResourceCapacity"/>
          <s:enumeration value="ServiceRestriction"/>
          <s:enumeration value="ServiceCost"/>
        </s:restriction>
      </s:simpleType>
      <s:simpleType name="TimeCode">
        <s:restriction base="s:string">
          <s:enumeration value="Available"/>
          <s:enumeration value="Busy"/>
          <s:enumeration value="Unavailable"/>
          <s:enumeration value="Filter"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="TimeInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Start" type="s3:CrmDateTime"/>
          <s:element minOccurs="0" maxOccurs="1" name="End" type="s3:CrmDateTime"/>
          <s:element minOccurs="1" maxOccurs="1" name="TimeCode" type="s4:TimeCode"/>
          <s:element minOccurs="1" maxOccurs="1" name="SubCode" type="s4:SubCode"/>
          <s:element minOccurs="1" maxOccurs="1" name="SourceId" type="s0:guid"/>
          <s:element minOccurs="1" maxOccurs="1" name="CalendarId" type="s0:guid"/>
          <s:element minOccurs="1" maxOccurs="1" name="SourceTypeCode" type="s:int"/>
          <s:element minOccurs="1" maxOccurs="1" name="IsActivity" type="s:boolean"/>
          <s:element minOccurs="1" maxOccurs="1" name="ActivityStatusCode" type="s:int"/>
          <s:element minOccurs="1" maxOccurs="1" name="Effort" type="s:double"/>
          <s:element minOccurs="0" maxOccurs="1" name="DisplayText" type="s:string"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="TraceInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="ErrorInfoList" type="s4:ArrayOfErrorInfo"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="ValidationResult">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="ValidationSuccess" type="s:boolean"/>
          <s:element minOccurs="0" maxOccurs="1" name="TraceInfo" type="s4:TraceInfo"/>
          <s:element minOccurs="1" maxOccurs="1" name="ActivityId" type="s0:guid"/>
        </s:sequence>
      </s:complexType>
    </s:schema>
    <s:schema elementFormDefault="qualified" targetNamespace="http://schemas.microsoft.com/crm/2007/CoreTypes">
      <s:import namespace="http://microsoft.com/wsdl/types/"/>
      <s:import namespace="http://schemas.microsoft.com/crm/2006/WebServices"/>
      <s:complexType name="ApplicationOrigin">
        <s:complexContent mixed="false">
          <s:extension base="s5:CallerOrigin"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="AsyncServiceOrigin">
        <s:complexContent mixed="false">
          <s:extension base="s5:CallerOrigin"/>
        </s:complexContent>
      </s:complexType>
      <s:simpleType name="BulkOperationSource">
        <s:restriction base="s:string">
          <s:enumeration value="QuickCampaign"/>
          <s:enumeration value="CampaignActivity"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="CallerOrigin" abstract="true"/>
      <s:complexType name="CallerOriginToken">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="CallerOrigin" type="s5:CallerOrigin"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="CorrelationToken">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="CorrelationId" type="s0:guid"/>
          <s:element minOccurs="0" maxOccurs="1" name="CorrelationUpdatedTime" type="s3:CrmDateTime"/>
          <s:element minOccurs="1" maxOccurs="1" name="Depth" type="s:int"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="CrmAuthenticationToken">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="AuthenticationType" type="s:int"/>
          <s:element minOccurs="0" maxOccurs="1" name="CrmTicket" type="s:string"/>
          <s:element minOccurs="0" maxOccurs="1" name="OrganizationName" type="s:string"/>
          <s:element minOccurs="1" maxOccurs="1" name="CallerId" type="s0:guid"/>
        </s:sequence>
      </s:complexType>
      <s:simpleType name="EntitySource">
        <s:restriction base="s:string">
          <s:enumeration value="Account"/>
          <s:enumeration value="Contact"/>
          <s:enumeration value="Lead"/>
          <s:enumeration value="All"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="OfflineOrigin">
        <s:complexContent mixed="false">
          <s:extension base="s5:CallerOrigin">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="OfflineTimestamp" type="s3:CrmDateTime"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="WebServiceApiOrigin">
        <s:complexContent mixed="false">
          <s:extension base="s5:CallerOrigin"/>
        </s:complexContent>
      </s:complexType>
    </s:schema>
    <s:schema elementFormDefault="qualified" targetNamespace="http://schemas.microsoft.com/crm/2007/WebServices">
      <s:import namespace="http://microsoft.com/wsdl/types/"/>
      <s:import namespace="http://schemas.microsoft.com/crm/2006/CoreTypes"/>
      <s:import namespace="http://schemas.microsoft.com/crm/2006/Query"/>
      <s:import namespace="http://schemas.microsoft.com/crm/2006/Scheduling"/>
      <s:import namespace="http://schemas.microsoft.com/crm/2006/WebServices"/>
      <s:import namespace="http://schemas.microsoft.com/crm/2007/CoreTypes"/>
      <s:element name="AccessRights" type="s1:AccessRights"/>
      <s:element name="AppointmentRequest" nillable="true" type="s4:AppointmentRequest"/>
      <s:element name="ArrayOfArrayOfString" nillable="true" type="tns:ArrayOfArrayOfString"/>
      <s:element name="ArrayOfArrayOfTimeInfo" nillable="true" type="tns:ArrayOfArrayOfTimeInfo"/>
      <s:element name="ArrayOfBoolean" nillable="true" type="tns:ArrayOfBoolean"/>
      <s:element name="ArrayOfGuid" nillable="true" type="tns:ArrayOfGuid"/>
      <s:element name="ArrayOfInt" nillable="true" type="tns:ArrayOfInt"/>
      <s:element name="ArrayOfLocLabel" nillable="true" type="tns:ArrayOfLocLabel"/>
      <s:element name="ArrayOfOptionalParameter" nillable="true" type="tns:ArrayOfOptionalParameter"/>
      <s:element name="ArrayOfPrincipalAccess" nillable="true" type="tns:ArrayOfPrincipalAccess"/>
      <s:element name="ArrayOfQueryBase" nillable="true" type="tns:ArrayOfQueryBase"/>
      <s:element name="ArrayOfRolePrivilege" nillable="true" type="tns:ArrayOfRolePrivilege"/>
      <s:element name="ArrayOfSdkMessageProcessingStepRegistration" nillable="true" type="tns:ArrayOfSdkMessageProcessingStepRegistration"/>
      <s:element name="ArrayOfString" nillable="true" type="tns:ArrayOfString"/>
      <s:element name="ArrayOfTimeCode" nillable="true" type="tns:ArrayOfTimeCode"/>
      <s:element name="ArrayOfTimeInfo" nillable="true" type="tns:ArrayOfTimeInfo"/>
      <s:element name="ArrayOfValidationResult" nillable="true" type="tns:ArrayOfValidationResult"/>
      <s:element name="base64Binary" nillable="true" type="s:base64Binary"/>
      <s:element name="boolean" type="s:boolean"/>
      <s:element name="BulkOperationSource" type="s5:BulkOperationSource"/>
      <s:element name="BusinessEntity" nillable="true" type="s3:BusinessEntity"/>
      <s:element name="BusinessEntityCollection" nillable="true" type="s3:BusinessEntityCollection"/>
      <s:element name="CallerOriginToken" nillable="true" type="s5:CallerOriginToken"/>
      <s:element name="ColumnSetBase" nillable="true" type="s2:ColumnSetBase"/>
      <s:element name="CorrelationToken" nillable="true" type="s5:CorrelationToken"/>
      <s:element name="Create">
        <s:complexType>
          <s:sequence>
            <s:element name="entity" type="s3:BusinessEntity"/>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CreateResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="CreateResult" type="s0:guid"/>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CrmAuthenticationToken" nillable="true" type="s5:CrmAuthenticationToken"/>
      <s:element name="CrmBoolean" nillable="true" type="s3:CrmBoolean"/>
      <s:element name="CrmDateTime" nillable="true" type="s3:CrmDateTime"/>
      <s:element name="CrmDecimal" nillable="true" type="s3:CrmDecimal"/>
      <s:element name="CrmFloat" nillable="true" type="s3:CrmFloat"/>
      <s:element name="CrmLabel" nillable="true" type="tns:CrmLabel"/>
      <s:element name="CrmMoney" nillable="true" type="s3:CrmMoney"/>
      <s:element name="CrmNumber" nillable="true" type="s3:CrmNumber"/>
      <s:element name="Customer" nillable="true" type="s3:Customer"/>
      <s:element name="decimal" type="s:decimal"/>
      <s:element name="Delete">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="entityName" type="s:string"/>
            <s:element minOccurs="1" maxOccurs="1" name="id" type="s0:guid"/>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DeleteResponse">
        <s:complexType/>
      </s:element>
      <s:element name="DynamicEntity" nillable="true" type="s3:DynamicEntity"/>
      <s:element name="EntityNameReference" nillable="true" type="s3:EntityNameReference"/>
      <s:element name="EntitySource" type="s5:EntitySource"/>
      <s:element name="Execute">
        <s:complexType>
          <s:sequence>
            <s:element name="Request" type="tns:Request"/>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ExecuteResponse">
        <s:complexType>
          <s:sequence>
            <s:element name="Response" type="tns:Response"/>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="Fetch">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="fetchXml" type="s:string"/>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="FetchResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="FetchResult" type="s:string"/>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="guid" type="s0:guid"/>
      <s:element name="int" type="s:int"/>
      <s:element name="Key" nillable="true" type="s3:Key"/>
      <s:element name="long" type="s:long"/>
      <s:element name="Lookup" nillable="true" type="s3:Lookup"/>
      <s:element name="Moniker" nillable="true" type="s1:Moniker"/>
      <s:element name="Owner" nillable="true" type="s3:Owner"/>
      <s:element name="PagingInfo" nillable="true" type="s2:PagingInfo"/>
      <s:element name="Picklist" nillable="true" type="s3:Picklist"/>
      <s:element name="PrincipalAccess" nillable="true" type="s1:PrincipalAccess"/>
      <s:element name="PropagationOwnershipOptions" type="s1:PropagationOwnershipOptions"/>
      <s:element name="QueryBase" nillable="true" type="s2:QueryBase"/>
      <s:element name="QueryExpression" nillable="true" type="s2:QueryExpression"/>
      <s:element name="Retrieve">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="entityName" type="s:string"/>
            <s:element minOccurs="1" maxOccurs="1" name="id" type="s0:guid"/>
            <s:element minOccurs="0" maxOccurs="1" name="columnSet" type="s2:ColumnSetBase"/>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RetrieveMultiple">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="query" type="s2:QueryBase"/>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RetrieveMultipleResponse">
        <s:complexType>
          <s:sequence>
            <s:element name="RetrieveMultipleResult" type="s3:BusinessEntityCollection"/>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RetrieveResponse">
        <s:complexType>
          <s:sequence>
            <s:element name="RetrieveResult" type="s3:BusinessEntity"/>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RollupType" type="s1:RollupType"/>
      <s:element name="RouteType" type="s1:RouteType"/>
      <s:element name="SearchResults" nillable="true" type="s4:SearchResults"/>
      <s:element name="SecurityPrincipal" nillable="true" type="s1:SecurityPrincipal"/>
      <s:element name="Status" nillable="true" type="s3:Status"/>
      <s:element name="string" nillable="true" type="s:string"/>
      <s:element name="TargetFieldType" type="s3:TargetFieldType"/>
      <s:element name="UniqueIdentifier" nillable="true" type="s3:UniqueIdentifier"/>
      <s:element name="Update">
        <s:complexType>
          <s:sequence>
            <s:element name="entity" type="s3:BusinessEntity"/>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateResponse">
        <s:complexType/>
      </s:element>
      <s:element name="ValidationResult" nillable="true" type="s4:ValidationResult"/>
      <s:complexType name="account">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="accountcategorycode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="accountclassificationcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="accountid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="accountnumber" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="accountratingcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_addressid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_addresstypecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_city" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_country" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_county" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_fax" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_freighttermscode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_latitude" type="s3:CrmFloat"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_line1" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_line2" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_line3" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_longitude" type="s3:CrmFloat"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_postalcode" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_postofficebox" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_primarycontactname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_shippingmethodcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_stateorprovince" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_telephone1" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_telephone2" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_telephone3" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_upszone" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_utcoffset" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_addressid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_addresstypecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_city" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_country" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_county" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_fax" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_freighttermscode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_latitude" type="s3:CrmFloat"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_line1" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_line2" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_line3" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_longitude" type="s3:CrmFloat"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_postalcode" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_postofficebox" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_primarycontactname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_shippingmethodcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_stateorprovince" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_telephone1" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_telephone2" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_telephone3" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_upszone" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_utcoffset" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="aging30" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="aging30_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="aging60" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="aging60_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="aging90" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="aging90_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="businesstypecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="creditlimit" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="creditlimit_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="creditonhold" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="customersizecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="customertypecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="defaultpricelevelid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="donotbulkemail" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="donotbulkpostalmail" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="donotemail" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="donotfax" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="donotphone" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="donotpostalmail" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="donotsendmm" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="emailaddress1" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="emailaddress2" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="emailaddress3" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="exchangerate" type="s3:CrmDecimal"/>
              <s:element minOccurs="0" maxOccurs="1" name="fax" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="ftpsiteurl" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="industrycode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="lastusedincampaign" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="marketcap" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="marketcap_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="masterid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="merged" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="numberofemployees" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="originatingleadid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="ownerid" type="s3:Owner"/>
              <s:element minOccurs="0" maxOccurs="1" name="ownershipcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="parentaccountid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="participatesinworkflow" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="paymenttermscode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="preferredappointmentdaycode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="preferredappointmenttimecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="preferredcontactmethodcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="preferredequipmentid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="preferredserviceid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="preferredsystemuserid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="primarycontactid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="revenue" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="revenue_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="sharesoutstanding" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="shippingmethodcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="sic" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="statecode" type="tns:AccountStateInfo"/>
              <s:element minOccurs="0" maxOccurs="1" name="statuscode" type="s3:Status"/>
              <s:element minOccurs="0" maxOccurs="1" name="stockexchange" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="telephone1" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="telephone2" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="telephone3" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="territorycode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="territoryid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="tickersymbol" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="transactioncurrencyid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="websiteurl" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="yominame" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:simpleType name="AccountState">
        <s:restriction base="s:string">
          <s:enumeration value="Active"/>
          <s:enumeration value="Inactive"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="AccountStateInfo">
        <s:simpleContent>
          <s:extension base="tns:AccountState">
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="activitymimeattachment">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="activityid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="activitymimeattachmentid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="attachmentnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="body" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="filename" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="filesize" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="mimetype" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="subject" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="activityparty">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="activityid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="activitypartyid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="addressused" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="donotemail" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="donotfax" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="donotphone" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="donotpostalmail" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="effort" type="s3:CrmFloat"/>
              <s:element minOccurs="0" maxOccurs="1" name="exchangeentryid" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="participationtypemask" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="partyid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="resourcespecid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="scheduledend" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="scheduledstart" type="s3:CrmDateTime"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="activitypointer">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="activityid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="activitytypecode" type="s3:EntityNameReference"/>
              <s:element minOccurs="0" maxOccurs="1" name="actualdurationminutes" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="actualend" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="actualstart" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="isbilled" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="isworkflowcreated" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="ownerid" type="s3:Owner"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="prioritycode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="regardingobjectid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="scheduleddurationminutes" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="scheduledend" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="scheduledstart" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="serviceid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="statecode" type="tns:ActivityPointerStateInfo"/>
              <s:element minOccurs="0" maxOccurs="1" name="statuscode" type="s3:Status"/>
              <s:element minOccurs="0" maxOccurs="1" name="subject" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:simpleType name="ActivityPointerState">
        <s:restriction base="s:string">
          <s:enumeration value="Open"/>
          <s:enumeration value="Completed"/>
          <s:enumeration value="Canceled"/>
          <s:enumeration value="Scheduled"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="ActivityPointerStateInfo">
        <s:simpleContent>
          <s:extension base="tns:ActivityPointerState">
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="AddItemCampaignActivityRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="CampaignActivityId" type="s0:guid"/>
              <s:element name="ItemId" type="s0:guid"/>
              <s:element name="EntityName" type="tns:EntityName"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="AddItemCampaignActivityResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="CampaignActivityItemId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="AddItemCampaignRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="CampaignId" type="s0:guid"/>
              <s:element name="EntityId" type="s0:guid"/>
              <s:element name="EntityName" type="tns:EntityName"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="AddItemCampaignResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="CampaignItemId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="AddMemberListRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="ListId" type="s0:guid"/>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="AddMemberListResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="Id" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="AddMembersTeamRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="TeamId" type="s0:guid"/>
              <s:element name="MemberIds" type="tns:ArrayOfGuid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="AddMembersTeamResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="AddPrivilegesRoleRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="RoleId" type="s0:guid"/>
              <s:element name="Privileges" type="tns:ArrayOfRolePrivilege"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="AddPrivilegesRoleResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="AddProductToKitRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="KitId" type="s0:guid"/>
              <s:element name="ProductId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="AddProductToKitResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="AddSubstituteProductRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="ProductId" type="s0:guid"/>
              <s:element name="SubstituteId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="AddSubstituteProductResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="annotation">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="annotationid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="documentbody" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="filename" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="filesize" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="isdocument" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="langid" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="mimetype" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="notetext" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="objectid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="objecttypecode" type="s3:EntityNameReference"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="ownerid" type="s3:Owner"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="stepid" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="subject" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="annualfiscalcalendar">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="annual" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="annual_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="businessunitid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="effectiveon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="exchangerate" type="s3:CrmDecimal"/>
              <s:element minOccurs="0" maxOccurs="1" name="fiscalperiodtype" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="salespersonid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="transactioncurrencyid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="userfiscalcalendarid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="appointment">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="activityid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="actualdurationminutes" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="actualend" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="actualstart" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="category" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="globalobjectid" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="isalldayevent" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="isbilled" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="isworkflowcreated" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="location" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="optionalattendees" type="tns:ArrayOfactivityparty"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizer" type="tns:ArrayOfactivityparty"/>
              <s:element minOccurs="0" maxOccurs="1" name="outlookownerapptid" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="ownerid" type="s3:Owner"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="prioritycode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="regardingobjectid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="requiredattendees" type="tns:ArrayOfactivityparty"/>
              <s:element minOccurs="0" maxOccurs="1" name="scheduleddurationminutes" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="scheduledend" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="scheduledstart" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="serviceid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="statecode" type="tns:AppointmentStateInfo"/>
              <s:element minOccurs="0" maxOccurs="1" name="statuscode" type="s3:Status"/>
              <s:element minOccurs="0" maxOccurs="1" name="subcategory" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="subject" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="subscriptionid" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:simpleType name="AppointmentState">
        <s:restriction base="s:string">
          <s:enumeration value="Open"/>
          <s:enumeration value="Completed"/>
          <s:enumeration value="Canceled"/>
          <s:enumeration value="Scheduled"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="AppointmentStateInfo">
        <s:simpleContent>
          <s:extension base="tns:AppointmentState">
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="ArrayOfactivityparty">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="activityparty" type="tns:activityparty"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfArrayOfString">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="ArrayOfString" nillable="true" type="tns:ArrayOfString"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfArrayOfTimeInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="ArrayOfTimeInfo" nillable="true" type="tns:ArrayOfTimeInfo"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfBoolean">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="boolean" type="s:boolean"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfcalendarrule">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="calendarrule" type="tns:calendarrule"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfduplicaterulecondition">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="duplicaterulecondition" type="tns:duplicaterulecondition"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfDynamicEntity">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="DynamicEntity" type="s3:DynamicEntity"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfGuid">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="guid" type="s0:guid"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfInt">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="int" type="s:int"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfinvoicedetail">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="invoicedetail" type="tns:invoicedetail"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfLocLabel">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="LocLabel" nillable="true" type="tns:LocLabel"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfOptionalParameter">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="OptionalParameter" nillable="true" type="tns:OptionalParameter"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfPrincipalAccess">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="PrincipalAccess" nillable="true" type="s1:PrincipalAccess"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfQueryBase">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="QueryBase" nillable="true" type="s2:QueryBase"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfquotedetail">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="quotedetail" type="tns:quotedetail"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfRolePrivilege">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="RolePrivilege" nillable="true" type="s1:RolePrivilege"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfsalesorderdetail">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="salesorderdetail" type="tns:salesorderdetail"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfSdkMessageProcessingStepImageRegistration">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="SdkMessageProcessingStepImageRegistration" nillable="true" type="tns:SdkMessageProcessingStepImageRegistration"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfSdkMessageProcessingStepRegistration">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="SdkMessageProcessingStepRegistration" nillable="true" type="tns:SdkMessageProcessingStepRegistration"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfString">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="string" nillable="true" type="s:string"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfTimeCode">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="TimeCode" type="s4:TimeCode"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfTimeInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="TimeInfo" nillable="true" type="s4:TimeInfo"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfValidationResult">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="ValidationResult" nillable="true" type="s4:ValidationResult"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="AssignRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="Target" type="tns:TargetOwned"/>
              <s:element name="Assignee" type="s1:SecurityPrincipal"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="AssignResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="AssignUserRolesRoleRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="UserId" type="s0:guid"/>
              <s:element name="RoleIds" type="tns:ArrayOfGuid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="AssignUserRolesRoleResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="AssociateEntitiesRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="Moniker1" type="s1:Moniker"/>
              <s:element name="Moniker2" type="s1:Moniker"/>
              <s:element name="RelationshipName" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="AssociateEntitiesResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="asyncoperation">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="asyncoperationid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="completedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="correlationid" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="correlationupdatedtime" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="data" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="dependencytoken" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="depth" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="errorcode" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="hostid" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="iswaitingforevent" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="message" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="messagename" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="operationtype" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="ownerid" type="s3:Owner"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="postponeuntil" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="primaryentitytype" type="s3:EntityNameReference"/>
              <s:element minOccurs="0" maxOccurs="1" name="recurrencepattern" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="recurrencestarttime" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="regardingobjectid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="requestid" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="retrycount" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="startedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="statecode" type="tns:AsyncOperationStateInfo"/>
              <s:element minOccurs="0" maxOccurs="1" name="statuscode" type="s3:Status"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="workflowactivationid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="workflowstagename" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:simpleType name="AsyncOperationState">
        <s:restriction base="s:string">
          <s:enumeration value="Ready"/>
          <s:enumeration value="Suspended"/>
          <s:enumeration value="Locked"/>
          <s:enumeration value="Completed"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="AsyncOperationStateInfo">
        <s:simpleContent>
          <s:extension base="tns:AsyncOperationState">
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="attributemap">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="attributemapid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="entitymapid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="issystem" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="parentattributemapid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="sourceattributename" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="targetattributename" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="AutoMapEntityRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EntityMapId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="AutoMapEntityResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="BackgroundSendEmailRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="Query" type="s2:QueryBase"/>
            </s:sequence>
            <s:attribute name="ReturnDynamicEntities" type="s:boolean" use="required"/>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="BackgroundSendEmailResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element ref="s3:BusinessEntityCollection"/>
              <s:element name="HasAttachments" type="tns:ArrayOfBoolean"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="BookRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="Target" type="tns:TargetSchedule"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="BookResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="ValidationResult" type="s4:ValidationResult"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="bulkdeletefailure">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="asyncoperationid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="bulkdeletefailureid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="bulkdeleteoperationid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="errordescription" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="errornumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="orderedqueryindex" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="owninguser" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="regardingobjectid" type="s3:Lookup"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="bulkdeleteoperation">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="asyncoperationid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="bulkdeleteoperationid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="failurecount" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="isrecurring" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="nextrun" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="orderedquerysetxml" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="owninguser" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="processingqeindex" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="statecode" type="tns:BulkDeleteOperationStateInfo"/>
              <s:element minOccurs="0" maxOccurs="1" name="statuscode" type="s3:Status"/>
              <s:element minOccurs="0" maxOccurs="1" name="successcount" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:simpleType name="BulkDeleteOperationState">
        <s:restriction base="s:string">
          <s:enumeration value="Ready"/>
          <s:enumeration value="Suspended"/>
          <s:enumeration value="Locked"/>
          <s:enumeration value="Completed"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="BulkDeleteOperationStateInfo">
        <s:simpleContent>
          <s:extension base="tns:BulkDeleteOperationState">
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="BulkDeleteRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="QuerySet" type="tns:ArrayOfQueryBase"/>
              <s:element name="JobName" type="s:string"/>
              <s:element name="SendEmailNotification" type="s:boolean"/>
              <s:element name="ToRecipients" type="tns:ArrayOfGuid"/>
              <s:element name="CCRecipients" type="tns:ArrayOfGuid"/>
              <s:element name="RecurrencePattern" type="s:string"/>
              <s:element name="StartDateTime" type="s3:CrmDateTime"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="BulkDeleteResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="JobId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="BulkDetectDuplicatesRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="Query" type="s2:QueryBase"/>
              <s:element name="JobName" type="s:string"/>
              <s:element name="SendEmailNotification" type="s:boolean"/>
              <s:element name="TemplateId" type="s0:guid"/>
              <s:element name="ToRecipients" type="tns:ArrayOfGuid"/>
              <s:element name="CCRecipients" type="tns:ArrayOfGuid"/>
              <s:element name="RecurrencePattern" type="s:string"/>
              <s:element name="RecurrenceStartTime" type="s3:CrmDateTime"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="BulkDetectDuplicatesResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="JobId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="bulkoperation">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="activityid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="actualdurationminutes" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="actualend" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="actualstart" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="bulkoperationnumber" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdrecordtypecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="errornumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="failurecount" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="isbilled" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="isworkflowcreated" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="operationtypecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="ownerid" type="s3:Owner"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="parameters" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="regardingobjectid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="scheduleddurationminutes" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="scheduledend" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="scheduledstart" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="serviceid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="statecode" type="tns:BulkOperationStateInfo"/>
              <s:element minOccurs="0" maxOccurs="1" name="statuscode" type="s3:Status"/>
              <s:element minOccurs="0" maxOccurs="1" name="subject" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="successcount" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="targetedrecordtypecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="targetmemberscount" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="bulkoperationlog">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="additionalinfo" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="bulkoperationid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="bulkoperationlogid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdobjectid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="errornumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="owninguser" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="regardingobjectid" type="s3:Lookup"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:simpleType name="BulkOperationState">
        <s:restriction base="s:string">
          <s:enumeration value="Open"/>
          <s:enumeration value="Closed"/>
          <s:enumeration value="Canceled"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="BulkOperationStateInfo">
        <s:simpleContent>
          <s:extension base="tns:BulkOperationState">
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="BulkOperationStatusCloseRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="BulkOperationId" type="s0:guid"/>
              <s:element name="FailureCount" type="s:int"/>
              <s:element name="SuccessCount" type="s:int"/>
              <s:element name="StatusReason" type="s:int"/>
              <s:element name="ErrorCode" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="BulkOperationStatusCloseResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="businesstask">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="actionurl" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="businesstaskid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="helpurl" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="iconurl" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="languagecode" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="parentbusinesstaskid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="privilege" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="statecode" type="tns:BusinessTaskStateInfo"/>
              <s:element minOccurs="0" maxOccurs="1" name="statuscode" type="s3:Status"/>
              <s:element minOccurs="0" maxOccurs="1" name="taskorder" type="s3:CrmNumber"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:simpleType name="BusinessTaskState">
        <s:restriction base="s:string">
          <s:enumeration value="Active"/>
          <s:enumeration value="Inactive"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="BusinessTaskStateInfo">
        <s:simpleContent>
          <s:extension base="tns:BusinessTaskState">
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="businessunit">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="address1_addressid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_addresstypecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_city" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_country" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_county" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_fax" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_latitude" type="s3:CrmFloat"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_line1" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_line2" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_line3" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_longitude" type="s3:CrmFloat"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_postalcode" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_postofficebox" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_shippingmethodcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_stateorprovince" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_telephone1" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_telephone2" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_telephone3" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_upszone" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_utcoffset" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_addressid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_addresstypecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_city" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_country" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_county" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_fax" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_latitude" type="s3:CrmFloat"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_line1" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_line2" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_line3" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_longitude" type="s3:CrmFloat"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_postalcode" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_postofficebox" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_shippingmethodcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_stateorprovince" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_telephone1" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_telephone2" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_telephone3" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_upszone" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_utcoffset" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="businessunitid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="calendarid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="costcenter" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="creditlimit" type="s3:CrmFloat"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="disabledreason" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="divisionname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="emailaddress" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="fileasname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="ftpsiteurl" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="inheritancemask" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="isdisabled" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="parentbusinessunitid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="picture" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="stockexchange" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="tickersymbol" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcoffset" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="websiteurl" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="workflowsuspended" type="s3:CrmBoolean"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="businessunitnewsarticle">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="activeon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="activeuntil" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="articletitle" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="articletypecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="articleurl" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="businessunitnewsarticleid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="newsarticle" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="showonhomepage" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:simpleType name="BusinessUnitState">
        <s:restriction base="s:string">
          <s:enumeration value="Active"/>
          <s:enumeration value="Inactive"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="CalculateActualValueOpportunityRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="OpportunityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="CalculateActualValueOpportunityResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="Value" type="s:decimal"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="CalculateTotalTimeIncidentRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="IncidentId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="CalculateTotalTimeIncidentResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="TotalTime" type="s:long"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="calendar">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="businessunitid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="calendarid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="isshared" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="primaryuserid" type="s3:UniqueIdentifier"/>
              <s:element name="calendarrules" type="tns:ArrayOfcalendarrule"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="calendarrule">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="businessunitid" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="calendarid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="calendarruleid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="duration" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="effectiveintervalend" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="effectiveintervalstart" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="effort" type="s3:CrmFloat"/>
              <s:element minOccurs="0" maxOccurs="1" name="endtime" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="extentcode" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="groupdesignator" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="innercalendarid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="ismodified" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="isselected" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="issimple" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="isvaried" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="offset" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="pattern" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="rank" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="serviceid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="starttime" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="subcode" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="timecode" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezonecode" type="s3:CrmNumber"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="CallPriorityOptionalParameter">
        <s:complexContent mixed="false">
          <s:extension base="tns:OptionalParameter">
            <s:sequence>
              <s:element minOccurs="1" maxOccurs="1" name="Value" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="campaign">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="actualend" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="actualstart" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="budgetedcost" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="budgetedcost_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="campaignid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="codename" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="exchangerate" type="s3:CrmDecimal"/>
              <s:element minOccurs="0" maxOccurs="1" name="expectedresponse" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="expectedrevenue" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="expectedrevenue_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="istemplate" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="message" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="objective" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="othercost" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="othercost_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="ownerid" type="s3:Owner"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="pricelistid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="promotioncodename" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="proposedend" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="proposedstart" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="statecode" type="tns:CampaignStateInfo"/>
              <s:element minOccurs="0" maxOccurs="1" name="statuscode" type="s3:Status"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="totalactualcost" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="totalactualcost_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="totalcampaignactivityactualcost" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="totalcampaignactivityactualcost_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="transactioncurrencyid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="typecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="campaignactivity">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="activityid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="actualcost" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="actualcost_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="actualdurationminutes" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="actualend" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="actualstart" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="budgetedcost" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="budgetedcost_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="category" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="channeltypecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="donotsendonoptout" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="exchangerate" type="s3:CrmDecimal"/>
              <s:element minOccurs="0" maxOccurs="1" name="excludeifcontactedinxdays" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="from" type="tns:ArrayOfactivityparty"/>
              <s:element minOccurs="0" maxOccurs="1" name="ignoreinactivelistmembers" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="isbilled" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="isworkflowcreated" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="ownerid" type="s3:Owner"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="partners" type="tns:ArrayOfactivityparty"/>
              <s:element minOccurs="0" maxOccurs="1" name="prioritycode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="regardingobjectid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="scheduleddurationminutes" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="scheduledend" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="scheduledstart" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="serviceid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="statecode" type="tns:CampaignActivityStateInfo"/>
              <s:element minOccurs="0" maxOccurs="1" name="statuscode" type="s3:Status"/>
              <s:element minOccurs="0" maxOccurs="1" name="subcategory" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="subject" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="transactioncurrencyid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="typecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="campaignactivityitem">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="campaignactivityid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="campaignactivityitemid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="itemid" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="itemobjecttypecode" type="s3:EntityNameReference"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="owninguser" type="s3:UniqueIdentifier"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:simpleType name="CampaignActivityState">
        <s:restriction base="s:string">
          <s:enumeration value="Open"/>
          <s:enumeration value="Closed"/>
          <s:enumeration value="Canceled"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="CampaignActivityStateInfo">
        <s:simpleContent>
          <s:extension base="tns:CampaignActivityState">
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="campaignitem">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="campaignid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="campaignitemid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="entityid" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="entitytype" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="owninguser" type="s3:UniqueIdentifier"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="campaignresponse">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="activityid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="actualdurationminutes" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="actualend" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="actualstart" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="category" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="channeltypecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="companyname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="customer" type="tns:ArrayOfactivityparty"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="emailaddress" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="fax" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="firstname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="from" type="tns:ArrayOfactivityparty"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="isbilled" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="isworkflowcreated" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="lastname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="originatingactivityid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="ownerid" type="s3:Owner"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="partner" type="tns:ArrayOfactivityparty"/>
              <s:element minOccurs="0" maxOccurs="1" name="prioritycode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="promotioncodename" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="receivedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="regardingobjectid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="responsecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="scheduleddurationminutes" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="scheduledend" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="scheduledstart" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="serviceid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="statecode" type="tns:CampaignResponseStateInfo"/>
              <s:element minOccurs="0" maxOccurs="1" name="statuscode" type="s3:Status"/>
              <s:element minOccurs="0" maxOccurs="1" name="subcategory" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="subject" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="telephone" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="yomicompanyname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="yomifirstname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="yomilastname" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:simpleType name="CampaignResponseState">
        <s:restriction base="s:string">
          <s:enumeration value="Open"/>
          <s:enumeration value="Closed"/>
          <s:enumeration value="Canceled"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="CampaignResponseStateInfo">
        <s:simpleContent>
          <s:extension base="tns:CampaignResponseState">
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:simpleType name="CampaignState">
        <s:restriction base="s:string">
          <s:enumeration value="Active"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="CampaignStateInfo">
        <s:simpleContent>
          <s:extension base="tns:CampaignState">
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="CancelContractRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="ContractId" type="s0:guid"/>
              <s:element name="CancelDate" type="s3:CrmDateTime"/>
              <s:element name="Status" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="CancelContractResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="CancelSalesOrderRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="OrderClose" type="s3:BusinessEntity"/>
              <s:element name="Status" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="CancelSalesOrderResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="CheckIncomingEmailRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="MessageId" type="s:string"/>
              <s:element name="Subject" type="s:string"/>
              <s:element name="From" type="s:string"/>
              <s:element name="To" type="s:string"/>
              <s:element name="Cc" type="s:string"/>
              <s:element name="Bcc" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="CheckIncomingEmailResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="ShouldDeliver" type="s:boolean"/>
              <s:element name="ReasonCode" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="CheckPromoteEmailRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="MessageId" type="s:string"/>
              <s:element name="Subject" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="CheckPromoteEmailResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="ShouldPromote" type="s:boolean"/>
              <s:element name="ReasonCode" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="CleanUpBulkOperationRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="BulkOperationId" type="s0:guid"/>
              <s:element name="BulkOperationSource" type="s5:BulkOperationSource"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="CleanUpBulkOperationResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="CloneContractRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="ContractId" type="s0:guid"/>
              <s:element name="IncludeCanceledLines" type="s:boolean"/>
            </s:sequence>
            <s:attribute name="ReturnDynamicEntities" type="s:boolean" use="required"/>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="CloneContractResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element ref="s3:BusinessEntity"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="CloseIncidentRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="IncidentResolution" type="s3:BusinessEntity"/>
              <s:element name="Status" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="CloseIncidentResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="CloseQuoteRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="QuoteClose" type="s3:BusinessEntity"/>
              <s:element name="Status" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="CloseQuoteResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="columnmapping">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="columnmappingid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="importmapid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="processcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="sourceattributename" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="sourceentityname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="statecode" type="tns:ColumnMappingStateInfo"/>
              <s:element minOccurs="0" maxOccurs="1" name="statuscode" type="s3:Status"/>
              <s:element minOccurs="0" maxOccurs="1" name="targetattributename" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="targetentityname" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:simpleType name="ColumnMappingState">
        <s:restriction base="s:string">
          <s:enumeration value="Active"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="ColumnMappingStateInfo">
        <s:simpleContent>
          <s:extension base="tns:ColumnMappingState">
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="competitor">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="address1_addressid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_addresstypecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_city" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_country" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_county" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_fax" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_latitude" type="s3:CrmFloat"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_line1" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_line2" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_line3" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_longitude" type="s3:CrmFloat"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_postalcode" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_postofficebox" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_shippingmethodcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_stateorprovince" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_telephone1" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_telephone2" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_telephone3" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_upszone" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_utcoffset" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_addressid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_addresstypecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_city" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_country" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_county" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_fax" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_latitude" type="s3:CrmFloat"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_line1" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_line2" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_line3" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_longitude" type="s3:CrmFloat"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_postalcode" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_postofficebox" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_shippingmethodcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_stateorprovince" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_telephone1" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_telephone2" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_telephone3" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_upszone" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_utcoffset" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="competitorid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="exchangerate" type="s3:CrmDecimal"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="keyproduct" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="opportunities" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="overview" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="referenceinfourl" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="reportedrevenue" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="reportedrevenue_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="reportingquarter" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="reportingyear" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="stockexchange" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="strengths" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="threats" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="tickersymbol" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="transactioncurrencyid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="weaknesses" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="websiteurl" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="winpercentage" type="s3:CrmFloat"/>
              <s:element minOccurs="0" maxOccurs="1" name="yominame" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="CompoundCreateRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="Target" type="tns:TargetCompound"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="CompoundCreateResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="Id" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="CompoundUpdateDuplicateDetectionRuleRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="Target" type="tns:TargetCompound"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="CompoundUpdateDuplicateDetectionRuleResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="CompoundUpdateRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="Target" type="tns:TargetCompound"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="CompoundUpdateResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="constraintbasedgroup">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="businessunitid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="constraintbasedgroupid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="constraints" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="grouptypecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:Lookup"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="contact">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="accountrolecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_addressid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_addresstypecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_city" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_country" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_county" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_fax" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_freighttermscode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_latitude" type="s3:CrmFloat"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_line1" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_line2" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_line3" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_longitude" type="s3:CrmFloat"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_postalcode" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_postofficebox" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_primarycontactname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_shippingmethodcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_stateorprovince" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_telephone1" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_telephone2" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_telephone3" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_upszone" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_utcoffset" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_addressid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_addresstypecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_city" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_country" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_county" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_fax" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_freighttermscode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_latitude" type="s3:CrmFloat"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_line1" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_line2" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_line3" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_longitude" type="s3:CrmFloat"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_postalcode" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_postofficebox" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_primarycontactname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_shippingmethodcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_stateorprovince" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_telephone1" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_telephone2" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_telephone3" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_upszone" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_utcoffset" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="aging30" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="aging30_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="aging60" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="aging60_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="aging90" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="aging90_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="anniversary" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="annualincome" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="annualincome_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="assistantname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="assistantphone" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="birthdate" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="childrensnames" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="contactid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="creditlimit" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="creditlimit_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="creditonhold" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="customersizecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="customertypecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="defaultpricelevelid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="department" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="donotbulkemail" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="donotbulkpostalmail" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="donotemail" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="donotfax" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="donotphone" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="donotpostalmail" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="donotsendmm" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="educationcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="emailaddress1" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="emailaddress2" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="emailaddress3" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="employeeid" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="exchangerate" type="s3:CrmDecimal"/>
              <s:element minOccurs="0" maxOccurs="1" name="externaluseridentifier" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="familystatuscode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="fax" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="firstname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="ftpsiteurl" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="fullname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="gendercode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="governmentid" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="haschildrencode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="isbackofficecustomer" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="jobtitle" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="lastname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="lastusedincampaign" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="leadsourcecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="managername" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="managerphone" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="masterid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="merged" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="middlename" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="mobilephone" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="nickname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="numberofchildren" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="originatingleadid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="ownerid" type="s3:Owner"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="pager" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="parentcustomerid" type="s3:Customer"/>
              <s:element minOccurs="0" maxOccurs="1" name="participatesinworkflow" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="paymenttermscode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="preferredappointmentdaycode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="preferredappointmenttimecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="preferredcontactmethodcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="preferredequipmentid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="preferredserviceid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="preferredsystemuserid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="salutation" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shippingmethodcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="spousesname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="statecode" type="tns:ContactStateInfo"/>
              <s:element minOccurs="0" maxOccurs="1" name="statuscode" type="s3:Status"/>
              <s:element minOccurs="0" maxOccurs="1" name="subscriptionid" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="suffix" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="telephone1" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="telephone2" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="telephone3" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="territorycode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="transactioncurrencyid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="websiteurl" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="yomifirstname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="yomifullname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="yomilastname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="yomimiddlename" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:simpleType name="ContactState">
        <s:restriction base="s:string">
          <s:enumeration value="Active"/>
          <s:enumeration value="Inactive"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="ContactStateInfo">
        <s:simpleContent>
          <s:extension base="tns:ContactState">
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="contract">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="activeon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="allotmenttypecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="billingcustomerid" type="s3:Customer"/>
              <s:element minOccurs="0" maxOccurs="1" name="billingendon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="billingfrequencycode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="billingstarton" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="billtoaddress" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="cancelon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="contractid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="contractlanguage" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="contractnumber" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="contractservicelevelcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="contracttemplateabbreviation" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="contracttemplateid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="customerid" type="s3:Customer"/>
              <s:element minOccurs="0" maxOccurs="1" name="duration" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="effectivitycalendar" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="exchangerate" type="s3:CrmDecimal"/>
              <s:element minOccurs="0" maxOccurs="1" name="expireson" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="netprice" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="netprice_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="originatingcontract" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="ownerid" type="s3:Owner"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="serviceaddress" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="statecode" type="tns:ContractStateInfo"/>
              <s:element minOccurs="0" maxOccurs="1" name="statuscode" type="s3:Status"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="title" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="totaldiscount" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="totaldiscount_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="totalprice" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="totalprice_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="transactioncurrencyid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="usediscountaspercentage" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="contractdetail">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="activeon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="allotmentsremaining" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="allotmentsused" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="contractdetailid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="contractid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="contractstatecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="customerid" type="s3:Customer"/>
              <s:element minOccurs="0" maxOccurs="1" name="discount" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="discount_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="discountpercentage" type="s3:CrmDecimal"/>
              <s:element minOccurs="0" maxOccurs="1" name="effectivitycalendar" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="exchangerate" type="s3:CrmDecimal"/>
              <s:element minOccurs="0" maxOccurs="1" name="expireson" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="initialquantity" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="lineitemorder" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="net" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="net_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="owninguser" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="price" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="price_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="productid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="productserialnumber" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="rate" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="rate_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="serviceaddress" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="servicecontractunitscode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="statecode" type="tns:ContractDetailStateInfo"/>
              <s:element minOccurs="0" maxOccurs="1" name="statuscode" type="s3:Status"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="title" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="totalallotments" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="transactioncurrencyid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="uomid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="uomscheduleid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:simpleType name="ContractDetailState">
        <s:restriction base="s:string">
          <s:enumeration value="Existing"/>
          <s:enumeration value="Renewed"/>
          <s:enumeration value="Canceled"/>
          <s:enumeration value="Expired"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="ContractDetailStateInfo">
        <s:simpleContent>
          <s:extension base="tns:ContractDetailState">
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:simpleType name="ContractState">
        <s:restriction base="s:string">
          <s:enumeration value="Draft"/>
          <s:enumeration value="Invoiced"/>
          <s:enumeration value="Active"/>
          <s:enumeration value="On Hold"/>
          <s:enumeration value="Canceled"/>
          <s:enumeration value="Expired"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="ContractStateInfo">
        <s:simpleContent>
          <s:extension base="tns:ContractState">
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="contracttemplate">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="abbreviation" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="allotmenttypecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="billingfrequencycode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="contractservicelevelcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="contracttemplateid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="effectivitycalendar" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="usediscountaspercentage" type="s3:CrmBoolean"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ConvertKitToProductRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="KitId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ConvertKitToProductResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ConvertProductToKitRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="ProductId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ConvertProductToKitResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ConvertQuoteToSalesOrderRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="QuoteId" type="s0:guid"/>
              <s:element name="ColumnSet" type="s2:ColumnSetBase"/>
            </s:sequence>
            <s:attribute name="ReturnDynamicEntities" type="s:boolean" use="required"/>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ConvertQuoteToSalesOrderResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element ref="s3:BusinessEntity"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ConvertSalesOrderToInvoiceRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="SalesOrderId" type="s0:guid"/>
              <s:element name="ColumnSet" type="s2:ColumnSetBase"/>
            </s:sequence>
            <s:attribute name="ReturnDynamicEntities" type="s:boolean" use="required"/>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ConvertSalesOrderToInvoiceResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element ref="s3:BusinessEntity"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="CopyCampaignRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="BaseCampaign" type="s0:guid"/>
              <s:element name="SaveAsTemplate" type="s:boolean"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="CopyCampaignResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="CampaignCopyId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="CopyMembersListRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="SourceListId" type="s0:guid"/>
              <s:element name="TargetListId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="CopyMembersListResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="CreateActivitiesListRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="ListId" type="s0:guid"/>
              <s:element name="FriendlyName" type="s:string"/>
              <s:element name="Activity" type="s3:BusinessEntity"/>
              <s:element name="TemplateId" type="s0:guid"/>
              <s:element name="Propagate" type="s:boolean"/>
              <s:element name="OwnershipOptions" type="s1:PropagationOwnershipOptions"/>
              <s:element name="Owner" type="s1:Moniker"/>
              <s:element name="sendEmail" type="s:boolean"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="CreateActivitiesListResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="BulkOperationId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="CreateDuplicatesOptionalParameter">
        <s:complexContent mixed="false">
          <s:extension base="tns:OptionalParameter">
            <s:sequence>
              <s:element minOccurs="1" maxOccurs="1" name="Value" type="s:boolean"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="CreateRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="Target" type="tns:TargetCreate"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="CreateResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="id" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="CreateWorkflowFromTemplateRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="WorkflowName" type="s:string"/>
              <s:element name="WorkflowTemplateId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="CreateWorkflowFromTemplateResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="Id" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="CrmLabel">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="LocLabels" type="tns:ArrayOfLocLabel"/>
          <s:element minOccurs="0" maxOccurs="1" name="UserLocLabel" type="tns:LocLabel"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="customeraddress">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="addressnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="addresstypecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="city" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="country" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="county" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="customeraddressid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="fax" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="freighttermscode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="latitude" type="s3:CrmFloat"/>
              <s:element minOccurs="0" maxOccurs="1" name="line1" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="line2" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="line3" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="longitude" type="s3:CrmFloat"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="objecttypecode" type="s3:EntityNameReference"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="owninguser" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="parentid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="postalcode" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="postofficebox" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="primarycontactname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shippingmethodcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="stateorprovince" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="telephone1" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="telephone2" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="telephone3" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="upszone" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcoffset" type="s3:CrmNumber"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="customeropportunityrole">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="customerid" type="s3:Customer"/>
              <s:element minOccurs="0" maxOccurs="1" name="customeropportunityroleid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="opportunityid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="opportunityroleid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="opportunitystatecode" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="opportunitystatuscode" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="ownerid" type="s3:Owner"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:Lookup"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="customerrelationship">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="converserelationshipid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="customerid" type="s3:Customer"/>
              <s:element minOccurs="0" maxOccurs="1" name="customerrelationshipid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="customerroledescription" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="customerroleid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="ownerid" type="s3:Owner"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="partnerid" type="s3:Customer"/>
              <s:element minOccurs="0" maxOccurs="1" name="partnerroledescription" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="partnerroleid" type="s3:Lookup"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="DeleteRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="Target" type="tns:TargetDelete"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="DeleteResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="DeliverIncomingEmailRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="MessageId" type="s:string"/>
              <s:element name="Subject" type="s:string"/>
              <s:element name="From" type="s:string"/>
              <s:element name="To" type="s:string"/>
              <s:element name="Cc" type="s:string"/>
              <s:element name="Bcc" type="s:string"/>
              <s:element name="ReceivedOn" type="s3:CrmDateTime"/>
              <s:element name="SubmittedBy" type="s:string"/>
              <s:element name="Importance" type="s:string"/>
              <s:element name="Body" type="s:string"/>
              <s:element name="Attachments" type="s3:BusinessEntityCollection"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="DeliverIncomingEmailResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="EmailId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="DeliverPromoteEmailRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EmailId" type="s0:guid"/>
              <s:element name="MessageId" type="s:string"/>
              <s:element name="Subject" type="s:string"/>
              <s:element name="From" type="s:string"/>
              <s:element name="To" type="s:string"/>
              <s:element name="Cc" type="s:string"/>
              <s:element name="Bcc" type="s:string"/>
              <s:element name="ReceivedOn" type="s3:CrmDateTime"/>
              <s:element name="SubmittedBy" type="s:string"/>
              <s:element name="Importance" type="s:string"/>
              <s:element name="Body" type="s:string"/>
              <s:element name="Attachments" type="s3:BusinessEntityCollection"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="DeliverPromoteEmailResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="EmailId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="DetachFromQueueEmailRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EmailId" type="s0:guid"/>
              <s:element name="QueueId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="DetachFromQueueEmailResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="DisassociateEntitiesRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="Moniker1" type="s1:Moniker"/>
              <s:element name="Moniker2" type="s1:Moniker"/>
              <s:element name="RelationshipName" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="DisassociateEntitiesResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="discount">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="amount" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="amount_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="discountid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="discounttypeid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="exchangerate" type="s3:CrmDecimal"/>
              <s:element minOccurs="0" maxOccurs="1" name="highquantity" type="s3:CrmDecimal"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="isamounttype" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="lowquantity" type="s3:CrmDecimal"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="percentage" type="s3:CrmDecimal"/>
              <s:element minOccurs="0" maxOccurs="1" name="statuscode" type="s3:Status"/>
              <s:element minOccurs="0" maxOccurs="1" name="transactioncurrencyid" type="s3:Lookup"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="discounttype">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="discounttypeid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="isamounttype" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="statecode" type="tns:DiscountTypeStateInfo"/>
              <s:element minOccurs="0" maxOccurs="1" name="statuscode" type="s3:Status"/>
              <s:element minOccurs="0" maxOccurs="1" name="transactioncurrencyid" type="s3:Lookup"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:simpleType name="DiscountTypeState">
        <s:restriction base="s:string">
          <s:enumeration value="Active"/>
          <s:enumeration value="Inactive"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="DiscountTypeStateInfo">
        <s:simpleContent>
          <s:extension base="tns:DiscountTypeState">
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="displaystring">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="customcomment" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="customdisplaystring" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="displaystringid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="displaystringkey" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="formatparameters" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="languagecode" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="publisheddisplaystring" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="DistributeCampaignActivityRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="CampaignActivityId" type="s0:guid"/>
              <s:element name="Propagate" type="s:boolean"/>
              <s:element name="Activity" type="s3:BusinessEntity"/>
              <s:element name="TemplateId" type="s0:guid"/>
              <s:element name="OwnershipOptions" type="s1:PropagationOwnershipOptions"/>
              <s:element name="Owner" type="s1:Moniker"/>
              <s:element name="SendEmail" type="s:boolean"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="DistributeCampaignActivityResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="BulkOperationId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="DownloadReportDefinitionRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="ReportId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="DownloadReportDefinitionResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="BodyText" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="duplicaterecord">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="asyncoperationid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="baserecordid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="duplicateid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="duplicaterecordid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="duplicateruleid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="owninguser" type="s3:UniqueIdentifier"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="duplicaterule">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="baseentitymatchcodetable" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="baseentityname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="baseentitytypecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="duplicateruleid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="iscasesensitive" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="matchingentitymatchcodetable" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="matchingentityname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="matchingentitytypecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="ownerid" type="s3:Owner"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="statecode" type="tns:DuplicateRuleStateInfo"/>
              <s:element minOccurs="0" maxOccurs="1" name="statuscode" type="s3:Status"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="duplicaterulecondition">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="baseattributename" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="duplicateruleconditionid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="matchingattributename" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="operatorcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="operatorparam" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="owninguser" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="regardingobjectid" type="s3:Lookup"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:simpleType name="DuplicateRuleState">
        <s:restriction base="s:string">
          <s:enumeration value="Inactive"/>
          <s:enumeration value="Active"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="DuplicateRuleStateInfo">
        <s:simpleContent>
          <s:extension base="tns:DuplicateRuleState">
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="email">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="activityid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="actualdurationminutes" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="actualend" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="actualstart" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="bcc" type="tns:ArrayOfactivityparty"/>
              <s:element minOccurs="0" maxOccurs="1" name="category" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="cc" type="tns:ArrayOfactivityparty"/>
              <s:element minOccurs="0" maxOccurs="1" name="compressed" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="deliveryattempts" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="deliveryreceiptrequested" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="directioncode" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="from" type="tns:ArrayOfactivityparty"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="isbilled" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="isworkflowcreated" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="messageid" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="messageiddupcheck" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="mimetype" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="notifications" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="ownerid" type="s3:Owner"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="prioritycode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="readreceiptrequested" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="regardingobjectid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="scheduleddurationminutes" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="scheduledend" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="scheduledstart" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="sender" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="serviceid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="statecode" type="tns:EmailStateInfo"/>
              <s:element minOccurs="0" maxOccurs="1" name="statuscode" type="s3:Status"/>
              <s:element minOccurs="0" maxOccurs="1" name="subcategory" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="subject" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="submittedby" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="to" type="tns:ArrayOfactivityparty"/>
              <s:element minOccurs="0" maxOccurs="1" name="torecipients" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="trackingtoken" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:simpleType name="EmailState">
        <s:restriction base="s:string">
          <s:enumeration value="Open"/>
          <s:enumeration value="Completed"/>
          <s:enumeration value="Canceled"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="EmailStateInfo">
        <s:simpleContent>
          <s:extension base="tns:EmailState">
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="entitymap">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="entitymapid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="sourceentityname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="targetentityname" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:simpleType name="EntityName">
        <s:restriction base="s:string">
          <s:enumeration value="none"/>
          <s:enumeration value="account"/>
          <s:enumeration value="activitymimeattachment"/>
          <s:enumeration value="activityparty"/>
          <s:enumeration value="activitypointer"/>
          <s:enumeration value="annotation"/>
          <s:enumeration value="annualfiscalcalendar"/>
          <s:enumeration value="appointment"/>
          <s:enumeration value="asyncoperation"/>
          <s:enumeration value="attributemap"/>
          <s:enumeration value="bulkdeletefailure"/>
          <s:enumeration value="bulkdeleteoperation"/>
          <s:enumeration value="bulkoperation"/>
          <s:enumeration value="bulkoperationlog"/>
          <s:enumeration value="businesstask"/>
          <s:enumeration value="businessunit"/>
          <s:enumeration value="businessunitnewsarticle"/>
          <s:enumeration value="calendar"/>
          <s:enumeration value="calendarrule"/>
          <s:enumeration value="campaign"/>
          <s:enumeration value="campaignactivity"/>
          <s:enumeration value="campaignactivityitem"/>
          <s:enumeration value="campaignitem"/>
          <s:enumeration value="campaignresponse"/>
          <s:enumeration value="columnmapping"/>
          <s:enumeration value="competitor"/>
          <s:enumeration value="constraintbasedgroup"/>
          <s:enumeration value="contact"/>
          <s:enumeration value="contract"/>
          <s:enumeration value="contractdetail"/>
          <s:enumeration value="contracttemplate"/>
          <s:enumeration value="customeraddress"/>
          <s:enumeration value="customeropportunityrole"/>
          <s:enumeration value="customerrelationship"/>
          <s:enumeration value="discount"/>
          <s:enumeration value="discounttype"/>
          <s:enumeration value="displaystring"/>
          <s:enumeration value="duplicaterecord"/>
          <s:enumeration value="duplicaterule"/>
          <s:enumeration value="duplicaterulecondition"/>
          <s:enumeration value="email"/>
          <s:enumeration value="entitymap"/>
          <s:enumeration value="equipment"/>
          <s:enumeration value="fax"/>
          <s:enumeration value="fixedmonthlyfiscalcalendar"/>
          <s:enumeration value="import"/>
          <s:enumeration value="importdata"/>
          <s:enumeration value="importfile"/>
          <s:enumeration value="importjob"/>
          <s:enumeration value="importlog"/>
          <s:enumeration value="importmap"/>
          <s:enumeration value="incident"/>
          <s:enumeration value="incidentresolution"/>
          <s:enumeration value="invoice"/>
          <s:enumeration value="invoicedetail"/>
          <s:enumeration value="isvconfig"/>
          <s:enumeration value="kbarticle"/>
          <s:enumeration value="kbarticlecomment"/>
          <s:enumeration value="kbarticletemplate"/>
          <s:enumeration value="lead"/>
          <s:enumeration value="letter"/>
          <s:enumeration value="license"/>
          <s:enumeration value="list"/>
          <s:enumeration value="listmember"/>
          <s:enumeration value="lookupmapping"/>
          <s:enumeration value="mailmergetemplate"/>
          <s:enumeration value="monthlyfiscalcalendar"/>
          <s:enumeration value="notification"/>
          <s:enumeration value="opportunity"/>
          <s:enumeration value="opportunityclose"/>
          <s:enumeration value="opportunityproduct"/>
          <s:enumeration value="orderclose"/>
          <s:enumeration value="organization"/>
          <s:enumeration value="organizationui"/>
          <s:enumeration value="ownermapping"/>
          <s:enumeration value="phonecall"/>
          <s:enumeration value="picklistmapping"/>
          <s:enumeration value="pluginassembly"/>
          <s:enumeration value="plugintype"/>
          <s:enumeration value="pricelevel"/>
          <s:enumeration value="privilege"/>
          <s:enumeration value="product"/>
          <s:enumeration value="productpricelevel"/>
          <s:enumeration value="quarterlyfiscalcalendar"/>
          <s:enumeration value="queue"/>
          <s:enumeration value="queueitem"/>
          <s:enumeration value="quote"/>
          <s:enumeration value="quoteclose"/>
          <s:enumeration value="quotedetail"/>
          <s:enumeration value="relationshiprole"/>
          <s:enumeration value="relationshiprolemap"/>
          <s:enumeration value="report"/>
          <s:enumeration value="reportcategory"/>
          <s:enumeration value="reportentity"/>
          <s:enumeration value="reportlink"/>
          <s:enumeration value="reportvisibility"/>
          <s:enumeration value="resource"/>
          <s:enumeration value="resourcegroup"/>
          <s:enumeration value="resourcespec"/>
          <s:enumeration value="role"/>
          <s:enumeration value="salesliterature"/>
          <s:enumeration value="salesliteratureitem"/>
          <s:enumeration value="salesorder"/>
          <s:enumeration value="salesorderdetail"/>
          <s:enumeration value="savedquery"/>
          <s:enumeration value="sdkmessage"/>
          <s:enumeration value="sdkmessagefilter"/>
          <s:enumeration value="sdkmessageprocessingstep"/>
          <s:enumeration value="sdkmessageprocessingstepimage"/>
          <s:enumeration value="sdkmessageprocessingstepsecureconfig"/>
          <s:enumeration value="semiannualfiscalcalendar"/>
          <s:enumeration value="service"/>
          <s:enumeration value="serviceappointment"/>
          <s:enumeration value="site"/>
          <s:enumeration value="subject"/>
          <s:enumeration value="subscription"/>
          <s:enumeration value="subscriptionclients"/>
          <s:enumeration value="subscriptionsyncinfo"/>
          <s:enumeration value="systemuser"/>
          <s:enumeration value="task"/>
          <s:enumeration value="team"/>
          <s:enumeration value="template"/>
          <s:enumeration value="territory"/>
          <s:enumeration value="timezonedefinition"/>
          <s:enumeration value="timezonelocalizedname"/>
          <s:enumeration value="timezonerule"/>
          <s:enumeration value="transactioncurrency"/>
          <s:enumeration value="transformationmapping"/>
          <s:enumeration value="transformationparametermapping"/>
          <s:enumeration value="uom"/>
          <s:enumeration value="uomschedule"/>
          <s:enumeration value="userquery"/>
          <s:enumeration value="usersettings"/>
          <s:enumeration value="webwizard"/>
          <s:enumeration value="wfprocess"/>
          <s:enumeration value="wfprocessinstance"/>
          <s:enumeration value="wizardaccessprivilege"/>
          <s:enumeration value="wizardpage"/>
          <s:enumeration value="workflow"/>
          <s:enumeration value="workflowdependency"/>
          <s:enumeration value="workflowlog"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="equipment">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="businessunitid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="calendarid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="displayinserviceviews" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="emailaddress" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="equipmentid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="isdisabled" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="siteid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="skills" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezonecode" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ExecuteByIdSavedQueryRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ExecuteByIdSavedQueryResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="String" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ExecuteByIdUserQueryRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ExecuteByIdUserQueryResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="String" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ExecuteCampaignActivityRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="CampaignActivityId" type="s0:guid"/>
              <s:element name="Propagate" type="s:boolean"/>
              <s:element name="Activity" type="s3:BusinessEntity"/>
              <s:element name="TemplateId" type="s0:guid"/>
              <s:element name="OwnershipOptions" type="s1:PropagationOwnershipOptions"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ExecuteCampaignActivityResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="BulkOperationId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ExecuteFetchRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="FetchXml" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ExecuteFetchResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="FetchXmlResult" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ExecuteWorkflowRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
              <s:element name="WorkflowId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ExecuteWorkflowResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="Id" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ExpandCalendarRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="CalendarId" type="s0:guid"/>
              <s:element name="Start" type="s3:CrmDateTime"/>
              <s:element name="End" type="s3:CrmDateTime"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ExpandCalendarResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="result" type="tns:ArrayOfTimeInfo"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ExportAllXmlRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ExportAllXmlResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="ExportXml" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ExportCompressedAllXmlRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EmbeddedFileName" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ExportCompressedAllXmlResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="ExportCompressedXml" type="s:base64Binary"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ExportCompressedTranslationsXmlRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EmbeddedFileName" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ExportCompressedTranslationsXmlResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="ExportCompressedXml" type="s:base64Binary"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ExportCompressedXmlRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="ParameterXml" type="s:string"/>
              <s:element name="EmbeddedFileName" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ExportCompressedXmlResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="ExportCompressedXml" type="s:base64Binary"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ExportIdsOptionalParameter">
        <s:complexContent mixed="false">
          <s:extension base="tns:OptionalParameter">
            <s:sequence>
              <s:element minOccurs="1" maxOccurs="1" name="Value" type="s:boolean"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ExportTranslationsXmlRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ExportTranslationsXmlResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="ExportXml" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ExportXmlRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="ParameterXml" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ExportXmlResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="ExportXml" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="fax">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="activityid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="actualdurationminutes" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="actualend" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="actualstart" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="billingcode" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="category" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="coverpagename" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="directioncode" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="faxnumber" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="from" type="tns:ArrayOfactivityparty"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="isbilled" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="isworkflowcreated" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="numberofpages" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="ownerid" type="s3:Owner"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="prioritycode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="regardingobjectid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="scheduleddurationminutes" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="scheduledend" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="scheduledstart" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="serviceid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="statecode" type="tns:FaxStateInfo"/>
              <s:element minOccurs="0" maxOccurs="1" name="statuscode" type="s3:Status"/>
              <s:element minOccurs="0" maxOccurs="1" name="subcategory" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="subject" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="subscriptionid" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="to" type="tns:ArrayOfactivityparty"/>
              <s:element minOccurs="0" maxOccurs="1" name="tsid" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:simpleType name="FaxState">
        <s:restriction base="s:string">
          <s:enumeration value="Open"/>
          <s:enumeration value="Completed"/>
          <s:enumeration value="Canceled"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="FaxStateInfo">
        <s:simpleContent>
          <s:extension base="tns:FaxState">
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="FetchXmlToQueryExpressionRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="FetchXml" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="FetchXmlToQueryExpressionResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="Query" type="s2:QueryExpression"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="FindParentResourceGroupRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="ParentId" type="s0:guid"/>
              <s:element name="ChildrenIds" type="tns:ArrayOfGuid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="FindParentResourceGroupResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="result" type="s:boolean"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="fixedmonthlyfiscalcalendar">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="businessunitid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="effectiveon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="exchangerate" type="s3:CrmDecimal"/>
              <s:element minOccurs="0" maxOccurs="1" name="fiscalperiodtype" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="period1" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="period1_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="period10" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="period10_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="period11" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="period11_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="period12" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="period12_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="period13" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="period13_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="period2" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="period2_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="period3" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="period3_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="period4" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="period4_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="period5" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="period5_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="period6" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="period6_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="period7" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="period7_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="period8" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="period8_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="period9" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="period9_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="salespersonid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="transactioncurrencyid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="userfiscalcalendarid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="FulfillSalesOrderRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="OrderClose" type="s3:BusinessEntity"/>
              <s:element name="Status" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="FulfillSalesOrderResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="GenerateInvoiceFromOpportunityRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="OpportunityId" type="s0:guid"/>
              <s:element name="ColumnSet" type="s2:ColumnSetBase"/>
            </s:sequence>
            <s:attribute name="ReturnDynamicEntities" type="s:boolean" use="required"/>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="GenerateInvoiceFromOpportunityResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element ref="s3:BusinessEntity"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="GenerateQuoteFromOpportunityRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="OpportunityId" type="s0:guid"/>
              <s:element name="ColumnSet" type="s2:ColumnSetBase"/>
            </s:sequence>
            <s:attribute name="ReturnDynamicEntities" type="s:boolean" use="required"/>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="GenerateQuoteFromOpportunityResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element ref="s3:BusinessEntity"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="GenerateSalesOrderFromOpportunityRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="OpportunityId" type="s0:guid"/>
              <s:element name="ColumnSet" type="s2:ColumnSetBase"/>
            </s:sequence>
            <s:attribute name="ReturnDynamicEntities" type="s:boolean" use="required"/>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="GenerateSalesOrderFromOpportunityResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element ref="s3:BusinessEntity"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="GetAllTimeZonesWithDisplayNameRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="LocaleId" type="s:int"/>
            </s:sequence>
            <s:attribute name="ReturnDynamicEntities" type="s:boolean" use="required"/>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="GetAllTimeZonesWithDisplayNameResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element ref="s3:BusinessEntityCollection"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="GetDecryptionKeyRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="GetDecryptionKeyResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="Key" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="GetDistinctValuesImportFileRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="ImportFileId" type="s0:guid"/>
              <s:element name="columnNumber" type="s:int"/>
              <s:element name="pageNumber" type="s:int"/>
              <s:element name="recordsPerPage" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="GetDistinctValuesImportFileResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="Values" type="tns:ArrayOfString"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="GetHeaderColumnsImportFileRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="ImportFileId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="GetHeaderColumnsImportFileResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="Columns" type="tns:ArrayOfString"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="GetInvoiceProductsFromOpportunityRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="OpportunityId" type="s0:guid"/>
              <s:element name="InvoiceId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="GetInvoiceProductsFromOpportunityResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="GetQuantityDecimalRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="Target" type="tns:TargetQuantify"/>
              <s:element name="ProductId" type="s0:guid"/>
              <s:element name="UoMId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="GetQuantityDecimalResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="Quantity" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="GetQuoteProductsFromOpportunityRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="OpportunityId" type="s0:guid"/>
              <s:element name="QuoteId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="GetQuoteProductsFromOpportunityResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="GetReportHistoryLimitRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="ReportId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="GetReportHistoryLimitResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="HistoryLimit" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="GetSalesOrderProductsFromOpportunityRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="OpportunityId" type="s0:guid"/>
              <s:element name="SalesOrderId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="GetSalesOrderProductsFromOpportunityResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="GetTimeZoneCodeByLocalizedNameRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="LocalizedStandardName" type="s:string"/>
              <s:element name="LocaleId" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="GetTimeZoneCodeByLocalizedNameResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="TimeZoneCode" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="GetTrackingTokenEmailRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="Subject" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="GetTrackingTokenEmailResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="TrackingToken" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="GrantAccessRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="Target" type="tns:TargetOwned"/>
              <s:element name="PrincipalAccess" type="s1:PrincipalAccess"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="GrantAccessResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="HandleRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="Target" type="tns:TargetQueued"/>
              <s:element name="SourceQueueId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="HandleResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="import">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="emailaddress" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="importid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="isimport" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="modecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="ownerid" type="s3:Owner"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="sendnotification" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="sequence" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="statecode" type="tns:ImportStateInfo"/>
              <s:element minOccurs="0" maxOccurs="1" name="statuscode" type="s3:Status"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ImportAllXmlRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="CustomizationXml" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ImportAllXmlResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ImportCompressedAllXmlRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="CompressedCustomizationXml" type="s:base64Binary"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ImportCompressedAllXmlResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ImportCompressedTranslationsXmlWithProgressRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="CompressedTranslationsXml" type="s:base64Binary"/>
              <s:element name="ImportJobId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ImportCompressedTranslationsXmlWithProgressResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ImportCompressedXmlWithProgressRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="ParameterXml" type="s:string"/>
              <s:element name="CompressedCustomizationXml" type="s:base64Binary"/>
              <s:element name="ImportJobId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ImportCompressedXmlWithProgressResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="importdata">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="data" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="haserror" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="importdataid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="importfileid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="linenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="ownerid" type="s3:Owner"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="recordid" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="statecode" type="tns:ImportDataStateInfo"/>
              <s:element minOccurs="0" maxOccurs="1" name="statuscode" type="s3:Status"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:simpleType name="ImportDataState">
        <s:restriction base="s:string">
          <s:enumeration value="Active"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="ImportDataStateInfo">
        <s:simpleContent>
          <s:extension base="tns:ImportDataState">
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="importfile">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="additionalheaderrow" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="completedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="content" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="datadelimitercode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="enableduplicatedetection" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="failurecount" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="fielddelimitercode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="headerrow" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="importfileid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="importid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="importmapid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="isfirstrowheader" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="ownerid" type="s3:Owner"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="parsedtablecolumnprefix" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="parsedtablecolumnsnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="parsedtablename" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="processcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="processingstatus" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="progresscounter" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="recordsownerid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="size" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="source" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="sourceentityname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="statecode" type="tns:ImportFileStateInfo"/>
              <s:element minOccurs="0" maxOccurs="1" name="statuscode" type="s3:Status"/>
              <s:element minOccurs="0" maxOccurs="1" name="successcount" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="targetentityname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="totalcount" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="usesystemmap" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:simpleType name="ImportFileState">
        <s:restriction base="s:string">
          <s:enumeration value="Active"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="ImportFileStateInfo">
        <s:simpleContent>
          <s:extension base="tns:ImportFileState">
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="importjob">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="completedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="data" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="importjobid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="startedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="importlog">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="additionalinfo" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="columnvalue" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="errordescription" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="errornumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="headercolumn" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="importdataid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="importfileid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="importlogid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="linenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="logphasecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="ownerid" type="s3:Owner"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="sequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="statecode" type="tns:ImportLogStateInfo"/>
              <s:element minOccurs="0" maxOccurs="1" name="statuscode" type="s3:Status"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:simpleType name="ImportLogState">
        <s:restriction base="s:string">
          <s:enumeration value="Active"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="ImportLogStateInfo">
        <s:simpleContent>
          <s:extension base="tns:ImportLogState">
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="importmap">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="importmapid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="importmaptype" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="isvalidforimport" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="iswizardcreated" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="ownerid" type="s3:Owner"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="source" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="sourceuseridentifierforsourcecrmuserlink" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="sourceuseridentifierforsourcedatasourceuserlink" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="statecode" type="tns:ImportMapStateInfo"/>
              <s:element minOccurs="0" maxOccurs="1" name="statuscode" type="s3:Status"/>
              <s:element minOccurs="0" maxOccurs="1" name="targetentity" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="targetuseridentifierforsourcecrmuserlink" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:simpleType name="ImportMapState">
        <s:restriction base="s:string">
          <s:enumeration value="Active"/>
          <s:enumeration value="Inactive"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="ImportMapStateInfo">
        <s:simpleContent>
          <s:extension base="tns:ImportMapState">
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="ImportRecordsImportRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="ImportId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ImportRecordsImportResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="AsyncOperationId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:simpleType name="ImportState">
        <s:restriction base="s:string">
          <s:enumeration value="Active"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="ImportStateInfo">
        <s:simpleContent>
          <s:extension base="tns:ImportState">
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="ImportTranslationsXmlWithProgressRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="ImportXml" type="s:string"/>
              <s:element name="ImportJobId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ImportTranslationsXmlWithProgressResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ImportXmlRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="ParameterXml" type="s:string"/>
              <s:element name="CustomizationXml" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ImportXmlResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ImportXmlWithProgressRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="ParameterXml" type="s:string"/>
              <s:element name="CustomizationXml" type="s:string"/>
              <s:element name="ImportJobId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ImportXmlWithProgressResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="incident">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="actualserviceunits" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="billedserviceunits" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="caseorigincode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="casetypecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="contractdetailid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="contractid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="contractservicelevelcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="customerid" type="s3:Customer"/>
              <s:element minOccurs="0" maxOccurs="1" name="customersatisfactioncode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="followupby" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="incidentid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="incidentstagecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="isdecrementing" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="kbarticleid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="ownerid" type="s3:Owner"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="prioritycode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="productid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="productserialnumber" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="responsiblecontactid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="severitycode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="statecode" type="tns:IncidentStateInfo"/>
              <s:element minOccurs="0" maxOccurs="1" name="statuscode" type="s3:Status"/>
              <s:element minOccurs="0" maxOccurs="1" name="subjectid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="ticketnumber" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="title" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="incidentresolution">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="activityid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="actualdurationminutes" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="actualend" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="actualstart" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="category" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="incidentid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="isbilled" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="isworkflowcreated" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="ownerid" type="s3:Owner"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="scheduleddurationminutes" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="scheduledend" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="scheduledstart" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="serviceid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="statecode" type="tns:IncidentResolutionStateInfo"/>
              <s:element minOccurs="0" maxOccurs="1" name="statuscode" type="s3:Status"/>
              <s:element minOccurs="0" maxOccurs="1" name="subcategory" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="subject" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="timespent" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:simpleType name="IncidentResolutionState">
        <s:restriction base="s:string">
          <s:enumeration value="Open"/>
          <s:enumeration value="Completed"/>
          <s:enumeration value="Canceled"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="IncidentResolutionStateInfo">
        <s:simpleContent>
          <s:extension base="tns:IncidentResolutionState">
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:simpleType name="IncidentState">
        <s:restriction base="s:string">
          <s:enumeration value="Active"/>
          <s:enumeration value="Resolved"/>
          <s:enumeration value="Canceled"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="IncidentStateInfo">
        <s:simpleContent>
          <s:extension base="tns:IncidentState">
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="InitializeFromRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EntityMoniker" type="s1:Moniker"/>
              <s:element name="TargetEntityName" type="s:string"/>
              <s:element name="TargetFieldType" type="s3:TargetFieldType"/>
            </s:sequence>
            <s:attribute name="ReturnDynamicEntities" type="s:boolean" use="required"/>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="InitializeFromResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element ref="s3:Entity"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="InstantiateTemplateRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="TemplateId" type="s0:guid"/>
              <s:element name="ObjectType" type="s:string"/>
              <s:element name="ObjectId" type="s0:guid"/>
            </s:sequence>
            <s:attribute name="ReturnDynamicEntities" type="s:boolean" use="required"/>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="InstantiateTemplateResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element ref="s3:BusinessEntityCollection"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="invoice">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="billto_city" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="billto_country" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="billto_fax" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="billto_line1" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="billto_line2" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="billto_line3" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="billto_name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="billto_postalcode" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="billto_stateorprovince" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="billto_telephone" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="customerid" type="s3:Customer"/>
              <s:element minOccurs="0" maxOccurs="1" name="datedelivered" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="discountamount" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="discountamount_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="discountpercentage" type="s3:CrmDecimal"/>
              <s:element minOccurs="0" maxOccurs="1" name="duedate" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="exchangerate" type="s3:CrmDecimal"/>
              <s:element minOccurs="0" maxOccurs="1" name="freightamount" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="freightamount_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="invoiceid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="invoicenumber" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="ispricelocked" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="lastbackofficesubmit" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="opportunityid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="ownerid" type="s3:Owner"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="paymenttermscode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="pricelevelid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="pricingerrorcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="prioritycode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="salesorderid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="shippingmethodcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_city" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_country" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_fax" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_freighttermscode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_line1" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_line2" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_line3" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_postalcode" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_stateorprovince" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_telephone" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="statecode" type="tns:InvoiceStateInfo"/>
              <s:element minOccurs="0" maxOccurs="1" name="statuscode" type="s3:Status"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="totalamount" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="totalamount_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="totalamountlessfreight" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="totalamountlessfreight_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="totaldiscountamount" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="totaldiscountamount_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="totallineitemamount" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="totallineitemamount_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="totallineitemdiscountamount" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="totallineitemdiscountamount_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="totaltax" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="totaltax_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="transactioncurrencyid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="willcall" type="s3:CrmBoolean"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="invoicedetail">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="actualdeliveryon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="baseamount" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="baseamount_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="exchangerate" type="s3:CrmDecimal"/>
              <s:element minOccurs="0" maxOccurs="1" name="extendedamount" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="extendedamount_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="invoicedetailid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="invoiceid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="invoiceispricelocked" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="invoicestatecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="iscopied" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="ispriceoverridden" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="isproductoverridden" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="lineitemnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="manualdiscountamount" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="manualdiscountamount_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="owninguser" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="priceperunit" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="priceperunit_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="pricingerrorcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="productdescription" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="productid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="quantity" type="s3:CrmDecimal"/>
              <s:element minOccurs="0" maxOccurs="1" name="quantitybackordered" type="s3:CrmDecimal"/>
              <s:element minOccurs="0" maxOccurs="1" name="quantitycancelled" type="s3:CrmDecimal"/>
              <s:element minOccurs="0" maxOccurs="1" name="quantityshipped" type="s3:CrmDecimal"/>
              <s:element minOccurs="0" maxOccurs="1" name="salesrepid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="shippingtrackingnumber" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_city" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_country" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_fax" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_freighttermscode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_line1" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_line2" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_line3" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_postalcode" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_stateorprovince" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_telephone" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="tax" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="tax_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="transactioncurrencyid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="uomid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="volumediscountamount" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="volumediscountamount_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="willcall" type="s3:CrmBoolean"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:simpleType name="InvoiceState">
        <s:restriction base="s:string">
          <s:enumeration value="Active"/>
          <s:enumeration value="Closed"/>
          <s:enumeration value="Paid"/>
          <s:enumeration value="Canceled"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="InvoiceStateInfo">
        <s:simpleContent>
          <s:extension base="tns:InvoiceState">
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="IsBackOfficeInstalledRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="IsBackOfficeInstalledResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="IsInstalled" type="s:boolean"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="IsValidStateTransitionRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="Entity" type="s1:Moniker"/>
              <s:element name="NewState" type="s:string"/>
              <s:element name="NewStatus" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="IsValidStateTransitionResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="IsValid" type="s:boolean"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="isvconfig">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="configxml" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="isvconfigid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:UniqueIdentifier"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="kbarticle">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="articlexml" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="comments" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="content" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="kbarticleid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="kbarticletemplateid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="keywords" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="number" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="statecode" type="tns:KbArticleStateInfo"/>
              <s:element minOccurs="0" maxOccurs="1" name="statuscode" type="s3:Status"/>
              <s:element minOccurs="0" maxOccurs="1" name="subjectid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="title" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="kbarticlecomment">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="commenttext" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="kbarticlecommentid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="kbarticleid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="title" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:simpleType name="KbArticleState">
        <s:restriction base="s:string">
          <s:enumeration value="Draft"/>
          <s:enumeration value="Unapproved"/>
          <s:enumeration value="Published"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="KbArticleStateInfo">
        <s:simpleContent>
          <s:extension base="tns:KbArticleState">
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="kbarticletemplate">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="formatxml" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="isactive" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="kbarticletemplateid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="languagecode" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="structurexml" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="title" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="lead">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="address1_addressid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_addresstypecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_city" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_country" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_county" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_fax" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_latitude" type="s3:CrmFloat"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_line1" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_line2" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_line3" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_longitude" type="s3:CrmFloat"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_postalcode" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_postofficebox" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_shippingmethodcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_stateorprovince" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_telephone1" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_telephone2" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_telephone3" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_upszone" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_utcoffset" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_addressid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_addresstypecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_city" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_country" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_county" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_fax" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_latitude" type="s3:CrmFloat"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_line1" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_line2" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_line3" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_longitude" type="s3:CrmFloat"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_postalcode" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_postofficebox" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_shippingmethodcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_stateorprovince" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_telephone1" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_telephone2" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_telephone3" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_upszone" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_utcoffset" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="campaignid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="companyname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="customerid" type="s3:Customer"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="donotbulkemail" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="donotemail" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="donotfax" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="donotphone" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="donotpostalmail" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="donotsendmm" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="emailaddress1" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="emailaddress2" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="emailaddress3" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="estimatedamount" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="estimatedamount_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="estimatedclosedate" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="estimatedvalue" type="s3:CrmFloat"/>
              <s:element minOccurs="0" maxOccurs="1" name="exchangerate" type="s3:CrmDecimal"/>
              <s:element minOccurs="0" maxOccurs="1" name="fax" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="firstname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="fullname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="industrycode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="jobtitle" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="lastname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="lastusedincampaign" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="leadid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="leadqualitycode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="leadsourcecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="masterid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="merged" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="middlename" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="mobilephone" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="numberofemployees" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="ownerid" type="s3:Owner"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="pager" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="participatesinworkflow" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="preferredcontactmethodcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="prioritycode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="revenue" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="revenue_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="salesstagecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="salutation" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="sic" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="statecode" type="tns:LeadStateInfo"/>
              <s:element minOccurs="0" maxOccurs="1" name="statuscode" type="s3:Status"/>
              <s:element minOccurs="0" maxOccurs="1" name="subject" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="telephone1" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="telephone2" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="telephone3" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="transactioncurrencyid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="websiteurl" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="yomicompanyname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="yomifirstname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="yomifullname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="yomilastname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="yomimiddlename" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:simpleType name="LeadState">
        <s:restriction base="s:string">
          <s:enumeration value="Open"/>
          <s:enumeration value="Qualified"/>
          <s:enumeration value="Disqualified"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="LeadStateInfo">
        <s:simpleContent>
          <s:extension base="tns:LeadState">
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="letter">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="activityid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="actualdurationminutes" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="actualend" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="actualstart" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="address" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="bcc" type="tns:ArrayOfactivityparty"/>
              <s:element minOccurs="0" maxOccurs="1" name="category" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="cc" type="tns:ArrayOfactivityparty"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="directioncode" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="from" type="tns:ArrayOfactivityparty"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="isbilled" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="isworkflowcreated" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="ownerid" type="s3:Owner"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="prioritycode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="regardingobjectid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="scheduleddurationminutes" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="scheduledend" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="scheduledstart" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="serviceid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="statecode" type="tns:LetterStateInfo"/>
              <s:element minOccurs="0" maxOccurs="1" name="statuscode" type="s3:Status"/>
              <s:element minOccurs="0" maxOccurs="1" name="subcategory" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="subject" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="subscriptionid" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="to" type="tns:ArrayOfactivityparty"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:simpleType name="LetterState">
        <s:restriction base="s:string">
          <s:enumeration value="Open"/>
          <s:enumeration value="Completed"/>
          <s:enumeration value="Canceled"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="LetterStateInfo">
        <s:simpleContent>
          <s:extension base="tns:LetterState">
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="license">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="installedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="licenseid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="licensekey" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="licensetype" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="list">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="cost" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="cost_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdfromcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="donotsendonoptout" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="exchangerate" type="s3:CrmDecimal"/>
              <s:element minOccurs="0" maxOccurs="1" name="ignoreinactivelistmembers" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="lastusedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="listid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="listname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="lockstatus" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="membercount" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="membertype" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="ownerid" type="s3:Owner"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="purpose" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="source" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="statecode" type="tns:ListStateInfo"/>
              <s:element minOccurs="0" maxOccurs="1" name="statuscode" type="s3:Status"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="transactioncurrencyid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="listmember">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="entityid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="entitytype" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="listid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="listmemberid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="owninguser" type="s3:UniqueIdentifier"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:simpleType name="ListState">
        <s:restriction base="s:string">
          <s:enumeration value="Active"/>
          <s:enumeration value="Inactive"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="ListStateInfo">
        <s:simpleContent>
          <s:extension base="tns:ListState">
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="LocalTimeFromUtcTimeRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="TimeZoneCode" type="s:int"/>
              <s:element name="UtcTime" type="s3:CrmDateTime"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="LocalTimeFromUtcTimeResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="LocalTime" type="s3:CrmDateTime"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="LockInvoicePricingRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="InvoiceId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="LockInvoicePricingResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="LockSalesOrderPricingRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="SalesOrderId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="LockSalesOrderPricingResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="LocLabel">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Label" type="s:string"/>
          <s:element minOccurs="0" maxOccurs="1" name="LanguageCode" type="s3:CrmNumber"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="LogFailureBulkOperationRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="BulkOperationId" type="s0:guid"/>
              <s:element name="RegardingObjectId" type="s0:guid"/>
              <s:element name="RegardingObjectTypeCode" type="s:int"/>
              <s:element name="ErrorCode" type="s:int"/>
              <s:element name="Message" type="s:string"/>
              <s:element name="AdditionalInfo" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="LogFailureBulkOperationResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="LogSuccessBulkOperationRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="BulkOperationId" type="s0:guid"/>
              <s:element name="RegardingObjectId" type="s0:guid"/>
              <s:element name="RegardingObjectTypeCode" type="s:int"/>
              <s:element name="CreatedObjectId" type="s0:guid"/>
              <s:element name="CreatedObjectTypeCode" type="s:int"/>
              <s:element name="AdditionalInfo" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="LogSuccessBulkOperationResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="lookupmapping">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="columnmappingid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="lookupattributename" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="lookupentityname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="lookupmappingid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="lookupsourcecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="processcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="statecode" type="tns:LookUpMappingStateInfo"/>
              <s:element minOccurs="0" maxOccurs="1" name="statuscode" type="s3:Status"/>
              <s:element minOccurs="0" maxOccurs="1" name="transformationparametermappingid" type="s3:Lookup"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:simpleType name="LookUpMappingState">
        <s:restriction base="s:string">
          <s:enumeration value="Active"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="LookUpMappingStateInfo">
        <s:simpleContent>
          <s:extension base="tns:LookUpMappingState">
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="LoseOpportunityRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="OpportunityClose" type="s3:BusinessEntity"/>
              <s:element name="Status" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="LoseOpportunityResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="mailmergetemplate">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="body" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="defaultfilter" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="documentformat" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="filename" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="filesize" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="ispersonal" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="languagecode" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="mailmergetemplateid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="mailmergetype" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="mimetype" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="ownerid" type="s3:Owner"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="parameterxml" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="statecode" type="tns:MailMergeTemplateStateInfo"/>
              <s:element minOccurs="0" maxOccurs="1" name="statuscode" type="s3:Status"/>
              <s:element minOccurs="0" maxOccurs="1" name="templatetypecode" type="s3:EntityNameReference"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:simpleType name="MailMergeTemplateState">
        <s:restriction base="s:string">
          <s:enumeration value="Active"/>
          <s:enumeration value="Inactive"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="MailMergeTemplateStateInfo">
        <s:simpleContent>
          <s:extension base="tns:MailMergeTemplateState">
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="MakeAvailableToOrganizationReportRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="ReportId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="MakeAvailableToOrganizationReportResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="MakeAvailableToOrganizationTemplateRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="TemplateId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="MakeAvailableToOrganizationTemplateResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="MakeUnavailableToOrganizationReportRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="ReportId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="MakeUnavailableToOrganizationReportResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="MakeUnavailableToOrganizationTemplateRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="TemplateId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="MakeUnavailableToOrganizationTemplateResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="MergeRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="Target" type="tns:TargetMerge"/>
              <s:element name="SubordinateId" type="s0:guid"/>
              <s:element name="UpdateContent" type="s3:BusinessEntity"/>
              <s:element name="PerformParentingChecks" type="s:boolean"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="MergeResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ModifyAccessRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="Target" type="tns:TargetOwned"/>
              <s:element name="PrincipalAccess" type="s1:PrincipalAccess"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ModifyAccessResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="monthlyfiscalcalendar">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="businessunitid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="effectiveon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="exchangerate" type="s3:CrmDecimal"/>
              <s:element minOccurs="0" maxOccurs="1" name="fiscalperiodtype" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="month1" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="month1_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="month10" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="month10_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="month11" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="month11_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="month12" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="month12_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="month2" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="month2_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="month3" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="month3_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="month4" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="month4_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="month5" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="month5_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="month6" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="month6_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="month7" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="month7_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="month8" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="month8_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="month9" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="month9_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="salespersonid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="transactioncurrencyid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="userfiscalcalendarid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="notification">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdonstring" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="eventdata" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="eventid" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="notificationid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="notificationnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:Key"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="OfflineDataOptionalParameter">
        <s:complexContent mixed="false">
          <s:extension base="tns:OptionalParameter">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="Name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="Value" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="opportunity">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="actualclosedate" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="actualvalue" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="actualvalue_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="campaignid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="closeprobability" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="customerid" type="s3:Customer"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="estimatedclosedate" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="estimatedvalue" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="estimatedvalue_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="exchangerate" type="s3:CrmDecimal"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="isrevenuesystemcalculated" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="opportunityid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="opportunityratingcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="originatingleadid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="ownerid" type="s3:Owner"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="participatesinworkflow" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="pricelevelid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="pricingerrorcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="prioritycode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="salesstagecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="statecode" type="tns:OpportunityStateInfo"/>
              <s:element minOccurs="0" maxOccurs="1" name="statuscode" type="s3:Status"/>
              <s:element minOccurs="0" maxOccurs="1" name="stepid" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="stepname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="transactioncurrencyid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="opportunityclose">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="activityid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="actualdurationminutes" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="actualend" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="actualrevenue" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="actualrevenue_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="actualstart" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="category" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="competitorid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="exchangerate" type="s3:CrmDecimal"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="isbilled" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="isworkflowcreated" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="opportunityid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="ownerid" type="s3:Owner"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="scheduleddurationminutes" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="scheduledend" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="scheduledstart" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="serviceid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="statecode" type="tns:OpportunityCloseStateInfo"/>
              <s:element minOccurs="0" maxOccurs="1" name="statuscode" type="s3:Status"/>
              <s:element minOccurs="0" maxOccurs="1" name="subcategory" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="subject" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="transactioncurrencyid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:simpleType name="OpportunityCloseState">
        <s:restriction base="s:string">
          <s:enumeration value="Open"/>
          <s:enumeration value="Completed"/>
          <s:enumeration value="Canceled"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="OpportunityCloseStateInfo">
        <s:simpleContent>
          <s:extension base="tns:OpportunityCloseState">
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="opportunityproduct">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="baseamount" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="baseamount_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="exchangerate" type="s3:CrmDecimal"/>
              <s:element minOccurs="0" maxOccurs="1" name="extendedamount" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="extendedamount_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="ispriceoverridden" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="isproductoverridden" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="manualdiscountamount" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="manualdiscountamount_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="opportunityid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="opportunityproductid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="opportunitystatecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="owninguser" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="priceperunit" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="priceperunit_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="pricingerrorcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="productdescription" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="productid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="quantity" type="s3:CrmDecimal"/>
              <s:element minOccurs="0" maxOccurs="1" name="tax" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="tax_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="transactioncurrencyid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="uomid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="volumediscountamount" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="volumediscountamount_base" type="s3:CrmMoney"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:simpleType name="OpportunityState">
        <s:restriction base="s:string">
          <s:enumeration value="Open"/>
          <s:enumeration value="Won"/>
          <s:enumeration value="Lost"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="OpportunityStateInfo">
        <s:simpleContent>
          <s:extension base="tns:OpportunityState">
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="OptionalParameter" abstract="true"/>
      <s:complexType name="orderclose">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="activityid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="actualdurationminutes" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="actualend" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="actualstart" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="category" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="isbilled" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="isworkflowcreated" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="ordernumber" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="ownerid" type="s3:Owner"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="revision" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="salesorderid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="scheduleddurationminutes" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="scheduledend" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="scheduledstart" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="serviceid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="statecode" type="tns:OrderCloseStateInfo"/>
              <s:element minOccurs="0" maxOccurs="1" name="statuscode" type="s3:Status"/>
              <s:element minOccurs="0" maxOccurs="1" name="subcategory" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="subject" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:simpleType name="OrderCloseState">
        <s:restriction base="s:string">
          <s:enumeration value="Open"/>
          <s:enumeration value="Completed"/>
          <s:enumeration value="Canceled"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="OrderCloseStateInfo">
        <s:simpleContent>
          <s:extension base="tns:OrderCloseState">
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="organization">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="acknowledgementtemplateid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="allowaddressbooksyncs" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="allowautoresponsecreation" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="allowautounsubscribe" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="allowautounsubscribeacknowledgement" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="allowmarketingemailexecution" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="allowofflinescheduledsyncs" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="allowoutlookscheduledsyncs" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="allowunresolvedpartiesonemailsend" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="allowwebexcelexport" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="amdesignator" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="basecurrencyid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="blockedattachments" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="bulkoperationprefix" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="businessclosurecalendarid" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="calendartype" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="campaignprefix" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="caseprefix" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="contractprefix" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="currencydecimalprecision" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="currencydisplayoption" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="currencyformatcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="currencysymbol" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="currentbulkoperationnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="currentcampaignnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="currentcasenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="currentcontractnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="currentimportsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="currentinvoicenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="currentkbnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="currentordernumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="currentparsedtablenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="currentquotenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="dateformatcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="dateformatstring" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="dateseparator" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="decimalsymbol" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="disabledreason" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="emailsendpollingperiod" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="enablepricingoncreate" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="featureset" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="fiscalcalendarstart" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="fiscalperiodformat" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="fiscalperiodtype" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="fiscalsettingsupdated" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="fiscalyeardisplaycode" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="fiscalyearformat" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="fiscalyearperiodconnect" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="fullnameconventioncode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="grantaccesstonetworkservice" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="ignoreinternalemail" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="integrationuserid" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="invoiceprefix" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="isappmode" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="isdisabled" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="isduplicatedetectionenabled" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="isduplicatedetectionenabledforimport" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="isduplicatedetectionenabledforofflinesync" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="isduplicatedetectionenabledforonlinecreateupdate" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="isfiscalperiodmonthbased" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="ispresenceenabled" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="isregistered" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="issopintegrationenabled" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="isvintegrationcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="kbprefix" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="languagecode" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="localeid" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="longdateformatcode" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="maxappointmentdurationdays" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="maximumtrackingnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="maxrecordsforexporttoexcel" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="maxuploadfilesize" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="minaddressbooksyncinterval" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="minofflinesyncinterval" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="minoutlooksyncinterval" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="negativecurrencyformatcode" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="negativeformatcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="nexttrackingnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="numberformat" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="numbergroupformat" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="numberseparator" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="orderprefix" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="parsedtablecolumnprefix" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="parsedtableprefix" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="picture" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="pmdesignator" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="pricingdecimalprecision" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="privilegeusergroupid" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="privreportinggroupid" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="privreportinggroupname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="quoteprefix" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="referencesitemapxml" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="rendersecureiframeforemail" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="reportinggroupid" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="reportinggroupname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="schemanameprefix" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="sharetopreviousowneronassign" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="showweeknumber" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="sitemapxml" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="sortid" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="sqlaccessgroupid" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="sqlaccessgroupname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="sqmenabled" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="supportuserid" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="systemuserid" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="tagmaxaggressivecycles" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="tagpollingperiod" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="timeformatcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="timeformatstring" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="timeseparator" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="tokenexpiry" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="tokenkey" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="trackingprefix" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="trackingtokenidbase" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="trackingtokeniddigits" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="uniquespecifierlength" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="usergroupid" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="v3calloutconfighash" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="weekstartdaycode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="yearstartweekcode" type="s3:CrmNumber"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="organizationui">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="customizationlevel" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="fieldxml" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="formid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="formidunique" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="formxml" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="gridicon" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="inproduction" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="largeentityicon" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="objecttypecode" type="s3:EntityNameReference"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="outlookshortcuticon" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="previewcolumnsetxml" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="previewxml" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="version" type="s3:CrmNumber"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ownermapping">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="importmapid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="ownermappingid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="processcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="sourcesystemusername" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="sourceuservalueforsourcecrmuserlink" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="statecode" type="tns:OwnerMappingStateInfo"/>
              <s:element minOccurs="0" maxOccurs="1" name="statuscode" type="s3:Status"/>
              <s:element minOccurs="0" maxOccurs="1" name="targetsystemuserdomainname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="targetsystemuserid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="targetuservalueforsourcecrmuserlink" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:simpleType name="OwnerMappingState">
        <s:restriction base="s:string">
          <s:enumeration value="Active"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="OwnerMappingStateInfo">
        <s:simpleContent>
          <s:extension base="tns:OwnerMappingState">
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="ParseImportRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="ImportId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ParseImportResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="AsyncOperationId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="PersistInSyncOptionalParameter">
        <s:complexContent mixed="false">
          <s:extension base="tns:OptionalParameter">
            <s:sequence>
              <s:element minOccurs="1" maxOccurs="1" name="Value" type="s:boolean"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="phonecall">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="activityid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="actualdurationminutes" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="actualend" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="actualstart" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="category" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="directioncode" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="from" type="tns:ArrayOfactivityparty"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="isbilled" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="isworkflowcreated" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="ownerid" type="s3:Owner"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="phonenumber" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="prioritycode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="regardingobjectid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="scheduleddurationminutes" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="scheduledend" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="scheduledstart" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="serviceid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="statecode" type="tns:PhoneCallStateInfo"/>
              <s:element minOccurs="0" maxOccurs="1" name="statuscode" type="s3:Status"/>
              <s:element minOccurs="0" maxOccurs="1" name="subcategory" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="subject" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="subscriptionid" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="to" type="tns:ArrayOfactivityparty"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:simpleType name="PhoneCallState">
        <s:restriction base="s:string">
          <s:enumeration value="Open"/>
          <s:enumeration value="Completed"/>
          <s:enumeration value="Canceled"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="PhoneCallStateInfo">
        <s:simpleContent>
          <s:extension base="tns:PhoneCallState">
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="picklistmapping">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="columnmappingid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="picklistmappingid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="processcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="sourcevalue" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="statecode" type="tns:PickListMappingStateInfo"/>
              <s:element minOccurs="0" maxOccurs="1" name="statuscode" type="s3:Status"/>
              <s:element minOccurs="0" maxOccurs="1" name="targetvalue" type="s3:CrmNumber"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:simpleType name="PickListMappingState">
        <s:restriction base="s:string">
          <s:enumeration value="Active"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="PickListMappingStateInfo">
        <s:simpleContent>
          <s:extension base="tns:PickListMappingState">
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="pluginassembly">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="content" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="culture" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="customizationlevel" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="path" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="pluginassemblyid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="pluginassemblyidunique" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="publickeytoken" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="sourcehash" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="sourcetype" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="version" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="plugintype">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="assemblyname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="culture" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="customizationlevel" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="friendlyname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="isworkflowactivity" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="pluginassemblyid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="plugintypeid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="plugintypeidunique" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="publickeytoken" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="typename" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="version" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="pricelevel">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="begindate" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="enddate" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="freighttermscode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="paymentmethodcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="pricelevelid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="shippingmethodcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="statecode" type="tns:PriceLevelStateInfo"/>
              <s:element minOccurs="0" maxOccurs="1" name="statuscode" type="s3:Status"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="transactioncurrencyid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:simpleType name="PriceLevelState">
        <s:restriction base="s:string">
          <s:enumeration value="Active"/>
          <s:enumeration value="Inactive"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="PriceLevelStateInfo">
        <s:simpleContent>
          <s:extension base="tns:PriceLevelState">
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="privilege">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="accessright" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="canbebasic" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="canbedeep" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="canbeglobal" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="canbelocal" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="privilegeid" type="s3:Key"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ProcessInboundEmailRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="InboundEmailActivity" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ProcessInboundEmailResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ProcessOneMemberBulkOperationRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="BulkOperationId" type="s0:guid"/>
              <s:element name="Entity" type="s3:BusinessEntity"/>
              <s:element name="BulkOperationSource" type="s5:BulkOperationSource"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ProcessOneMemberBulkOperationResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="ProcessResult" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="product">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="currentcost" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="currentcost_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="defaultuomid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="defaultuomscheduleid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="exchangerate" type="s3:CrmDecimal"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="iskit" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="isstockitem" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="price" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="price_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="pricelevelid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="productid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="productnumber" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="producttypecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="producturl" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="quantitydecimal" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="quantityonhand" type="s3:CrmDecimal"/>
              <s:element minOccurs="0" maxOccurs="1" name="size" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="standardcost" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="standardcost_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="statecode" type="tns:ProductStateInfo"/>
              <s:element minOccurs="0" maxOccurs="1" name="statuscode" type="s3:Status"/>
              <s:element minOccurs="0" maxOccurs="1" name="stockvolume" type="s3:CrmDecimal"/>
              <s:element minOccurs="0" maxOccurs="1" name="stockweight" type="s3:CrmDecimal"/>
              <s:element minOccurs="0" maxOccurs="1" name="subjectid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="suppliername" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="transactioncurrencyid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="vendorname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="vendorpartnumber" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="productpricelevel">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="amount" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="amount_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="discounttypeid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="exchangerate" type="s3:CrmDecimal"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="percentage" type="s3:CrmDecimal"/>
              <s:element minOccurs="0" maxOccurs="1" name="pricelevelid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="pricingmethodcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="productid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="productpricelevelid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="quantitysellingcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="roundingoptionamount" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="roundingoptionamount_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="roundingoptioncode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="roundingpolicycode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="transactioncurrencyid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="uomid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="uomscheduleid" type="s3:Lookup"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:simpleType name="ProductState">
        <s:restriction base="s:string">
          <s:enumeration value="Active"/>
          <s:enumeration value="Inactive"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="ProductStateInfo">
        <s:simpleContent>
          <s:extension base="tns:ProductState">
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="PropagateByExpressionRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="QueryExpression" type="s2:QueryBase"/>
              <s:element name="FriendlyName" type="s:string"/>
              <s:element name="ExecuteImmediately" type="s:boolean"/>
              <s:element name="Activity" type="s3:BusinessEntity"/>
              <s:element name="TemplateId" type="s0:guid"/>
              <s:element name="OwnershipOptions" type="s1:PropagationOwnershipOptions"/>
              <s:element name="PostWorkflowEvent" type="s:boolean"/>
              <s:element name="Owner" type="s1:Moniker"/>
              <s:element name="SendEmail" type="s:boolean"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="PropagateByExpressionResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="BulkOperationId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="PublishAllXmlRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="PublishAllXmlResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="PublishDuplicateRuleRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="DuplicateRuleId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="PublishDuplicateRuleResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="JobId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="PublishXmlRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="ParameterXml" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="PublishXmlResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="QualifyMemberListRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="ListId" type="s0:guid"/>
              <s:element name="MembersId" type="tns:ArrayOfGuid"/>
              <s:element name="OverrideorRemove" type="s:boolean"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="QualifyMemberListResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="quarterlyfiscalcalendar">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="businessunitid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="effectiveon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="exchangerate" type="s3:CrmDecimal"/>
              <s:element minOccurs="0" maxOccurs="1" name="fiscalperiodtype" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="quarter1" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="quarter1_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="quarter2" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="quarter2_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="quarter3" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="quarter3_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="quarter4" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="quarter4_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="salespersonid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="transactioncurrencyid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="userfiscalcalendarid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="QueryExpressionToFetchXmlRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="Query" type="s2:QueryBase"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="QueryExpressionToFetchXmlResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="FetchXml" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="QueryMultipleSchedulesRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="ResourceIds" type="tns:ArrayOfGuid"/>
              <s:element name="Start" type="s3:CrmDateTime"/>
              <s:element name="End" type="s3:CrmDateTime"/>
              <s:element name="TimeCodes" type="tns:ArrayOfTimeCode"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="QueryMultipleSchedulesResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="TimeInfos" type="tns:ArrayOfArrayOfTimeInfo"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="QueryScheduleRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="ResourceId" type="s0:guid"/>
              <s:element name="Start" type="s3:CrmDateTime"/>
              <s:element name="End" type="s3:CrmDateTime"/>
              <s:element name="TimeCodes" type="tns:ArrayOfTimeCode"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="QueryScheduleResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="TimeInfos" type="tns:ArrayOfTimeInfo"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="queue">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="allowemailcredentials" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="businessunitid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="emailaddress" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="emailpassword" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="emailusername" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="ignoreunsolicitedemail" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="incomingemaildeliverymethod" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="incomingemailfilteringmethod" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="isfaxqueue" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="outgoingemaildeliverymethod" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="primaryuserid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="queueid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="queuesemantics" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="queuetypecode" type="s3:Picklist"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="queueitem">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="enteredon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="objectid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="objecttypecode" type="s3:EntityNameReference"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="priority" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="queueid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="queueitemid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="sender" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="state" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="status" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="title" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="torecipients" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="quote">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="billto_addressid" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="billto_city" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="billto_contactname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="billto_country" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="billto_fax" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="billto_line1" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="billto_line2" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="billto_line3" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="billto_name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="billto_postalcode" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="billto_stateorprovince" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="billto_telephone" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="campaignid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="closedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="customerid" type="s3:Customer"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="discountamount" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="discountamount_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="discountpercentage" type="s3:CrmDecimal"/>
              <s:element minOccurs="0" maxOccurs="1" name="effectivefrom" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="effectiveto" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="exchangerate" type="s3:CrmDecimal"/>
              <s:element minOccurs="0" maxOccurs="1" name="expireson" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="freightamount" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="freightamount_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="freighttermscode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="opportunityid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="ownerid" type="s3:Owner"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="paymenttermscode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="pricelevelid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="pricingerrorcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="quoteid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="quotenumber" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="requestdeliveryby" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="revisionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="shippingmethodcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_addressid" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_city" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_contactname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_country" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_fax" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_freighttermscode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_line1" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_line2" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_line3" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_postalcode" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_stateorprovince" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_telephone" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="statecode" type="tns:QuoteStateInfo"/>
              <s:element minOccurs="0" maxOccurs="1" name="statuscode" type="s3:Status"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="totalamount" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="totalamount_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="totalamountlessfreight" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="totalamountlessfreight_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="totaldiscountamount" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="totaldiscountamount_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="totallineitemamount" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="totallineitemamount_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="totallineitemdiscountamount" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="totallineitemdiscountamount_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="totaltax" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="totaltax_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="transactioncurrencyid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="willcall" type="s3:CrmBoolean"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="quoteclose">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="activityid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="actualdurationminutes" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="actualend" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="actualstart" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="category" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="isbilled" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="isworkflowcreated" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="ownerid" type="s3:Owner"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="quoteid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="quotenumber" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="revision" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="scheduleddurationminutes" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="scheduledend" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="scheduledstart" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="serviceid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="statecode" type="tns:QuoteCloseStateInfo"/>
              <s:element minOccurs="0" maxOccurs="1" name="statuscode" type="s3:Status"/>
              <s:element minOccurs="0" maxOccurs="1" name="subcategory" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="subject" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:simpleType name="QuoteCloseState">
        <s:restriction base="s:string">
          <s:enumeration value="Open"/>
          <s:enumeration value="Completed"/>
          <s:enumeration value="Canceled"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="QuoteCloseStateInfo">
        <s:simpleContent>
          <s:extension base="tns:QuoteCloseState">
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="quotedetail">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="baseamount" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="baseamount_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="exchangerate" type="s3:CrmDecimal"/>
              <s:element minOccurs="0" maxOccurs="1" name="extendedamount" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="extendedamount_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="ispriceoverridden" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="isproductoverridden" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="lineitemnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="manualdiscountamount" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="manualdiscountamount_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="owninguser" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="priceperunit" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="priceperunit_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="pricingerrorcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="productdescription" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="productid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="quantity" type="s3:CrmDecimal"/>
              <s:element minOccurs="0" maxOccurs="1" name="quotedetailid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="quoteid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="quotestatecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="requestdeliveryby" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="salesrepid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_addressid" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_city" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_contactname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_country" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_fax" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_freighttermscode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_line1" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_line2" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_line3" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_postalcode" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_stateorprovince" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_telephone" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="tax" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="tax_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="transactioncurrencyid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="uomid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="volumediscountamount" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="volumediscountamount_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="willcall" type="s3:CrmBoolean"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:simpleType name="QuoteState">
        <s:restriction base="s:string">
          <s:enumeration value="Draft"/>
          <s:enumeration value="Active"/>
          <s:enumeration value="Won"/>
          <s:enumeration value="Closed"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="QuoteStateInfo">
        <s:simpleContent>
          <s:extension base="tns:QuoteState">
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="ReassignObjectsSystemUserRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="UserId" type="s0:guid"/>
              <s:element name="ReassignPrincipal" type="s1:SecurityPrincipal"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ReassignObjectsSystemUserResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RegardingObjectIdOptionalParameter">
        <s:complexContent mixed="false">
          <s:extension base="tns:OptionalParameter">
            <s:sequence>
              <s:element minOccurs="1" maxOccurs="1" name="Value" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RegisterSolutionRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="PluginAssembly" type="s3:BusinessEntity"/>
              <s:element name="Steps" type="tns:ArrayOfSdkMessageProcessingStepRegistration"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RegisterSolutionResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="PluginAssemblyId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="relationshiprole">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="relationshiproleid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="statecode" type="tns:RelationshipRoleStateInfo"/>
              <s:element minOccurs="0" maxOccurs="1" name="statuscode" type="s3:Status"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="relationshiprolemap">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="associateobjecttypecode" type="s3:EntityNameReference"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="primaryobjecttypecode" type="s3:EntityNameReference"/>
              <s:element minOccurs="0" maxOccurs="1" name="relationshiproleid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="relationshiprolemapid" type="s3:Key"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:simpleType name="RelationshipRoleState">
        <s:restriction base="s:string">
          <s:enumeration value="Active"/>
          <s:enumeration value="Inactive"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="RelationshipRoleStateInfo">
        <s:simpleContent>
          <s:extension base="tns:RelationshipRoleState">
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="RemoveItemCampaignActivityRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="CampaignActivityId" type="s0:guid"/>
              <s:element name="ItemId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RemoveItemCampaignActivityResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RemoveItemCampaignRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="CampaignId" type="s0:guid"/>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RemoveItemCampaignResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RemoveMemberListRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="ListId" type="s0:guid"/>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RemoveMemberListResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RemoveMembersTeamRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="TeamId" type="s0:guid"/>
              <s:element name="MemberIds" type="tns:ArrayOfGuid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RemoveMembersTeamResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RemoveParentRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="Target" type="tns:TargetRemoveParent"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RemoveParentResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RemovePrivilegeRoleRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="RoleId" type="s0:guid"/>
              <s:element name="PrivilegeId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RemovePrivilegeRoleResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RemoveProductFromKitRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="KitId" type="s0:guid"/>
              <s:element name="ProductId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RemoveProductFromKitResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RemoveRelatedRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="Target" type="tns:TargetRelated"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RemoveRelatedResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RemoveSubstituteProductRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="ProductId" type="s0:guid"/>
              <s:element name="SubstituteId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RemoveSubstituteProductResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RemoveUserRolesRoleRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="UserId" type="s0:guid"/>
              <s:element name="RoleIds" type="tns:ArrayOfGuid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RemoveUserRolesRoleResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RenewContractRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="ContractId" type="s0:guid"/>
              <s:element name="Status" type="s:int"/>
              <s:element name="IncludeCanceledLines" type="s:boolean"/>
            </s:sequence>
            <s:attribute name="ReturnDynamicEntities" type="s:boolean" use="required"/>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RenewContractResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element ref="s3:BusinessEntity"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ReplacePrivilegesRoleRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="RoleId" type="s0:guid"/>
              <s:element name="Privileges" type="tns:ArrayOfRolePrivilege"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ReplacePrivilegesRoleResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="report">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="bodybinary" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="bodytext" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="bodyurl" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="customreportxml" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="defaultfilter" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="filename" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="filesize" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="iscustomreport" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="ispersonal" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="isscheduledreport" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="languagecode" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="mimetype" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="ownerid" type="s3:Owner"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="parentreportid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="queryinfo" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="reportid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="reporttypecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="schedulexml" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="signaturedate" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="signatureid" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="signaturelcid" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="signaturemajorversion" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="signatureminorversion" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="reportcategory">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="categorycode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="owninguser" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="reportcategoryid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="reportid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="reportentity">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="isfilterable" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="objecttypecode" type="s3:EntityNameReference"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="owninguser" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="reportentityid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="reportid" type="s3:Lookup"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="reportlink">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="linkedreportid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="linkedreportname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="linktypecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="owninguser" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="reportid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="reportlinkid" type="s3:Key"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="reportvisibility">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="owninguser" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="reportid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="reportvisibilityid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="visibilitycode" type="s3:Picklist"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="Request" abstract="true">
        <s:sequence>
          <s:element name="OptionalParameters" type="tns:ArrayOfOptionalParameter"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="RequestIdOptionalParameter">
        <s:complexContent mixed="false">
          <s:extension base="tns:OptionalParameter">
            <s:sequence>
              <s:element minOccurs="1" maxOccurs="1" name="Value" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RescheduleRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="Target" type="tns:TargetSchedule"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RescheduleResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="ValidationResult" type="s4:ValidationResult"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ResetDataFiltersRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ResetDataFiltersResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="resource">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="businessunitid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="calendarid" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="displayinserviceviews" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="isdisabled" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="objecttypecode" type="s3:EntityNameReference"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="resourceid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="siteid" type="s3:Lookup"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="resourcegroup">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="businessunitid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="grouptypecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="objecttypecode" type="s3:EntityNameReference"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="resourcegroupid" type="s3:Key"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="resourcespec">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="businessunitid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="constraints" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="effortrequired" type="s3:CrmFloat"/>
              <s:element minOccurs="0" maxOccurs="1" name="groupobjectid" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="objectiveexpression" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="objecttypecode" type="s3:EntityNameReference"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="requiredcount" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="resourcespecid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="samesite" type="s3:CrmBoolean"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="Response" abstract="true"/>
      <s:complexType name="RetrieveAllChildUsersSystemUserRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
              <s:element name="ColumnSet" type="s2:ColumnSetBase"/>
            </s:sequence>
            <s:attribute name="ReturnDynamicEntities" type="s:boolean" use="required"/>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveAllChildUsersSystemUserResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element ref="s3:BusinessEntityCollection"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveAvailableLanguagesRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveAvailableLanguagesResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="LocaleIds" type="tns:ArrayOfInt"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveBusinessHierarchyBusinessUnitRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
              <s:element name="ColumnSet" type="s2:ColumnSetBase"/>
            </s:sequence>
            <s:attribute name="ReturnDynamicEntities" type="s:boolean" use="required"/>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveBusinessHierarchyBusinessUnitResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element ref="s3:BusinessEntityCollection"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveByGroupResourceRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="ResourceGroupId" type="s0:guid"/>
              <s:element name="Query" type="s2:QueryBase"/>
            </s:sequence>
            <s:attribute name="ReturnDynamicEntities" type="s:boolean" use="required"/>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveByGroupResourceResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element ref="s3:BusinessEntityCollection"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveByResourceResourceGroupRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="ResourceId" type="s0:guid"/>
              <s:element name="Query" type="s2:QueryBase"/>
            </s:sequence>
            <s:attribute name="ReturnDynamicEntities" type="s:boolean" use="required"/>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveByResourceResourceGroupResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element ref="s3:BusinessEntityCollection"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveByResourcesServiceRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="ResourceIds" type="tns:ArrayOfGuid"/>
              <s:element name="Query" type="s2:QueryBase"/>
            </s:sequence>
            <s:attribute name="ReturnDynamicEntities" type="s:boolean" use="required"/>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveByResourcesServiceResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element ref="s3:BusinessEntityCollection"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveByTopIncidentProductKbArticleRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="ProductId" type="s0:guid"/>
            </s:sequence>
            <s:attribute name="ReturnDynamicEntities" type="s:boolean" use="required"/>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveByTopIncidentProductKbArticleResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element ref="s3:BusinessEntityCollection"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveByTopIncidentSubjectKbArticleRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="SubjectId" type="s0:guid"/>
            </s:sequence>
            <s:attribute name="ReturnDynamicEntities" type="s:boolean" use="required"/>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveByTopIncidentSubjectKbArticleResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element ref="s3:BusinessEntityCollection"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveDeploymentLicenseTypeRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveDeploymentLicenseTypeResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="licenseType" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveDeprovisionedLanguagesRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveDeprovisionedLanguagesResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="RetrieveDeprovisionedLanguages" type="tns:ArrayOfInt"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveDuplicatesRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="BusinessEntity" type="s3:BusinessEntity"/>
              <s:element name="MatchingEntityName" type="s:string"/>
              <s:element name="PagingInfo" type="s2:PagingInfo"/>
            </s:sequence>
            <s:attribute name="ReturnDynamicEntities" type="s:boolean" use="required"/>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveDuplicatesResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element ref="s3:DuplicateCollection"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveExchangeRateRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="TransactionCurrencyId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveExchangeRateResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="ExchangeRate" type="s:decimal"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveFormXmlRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EntityName" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveFormXmlResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="FormXml" type="s:string"/>
              <s:element name="CustomizationLevel" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveInstalledLanguagePacksRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveInstalledLanguagePacksResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="RetrieveInstalledLanguagePacks" type="tns:ArrayOfInt"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveLicenseInfoRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="AccessMode" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveLicenseInfoResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="AvailableCount" type="s:int"/>
              <s:element name="GrantedLicenseCount" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveLocLabelsRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EntityMoniker" type="s1:Moniker"/>
              <s:element name="AttributeName" type="s:string"/>
              <s:element name="IncludeUnpublished" type="s:boolean"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveLocLabelsResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="Label" type="tns:CrmLabel"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveMembersBulkOperationRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="BulkOperationId" type="s0:guid"/>
              <s:element name="BulkOperationSource" type="s5:BulkOperationSource"/>
              <s:element name="EntitySource" type="s5:EntitySource"/>
            </s:sequence>
            <s:attribute name="ReturnDynamicEntities" type="s:boolean" use="required"/>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveMembersBulkOperationResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element ref="s3:BusinessEntityCollection"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveMembersTeamRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
              <s:element name="MemberColumnSet" type="s2:ColumnSetBase"/>
            </s:sequence>
            <s:attribute name="ReturnDynamicEntities" type="s:boolean" use="required"/>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveMembersTeamResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element ref="s3:BusinessEntityCollection"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveMultipleRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="Query" type="s2:QueryBase"/>
            </s:sequence>
            <s:attribute name="ReturnDynamicEntities" type="s:boolean" use="required"/>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveMultipleResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element ref="s3:BusinessEntityCollection"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveParentGroupsResourceGroupRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="ResourceGroupId" type="s0:guid"/>
              <s:element name="Query" type="s2:QueryBase"/>
            </s:sequence>
            <s:attribute name="ReturnDynamicEntities" type="s:boolean" use="required"/>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveParentGroupsResourceGroupResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element ref="s3:BusinessEntityCollection"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveParsedDataImportFileRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="ImportFileId" type="s0:guid"/>
              <s:element name="PagingInfo" type="s2:PagingInfo"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveParsedDataImportFileResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="Values" type="tns:ArrayOfArrayOfString"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrievePrincipalAccessRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="Target" type="tns:TargetOwned"/>
              <s:element name="Principal" type="s1:SecurityPrincipal"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrievePrincipalAccessResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="AccessRights" type="s1:AccessRights"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrievePrivilegeSetRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:attribute name="ReturnDynamicEntities" type="s:boolean" use="required"/>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrievePrivilegeSetResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element ref="s3:BusinessEntityCollection"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveProvisionedLanguagesRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveProvisionedLanguagesResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="RetrieveProvisionedLanguages" type="tns:ArrayOfInt"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="Target" type="tns:TargetRetrieve"/>
              <s:element name="ColumnSet" type="s2:ColumnSetBase"/>
            </s:sequence>
            <s:attribute name="ReturnDynamicEntities" type="s:boolean" use="required"/>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element ref="s3:BusinessEntity"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveRolePrivilegesRoleRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="RoleId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveRolePrivilegesRoleResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="RolePrivileges" type="tns:ArrayOfRolePrivilege"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveSharedPrincipalsAndAccessRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="Target" type="tns:TargetOwned"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveSharedPrincipalsAndAccessResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="PrincipalAccesses" type="tns:ArrayOfPrincipalAccess"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveSubGroupsResourceGroupRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="ResourceGroupId" type="s0:guid"/>
              <s:element name="Query" type="s2:QueryBase"/>
            </s:sequence>
            <s:attribute name="ReturnDynamicEntities" type="s:boolean" use="required"/>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveSubGroupsResourceGroupResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element ref="s3:BusinessEntityCollection"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveSubsidiaryTeamsBusinessUnitRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
              <s:element name="ColumnSet" type="s2:ColumnSetBase"/>
            </s:sequence>
            <s:attribute name="ReturnDynamicEntities" type="s:boolean" use="required"/>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveSubsidiaryTeamsBusinessUnitResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element ref="s3:BusinessEntityCollection"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveSubsidiaryUsersBusinessUnitRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
              <s:element name="ColumnSet" type="s2:ColumnSetBase"/>
            </s:sequence>
            <s:attribute name="ReturnDynamicEntities" type="s:boolean" use="required"/>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveSubsidiaryUsersBusinessUnitResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element ref="s3:BusinessEntityCollection"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveTeamsSystemUserRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
              <s:element name="ColumnSet" type="s2:ColumnSetBase"/>
            </s:sequence>
            <s:attribute name="ReturnDynamicEntities" type="s:boolean" use="required"/>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveTeamsSystemUserResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element ref="s3:BusinessEntityCollection"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveUserPrivilegesRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="UserId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveUserPrivilegesResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="RolePrivileges" type="tns:ArrayOfRolePrivilege"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveUserSettingsSystemUserRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
              <s:element name="ColumnSet" type="s2:ColumnSetBase"/>
            </s:sequence>
            <s:attribute name="ReturnDynamicEntities" type="s:boolean" use="required"/>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveUserSettingsSystemUserResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element ref="s3:BusinessEntity"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveVersionRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RetrieveVersionResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="Version" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ReviseQuoteRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="QuoteId" type="s0:guid"/>
              <s:element name="ColumnSet" type="s2:ColumnSetBase"/>
            </s:sequence>
            <s:attribute name="ReturnDynamicEntities" type="s:boolean" use="required"/>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ReviseQuoteResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element ref="s3:BusinessEntity"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RevokeAccessRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="Target" type="tns:TargetOwned"/>
              <s:element name="Revokee" type="s1:SecurityPrincipal"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RevokeAccessResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="role">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="businessunitid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="parentroleid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="roleid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="roletemplateid" type="s3:Lookup"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RollupRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="Target" type="tns:TargetRollup"/>
              <s:element name="RollupType" type="s1:RollupType"/>
            </s:sequence>
            <s:attribute name="ReturnDynamicEntities" type="s:boolean" use="required"/>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RollupResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element ref="s3:BusinessEntityCollection"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RouteRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="Target" type="tns:TargetQueued"/>
              <s:element name="SourceQueueId" type="s0:guid"/>
              <s:element name="RouteType" type="s1:RouteType"/>
              <s:element name="EndpointId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="RouteResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="salesliterature">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="employeecontactid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="expirationdate" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="hasattachments" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="iscustomerviewable" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="keywords" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="literaturetypecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="salesliteratureid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="subjectid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="salesliteratureitem">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="abstract" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="attacheddocumenturl" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="authorname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="documentbody" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="filename" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="filesize" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="filetypecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="iscustomerviewable" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="keywords" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="mimetype" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="salesliteratureid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="salesliteratureitemid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="title" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="salesorder">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="billto_addressid" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="billto_city" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="billto_contactname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="billto_country" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="billto_fax" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="billto_line1" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="billto_line2" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="billto_line3" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="billto_name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="billto_postalcode" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="billto_stateorprovince" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="billto_telephone" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="campaignid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="customerid" type="s3:Customer"/>
              <s:element minOccurs="0" maxOccurs="1" name="datefulfilled" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="discountamount" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="discountamount_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="discountpercentage" type="s3:CrmDecimal"/>
              <s:element minOccurs="0" maxOccurs="1" name="exchangerate" type="s3:CrmDecimal"/>
              <s:element minOccurs="0" maxOccurs="1" name="freightamount" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="freightamount_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="freighttermscode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="ispricelocked" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="lastbackofficesubmit" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="opportunityid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="ordernumber" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="ownerid" type="s3:Owner"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="paymenttermscode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="pricelevelid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="pricingerrorcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="prioritycode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="quoteid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="requestdeliveryby" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="salesorderid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="shippingmethodcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_addressid" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_city" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_contactname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_country" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_fax" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_freighttermscode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_line1" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_line2" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_line3" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_postalcode" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_stateorprovince" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_telephone" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="statecode" type="tns:SalesOrderStateInfo"/>
              <s:element minOccurs="0" maxOccurs="1" name="statuscode" type="s3:Status"/>
              <s:element minOccurs="0" maxOccurs="1" name="submitdate" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="submitstatus" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="submitstatusdescription" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="totalamount" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="totalamount_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="totalamountlessfreight" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="totalamountlessfreight_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="totaldiscountamount" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="totaldiscountamount_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="totallineitemamount" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="totallineitemamount_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="totallineitemdiscountamount" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="totallineitemdiscountamount_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="totaltax" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="totaltax_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="transactioncurrencyid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="willcall" type="s3:CrmBoolean"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="salesorderdetail">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="baseamount" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="baseamount_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="exchangerate" type="s3:CrmDecimal"/>
              <s:element minOccurs="0" maxOccurs="1" name="extendedamount" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="extendedamount_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="iscopied" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="ispriceoverridden" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="isproductoverridden" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="lineitemnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="manualdiscountamount" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="manualdiscountamount_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="owninguser" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="priceperunit" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="priceperunit_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="pricingerrorcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="productdescription" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="productid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="quantity" type="s3:CrmDecimal"/>
              <s:element minOccurs="0" maxOccurs="1" name="quantitybackordered" type="s3:CrmDecimal"/>
              <s:element minOccurs="0" maxOccurs="1" name="quantitycancelled" type="s3:CrmDecimal"/>
              <s:element minOccurs="0" maxOccurs="1" name="quantityshipped" type="s3:CrmDecimal"/>
              <s:element minOccurs="0" maxOccurs="1" name="requestdeliveryby" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="salesorderdetailid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="salesorderid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="salesorderispricelocked" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="salesorderstatecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="salesrepid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_addressid" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_city" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_contactname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_country" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_fax" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_freighttermscode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_line1" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_line2" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_line3" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_postalcode" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_stateorprovince" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="shipto_telephone" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="tax" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="tax_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="transactioncurrencyid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="uomid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="volumediscountamount" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="volumediscountamount_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="willcall" type="s3:CrmBoolean"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:simpleType name="SalesOrderState">
        <s:restriction base="s:string">
          <s:enumeration value="Active"/>
          <s:enumeration value="Submitted"/>
          <s:enumeration value="Canceled"/>
          <s:enumeration value="Fulfilled"/>
          <s:enumeration value="Invoiced"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="SalesOrderStateInfo">
        <s:simpleContent>
          <s:extension base="tns:SalesOrderState">
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="savedquery">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="columnsetxml" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="customizationlevel" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="fetchxml" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="inproduction" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="iscustomizable" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="isdefault" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="isprivate" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="isquickfindquery" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="isuserdefined" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="layoutxml" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="queryapi" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="queryappusage" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="querytype" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="returnedtypecode" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="savedqueryid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="savedqueryidunique" type="s3:UniqueIdentifier"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="sdkmessage">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="autotransact" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="availability" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="categoryname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="customizationlevel" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="expand" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="isprivate" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="sdkmessageid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="sdkmessageidunique" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="template" type="s3:CrmBoolean"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="sdkmessagefilter">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="availability" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="customizationlevel" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="iscustomprocessingstepallowed" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="primaryobjecttypecode" type="s3:EntityNameReference"/>
              <s:element minOccurs="0" maxOccurs="1" name="sdkmessagefilterid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="sdkmessagefilteridunique" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="sdkmessageid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="secondaryobjecttypecode" type="s3:EntityNameReference"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="sdkmessageprocessingstep">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="configuration" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="customizationlevel" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="filteringattributes" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="impersonatinguserid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="invocationsource" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="mode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="plugintypeid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="rank" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="sdkmessagefilterid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="sdkmessageid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="sdkmessageprocessingstepid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="sdkmessageprocessingstepidunique" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="sdkmessageprocessingstepsecureconfigid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="stage" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="statecode" type="tns:SdkMessageProcessingStepStateInfo"/>
              <s:element minOccurs="0" maxOccurs="1" name="statuscode" type="s3:Status"/>
              <s:element minOccurs="0" maxOccurs="1" name="supporteddeployment" type="s3:Picklist"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="sdkmessageprocessingstepimage">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="attributes" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="customizationlevel" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="entityalias" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="imagetype" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="messagepropertyname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="relatedattributename" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="sdkmessageprocessingstepid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="sdkmessageprocessingstepimageid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="sdkmessageprocessingstepimageidunique" type="s3:UniqueIdentifier"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SdkMessageProcessingStepImageRegistration">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="MessagePropertyName" type="s:string"/>
          <s:element minOccurs="0" maxOccurs="1" name="Attributes" type="tns:ArrayOfString"/>
          <s:element minOccurs="0" maxOccurs="1" name="EntityAlias" type="s:string"/>
          <s:element minOccurs="1" maxOccurs="1" name="ImageType" type="s:int"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="SdkMessageProcessingStepRegistration">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="MessageName" type="s:string"/>
          <s:element minOccurs="0" maxOccurs="1" name="PrimaryEntityName" type="s:string"/>
          <s:element minOccurs="0" maxOccurs="1" name="SecondaryEntityName" type="s:string"/>
          <s:element minOccurs="0" maxOccurs="1" name="Description" type="s:string"/>
          <s:element minOccurs="1" maxOccurs="1" name="Stage" type="s:int"/>
          <s:element minOccurs="1" maxOccurs="1" name="Mode" type="s:int"/>
          <s:element minOccurs="1" maxOccurs="1" name="ImpersonatingUserId" type="s0:guid"/>
          <s:element minOccurs="1" maxOccurs="1" name="SupportedDeployment" type="s:int"/>
          <s:element minOccurs="0" maxOccurs="1" name="FilteringAttributes" type="s:string"/>
          <s:element minOccurs="0" maxOccurs="1" name="PluginTypeFriendlyName" type="s:string"/>
          <s:element minOccurs="0" maxOccurs="1" name="PluginTypeName" type="s:string"/>
          <s:element minOccurs="0" maxOccurs="1" name="CustomConfiguration" type="s:string"/>
          <s:element minOccurs="1" maxOccurs="1" name="InvocationSource" type="s:int"/>
          <s:element minOccurs="0" maxOccurs="1" name="Images" type="tns:ArrayOfSdkMessageProcessingStepImageRegistration"/>
        </s:sequence>
      </s:complexType>
      <s:complexType name="sdkmessageprocessingstepsecureconfig">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="customizationlevel" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="sdkmessageprocessingstepsecureconfigid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="sdkmessageprocessingstepsecureconfigidunique" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="secureconfig" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:simpleType name="SdkMessageProcessingStepState">
        <s:restriction base="s:string">
          <s:enumeration value="Enabled"/>
          <s:enumeration value="Disabled"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="SdkMessageProcessingStepStateInfo">
        <s:simpleContent>
          <s:extension base="tns:SdkMessageProcessingStepState">
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="SearchByBodyKbArticleRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="SearchText" type="s:string"/>
              <s:element name="SubjectId" type="s0:guid"/>
              <s:element name="ColumnSet" type="s2:ColumnSetBase"/>
            </s:sequence>
            <s:attribute name="ReturnDynamicEntities" type="s:boolean" use="required"/>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SearchByBodyKbArticleResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element ref="s3:BusinessEntityCollection"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SearchByKeywordsKbArticleRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="SearchText" type="s:string"/>
              <s:element name="SubjectId" type="s0:guid"/>
              <s:element name="ColumnSet" type="s2:ColumnSetBase"/>
            </s:sequence>
            <s:attribute name="ReturnDynamicEntities" type="s:boolean" use="required"/>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SearchByKeywordsKbArticleResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element ref="s3:BusinessEntityCollection"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SearchByTitleKbArticleRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="SearchText" type="s:string"/>
              <s:element name="SubjectId" type="s0:guid"/>
              <s:element name="ColumnSet" type="s2:ColumnSetBase"/>
            </s:sequence>
            <s:attribute name="ReturnDynamicEntities" type="s:boolean" use="required"/>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SearchByTitleKbArticleResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element ref="s3:BusinessEntityCollection"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SearchRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="AppointmentRequest" type="s4:AppointmentRequest"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SearchResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="SearchResults" type="s4:SearchResults"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="semiannualfiscalcalendar">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="businessunitid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="effectiveon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="exchangerate" type="s3:CrmDecimal"/>
              <s:element minOccurs="0" maxOccurs="1" name="firsthalf" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="firsthalf_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="fiscalperiodtype" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="salespersonid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="secondhalf" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="secondhalf_base" type="s3:CrmMoney"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="transactioncurrencyid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="userfiscalcalendarid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SendBulkMailRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="Sender" type="s1:Moniker"/>
              <s:element name="TemplateId" type="s0:guid"/>
              <s:element name="RegardingType" type="s:string"/>
              <s:element name="RegardingId" type="s0:guid"/>
              <s:element name="Query" type="s2:QueryBase"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SendBulkMailResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SendEmailFromTemplateRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="TemplateId" type="s0:guid"/>
              <s:element name="RegardingType" type="s:string"/>
              <s:element name="RegardingId" type="s0:guid"/>
              <s:element name="Target" type="tns:TargetSendFromTemplate"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SendEmailFromTemplateResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="Id" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SendEmailRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EmailId" type="s0:guid"/>
              <s:element name="IssueSend" type="s:boolean"/>
              <s:element name="TrackingToken" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SendEmailResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="Subject" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SendFaxRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="FaxId" type="s0:guid"/>
              <s:element name="IssueSend" type="s:boolean"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SendFaxResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SendTemplateRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="TemplateId" type="s0:guid"/>
              <s:element name="Sender" type="s1:Moniker"/>
              <s:element name="RecipientType" type="s:string"/>
              <s:element name="RecipientIds" type="tns:ArrayOfGuid"/>
              <s:element name="RegardingType" type="s:string"/>
              <s:element name="RegardingId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SendTemplateResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="service">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="anchoroffset" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="calendarid" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="duration" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="granularity" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="initialstatuscode" type="s3:Status"/>
              <s:element minOccurs="0" maxOccurs="1" name="isschedulable" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="isvisible" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="resourcespecid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="serviceid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="showresources" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="strategyid" type="s3:Lookup"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="serviceappointment">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="activityid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="actualdurationminutes" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="actualend" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="actualstart" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="category" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="customers" type="tns:ArrayOfactivityparty"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="isalldayevent" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="isbilled" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="isworkflowcreated" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="location" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="ownerid" type="s3:Owner"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="prioritycode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="regardingobjectid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="resources" type="tns:ArrayOfactivityparty"/>
              <s:element minOccurs="0" maxOccurs="1" name="scheduleddurationminutes" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="scheduledend" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="scheduledstart" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="serviceid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="siteid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="statecode" type="tns:ServiceAppointmentStateInfo"/>
              <s:element minOccurs="0" maxOccurs="1" name="statuscode" type="s3:Status"/>
              <s:element minOccurs="0" maxOccurs="1" name="subcategory" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="subject" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="subscriptionid" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:simpleType name="ServiceAppointmentState">
        <s:restriction base="s:string">
          <s:enumeration value="Open"/>
          <s:enumeration value="Closed"/>
          <s:enumeration value="Canceled"/>
          <s:enumeration value="Scheduled"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="ServiceAppointmentStateInfo">
        <s:simpleContent>
          <s:extension base="tns:ServiceAppointmentState">
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="SetBusinessEquipmentRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EquipmentId" type="s0:guid"/>
              <s:element name="BusinessUnitId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetBusinessEquipmentResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetBusinessSystemUserRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="UserId" type="s0:guid"/>
              <s:element name="BusinessId" type="s0:guid"/>
              <s:element name="ReassignPrincipal" type="s1:SecurityPrincipal"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetBusinessSystemUserResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetLocLabelsRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EntityMoniker" type="s1:Moniker"/>
              <s:element name="AttributeName" type="s:string"/>
              <s:element name="Labels" type="tns:ArrayOfLocLabel"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetLocLabelsResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetParentBusinessUnitRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="BusinessUnitId" type="s0:guid"/>
              <s:element name="ParentId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetParentBusinessUnitResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetParentSystemUserRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="UserId" type="s0:guid"/>
              <s:element name="ParentId" type="s0:guid"/>
              <s:element name="KeepChildUsers" type="s:boolean"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetParentSystemUserResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetParentTeamRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="TeamId" type="s0:guid"/>
              <s:element name="BusinessId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetParentTeamResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetRelatedRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="Target" type="tns:TargetRelated"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetRelatedResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetReportRelatedRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="ReportId" type="s0:guid"/>
              <s:element name="Entities" type="tns:ArrayOfInt"/>
              <s:element name="Categories" type="tns:ArrayOfInt"/>
              <s:element name="Visibility" type="tns:ArrayOfInt"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetReportRelatedResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateAccountRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
              <s:element name="AccountState" type="tns:AccountState"/>
              <s:element name="AccountStatus" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateAccountResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateAppointmentRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
              <s:element name="AppointmentState" type="tns:AppointmentState"/>
              <s:element name="AppointmentStatus" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateAppointmentResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateBusinessUnitRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
              <s:element name="BusinessUnitState" type="tns:BusinessUnitState"/>
              <s:element name="BusinessUnitStatus" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateBusinessUnitResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateCampaignActivityRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
              <s:element name="CampaignActivityState" type="tns:CampaignActivityState"/>
              <s:element name="CampaignActivityStatus" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateCampaignActivityResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateCampaignRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
              <s:element name="CampaignState" type="tns:CampaignState"/>
              <s:element name="CampaignStatus" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateCampaignResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateCampaignResponseRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
              <s:element name="CampaignResponseState" type="tns:CampaignResponseState"/>
              <s:element name="CampaignResponseStatus" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateCampaignResponseResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateContactRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
              <s:element name="ContactState" type="tns:ContactState"/>
              <s:element name="ContactStatus" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateContactResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateContractDetailRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
              <s:element name="ContractDetailState" type="tns:ContractDetailState"/>
              <s:element name="ContractDetailStatus" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateContractDetailResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateContractRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
              <s:element name="ContractState" type="tns:ContractState"/>
              <s:element name="ContractStatus" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateContractResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateDiscountTypeRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
              <s:element name="DiscountTypeState" type="tns:DiscountTypeState"/>
              <s:element name="DiscountTypeStatus" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateDiscountTypeResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateDynamicEntityRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="Entity" type="s1:Moniker"/>
              <s:element name="State" type="s:string"/>
              <s:element name="Status" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateDynamicEntityResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateEmailRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
              <s:element name="EmailState" type="tns:EmailState"/>
              <s:element name="EmailStatus" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateEmailResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateFaxRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
              <s:element name="FaxState" type="tns:FaxState"/>
              <s:element name="FaxStatus" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateFaxResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateImportMapRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
              <s:element name="ImportMapState" type="tns:ImportMapState"/>
              <s:element name="ImportMapStatus" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateImportMapResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateIncidentRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
              <s:element name="IncidentState" type="tns:IncidentState"/>
              <s:element name="IncidentStatus" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateIncidentResolutionRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
              <s:element name="IncidentResolutionState" type="tns:IncidentResolutionState"/>
              <s:element name="IncidentResolutionStatus" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateIncidentResolutionResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateIncidentResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateInvoiceRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
              <s:element name="InvoiceState" type="tns:InvoiceState"/>
              <s:element name="InvoiceStatus" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateInvoiceResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateKbArticleRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
              <s:element name="KbArticleState" type="tns:KbArticleState"/>
              <s:element name="KbArticleStatus" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateKbArticleResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateLeadRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
              <s:element name="LeadState" type="tns:LeadState"/>
              <s:element name="LeadStatus" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateLeadResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateLetterRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
              <s:element name="LetterState" type="tns:LetterState"/>
              <s:element name="LetterStatus" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateLetterResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateListRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
              <s:element name="ListState" type="tns:ListState"/>
              <s:element name="ListStatus" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateListResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateMailMergeTemplateRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
              <s:element name="MailMergeTemplateState" type="tns:MailMergeTemplateState"/>
              <s:element name="MailMergeTemplateStatus" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateMailMergeTemplateResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateOpportunityCloseRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
              <s:element name="OpportunityCloseState" type="tns:OpportunityCloseState"/>
              <s:element name="OpportunityCloseStatus" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateOpportunityCloseResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateOpportunityRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
              <s:element name="OpportunityState" type="tns:OpportunityState"/>
              <s:element name="OpportunityStatus" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateOpportunityResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateOrderCloseRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
              <s:element name="OrderCloseState" type="tns:OrderCloseState"/>
              <s:element name="OrderCloseStatus" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateOrderCloseResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStatePhoneCallRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
              <s:element name="PhoneCallState" type="tns:PhoneCallState"/>
              <s:element name="PhoneCallStatus" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStatePhoneCallResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStatePriceLevelRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
              <s:element name="PriceLevelState" type="tns:PriceLevelState"/>
              <s:element name="PriceLevelStatus" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStatePriceLevelResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateProductRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
              <s:element name="ProductState" type="tns:ProductState"/>
              <s:element name="ProductStatus" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateProductResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateQuoteCloseRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
              <s:element name="QuoteCloseState" type="tns:QuoteCloseState"/>
              <s:element name="QuoteCloseStatus" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateQuoteCloseResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateQuoteRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
              <s:element name="QuoteState" type="tns:QuoteState"/>
              <s:element name="QuoteStatus" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateQuoteResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateRelationshipRoleRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
              <s:element name="RelationshipRoleState" type="tns:RelationshipRoleState"/>
              <s:element name="RelationshipRoleStatus" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateRelationshipRoleResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateSalesOrderRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
              <s:element name="SalesOrderState" type="tns:SalesOrderState"/>
              <s:element name="SalesOrderStatus" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateSalesOrderResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateSdkMessageProcessingStepRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
              <s:element name="SdkMessageProcessingStepState" type="tns:SdkMessageProcessingStepState"/>
              <s:element name="SdkMessageProcessingStepStatus" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateSdkMessageProcessingStepResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateServiceAppointmentRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
              <s:element name="ServiceAppointmentState" type="tns:ServiceAppointmentState"/>
              <s:element name="ServiceAppointmentStatus" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateServiceAppointmentResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateSystemUserRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
              <s:element name="SystemUserState" type="tns:SystemUserState"/>
              <s:element name="SystemUserStatus" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateSystemUserResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateTaskRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
              <s:element name="TaskState" type="tns:TaskState"/>
              <s:element name="TaskStatus" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateTaskResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateTransactionCurrencyRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
              <s:element name="TransactionCurrencyState" type="tns:TransactionCurrencyState"/>
              <s:element name="TransactionCurrencyStatus" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateTransactionCurrencyResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateUserQueryRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
              <s:element name="UserQueryState" type="tns:UserQueryState"/>
              <s:element name="UserQueryStatus" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateUserQueryResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateWFProcessInstanceRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
              <s:element name="WFProcessInstanceState" type="tns:WFProcessInstanceState"/>
              <s:element name="WFProcessInstanceStatus" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateWFProcessInstanceResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateWorkflowRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
              <s:element name="WorkflowState" type="tns:WorkflowState"/>
              <s:element name="WorkflowStatus" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SetStateWorkflowResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="site">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="address1_addressid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_addresstypecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_city" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_country" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_county" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_fax" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_latitude" type="s3:CrmFloat"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_line1" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_line2" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_line3" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_longitude" type="s3:CrmFloat"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_postalcode" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_postofficebox" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_shippingmethodcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_stateorprovince" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_telephone1" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_telephone2" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_telephone3" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_upszone" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_utcoffset" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_addressid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_addresstypecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_city" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_country" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_county" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_fax" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_latitude" type="s3:CrmFloat"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_line1" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_line2" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_line3" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_longitude" type="s3:CrmFloat"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_postalcode" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_postofficebox" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_shippingmethodcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_stateorprovince" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_telephone1" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_telephone2" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_telephone3" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_upszone" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_utcoffset" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="emailaddress" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="siteid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezonecode" type="s3:CrmNumber"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="StatusUpdateBulkOperationRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="BulkOperationId" type="s0:guid"/>
              <s:element name="FailureCount" type="s:int"/>
              <s:element name="SuccessCount" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="StatusUpdateBulkOperationResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="subject">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="featuremask" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="parentsubject" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="subjectid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="title" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="subscription">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="completedsyncstartedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="lastsyncstartedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="machinename" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="reinitialize" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="subscriptionid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="subscriptiontype" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="syncentrytablename" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="systemuserid" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="subscriptionclients">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="clientid" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="isprimaryclient" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="machinename" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="subscriptionclientid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="subscriptionid" type="s3:UniqueIdentifier"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="subscriptionsyncinfo">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="datasize" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="deleteobjectcount" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="endtime" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="insertobjectcount" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="starttime" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="subscriptionid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="subscriptionsyncinfoid" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="syncresult" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="systemuser">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="accessmode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_addressid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_addresstypecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_city" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_country" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_county" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_fax" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_latitude" type="s3:CrmFloat"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_line1" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_line2" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_line3" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_longitude" type="s3:CrmFloat"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_postalcode" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_postofficebox" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_shippingmethodcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_stateorprovince" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_telephone1" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_telephone2" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_telephone3" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_upszone" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address1_utcoffset" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_addressid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_addresstypecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_city" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_country" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_county" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_fax" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_latitude" type="s3:CrmFloat"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_line1" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_line2" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_line3" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_longitude" type="s3:CrmFloat"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_postalcode" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_postofficebox" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_shippingmethodcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_stateorprovince" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_telephone1" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_telephone2" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_telephone3" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_upszone" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="address2_utcoffset" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="businessunitid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="calendarid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="disabledreason" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="displayinserviceviews" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="domainname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="employeeid" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="firstname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="fullname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="governmentid" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="homephone" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="incomingemaildeliverymethod" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="internalemailaddress" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="invitestatuscode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="isdisabled" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="jobtitle" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="lastname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="middlename" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="mobilealertemail" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="mobilephone" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="nickname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="outgoingemaildeliverymethod" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="parentsystemuserid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="passporthi" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="passportlo" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="personalemailaddress" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="photourl" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="preferredaddresscode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="preferredemailcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="preferredphonecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="salutation" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="setupuser" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="siteid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="skills" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="systemuserid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="territoryid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="title" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="windowsliveid" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="yomifirstname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="yomifullname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="yomilastname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="yomimiddlename" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:simpleType name="SystemUserState">
        <s:restriction base="s:string">
          <s:enumeration value="Active"/>
          <s:enumeration value="Inactive"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="TargetCompound" abstract="true"/>
      <s:complexType name="TargetCompoundDuplicateRule">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCompound">
            <s:sequence>
              <s:element name="DuplicateRule" type="tns:duplicaterule"/>
              <s:element name="DuplicateRuleConditions" type="tns:ArrayOfduplicaterulecondition"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCompoundDynamic">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCompound">
            <s:sequence>
              <s:element name="Entity" type="s3:DynamicEntity"/>
              <s:element name="ChildEntities" type="tns:ArrayOfDynamicEntity"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCompoundInvoice">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCompound">
            <s:sequence>
              <s:element name="Invoice" type="tns:invoice"/>
              <s:element name="InvoiceDetails" type="tns:ArrayOfinvoicedetail"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCompoundQuote">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCompound">
            <s:sequence>
              <s:element name="Quote" type="tns:quote"/>
              <s:element name="QuoteDetails" type="tns:ArrayOfquotedetail"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCompoundSalesOrder">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCompound">
            <s:sequence>
              <s:element name="SalesOrder" type="tns:salesorder"/>
              <s:element name="SalesOrderDetails" type="tns:ArrayOfsalesorderdetail"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreate" abstract="true"/>
      <s:complexType name="TargetCreateAccount">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="Account" type="tns:account"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateActivityMimeAttachment">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="ActivityMimeAttachment" type="tns:activitymimeattachment"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateAnnotation">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="Annotation" type="tns:annotation"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateAnnualFiscalCalendar">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="AnnualFiscalCalendar" type="tns:annualfiscalcalendar"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateAppointment">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="Appointment" type="tns:appointment"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateAsyncOperation">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="AsyncOperation" type="tns:asyncoperation"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateAttributeMap">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="AttributeMap" type="tns:attributemap"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateBusinessTask">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="BusinessTask" type="tns:businesstask"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateBusinessUnit">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="BusinessUnit" type="tns:businessunit"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateBusinessUnitNewsArticle">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="BusinessUnitNewsArticle" type="tns:businessunitnewsarticle"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateCalendar">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="Calendar" type="tns:calendar"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateCampaign">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="Campaign" type="tns:campaign"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateCampaignActivity">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="CampaignActivity" type="tns:campaignactivity"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateCampaignResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="CampaignResponse" type="tns:campaignresponse"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateColumnMapping">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="ColumnMapping" type="tns:columnmapping"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateCompetitor">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="Competitor" type="tns:competitor"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateConstraintBasedGroup">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="ConstraintBasedGroup" type="tns:constraintbasedgroup"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateContact">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="Contact" type="tns:contact"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateContract">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="Contract" type="tns:contract"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateContractDetail">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="ContractDetail" type="tns:contractdetail"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateContractTemplate">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="ContractTemplate" type="tns:contracttemplate"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateCustomerAddress">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="CustomerAddress" type="tns:customeraddress"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateCustomerOpportunityRole">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="CustomerOpportunityRole" type="tns:customeropportunityrole"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateCustomerRelationship">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="CustomerRelationship" type="tns:customerrelationship"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateDiscount">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="Discount" type="tns:discount"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateDiscountType">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="DiscountType" type="tns:discounttype"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateDuplicateRule">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="DuplicateRule" type="tns:duplicaterule"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateDuplicateRuleCondition">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="DuplicateRuleCondition" type="tns:duplicaterulecondition"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateDynamic">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="Entity" type="s3:DynamicEntity"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateEmail">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="Email" type="tns:email"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateEquipment">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="Equipment" type="tns:equipment"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateFax">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="Fax" type="tns:fax"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateFixedMonthlyFiscalCalendar">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="FixedMonthlyFiscalCalendar" type="tns:fixedmonthlyfiscalcalendar"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateImport">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="Import" type="tns:import"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateImportData">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="ImportData" type="tns:importdata"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateImportFile">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="ImportFile" type="tns:importfile"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateImportJob">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="ImportJob" type="tns:importjob"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateImportMap">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="ImportMap" type="tns:importmap"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateIncident">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="Incident" type="tns:incident"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateIncidentResolution">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="IncidentResolution" type="tns:incidentresolution"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateInvoice">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="Invoice" type="tns:invoice"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateInvoiceDetail">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="InvoiceDetail" type="tns:invoicedetail"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateIsvConfig">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="IsvConfig" type="tns:isvconfig"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateKbArticle">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="KbArticle" type="tns:kbarticle"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateKbArticleComment">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="KbArticleComment" type="tns:kbarticlecomment"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateKbArticleTemplate">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="KbArticleTemplate" type="tns:kbarticletemplate"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateLead">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="Lead" type="tns:lead"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateLetter">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="Letter" type="tns:letter"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateList">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="List" type="tns:list"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateLookUpMapping">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="LookUpMapping" type="tns:lookupmapping"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateMailMergeTemplate">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="MailMergeTemplate" type="tns:mailmergetemplate"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateMonthlyFiscalCalendar">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="MonthlyFiscalCalendar" type="tns:monthlyfiscalcalendar"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateOpportunity">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="Opportunity" type="tns:opportunity"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateOpportunityClose">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="OpportunityClose" type="tns:opportunityclose"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateOpportunityProduct">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="OpportunityProduct" type="tns:opportunityproduct"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateOrderClose">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="OrderClose" type="tns:orderclose"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateOrganizationUI">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="OrganizationUI" type="tns:organizationui"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateOwnerMapping">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="OwnerMapping" type="tns:ownermapping"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreatePhoneCall">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="PhoneCall" type="tns:phonecall"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreatePickListMapping">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="PickListMapping" type="tns:picklistmapping"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreatePluginAssembly">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="PluginAssembly" type="tns:pluginassembly"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreatePluginType">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="PluginType" type="tns:plugintype"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreatePriceLevel">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="PriceLevel" type="tns:pricelevel"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateProduct">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="Product" type="tns:product"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateProductPriceLevel">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="ProductPriceLevel" type="tns:productpricelevel"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateQuarterlyFiscalCalendar">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="QuarterlyFiscalCalendar" type="tns:quarterlyfiscalcalendar"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateQueue">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="Queue" type="tns:queue"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateQuote">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="Quote" type="tns:quote"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateQuoteClose">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="QuoteClose" type="tns:quoteclose"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateQuoteDetail">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="QuoteDetail" type="tns:quotedetail"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateRelationshipRole">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="RelationshipRole" type="tns:relationshiprole"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateRelationshipRoleMap">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="RelationshipRoleMap" type="tns:relationshiprolemap"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateReport">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="Report" type="tns:report"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateReportCategory">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="ReportCategory" type="tns:reportcategory"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateReportEntity">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="ReportEntity" type="tns:reportentity"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateReportVisibility">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="ReportVisibility" type="tns:reportvisibility"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateResourceSpec">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="ResourceSpec" type="tns:resourcespec"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateRole">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="Role" type="tns:role"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateSalesLiterature">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="SalesLiterature" type="tns:salesliterature"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateSalesLiteratureItem">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="SalesLiteratureItem" type="tns:salesliteratureitem"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateSalesOrder">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="SalesOrder" type="tns:salesorder"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateSalesOrderDetail">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="SalesOrderDetail" type="tns:salesorderdetail"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateSavedQuery">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="SavedQuery" type="tns:savedquery"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateSdkMessageProcessingStep">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="SdkMessageProcessingStep" type="tns:sdkmessageprocessingstep"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateSdkMessageProcessingStepImage">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="SdkMessageProcessingStepImage" type="tns:sdkmessageprocessingstepimage"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateSdkMessageProcessingStepSecureConfig">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="SdkMessageProcessingStepSecureConfig" type="tns:sdkmessageprocessingstepsecureconfig"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateSemiAnnualFiscalCalendar">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="SemiAnnualFiscalCalendar" type="tns:semiannualfiscalcalendar"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateService">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="Service" type="tns:service"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateServiceAppointment">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="ServiceAppointment" type="tns:serviceappointment"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateSite">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="Site" type="tns:site"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateSubject">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="Subject" type="tns:subject"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateSystemUser">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="SystemUser" type="tns:systemuser"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateTask">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="Task" type="tns:task"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateTeam">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="Team" type="tns:team"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateTemplate">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="Template" type="tns:template"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateTerritory">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="Territory" type="tns:territory"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateTransactionCurrency">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="TransactionCurrency" type="tns:transactioncurrency"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateTransformationMapping">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="TransformationMapping" type="tns:transformationmapping"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateTransformationParameterMapping">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="TransformationParameterMapping" type="tns:transformationparametermapping"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateUoM">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="UoM" type="tns:uom"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateUoMSchedule">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="UoMSchedule" type="tns:uomschedule"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateUserQuery">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="UserQuery" type="tns:userquery"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateWebWizard">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="WebWizard" type="tns:webwizard"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateWizardAccessPrivilege">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="WizardAccessPrivilege" type="tns:wizardaccessprivilege"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateWizardPage">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="WizardPage" type="tns:wizardpage"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateWorkflow">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="Workflow" type="tns:workflow"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateWorkflowDependency">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="WorkflowDependency" type="tns:workflowdependency"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetCreateWorkflowLog">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetCreate">
            <s:sequence>
              <s:element name="WorkflowLog" type="tns:workflowlog"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDelete" abstract="true"/>
      <s:complexType name="TargetDeleteAccount">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteActivityMimeAttachment">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteAnnotation">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteAnnualFiscalCalendar">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteAppointment">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteAsyncOperation">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteAttributeMap">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteBulkDeleteOperation">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteBulkOperation">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteBusinessTask">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteBusinessUnitNewsArticle">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteCalendar">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteCampaign">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteCampaignActivity">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteCampaignResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteColumnMapping">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteCompetitor">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteConstraintBasedGroup">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteContact">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteContract">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteContractDetail">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteContractTemplate">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteCustomerAddress">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteCustomerOpportunityRole">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteCustomerRelationship">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteDiscount">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteDiscountType">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteDuplicateRule">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteDuplicateRuleCondition">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteDynamic">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityName" type="s:string"/>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteEmail">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteEquipment">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteFax">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteFixedMonthlyFiscalCalendar">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteImport">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteImportData">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteImportFile">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteImportJob">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteImportMap">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteIncident">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteIncidentResolution">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteInvoice">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteInvoiceDetail">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteIsvConfig">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteKbArticle">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteKbArticleComment">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteKbArticleTemplate">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteLead">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteLetter">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteList">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteLookUpMapping">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteMailMergeTemplate">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteMonthlyFiscalCalendar">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteOpportunity">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteOpportunityClose">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteOpportunityProduct">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteOrderClose">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteOwnerMapping">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeletePhoneCall">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeletePickListMapping">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeletePluginAssembly">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeletePluginType">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeletePriceLevel">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteProduct">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteProductPriceLevel">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteQuarterlyFiscalCalendar">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteQueue">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteQuote">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteQuoteClose">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteQuoteDetail">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteRelationshipRole">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteRelationshipRoleMap">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteReport">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteReportCategory">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteReportEntity">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteReportVisibility">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteResourceSpec">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteRole">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteSalesLiterature">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteSalesLiteratureItem">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteSalesOrder">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteSalesOrderDetail">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteSavedQuery">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteSdkMessageProcessingStep">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteSdkMessageProcessingStepImage">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteSdkMessageProcessingStepSecureConfig">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteSemiAnnualFiscalCalendar">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteService">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteServiceAppointment">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteSite">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteSubject">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteTask">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteTeam">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteTemplate">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteTerritory">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteTransactionCurrency">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteTransformationMapping">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteTransformationParameterMapping">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteUoM">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteUoMSchedule">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteUserQuery">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteWebWizard">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteWFProcessInstance">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteWizardAccessPrivilege">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteWizardPage">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteWorkflow">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteWorkflowDependency">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetDeleteWorkflowLog">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetDelete">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetMerge" abstract="true"/>
      <s:complexType name="TargetMergeAccount">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetMerge">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetMergeContact">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetMerge">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetMergeDynamic">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetMerge">
            <s:sequence>
              <s:element name="EntityName" type="s:string"/>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetMergeLead">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetMerge">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetOwned" abstract="true"/>
      <s:complexType name="TargetOwnedAccount">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetOwned">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetOwnedAnnotation">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetOwned">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetOwnedAppointment">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetOwned">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetOwnedAsyncOperation">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetOwned">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetOwnedBulkDeleteOperation">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetOwned">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetOwnedBulkOperation">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetOwned">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetOwnedCampaign">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetOwned">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetOwnedCampaignActivity">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetOwned">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetOwnedCampaignResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetOwned">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetOwnedContact">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetOwned">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetOwnedContract">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetOwned">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetOwnedCustomerOpportunityRole">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetOwned">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetOwnedCustomerRelationship">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetOwned">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetOwnedDuplicateRule">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetOwned">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetOwnedDynamic">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetOwned">
            <s:sequence>
              <s:element name="EntityName" type="s:string"/>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetOwnedEmail">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetOwned">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetOwnedFax">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetOwned">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetOwnedImport">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetOwned">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetOwnedImportFile">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetOwned">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetOwnedImportMap">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetOwned">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetOwnedIncident">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetOwned">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetOwnedIncidentResolution">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetOwned">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetOwnedInvoice">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetOwned">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetOwnedLead">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetOwned">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetOwnedLetter">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetOwned">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetOwnedList">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetOwned">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetOwnedMailMergeTemplate">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetOwned">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetOwnedOpportunity">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetOwned">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetOwnedOpportunityClose">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetOwned">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetOwnedOrderClose">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetOwned">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetOwnedPhoneCall">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetOwned">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetOwnedQuote">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetOwned">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetOwnedQuoteClose">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetOwned">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetOwnedReport">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetOwned">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetOwnedSalesOrder">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetOwned">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetOwnedServiceAppointment">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetOwned">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetOwnedTask">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetOwned">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetOwnedTemplate">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetOwned">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetOwnedUserQuery">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetOwned">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetOwnedWorkflow">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetOwned">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetQuantify" abstract="true"/>
      <s:complexType name="TargetQuantifyDynamic">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetQuantify">
            <s:sequence>
              <s:element name="EntityName" type="s:string"/>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetQuantifyInvoice">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetQuantify">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetQuantifyOpportunity">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetQuantify">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetQuantifyQuote">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetQuantify">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetQuantifySalesOrder">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetQuantify">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetQueued" abstract="true"/>
      <s:complexType name="TargetQueuedAppointment">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetQueued">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetQueuedCampaignActivity">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetQueued">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetQueuedCampaignResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetQueued">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetQueuedDynamic">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetQueued">
            <s:sequence>
              <s:element name="EntityName" type="s:string"/>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetQueuedEmail">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetQueued">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetQueuedFax">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetQueued">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetQueuedIncident">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetQueued">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetQueuedLetter">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetQueued">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetQueuedPhoneCall">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetQueued">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetQueuedServiceAppointment">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetQueued">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetQueuedTask">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetQueued">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRelated" abstract="true"/>
      <s:complexType name="TargetRelatedDynamic">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRelated">
            <s:sequence>
              <s:element name="Entity1Name" type="s:string"/>
              <s:element name="Entity1Id" type="s0:guid"/>
              <s:element name="Entity2Name" type="s:string"/>
              <s:element name="Entity2Id" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRelatedInvoiceToContact">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRelated">
            <s:sequence>
              <s:element name="InvoiceId" type="s0:guid"/>
              <s:element name="ContactId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRelatedLeadToAccount">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRelated">
            <s:sequence>
              <s:element name="LeadId" type="s0:guid"/>
              <s:element name="AccountId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRelatedLeadToContact">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRelated">
            <s:sequence>
              <s:element name="LeadId" type="s0:guid"/>
              <s:element name="ContactId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRelatedOpportunityToAccount">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRelated">
            <s:sequence>
              <s:element name="OpportunityId" type="s0:guid"/>
              <s:element name="AccountId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRelatedOpportunityToCompetitor">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRelated">
            <s:sequence>
              <s:element name="OpportunityId" type="s0:guid"/>
              <s:element name="CompetitorId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRelatedOpportunityToContact">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRelated">
            <s:sequence>
              <s:element name="OpportunityId" type="s0:guid"/>
              <s:element name="ContactId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRelatedProductToCompetitor">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRelated">
            <s:sequence>
              <s:element name="ProductId" type="s0:guid"/>
              <s:element name="CompetitorId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRelatedProductToLead">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRelated">
            <s:sequence>
              <s:element name="ProductId" type="s0:guid"/>
              <s:element name="LeadId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRelatedQuoteToContact">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRelated">
            <s:sequence>
              <s:element name="QuoteId" type="s0:guid"/>
              <s:element name="ContactId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRelatedSalesLiteratureToCompetitor">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRelated">
            <s:sequence>
              <s:element name="SalesLiteratureId" type="s0:guid"/>
              <s:element name="CompetitorId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRelatedSalesLiteratureToProduct">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRelated">
            <s:sequence>
              <s:element name="SalesLiteratureId" type="s0:guid"/>
              <s:element name="ProductId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRelatedSalesOrderToContact">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRelated">
            <s:sequence>
              <s:element name="SalesOrderId" type="s0:guid"/>
              <s:element name="ContactId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRemoveParent" abstract="true"/>
      <s:complexType name="TargetRemoveParentDynamic">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRemoveParent">
            <s:sequence>
              <s:element name="EntityName" type="s:string"/>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRemoveParentSystemUser">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRemoveParent">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieve" abstract="true"/>
      <s:complexType name="TargetRetrieveAccount">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveActivityMimeAttachment">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveActivityPointer">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveAnnotation">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveAnnualFiscalCalendar">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveAppointment">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveAsyncOperation">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveAttributeMap">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveBulkDeleteFailure">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveBulkDeleteOperation">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveBulkOperation">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveBulkOperationLog">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveBusinessTask">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveBusinessUnit">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveBusinessUnitNewsArticle">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveCalendar">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveCampaign">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveCampaignActivity">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveCampaignResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveColumnMapping">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveCompetitor">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveConstraintBasedGroup">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveContact">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveContract">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveContractDetail">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveContractTemplate">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveCustomerAddress">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveCustomerOpportunityRole">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveCustomerRelationship">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveDiscount">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveDiscountType">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveDisplayString">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveDuplicateRecord">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveDuplicateRule">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveDuplicateRuleCondition">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveDynamic">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityName" type="s:string"/>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveEmail">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveEntityMap">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveEquipment">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveFax">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveFixedMonthlyFiscalCalendar">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveImport">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveImportData">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveImportFile">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveImportJob">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveImportLog">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveImportMap">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveIncident">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveIncidentResolution">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveInvoice">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveInvoiceDetail">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveIsvConfig">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveKbArticle">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveKbArticleComment">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveKbArticleTemplate">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveLead">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveLetter">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveList">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveLookUpMapping">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveMailMergeTemplate">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveMonthlyFiscalCalendar">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveOpportunity">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveOpportunityClose">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveOpportunityProduct">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveOrderClose">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveOrganization">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveOrganizationUI">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveOwnerMapping">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrievePhoneCall">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrievePickListMapping">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrievePluginAssembly">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrievePluginType">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrievePriceLevel">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrievePrivilege">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveProduct">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveProductPriceLevel">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveQuarterlyFiscalCalendar">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveQueue">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveQueueItem">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveQuote">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveQuoteClose">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveQuoteDetail">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveRelationshipRole">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveRelationshipRoleMap">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveReport">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveReportCategory">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveReportEntity">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveReportLink">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveReportVisibility">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveResource">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveResourceGroup">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveResourceSpec">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveRole">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveSalesLiterature">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveSalesLiteratureItem">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveSalesOrder">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveSalesOrderDetail">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveSavedQuery">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveSdkMessage">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveSdkMessageFilter">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveSdkMessageProcessingStep">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveSdkMessageProcessingStepImage">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveSdkMessageProcessingStepSecureConfig">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveSemiAnnualFiscalCalendar">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveService">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveServiceAppointment">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveSite">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveSubject">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveSystemUser">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveTask">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveTeam">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveTemplate">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveTerritory">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveTimeZoneDefinition">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveTimeZoneLocalizedName">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveTimeZoneRule">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveTransactionCurrency">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveTransformationMapping">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveTransformationParameterMapping">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveUoM">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveUoMSchedule">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveUserQuery">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveWebWizard">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveWFProcess">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveWFProcessInstance">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveWizardAccessPrivilege">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveWizardPage">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveWorkflow">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveWorkflowDependency">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRetrieveWorkflowLog">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRetrieve">
            <s:sequence>
              <s:element name="EntityId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRollup" abstract="true"/>
      <s:complexType name="TargetRollupActivityPointerByAccount">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRollup">
            <s:sequence>
              <s:element name="AccountId" type="s0:guid"/>
              <s:element name="Query" type="s2:QueryBase"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRollupActivityPointerByContact">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRollup">
            <s:sequence>
              <s:element name="ContactId" type="s0:guid"/>
              <s:element name="Query" type="s2:QueryBase"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRollupActivityPointerByOpportunity">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRollup">
            <s:sequence>
              <s:element name="OpportunityId" type="s0:guid"/>
              <s:element name="Query" type="s2:QueryBase"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRollupAnnotationByAccount">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRollup">
            <s:sequence>
              <s:element name="AccountId" type="s0:guid"/>
              <s:element name="Query" type="s2:QueryBase"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRollupAnnotationByContact">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRollup">
            <s:sequence>
              <s:element name="ContactId" type="s0:guid"/>
              <s:element name="Query" type="s2:QueryBase"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRollupAnnotationByOpportunity">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRollup">
            <s:sequence>
              <s:element name="OpportunityId" type="s0:guid"/>
              <s:element name="Query" type="s2:QueryBase"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRollupContractByAccount">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRollup">
            <s:sequence>
              <s:element name="AccountId" type="s0:guid"/>
              <s:element name="Query" type="s2:QueryBase"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRollupContractByContact">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRollup">
            <s:sequence>
              <s:element name="ContactId" type="s0:guid"/>
              <s:element name="Query" type="s2:QueryBase"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRollupDynamic">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRollup">
            <s:sequence>
              <s:element name="EntityName" type="s:string"/>
              <s:element name="EntityId" type="s0:guid"/>
              <s:element name="Query" type="s2:QueryBase"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRollupIncidentByAccount">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRollup">
            <s:sequence>
              <s:element name="AccountId" type="s0:guid"/>
              <s:element name="Query" type="s2:QueryBase"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRollupIncidentByContact">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRollup">
            <s:sequence>
              <s:element name="ContactId" type="s0:guid"/>
              <s:element name="Query" type="s2:QueryBase"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRollupInvoiceByAccount">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRollup">
            <s:sequence>
              <s:element name="AccountId" type="s0:guid"/>
              <s:element name="Query" type="s2:QueryBase"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRollupInvoiceByContact">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRollup">
            <s:sequence>
              <s:element name="ContactId" type="s0:guid"/>
              <s:element name="Query" type="s2:QueryBase"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRollupOpportunityByAccount">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRollup">
            <s:sequence>
              <s:element name="AccountId" type="s0:guid"/>
              <s:element name="Query" type="s2:QueryBase"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRollupOpportunityByContact">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRollup">
            <s:sequence>
              <s:element name="ContactId" type="s0:guid"/>
              <s:element name="Query" type="s2:QueryBase"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRollupQuoteByAccount">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRollup">
            <s:sequence>
              <s:element name="AccountId" type="s0:guid"/>
              <s:element name="Query" type="s2:QueryBase"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRollupQuoteByContact">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRollup">
            <s:sequence>
              <s:element name="ContactId" type="s0:guid"/>
              <s:element name="Query" type="s2:QueryBase"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRollupSalesOrderByAccount">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRollup">
            <s:sequence>
              <s:element name="AccountId" type="s0:guid"/>
              <s:element name="Query" type="s2:QueryBase"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetRollupSalesOrderByContact">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetRollup">
            <s:sequence>
              <s:element name="ContactId" type="s0:guid"/>
              <s:element name="Query" type="s2:QueryBase"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetSchedule" abstract="true"/>
      <s:complexType name="TargetScheduleAppointment">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetSchedule">
            <s:sequence>
              <s:element name="Appointment" type="tns:appointment"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetScheduleDynamic">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetSchedule">
            <s:sequence>
              <s:element name="Entity" type="s3:DynamicEntity"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetScheduleServiceAppointment">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetSchedule">
            <s:sequence>
              <s:element name="ServiceAppointment" type="tns:serviceappointment"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetSendFromTemplate" abstract="true"/>
      <s:complexType name="TargetSendFromTemplateDynamic">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetSendFromTemplate">
            <s:sequence>
              <s:element name="Entity" type="s3:DynamicEntity"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetSendFromTemplateEmail">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetSendFromTemplate">
            <s:sequence>
              <s:element name="Email" type="tns:email"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdate" abstract="true"/>
      <s:complexType name="TargetUpdateAccount">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="Account" type="tns:account"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateActivityMimeAttachment">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="ActivityMimeAttachment" type="tns:activitymimeattachment"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateAnnotation">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="Annotation" type="tns:annotation"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateAnnualFiscalCalendar">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="AnnualFiscalCalendar" type="tns:annualfiscalcalendar"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateAppointment">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="Appointment" type="tns:appointment"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateAsyncOperation">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="AsyncOperation" type="tns:asyncoperation"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateBusinessTask">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="BusinessTask" type="tns:businesstask"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateBusinessUnit">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="BusinessUnit" type="tns:businessunit"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateBusinessUnitNewsArticle">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="BusinessUnitNewsArticle" type="tns:businessunitnewsarticle"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateCalendar">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="Calendar" type="tns:calendar"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateCampaign">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="Campaign" type="tns:campaign"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateCampaignActivity">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="CampaignActivity" type="tns:campaignactivity"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateCampaignResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="CampaignResponse" type="tns:campaignresponse"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateCompetitor">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="Competitor" type="tns:competitor"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateConstraintBasedGroup">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="ConstraintBasedGroup" type="tns:constraintbasedgroup"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateContact">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="Contact" type="tns:contact"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateContract">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="Contract" type="tns:contract"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateContractDetail">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="ContractDetail" type="tns:contractdetail"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateContractTemplate">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="ContractTemplate" type="tns:contracttemplate"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateCustomerAddress">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="CustomerAddress" type="tns:customeraddress"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateCustomerOpportunityRole">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="CustomerOpportunityRole" type="tns:customeropportunityrole"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateCustomerRelationship">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="CustomerRelationship" type="tns:customerrelationship"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateDiscount">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="Discount" type="tns:discount"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateDiscountType">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="DiscountType" type="tns:discounttype"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateDisplayString">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="DisplayString" type="tns:displaystring"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateDuplicateRule">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="DuplicateRule" type="tns:duplicaterule"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateDuplicateRuleCondition">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="DuplicateRuleCondition" type="tns:duplicaterulecondition"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateDynamic">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="Entity" type="s3:DynamicEntity"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateEmail">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="Email" type="tns:email"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateEquipment">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="Equipment" type="tns:equipment"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateFax">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="Fax" type="tns:fax"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateFixedMonthlyFiscalCalendar">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="FixedMonthlyFiscalCalendar" type="tns:fixedmonthlyfiscalcalendar"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateImport">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="Import" type="tns:import"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateImportData">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="ImportData" type="tns:importdata"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateImportFile">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="ImportFile" type="tns:importfile"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateImportJob">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="ImportJob" type="tns:importjob"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateImportMap">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="ImportMap" type="tns:importmap"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateIncident">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="Incident" type="tns:incident"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateIncidentResolution">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="IncidentResolution" type="tns:incidentresolution"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateInvoice">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="Invoice" type="tns:invoice"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateInvoiceDetail">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="InvoiceDetail" type="tns:invoicedetail"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateIsvConfig">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="IsvConfig" type="tns:isvconfig"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateKbArticle">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="KbArticle" type="tns:kbarticle"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateKbArticleComment">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="KbArticleComment" type="tns:kbarticlecomment"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateKbArticleTemplate">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="KbArticleTemplate" type="tns:kbarticletemplate"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateLead">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="Lead" type="tns:lead"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateLetter">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="Letter" type="tns:letter"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateList">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="List" type="tns:list"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateMailMergeTemplate">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="MailMergeTemplate" type="tns:mailmergetemplate"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateMonthlyFiscalCalendar">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="MonthlyFiscalCalendar" type="tns:monthlyfiscalcalendar"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateOpportunity">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="Opportunity" type="tns:opportunity"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateOpportunityClose">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="OpportunityClose" type="tns:opportunityclose"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateOpportunityProduct">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="OpportunityProduct" type="tns:opportunityproduct"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateOrderClose">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="OrderClose" type="tns:orderclose"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateOrganization">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="Organization" type="tns:organization"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateOrganizationUI">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="OrganizationUI" type="tns:organizationui"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdatePhoneCall">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="PhoneCall" type="tns:phonecall"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdatePluginAssembly">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="PluginAssembly" type="tns:pluginassembly"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdatePluginType">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="PluginType" type="tns:plugintype"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdatePriceLevel">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="PriceLevel" type="tns:pricelevel"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateProduct">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="Product" type="tns:product"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateProductPriceLevel">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="ProductPriceLevel" type="tns:productpricelevel"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateQuarterlyFiscalCalendar">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="QuarterlyFiscalCalendar" type="tns:quarterlyfiscalcalendar"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateQueue">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="Queue" type="tns:queue"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateQuote">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="Quote" type="tns:quote"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateQuoteClose">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="QuoteClose" type="tns:quoteclose"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateQuoteDetail">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="QuoteDetail" type="tns:quotedetail"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateRelationshipRole">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="RelationshipRole" type="tns:relationshiprole"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateRelationshipRoleMap">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="RelationshipRoleMap" type="tns:relationshiprolemap"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateReport">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="Report" type="tns:report"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateReportCategory">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="ReportCategory" type="tns:reportcategory"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateReportEntity">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="ReportEntity" type="tns:reportentity"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateReportVisibility">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="ReportVisibility" type="tns:reportvisibility"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateResourceSpec">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="ResourceSpec" type="tns:resourcespec"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateRole">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="Role" type="tns:role"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateSalesLiterature">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="SalesLiterature" type="tns:salesliterature"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateSalesLiteratureItem">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="SalesLiteratureItem" type="tns:salesliteratureitem"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateSalesOrder">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="SalesOrder" type="tns:salesorder"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateSalesOrderDetail">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="SalesOrderDetail" type="tns:salesorderdetail"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateSavedQuery">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="SavedQuery" type="tns:savedquery"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateSdkMessageProcessingStep">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="SdkMessageProcessingStep" type="tns:sdkmessageprocessingstep"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateSdkMessageProcessingStepImage">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="SdkMessageProcessingStepImage" type="tns:sdkmessageprocessingstepimage"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateSdkMessageProcessingStepSecureConfig">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="SdkMessageProcessingStepSecureConfig" type="tns:sdkmessageprocessingstepsecureconfig"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateSemiAnnualFiscalCalendar">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="SemiAnnualFiscalCalendar" type="tns:semiannualfiscalcalendar"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateService">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="Service" type="tns:service"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateServiceAppointment">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="ServiceAppointment" type="tns:serviceappointment"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateSite">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="Site" type="tns:site"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateSubject">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="Subject" type="tns:subject"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateSystemUser">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="SystemUser" type="tns:systemuser"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateTask">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="Task" type="tns:task"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateTeam">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="Team" type="tns:team"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateTemplate">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="Template" type="tns:template"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateTerritory">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="Territory" type="tns:territory"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateTransactionCurrency">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="TransactionCurrency" type="tns:transactioncurrency"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateUoM">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="UoM" type="tns:uom"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateUoMSchedule">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="UoMSchedule" type="tns:uomschedule"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateUserQuery">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="UserQuery" type="tns:userquery"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateWebWizard">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="WebWizard" type="tns:webwizard"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateWizardAccessPrivilege">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="WizardAccessPrivilege" type="tns:wizardaccessprivilege"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateWizardPage">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="WizardPage" type="tns:wizardpage"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateWorkflow">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="Workflow" type="tns:workflow"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateWorkflowDependency">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="WorkflowDependency" type="tns:workflowdependency"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TargetUpdateWorkflowLog">
        <s:complexContent mixed="false">
          <s:extension base="tns:TargetUpdate">
            <s:sequence>
              <s:element name="WorkflowLog" type="tns:workflowlog"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="task">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="activityid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="actualdurationminutes" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="actualend" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="actualstart" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="category" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="isbilled" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="isworkflowcreated" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="ownerid" type="s3:Owner"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="percentcomplete" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="prioritycode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="regardingobjectid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="scheduleddurationminutes" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="scheduledend" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="scheduledstart" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="serviceid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="statecode" type="tns:TaskStateInfo"/>
              <s:element minOccurs="0" maxOccurs="1" name="statuscode" type="s3:Status"/>
              <s:element minOccurs="0" maxOccurs="1" name="subcategory" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="subject" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="subscriptionid" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:simpleType name="TaskState">
        <s:restriction base="s:string">
          <s:enumeration value="Open"/>
          <s:enumeration value="Completed"/>
          <s:enumeration value="Canceled"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="TaskStateInfo">
        <s:simpleContent>
          <s:extension base="tns:TaskState">
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="team">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="businessunitid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="emailaddress" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="teamid" type="s3:Key"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="template">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="body" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="generationtypecode" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="ispersonal" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="languagecode" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="mimetype" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="ownerid" type="s3:Owner"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="presentationxml" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="subject" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="subjectpresentationxml" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="templateid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="templatetypecode" type="s3:EntityNameReference"/>
              <s:element minOccurs="0" maxOccurs="1" name="title" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="territory">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="managerid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="territoryid" type="s3:Key"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="timezonedefinition">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="bias" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="daylightname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="retiredorder" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="standardname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezonecode" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezonedefinitionid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="userinterfacename" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="timezonelocalizedname">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="cultureid" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="daylightname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="standardname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezonedefinitionid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezonelocalizednameid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="userinterfacename" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="timezonerule">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="bias" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="daylightbias" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="daylightday" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="daylightdayofweek" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="daylighthour" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="daylightminute" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="daylightmonth" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="daylightsecond" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="daylightyear" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="effectivedatetime" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="standardbias" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="standardday" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="standarddayofweek" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="standardhour" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="standardminute" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="standardmonth" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="standardsecond" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="standardyear" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezonedefinitionid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="transactioncurrency">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="currencyname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="currencysymbol" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="exchangerate" type="s3:CrmDecimal"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="isocurrencycode" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="statecode" type="tns:TransactionCurrencyStateInfo"/>
              <s:element minOccurs="0" maxOccurs="1" name="statuscode" type="s3:Status"/>
              <s:element minOccurs="0" maxOccurs="1" name="transactioncurrencyid" type="s3:Key"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:simpleType name="TransactionCurrencyState">
        <s:restriction base="s:string">
          <s:enumeration value="Active"/>
          <s:enumeration value="Inactive"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="TransactionCurrencyStateInfo">
        <s:simpleContent>
          <s:extension base="tns:TransactionCurrencyState">
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="transformationmapping">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="importmapid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="processcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="sourceentityname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="statecode" type="tns:TransformationMappingStateInfo"/>
              <s:element minOccurs="0" maxOccurs="1" name="statuscode" type="s3:Status"/>
              <s:element minOccurs="0" maxOccurs="1" name="targetentityname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="transformationmappingid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="transformationtypename" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:simpleType name="TransformationMappingState">
        <s:restriction base="s:string">
          <s:enumeration value="Active"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="TransformationMappingStateInfo">
        <s:simpleContent>
          <s:extension base="tns:TransformationMappingState">
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="transformationparametermapping">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="data" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="datatypecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="parameterarrayindex" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="parametersequence" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="parametertypecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="transformationmappingid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="transformationparametermappingid" type="s3:Key"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TransformImportRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="ImportId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TransformImportResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="AsyncOperationId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="UnlockInvoicePricingRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="InvoiceId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="UnlockInvoicePricingResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="UnlockSalesOrderPricingRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="SalesOrderId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="UnlockSalesOrderPricingResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="UnpublishDuplicateRuleRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="DuplicateRuleId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="UnpublishDuplicateRuleResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="UnregisterSolutionRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="PluginAssemblyId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="UnregisterSolutionResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="uom">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="baseuom" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="isschedulebaseuom" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="quantity" type="s3:CrmDecimal"/>
              <s:element minOccurs="0" maxOccurs="1" name="uomid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="uomscheduleid" type="s3:Lookup"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="uomschedule">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="baseuomname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="importsequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="overriddencreatedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="uomscheduleid" type="s3:Key"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="UpdateRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="Target" type="tns:TargetUpdate"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="UpdateResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="UpdateUserSettingsSystemUserRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="UserId" type="s0:guid"/>
              <s:element name="Settings" type="s3:BusinessEntity"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="UpdateUserSettingsSystemUserResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="userquery">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="columnsetxml" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="fetchxml" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="layoutxml" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="ownerid" type="s3:Owner"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="querytype" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="returnedtypecode" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="statecode" type="tns:UserQueryStateInfo"/>
              <s:element minOccurs="0" maxOccurs="1" name="statuscode" type="s3:Status"/>
              <s:element minOccurs="0" maxOccurs="1" name="userqueryid" type="s3:Key"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:simpleType name="UserQueryState">
        <s:restriction base="s:string">
          <s:enumeration value="Active"/>
          <s:enumeration value="Inactive"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="UserQueryStateInfo">
        <s:simpleContent>
          <s:extension base="tns:UserQueryState">
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="usersettings">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="addressbooksyncinterval" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="advancedfindstartupmode" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="allowemailcredentials" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="amdesignator" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="businessunitid" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="calendartype" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="currencydecimalprecision" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="currencyformatcode" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="currencysymbol" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="dateformatcode" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="dateformatstring" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="dateseparator" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="decimalsymbol" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="defaultcalendarview" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="emailpassword" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="emailusername" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="fullnameconventioncode" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="helplanguageid" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="homepagearea" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="homepagesubarea" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="ignoreunsolicitedemail" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="incomingemailfilteringmethod" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="isduplicatedetectionenabledwhengoingonline" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="localeid" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="longdateformatcode" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="negativecurrencyformatcode" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="negativeformatcode" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="nexttrackingnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="numbergroupformat" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="numberseparator" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="offlinesyncinterval" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="outlooksyncinterval" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="paginglimit" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="pmdesignator" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="pricingdecimalprecision" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="reportscripterrors" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="showweeknumber" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="synccontactcompany" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="systemuserid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="timeformatcode" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="timeformatstring" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="timeseparator" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezonebias" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezonecode" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezonedaylightbias" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezonedaylightday" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezonedaylightdayofweek" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezonedaylighthour" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezonedaylightminute" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezonedaylightmonth" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezonedaylightsecond" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezonedaylightyear" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezonestandardbias" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezonestandardday" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezonestandarddayofweek" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezonestandardhour" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezonestandardminute" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezonestandardmonth" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezonestandardsecond" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezonestandardyear" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="trackingtokenid" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="transactioncurrencyid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="uilanguageid" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="usecrmformforappointment" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="usecrmformforcontact" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="usecrmformforemail" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="usecrmformfortask" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="useimagestrips" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="userprofile" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="workdaystarttime" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="workdaystoptime" type="s:string"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="UtcTimeFromLocalTimeRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="TimeZoneCode" type="s:int"/>
              <s:element name="LocalTime" type="s3:CrmDateTime"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="UtcTimeFromLocalTimeResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="UtcTime" type="s3:CrmDateTime"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ValidateRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="Activities" type="s3:BusinessEntityCollection"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ValidateResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="Result" type="tns:ArrayOfValidationResult"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ValidateSavedQueryRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="FetchXml" type="s:string"/>
              <s:element name="QueryType" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ValidateSavedQueryResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="webwizard">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="accessprivileges" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="isstaticpagesequence" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="startpagesequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="titleresourcestring" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="webwizardid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="wizardpageheight" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="wizardpagewidth" type="s3:CrmNumber"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="wfprocess">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="businessunitid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="entitytype" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="eventtypecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="priority" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="processcode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="processid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="processtypecode" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="processtypeversion" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="statecode" type="tns:WFProcessStateInfo"/>
              <s:element minOccurs="0" maxOccurs="1" name="usercontext" type="s3:Lookup"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="wfprocessinstance">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="businessunitid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="lastactivityon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="objectid" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="objecttype" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="parentid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="processid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="processinstanceid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="startedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="startedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="statecode" type="tns:WFProcessInstanceStateInfo"/>
              <s:element minOccurs="0" maxOccurs="1" name="stepcounter" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="timezoneruleversionnumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="usercontext" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="utcconversiontimezonecode" type="s3:CrmNumber"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:simpleType name="WFProcessInstanceState">
        <s:restriction base="s:string">
          <s:enumeration value="Initial"/>
          <s:enumeration value="Active"/>
          <s:enumeration value="Waiting"/>
          <s:enumeration value="Paused"/>
          <s:enumeration value="Completed"/>
          <s:enumeration value="Aborted"/>
          <s:enumeration value="Failure"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="WFProcessInstanceStateInfo">
        <s:simpleContent>
          <s:extension base="tns:WFProcessInstanceState">
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:simpleType name="WFProcessState">
        <s:restriction base="s:string">
          <s:enumeration value="Active"/>
          <s:enumeration value="Inactive"/>
          <s:enumeration value="Disabled"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="WFProcessStateInfo">
        <s:simpleContent>
          <s:extension base="tns:WFProcessState">
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
      <s:complexType name="WhoAmIRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="WhoAmIResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response">
            <s:sequence>
              <s:element name="UserId" type="s0:guid"/>
              <s:element name="BusinessUnitId" type="s0:guid"/>
              <s:element name="OrganizationId" type="s0:guid"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="WinOpportunityRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="OpportunityClose" type="s3:BusinessEntity"/>
              <s:element name="Status" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="WinOpportunityResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="WinQuoteRequest">
        <s:complexContent mixed="false">
          <s:extension base="tns:Request">
            <s:sequence>
              <s:element name="QuoteClose" type="s3:BusinessEntity"/>
              <s:element name="Status" type="s:int"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="WinQuoteResponse">
        <s:complexContent mixed="false">
          <s:extension base="tns:Response"/>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="wizardaccessprivilege">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="entityname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="privilegename" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="webwizardid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="wizardaccessprivilegeid" type="s3:Key"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="wizardpage">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="organizationid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="pagedatatopost" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="pagesequencenumber" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="pageurl" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="webwizardid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="wizardpageid" type="s3:Key"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="workflow">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="activeworkflowid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="activities" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="iscrmuiworkflow" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="ondemand" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="ownerid" type="s3:Owner"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="parentworkflowid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="plugintypeid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="primaryentity" type="s3:EntityNameReference"/>
              <s:element minOccurs="0" maxOccurs="1" name="rules" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="scope" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="statecode" type="tns:WorkflowStateInfo"/>
              <s:element minOccurs="0" maxOccurs="1" name="statuscode" type="s3:Status"/>
              <s:element minOccurs="0" maxOccurs="1" name="subprocess" type="s3:CrmBoolean"/>
              <s:element minOccurs="0" maxOccurs="1" name="type" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="uidata" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="workflowid" type="s3:Key"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="workflowdependency">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="customentityname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="dependentattributename" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="dependententityname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="entityattributes" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="owninguser" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="parametername" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="parametertype" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="relatedattributename" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="relatedentityname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="sdkmessageid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="type" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="workflowdependencyid" type="s3:Key"/>
              <s:element minOccurs="0" maxOccurs="1" name="workflowid" type="s3:Lookup"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="workflowlog">
        <s:complexContent mixed="false">
          <s:extension base="s3:BusinessEntity">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="activityname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="asyncoperationid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="completedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="createdon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="errorcode" type="s3:CrmNumber"/>
              <s:element minOccurs="0" maxOccurs="1" name="message" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedby" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="modifiedon" type="s3:CrmDateTime"/>
              <s:element minOccurs="0" maxOccurs="1" name="owningbusinessunit" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="owninguser" type="s3:UniqueIdentifier"/>
              <s:element minOccurs="0" maxOccurs="1" name="regardingobjectid" type="s3:Lookup"/>
              <s:element minOccurs="0" maxOccurs="1" name="stagename" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="status" type="s3:Picklist"/>
              <s:element minOccurs="0" maxOccurs="1" name="stepname" type="s:string"/>
              <s:element minOccurs="0" maxOccurs="1" name="workflowlogid" type="s3:Key"/>
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:simpleType name="WorkflowState">
        <s:restriction base="s:string">
          <s:enumeration value="Draft"/>
          <s:enumeration value="Published"/>
        </s:restriction>
      </s:simpleType>
      <s:complexType name="WorkflowStateInfo">
        <s:simpleContent>
          <s:extension base="tns:WorkflowState">
            <s:attribute name="formattedvalue" type="s:string"/>
          </s:extension>
        </s:simpleContent>
      </s:complexType>
    </s:schema>
  </wsdl:types>
  <wsdl:message name="ExecuteSoapIn">
    <wsdl:part name="parameters" element="tns:Execute"/>
  </wsdl:message>
  <wsdl:message name="ExecuteSoapOut">
    <wsdl:part name="parameters" element="tns:ExecuteResponse"/>
  </wsdl:message>
  <wsdl:message name="ExecuteCrmAuthenticationToken">
    <wsdl:part name="CrmAuthenticationToken" element="tns:CrmAuthenticationToken"/>
  </wsdl:message>
  <wsdl:message name="ExecuteCallerOriginToken">
    <wsdl:part name="CallerOriginToken" element="tns:CallerOriginToken"/>
  </wsdl:message>
  <wsdl:message name="ExecuteCorrelationToken">
    <wsdl:part name="CorrelationToken" element="tns:CorrelationToken"/>
  </wsdl:message>
  <wsdl:message name="FetchSoapIn">
    <wsdl:part name="parameters" element="tns:Fetch"/>
  </wsdl:message>
  <wsdl:message name="FetchSoapOut">
    <wsdl:part name="parameters" element="tns:FetchResponse"/>
  </wsdl:message>
  <wsdl:message name="FetchCrmAuthenticationToken">
    <wsdl:part name="CrmAuthenticationToken" element="tns:CrmAuthenticationToken"/>
  </wsdl:message>
  <wsdl:message name="FetchCallerOriginToken">
    <wsdl:part name="CallerOriginToken" element="tns:CallerOriginToken"/>
  </wsdl:message>
  <wsdl:message name="FetchCorrelationToken">
    <wsdl:part name="CorrelationToken" element="tns:CorrelationToken"/>
  </wsdl:message>
  <wsdl:message name="CreateSoapIn">
    <wsdl:part name="parameters" element="tns:Create"/>
  </wsdl:message>
  <wsdl:message name="CreateSoapOut">
    <wsdl:part name="parameters" element="tns:CreateResponse"/>
  </wsdl:message>
  <wsdl:message name="CreateCrmAuthenticationToken">
    <wsdl:part name="CrmAuthenticationToken" element="tns:CrmAuthenticationToken"/>
  </wsdl:message>
  <wsdl:message name="CreateCallerOriginToken">
    <wsdl:part name="CallerOriginToken" element="tns:CallerOriginToken"/>
  </wsdl:message>
  <wsdl:message name="CreateCorrelationToken">
    <wsdl:part name="CorrelationToken" element="tns:CorrelationToken"/>
  </wsdl:message>
  <wsdl:message name="DeleteSoapIn">
    <wsdl:part name="parameters" element="tns:Delete"/>
  </wsdl:message>
  <wsdl:message name="DeleteSoapOut">
    <wsdl:part name="parameters" element="tns:DeleteResponse"/>
  </wsdl:message>
  <wsdl:message name="DeleteCrmAuthenticationToken">
    <wsdl:part name="CrmAuthenticationToken" element="tns:CrmAuthenticationToken"/>
  </wsdl:message>
  <wsdl:message name="DeleteCallerOriginToken">
    <wsdl:part name="CallerOriginToken" element="tns:CallerOriginToken"/>
  </wsdl:message>
  <wsdl:message name="DeleteCorrelationToken">
    <wsdl:part name="CorrelationToken" element="tns:CorrelationToken"/>
  </wsdl:message>
  <wsdl:message name="RetrieveSoapIn">
    <wsdl:part name="parameters" element="tns:Retrieve"/>
  </wsdl:message>
  <wsdl:message name="RetrieveSoapOut">
    <wsdl:part name="parameters" element="tns:RetrieveResponse"/>
  </wsdl:message>
  <wsdl:message name="RetrieveCrmAuthenticationToken">
    <wsdl:part name="CrmAuthenticationToken" element="tns:CrmAuthenticationToken"/>
  </wsdl:message>
  <wsdl:message name="RetrieveCallerOriginToken">
    <wsdl:part name="CallerOriginToken" element="tns:CallerOriginToken"/>
  </wsdl:message>
  <wsdl:message name="RetrieveCorrelationToken">
    <wsdl:part name="CorrelationToken" element="tns:CorrelationToken"/>
  </wsdl:message>
  <wsdl:message name="RetrieveMultipleSoapIn">
    <wsdl:part name="parameters" element="tns:RetrieveMultiple"/>
  </wsdl:message>
  <wsdl:message name="RetrieveMultipleSoapOut">
    <wsdl:part name="parameters" element="tns:RetrieveMultipleResponse"/>
  </wsdl:message>
  <wsdl:message name="RetrieveMultipleCrmAuthenticationToken">
    <wsdl:part name="CrmAuthenticationToken" element="tns:CrmAuthenticationToken"/>
  </wsdl:message>
  <wsdl:message name="RetrieveMultipleCallerOriginToken">
    <wsdl:part name="CallerOriginToken" element="tns:CallerOriginToken"/>
  </wsdl:message>
  <wsdl:message name="RetrieveMultipleCorrelationToken">
    <wsdl:part name="CorrelationToken" element="tns:CorrelationToken"/>
  </wsdl:message>
  <wsdl:message name="UpdateSoapIn">
    <wsdl:part name="parameters" element="tns:Update"/>
  </wsdl:message>
  <wsdl:message name="UpdateSoapOut">
    <wsdl:part name="parameters" element="tns:UpdateResponse"/>
  </wsdl:message>
  <wsdl:message name="UpdateCrmAuthenticationToken">
    <wsdl:part name="CrmAuthenticationToken" element="tns:CrmAuthenticationToken"/>
  </wsdl:message>
  <wsdl:message name="UpdateCallerOriginToken">
    <wsdl:part name="CallerOriginToken" element="tns:CallerOriginToken"/>
  </wsdl:message>
  <wsdl:message name="UpdateCorrelationToken">
    <wsdl:part name="CorrelationToken" element="tns:CorrelationToken"/>
  </wsdl:message>
  <wsdl:portType name="CrmServiceSoap">
    <wsdl:operation name="Execute">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Executes business logic and special operations using a message-based approach. The Execute method takes a message request class as a parameter and returns a message response class.</wsdl:documentation>
      <wsdl:input message="tns:ExecuteSoapIn"/>
      <wsdl:output message="tns:ExecuteSoapOut"/>
    </wsdl:operation>
    <wsdl:operation name="Fetch">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Executes a query specified in the FetchXML language. The results are returned as an XML string.</wsdl:documentation>
      <wsdl:input message="tns:FetchSoapIn"/>
      <wsdl:output message="tns:FetchSoapOut"/>
    </wsdl:operation>
    <wsdl:operation name="Create">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Creates an instance of an entity.</wsdl:documentation>
      <wsdl:input message="tns:CreateSoapIn"/>
      <wsdl:output message="tns:CreateSoapOut"/>
    </wsdl:operation>
    <wsdl:operation name="Delete">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Deletes the instance of the specified entity.</wsdl:documentation>
      <wsdl:input message="tns:DeleteSoapIn"/>
      <wsdl:output message="tns:DeleteSoapOut"/>
    </wsdl:operation>
    <wsdl:operation name="Retrieve">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Retrieves an instance of the specified entity.</wsdl:documentation>
      <wsdl:input message="tns:RetrieveSoapIn"/>
      <wsdl:output message="tns:RetrieveSoapOut"/>
    </wsdl:operation>
    <wsdl:operation name="RetrieveMultiple">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Retrieves a collection of entity instances of the specified type, which meet the specified conditions.</wsdl:documentation>
      <wsdl:input message="tns:RetrieveMultipleSoapIn"/>
      <wsdl:output message="tns:RetrieveMultipleSoapOut"/>
    </wsdl:operation>
    <wsdl:operation name="Update">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Updates the instance of the specified entity.</wsdl:documentation>
      <wsdl:input message="tns:UpdateSoapIn"/>
      <wsdl:output message="tns:UpdateSoapOut"/>
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="CrmServiceSoap" type="tns:CrmServiceSoap">
    <wsdl:documentation>
      <wsi:Claim conformsTo="http://ws-i.org/profiles/basic/1.1" xmlns:wsi="http://ws-i.org/schemas/conformanceClaim/"/>
    </wsdl:documentation>
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http"/>
    <wsdl:operation name="Execute">
      <soap:operation soapAction="http://schemas.microsoft.com/crm/2007/WebServices/Execute" style="document"/>
      <wsdl:input>
        <soap:body use="literal"/>
        <soap:header message="tns:ExecuteCrmAuthenticationToken" part="CrmAuthenticationToken" use="literal"/>
        <soap:header message="tns:ExecuteCallerOriginToken" part="CallerOriginToken" use="literal"/>
        <soap:header message="tns:ExecuteCorrelationToken" part="CorrelationToken" use="literal"/>
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal"/>
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Fetch">
      <soap:operation soapAction="http://schemas.microsoft.com/crm/2007/WebServices/Fetch" style="document"/>
      <wsdl:input>
        <soap:body use="literal"/>
        <soap:header message="tns:FetchCrmAuthenticationToken" part="CrmAuthenticationToken" use="literal"/>
        <soap:header message="tns:FetchCallerOriginToken" part="CallerOriginToken" use="literal"/>
        <soap:header message="tns:FetchCorrelationToken" part="CorrelationToken" use="literal"/>
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal"/>
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Create">
      <soap:operation soapAction="http://schemas.microsoft.com/crm/2007/WebServices/Create" style="document"/>
      <wsdl:input>
        <soap:body use="literal"/>
        <soap:header message="tns:CreateCrmAuthenticationToken" part="CrmAuthenticationToken" use="literal"/>
        <soap:header message="tns:CreateCallerOriginToken" part="CallerOriginToken" use="literal"/>
        <soap:header message="tns:CreateCorrelationToken" part="CorrelationToken" use="literal"/>
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal"/>
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Delete">
      <soap:operation soapAction="http://schemas.microsoft.com/crm/2007/WebServices/Delete" style="document"/>
      <wsdl:input>
        <soap:body use="literal"/>
        <soap:header message="tns:DeleteCrmAuthenticationToken" part="CrmAuthenticationToken" use="literal"/>
        <soap:header message="tns:DeleteCallerOriginToken" part="CallerOriginToken" use="literal"/>
        <soap:header message="tns:DeleteCorrelationToken" part="CorrelationToken" use="literal"/>
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal"/>
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Retrieve">
      <soap:operation soapAction="http://schemas.microsoft.com/crm/2007/WebServices/Retrieve" style="document"/>
      <wsdl:input>
        <soap:body use="literal"/>
        <soap:header message="tns:RetrieveCrmAuthenticationToken" part="CrmAuthenticationToken" use="literal"/>
        <soap:header message="tns:RetrieveCallerOriginToken" part="CallerOriginToken" use="literal"/>
        <soap:header message="tns:RetrieveCorrelationToken" part="CorrelationToken" use="literal"/>
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal"/>
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RetrieveMultiple">
      <soap:operation soapAction="http://schemas.microsoft.com/crm/2007/WebServices/RetrieveMultiple" style="document"/>
      <wsdl:input>
        <soap:body use="literal"/>
        <soap:header message="tns:RetrieveMultipleCrmAuthenticationToken" part="CrmAuthenticationToken" use="literal"/>
        <soap:header message="tns:RetrieveMultipleCallerOriginToken" part="CallerOriginToken" use="literal"/>
        <soap:header message="tns:RetrieveMultipleCorrelationToken" part="CorrelationToken" use="literal"/>
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal"/>
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Update">
      <soap:operation soapAction="http://schemas.microsoft.com/crm/2007/WebServices/Update" style="document"/>
      <wsdl:input>
        <soap:body use="literal"/>
        <soap:header message="tns:UpdateCrmAuthenticationToken" part="CrmAuthenticationToken" use="literal"/>
        <soap:header message="tns:UpdateCallerOriginToken" part="CallerOriginToken" use="literal"/>
        <soap:header message="tns:UpdateCorrelationToken" part="CorrelationToken" use="literal"/>
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal"/>
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="CrmServiceSoap12" type="tns:CrmServiceSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http"/>
    <wsdl:operation name="Execute">
      <soap12:operation soapAction="http://schemas.microsoft.com/crm/2007/WebServices/Execute" style="document"/>
      <wsdl:input>
        <soap12:body use="literal"/>
        <soap12:header message="tns:ExecuteCrmAuthenticationToken" part="CrmAuthenticationToken" use="literal"/>
        <soap12:header message="tns:ExecuteCallerOriginToken" part="CallerOriginToken" use="literal"/>
        <soap12:header message="tns:ExecuteCorrelationToken" part="CorrelationToken" use="literal"/>
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal"/>
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Fetch">
      <soap12:operation soapAction="http://schemas.microsoft.com/crm/2007/WebServices/Fetch" style="document"/>
      <wsdl:input>
        <soap12:body use="literal"/>
        <soap12:header message="tns:FetchCrmAuthenticationToken" part="CrmAuthenticationToken" use="literal"/>
        <soap12:header message="tns:FetchCallerOriginToken" part="CallerOriginToken" use="literal"/>
        <soap12:header message="tns:FetchCorrelationToken" part="CorrelationToken" use="literal"/>
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal"/>
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Create">
      <soap12:operation soapAction="http://schemas.microsoft.com/crm/2007/WebServices/Create" style="document"/>
      <wsdl:input>
        <soap12:body use="literal"/>
        <soap12:header message="tns:CreateCrmAuthenticationToken" part="CrmAuthenticationToken" use="literal"/>
        <soap12:header message="tns:CreateCallerOriginToken" part="CallerOriginToken" use="literal"/>
        <soap12:header message="tns:CreateCorrelationToken" part="CorrelationToken" use="literal"/>
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal"/>
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Delete">
      <soap12:operation soapAction="http://schemas.microsoft.com/crm/2007/WebServices/Delete" style="document"/>
      <wsdl:input>
        <soap12:body use="literal"/>
        <soap12:header message="tns:DeleteCrmAuthenticationToken" part="CrmAuthenticationToken" use="literal"/>
        <soap12:header message="tns:DeleteCallerOriginToken" part="CallerOriginToken" use="literal"/>
        <soap12:header message="tns:DeleteCorrelationToken" part="CorrelationToken" use="literal"/>
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal"/>
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Retrieve">
      <soap12:operation soapAction="http://schemas.microsoft.com/crm/2007/WebServices/Retrieve" style="document"/>
      <wsdl:input>
        <soap12:body use="literal"/>
        <soap12:header message="tns:RetrieveCrmAuthenticationToken" part="CrmAuthenticationToken" use="literal"/>
        <soap12:header message="tns:RetrieveCallerOriginToken" part="CallerOriginToken" use="literal"/>
        <soap12:header message="tns:RetrieveCorrelationToken" part="CorrelationToken" use="literal"/>
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal"/>
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RetrieveMultiple">
      <soap12:operation soapAction="http://schemas.microsoft.com/crm/2007/WebServices/RetrieveMultiple" style="document"/>
      <wsdl:input>
        <soap12:body use="literal"/>
        <soap12:header message="tns:RetrieveMultipleCrmAuthenticationToken" part="CrmAuthenticationToken" use="literal"/>
        <soap12:header message="tns:RetrieveMultipleCallerOriginToken" part="CallerOriginToken" use="literal"/>
        <soap12:header message="tns:RetrieveMultipleCorrelationToken" part="CorrelationToken" use="literal"/>
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal"/>
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Update">
      <soap12:operation soapAction="http://schemas.microsoft.com/crm/2007/WebServices/Update" style="document"/>
      <wsdl:input>
        <soap12:body use="literal"/>
        <soap12:header message="tns:UpdateCrmAuthenticationToken" part="CrmAuthenticationToken" use="literal"/>
        <soap12:header message="tns:UpdateCallerOriginToken" part="CallerOriginToken" use="literal"/>
        <soap12:header message="tns:UpdateCorrelationToken" part="CorrelationToken" use="literal"/>
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal"/>
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="CrmService">
    <wsdl:port name="CrmServiceSoap" binding="tns:CrmServiceSoap">
      <soap:address location="http://win2003/MSCrmServices/2007/CrmService.asmx"/>
    </wsdl:port>
    <wsdl:port name="CrmServiceSoap12" binding="tns:CrmServiceSoap12">
      <soap12:address location="http://win2003/MSCrmServices/2007/CrmService.asmx"/>
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>