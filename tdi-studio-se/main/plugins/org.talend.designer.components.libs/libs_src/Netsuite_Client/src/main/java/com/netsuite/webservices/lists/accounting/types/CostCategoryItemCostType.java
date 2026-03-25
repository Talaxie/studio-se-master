
package com.netsuite.webservices.lists.accounting.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CostCategoryItemCostType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CostCategoryItemCostType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_laborRun"/&gt;
 *     &lt;enumeration value="_laborRunOverhead"/&gt;
 *     &lt;enumeration value="_laborSetup"/&gt;
 *     &lt;enumeration value="_laborSetupOverhead"/&gt;
 *     &lt;enumeration value="_landed"/&gt;
 *     &lt;enumeration value="_machineRun"/&gt;
 *     &lt;enumeration value="_machineRunOverhead"/&gt;
 *     &lt;enumeration value="_machineSetup"/&gt;
 *     &lt;enumeration value="_machineSetupOverhead"/&gt;
 *     &lt;enumeration value="_material"/&gt;
 *     &lt;enumeration value="_materialOverhead"/&gt;
 *     &lt;enumeration value="_service"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CostCategoryItemCostType", namespace = "urn:types.accounting_2014_2.lists.webservices.netsuite.com")
@XmlEnum
public enum CostCategoryItemCostType {

    @XmlEnumValue("_laborRun")
    LABOR_RUN("_laborRun"),
    @XmlEnumValue("_laborRunOverhead")
    LABOR_RUN_OVERHEAD("_laborRunOverhead"),
    @XmlEnumValue("_laborSetup")
    LABOR_SETUP("_laborSetup"),
    @XmlEnumValue("_laborSetupOverhead")
    LABOR_SETUP_OVERHEAD("_laborSetupOverhead"),
    @XmlEnumValue("_landed")
    LANDED("_landed"),
    @XmlEnumValue("_machineRun")
    MACHINE_RUN("_machineRun"),
    @XmlEnumValue("_machineRunOverhead")
    MACHINE_RUN_OVERHEAD("_machineRunOverhead"),
    @XmlEnumValue("_machineSetup")
    MACHINE_SETUP("_machineSetup"),
    @XmlEnumValue("_machineSetupOverhead")
    MACHINE_SETUP_OVERHEAD("_machineSetupOverhead"),
    @XmlEnumValue("_material")
    MATERIAL("_material"),
    @XmlEnumValue("_materialOverhead")
    MATERIAL_OVERHEAD("_materialOverhead"),
    @XmlEnumValue("_service")
    SERVICE("_service");
    private final String value;

    CostCategoryItemCostType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CostCategoryItemCostType fromValue(String v) {
        for (CostCategoryItemCostType c: CostCategoryItemCostType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
