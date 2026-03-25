
package com.microsoft.schemas.crm._2011.contracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BulkOperationSource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BulkOperationSource">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="QuickCampaign"/>
 *     &lt;enumeration value="CampaignActivity"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BulkOperationSource")
@XmlEnum
public enum BulkOperationSource {

    @XmlEnumValue("QuickCampaign")
    QUICK_CAMPAIGN("QuickCampaign"),
    @XmlEnumValue("CampaignActivity")
    CAMPAIGN_ACTIVITY("CampaignActivity");
    private final String value;

    BulkOperationSource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BulkOperationSource fromValue(String v) {
        for (BulkOperationSource c: BulkOperationSource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
