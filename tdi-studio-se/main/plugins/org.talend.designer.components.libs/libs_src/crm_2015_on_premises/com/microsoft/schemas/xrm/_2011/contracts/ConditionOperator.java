
package com.microsoft.schemas.xrm._2011.contracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConditionOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConditionOperator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Equal"/>
 *     &lt;enumeration value="NotEqual"/>
 *     &lt;enumeration value="GreaterThan"/>
 *     &lt;enumeration value="LessThan"/>
 *     &lt;enumeration value="GreaterEqual"/>
 *     &lt;enumeration value="LessEqual"/>
 *     &lt;enumeration value="Like"/>
 *     &lt;enumeration value="NotLike"/>
 *     &lt;enumeration value="In"/>
 *     &lt;enumeration value="NotIn"/>
 *     &lt;enumeration value="Between"/>
 *     &lt;enumeration value="NotBetween"/>
 *     &lt;enumeration value="Null"/>
 *     &lt;enumeration value="NotNull"/>
 *     &lt;enumeration value="Yesterday"/>
 *     &lt;enumeration value="Today"/>
 *     &lt;enumeration value="Tomorrow"/>
 *     &lt;enumeration value="Last7Days"/>
 *     &lt;enumeration value="Next7Days"/>
 *     &lt;enumeration value="LastWeek"/>
 *     &lt;enumeration value="ThisWeek"/>
 *     &lt;enumeration value="NextWeek"/>
 *     &lt;enumeration value="LastMonth"/>
 *     &lt;enumeration value="ThisMonth"/>
 *     &lt;enumeration value="NextMonth"/>
 *     &lt;enumeration value="On"/>
 *     &lt;enumeration value="OnOrBefore"/>
 *     &lt;enumeration value="OnOrAfter"/>
 *     &lt;enumeration value="LastYear"/>
 *     &lt;enumeration value="ThisYear"/>
 *     &lt;enumeration value="NextYear"/>
 *     &lt;enumeration value="LastXHours"/>
 *     &lt;enumeration value="NextXHours"/>
 *     &lt;enumeration value="LastXDays"/>
 *     &lt;enumeration value="NextXDays"/>
 *     &lt;enumeration value="LastXWeeks"/>
 *     &lt;enumeration value="NextXWeeks"/>
 *     &lt;enumeration value="LastXMonths"/>
 *     &lt;enumeration value="NextXMonths"/>
 *     &lt;enumeration value="LastXYears"/>
 *     &lt;enumeration value="NextXYears"/>
 *     &lt;enumeration value="EqualUserId"/>
 *     &lt;enumeration value="NotEqualUserId"/>
 *     &lt;enumeration value="EqualBusinessId"/>
 *     &lt;enumeration value="NotEqualBusinessId"/>
 *     &lt;enumeration value="ChildOf"/>
 *     &lt;enumeration value="Mask"/>
 *     &lt;enumeration value="NotMask"/>
 *     &lt;enumeration value="MasksSelect"/>
 *     &lt;enumeration value="Contains"/>
 *     &lt;enumeration value="DoesNotContain"/>
 *     &lt;enumeration value="EqualUserLanguage"/>
 *     &lt;enumeration value="NotOn"/>
 *     &lt;enumeration value="OlderThanXMonths"/>
 *     &lt;enumeration value="BeginsWith"/>
 *     &lt;enumeration value="DoesNotBeginWith"/>
 *     &lt;enumeration value="EndsWith"/>
 *     &lt;enumeration value="DoesNotEndWith"/>
 *     &lt;enumeration value="ThisFiscalYear"/>
 *     &lt;enumeration value="ThisFiscalPeriod"/>
 *     &lt;enumeration value="NextFiscalYear"/>
 *     &lt;enumeration value="NextFiscalPeriod"/>
 *     &lt;enumeration value="LastFiscalYear"/>
 *     &lt;enumeration value="LastFiscalPeriod"/>
 *     &lt;enumeration value="LastXFiscalYears"/>
 *     &lt;enumeration value="LastXFiscalPeriods"/>
 *     &lt;enumeration value="NextXFiscalYears"/>
 *     &lt;enumeration value="NextXFiscalPeriods"/>
 *     &lt;enumeration value="InFiscalYear"/>
 *     &lt;enumeration value="InFiscalPeriod"/>
 *     &lt;enumeration value="InFiscalPeriodAndYear"/>
 *     &lt;enumeration value="InOrBeforeFiscalPeriodAndYear"/>
 *     &lt;enumeration value="InOrAfterFiscalPeriodAndYear"/>
 *     &lt;enumeration value="EqualUserTeams"/>
 *     &lt;enumeration value="EqualUserOrUserTeams"/>
 *     &lt;enumeration value="Under"/>
 *     &lt;enumeration value="NotUnder"/>
 *     &lt;enumeration value="UnderOrEqual"/>
 *     &lt;enumeration value="Above"/>
 *     &lt;enumeration value="AboveOrEqual"/>
 *     &lt;enumeration value="EqualUserOrUserHierarchy"/>
 *     &lt;enumeration value="EqualUserOrUserHierarchyAndTeams"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConditionOperator")
@XmlEnum
public enum ConditionOperator {

    @XmlEnumValue("Equal")
    EQUAL("Equal"),
    @XmlEnumValue("NotEqual")
    NOT_EQUAL("NotEqual"),
    @XmlEnumValue("GreaterThan")
    GREATER_THAN("GreaterThan"),
    @XmlEnumValue("LessThan")
    LESS_THAN("LessThan"),
    @XmlEnumValue("GreaterEqual")
    GREATER_EQUAL("GreaterEqual"),
    @XmlEnumValue("LessEqual")
    LESS_EQUAL("LessEqual"),
    @XmlEnumValue("Like")
    LIKE("Like"),
    @XmlEnumValue("NotLike")
    NOT_LIKE("NotLike"),
    @XmlEnumValue("In")
    IN("In"),
    @XmlEnumValue("NotIn")
    NOT_IN("NotIn"),
    @XmlEnumValue("Between")
    BETWEEN("Between"),
    @XmlEnumValue("NotBetween")
    NOT_BETWEEN("NotBetween"),
    @XmlEnumValue("Null")
    NULL("Null"),
    @XmlEnumValue("NotNull")
    NOT_NULL("NotNull"),
    @XmlEnumValue("Yesterday")
    YESTERDAY("Yesterday"),
    @XmlEnumValue("Today")
    TODAY("Today"),
    @XmlEnumValue("Tomorrow")
    TOMORROW("Tomorrow"),
    @XmlEnumValue("Last7Days")
    LAST_7_DAYS("Last7Days"),
    @XmlEnumValue("Next7Days")
    NEXT_7_DAYS("Next7Days"),
    @XmlEnumValue("LastWeek")
    LAST_WEEK("LastWeek"),
    @XmlEnumValue("ThisWeek")
    THIS_WEEK("ThisWeek"),
    @XmlEnumValue("NextWeek")
    NEXT_WEEK("NextWeek"),
    @XmlEnumValue("LastMonth")
    LAST_MONTH("LastMonth"),
    @XmlEnumValue("ThisMonth")
    THIS_MONTH("ThisMonth"),
    @XmlEnumValue("NextMonth")
    NEXT_MONTH("NextMonth"),
    @XmlEnumValue("On")
    ON("On"),
    @XmlEnumValue("OnOrBefore")
    ON_OR_BEFORE("OnOrBefore"),
    @XmlEnumValue("OnOrAfter")
    ON_OR_AFTER("OnOrAfter"),
    @XmlEnumValue("LastYear")
    LAST_YEAR("LastYear"),
    @XmlEnumValue("ThisYear")
    THIS_YEAR("ThisYear"),
    @XmlEnumValue("NextYear")
    NEXT_YEAR("NextYear"),
    @XmlEnumValue("LastXHours")
    LAST_X_HOURS("LastXHours"),
    @XmlEnumValue("NextXHours")
    NEXT_X_HOURS("NextXHours"),
    @XmlEnumValue("LastXDays")
    LAST_X_DAYS("LastXDays"),
    @XmlEnumValue("NextXDays")
    NEXT_X_DAYS("NextXDays"),
    @XmlEnumValue("LastXWeeks")
    LAST_X_WEEKS("LastXWeeks"),
    @XmlEnumValue("NextXWeeks")
    NEXT_X_WEEKS("NextXWeeks"),
    @XmlEnumValue("LastXMonths")
    LAST_X_MONTHS("LastXMonths"),
    @XmlEnumValue("NextXMonths")
    NEXT_X_MONTHS("NextXMonths"),
    @XmlEnumValue("LastXYears")
    LAST_X_YEARS("LastXYears"),
    @XmlEnumValue("NextXYears")
    NEXT_X_YEARS("NextXYears"),
    @XmlEnumValue("EqualUserId")
    EQUAL_USER_ID("EqualUserId"),
    @XmlEnumValue("NotEqualUserId")
    NOT_EQUAL_USER_ID("NotEqualUserId"),
    @XmlEnumValue("EqualBusinessId")
    EQUAL_BUSINESS_ID("EqualBusinessId"),
    @XmlEnumValue("NotEqualBusinessId")
    NOT_EQUAL_BUSINESS_ID("NotEqualBusinessId"),
    @XmlEnumValue("ChildOf")
    CHILD_OF("ChildOf"),
    @XmlEnumValue("Mask")
    MASK("Mask"),
    @XmlEnumValue("NotMask")
    NOT_MASK("NotMask"),
    @XmlEnumValue("MasksSelect")
    MASKS_SELECT("MasksSelect"),
    @XmlEnumValue("Contains")
    CONTAINS("Contains"),
    @XmlEnumValue("DoesNotContain")
    DOES_NOT_CONTAIN("DoesNotContain"),
    @XmlEnumValue("EqualUserLanguage")
    EQUAL_USER_LANGUAGE("EqualUserLanguage"),
    @XmlEnumValue("NotOn")
    NOT_ON("NotOn"),
    @XmlEnumValue("OlderThanXMonths")
    OLDER_THAN_X_MONTHS("OlderThanXMonths"),
    @XmlEnumValue("BeginsWith")
    BEGINS_WITH("BeginsWith"),
    @XmlEnumValue("DoesNotBeginWith")
    DOES_NOT_BEGIN_WITH("DoesNotBeginWith"),
    @XmlEnumValue("EndsWith")
    ENDS_WITH("EndsWith"),
    @XmlEnumValue("DoesNotEndWith")
    DOES_NOT_END_WITH("DoesNotEndWith"),
    @XmlEnumValue("ThisFiscalYear")
    THIS_FISCAL_YEAR("ThisFiscalYear"),
    @XmlEnumValue("ThisFiscalPeriod")
    THIS_FISCAL_PERIOD("ThisFiscalPeriod"),
    @XmlEnumValue("NextFiscalYear")
    NEXT_FISCAL_YEAR("NextFiscalYear"),
    @XmlEnumValue("NextFiscalPeriod")
    NEXT_FISCAL_PERIOD("NextFiscalPeriod"),
    @XmlEnumValue("LastFiscalYear")
    LAST_FISCAL_YEAR("LastFiscalYear"),
    @XmlEnumValue("LastFiscalPeriod")
    LAST_FISCAL_PERIOD("LastFiscalPeriod"),
    @XmlEnumValue("LastXFiscalYears")
    LAST_X_FISCAL_YEARS("LastXFiscalYears"),
    @XmlEnumValue("LastXFiscalPeriods")
    LAST_X_FISCAL_PERIODS("LastXFiscalPeriods"),
    @XmlEnumValue("NextXFiscalYears")
    NEXT_X_FISCAL_YEARS("NextXFiscalYears"),
    @XmlEnumValue("NextXFiscalPeriods")
    NEXT_X_FISCAL_PERIODS("NextXFiscalPeriods"),
    @XmlEnumValue("InFiscalYear")
    IN_FISCAL_YEAR("InFiscalYear"),
    @XmlEnumValue("InFiscalPeriod")
    IN_FISCAL_PERIOD("InFiscalPeriod"),
    @XmlEnumValue("InFiscalPeriodAndYear")
    IN_FISCAL_PERIOD_AND_YEAR("InFiscalPeriodAndYear"),
    @XmlEnumValue("InOrBeforeFiscalPeriodAndYear")
    IN_OR_BEFORE_FISCAL_PERIOD_AND_YEAR("InOrBeforeFiscalPeriodAndYear"),
    @XmlEnumValue("InOrAfterFiscalPeriodAndYear")
    IN_OR_AFTER_FISCAL_PERIOD_AND_YEAR("InOrAfterFiscalPeriodAndYear"),
    @XmlEnumValue("EqualUserTeams")
    EQUAL_USER_TEAMS("EqualUserTeams"),
    @XmlEnumValue("EqualUserOrUserTeams")
    EQUAL_USER_OR_USER_TEAMS("EqualUserOrUserTeams"),
    @XmlEnumValue("Under")
    UNDER("Under"),
    @XmlEnumValue("NotUnder")
    NOT_UNDER("NotUnder"),
    @XmlEnumValue("UnderOrEqual")
    UNDER_OR_EQUAL("UnderOrEqual"),
    @XmlEnumValue("Above")
    ABOVE("Above"),
    @XmlEnumValue("AboveOrEqual")
    ABOVE_OR_EQUAL("AboveOrEqual"),
    @XmlEnumValue("EqualUserOrUserHierarchy")
    EQUAL_USER_OR_USER_HIERARCHY("EqualUserOrUserHierarchy"),
    @XmlEnumValue("EqualUserOrUserHierarchyAndTeams")
    EQUAL_USER_OR_USER_HIERARCHY_AND_TEAMS("EqualUserOrUserHierarchyAndTeams");
    private final String value;

    ConditionOperator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConditionOperator fromValue(String v) {
        for (ConditionOperator c: ConditionOperator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
