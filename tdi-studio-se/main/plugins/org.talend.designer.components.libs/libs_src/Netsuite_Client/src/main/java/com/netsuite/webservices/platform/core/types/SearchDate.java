
package com.netsuite.webservices.platform.core.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchDate.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchDate"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="fiscalHalfBeforeLast"/&gt;
 *     &lt;enumeration value="fiscalHalfBeforeLastToDate"/&gt;
 *     &lt;enumeration value="fiscalQuarterBeforeLast"/&gt;
 *     &lt;enumeration value="fiscalQuarterBeforeLastToDate"/&gt;
 *     &lt;enumeration value="fiscalYearBeforeLast"/&gt;
 *     &lt;enumeration value="fiscalYearBeforeLastToDate"/&gt;
 *     &lt;enumeration value="lastBusinessWeek"/&gt;
 *     &lt;enumeration value="lastFiscalHalf"/&gt;
 *     &lt;enumeration value="lastFiscalHalfOneYearAgo"/&gt;
 *     &lt;enumeration value="lastFiscalHalfToDate"/&gt;
 *     &lt;enumeration value="lastFiscalQuarter"/&gt;
 *     &lt;enumeration value="lastFiscalQuarterOneYearAgo"/&gt;
 *     &lt;enumeration value="lastFiscalQuarterToDate"/&gt;
 *     &lt;enumeration value="lastFiscalYear"/&gt;
 *     &lt;enumeration value="lastFiscalYearToDate"/&gt;
 *     &lt;enumeration value="lastMonth"/&gt;
 *     &lt;enumeration value="lastMonthOneQuarterAgo"/&gt;
 *     &lt;enumeration value="lastMonthOneYearAgo"/&gt;
 *     &lt;enumeration value="lastMonthToDate"/&gt;
 *     &lt;enumeration value="lastMonthTwoQuartersAgo"/&gt;
 *     &lt;enumeration value="lastMonthTwoYearsAgo"/&gt;
 *     &lt;enumeration value="lastQuarterTwoYearsAgo"/&gt;
 *     &lt;enumeration value="lastRollingHalf"/&gt;
 *     &lt;enumeration value="lastRollingQuarter"/&gt;
 *     &lt;enumeration value="lastRollingYear"/&gt;
 *     &lt;enumeration value="lastWeek"/&gt;
 *     &lt;enumeration value="lastWeekToDate"/&gt;
 *     &lt;enumeration value="monthBeforeLast"/&gt;
 *     &lt;enumeration value="monthBeforeLastToDate"/&gt;
 *     &lt;enumeration value="nextBusinessWeek"/&gt;
 *     &lt;enumeration value="nextFiscalHalf"/&gt;
 *     &lt;enumeration value="nextFiscalQuarter"/&gt;
 *     &lt;enumeration value="nextFiscalYear"/&gt;
 *     &lt;enumeration value="nextFourWeeks"/&gt;
 *     &lt;enumeration value="nextMonth"/&gt;
 *     &lt;enumeration value="nextOneHalf"/&gt;
 *     &lt;enumeration value="nextOneMonth"/&gt;
 *     &lt;enumeration value="nextOneQuarter"/&gt;
 *     &lt;enumeration value="nextOneWeek"/&gt;
 *     &lt;enumeration value="nextOneYear"/&gt;
 *     &lt;enumeration value="nextWeek"/&gt;
 *     &lt;enumeration value="oneYearBeforeLast"/&gt;
 *     &lt;enumeration value="previousMonthsLastFiscalHalf"/&gt;
 *     &lt;enumeration value="previousMonthsLastFiscalQuarter"/&gt;
 *     &lt;enumeration value="previousMonthsLastFiscalYear"/&gt;
 *     &lt;enumeration value="previousMonthsSameFiscalHalfLastYear"/&gt;
 *     &lt;enumeration value="previousMonthsSameFiscalQuartherLastFiscalYear"/&gt;
 *     &lt;enumeration value="previousMonthsThisFiscalHalf"/&gt;
 *     &lt;enumeration value="previousMonthsThisFiscalQuarter"/&gt;
 *     &lt;enumeration value="previousMonthsThisFiscalYear"/&gt;
 *     &lt;enumeration value="previousOneDay"/&gt;
 *     &lt;enumeration value="previousOneHalf"/&gt;
 *     &lt;enumeration value="previousOneMonth"/&gt;
 *     &lt;enumeration value="previousOneQuarter"/&gt;
 *     &lt;enumeration value="previousOneWeek"/&gt;
 *     &lt;enumeration value="previousOneYear"/&gt;
 *     &lt;enumeration value="previousQuartersLastFiscalYear"/&gt;
 *     &lt;enumeration value="previousQuartersThisFiscalYear"/&gt;
 *     &lt;enumeration value="previousRollingHalf"/&gt;
 *     &lt;enumeration value="previousRollingQuarter"/&gt;
 *     &lt;enumeration value="previousRollingYear"/&gt;
 *     &lt;enumeration value="sameDayFiscalQuarterBeforeLast"/&gt;
 *     &lt;enumeration value="sameDayFiscalYearBeforeLast"/&gt;
 *     &lt;enumeration value="sameDayLastFiscalQuarter"/&gt;
 *     &lt;enumeration value="sameDayLastFiscalYear"/&gt;
 *     &lt;enumeration value="sameDayLastMonth"/&gt;
 *     &lt;enumeration value="sameDayLastWeek"/&gt;
 *     &lt;enumeration value="sameDayMonthBeforeLast"/&gt;
 *     &lt;enumeration value="sameDayWeekBeforeLast"/&gt;
 *     &lt;enumeration value="sameFiscalQuarterFiscalYearBeforeLast"/&gt;
 *     &lt;enumeration value="sameHalfLastFiscalYearToDate"/&gt;
 *     &lt;enumeration value="sameMonthFiscalQuarterBeforeLast"/&gt;
 *     &lt;enumeration value="sameMonthFiscalYearBeforeLast"/&gt;
 *     &lt;enumeration value="sameMonthLastFiscalQuarter"/&gt;
 *     &lt;enumeration value="sameMonthLastFiscalQuarterToDate"/&gt;
 *     &lt;enumeration value="sameMonthLastFiscalYear"/&gt;
 *     &lt;enumeration value="sameMonthLastFiscalYearToDate"/&gt;
 *     &lt;enumeration value="sameQuarterLastFiscalYear"/&gt;
 *     &lt;enumeration value="sameQuarterLastFiscalYearToDate"/&gt;
 *     &lt;enumeration value="sameWeekFiscalYearBeforeLast"/&gt;
 *     &lt;enumeration value="sameWeekLastFiscalYear"/&gt;
 *     &lt;enumeration value="startOfLastBusinessWeek"/&gt;
 *     &lt;enumeration value="startOfLastFiscalHalf"/&gt;
 *     &lt;enumeration value="startOfLastFiscalQuarter"/&gt;
 *     &lt;enumeration value="startOfLastFiscalYear"/&gt;
 *     &lt;enumeration value="startOfLastHalfOneYearAgo"/&gt;
 *     &lt;enumeration value="startOfLastMonth"/&gt;
 *     &lt;enumeration value="startOfLastMonthOneQuarterAgo"/&gt;
 *     &lt;enumeration value="startOfLastMonthOneYearAgo"/&gt;
 *     &lt;enumeration value="startOfLastQuarterOneYearAgo"/&gt;
 *     &lt;enumeration value="startOfLastRollingHalf"/&gt;
 *     &lt;enumeration value="startOfLastRollingQuarter"/&gt;
 *     &lt;enumeration value="startOfLastRollingYear"/&gt;
 *     &lt;enumeration value="startOfLastWeek"/&gt;
 *     &lt;enumeration value="startOfNextBusinessWeek"/&gt;
 *     &lt;enumeration value="startOfNextFiscalHalf"/&gt;
 *     &lt;enumeration value="startOfNextFiscalQuarter"/&gt;
 *     &lt;enumeration value="startOfNextMonth"/&gt;
 *     &lt;enumeration value="startOfNextWeek"/&gt;
 *     &lt;enumeration value="startOfNextYear"/&gt;
 *     &lt;enumeration value="startOfPreviousRollingHalf"/&gt;
 *     &lt;enumeration value="startOfPreviousRollingQuarter"/&gt;
 *     &lt;enumeration value="startOfPreviousRollingYear"/&gt;
 *     &lt;enumeration value="startOfSameHalfLastFiscalYear"/&gt;
 *     &lt;enumeration value="startOfSameMonthLastFiscalQuarter"/&gt;
 *     &lt;enumeration value="startOfSameMonthLastFiscalYear"/&gt;
 *     &lt;enumeration value="startOfSameQuarterLastFiscalYear"/&gt;
 *     &lt;enumeration value="startOfTheHalfBeforeLast"/&gt;
 *     &lt;enumeration value="startOfTheMonthBeforeLast"/&gt;
 *     &lt;enumeration value="startOfTheQuarterBeforeLast"/&gt;
 *     &lt;enumeration value="startOfTheWeekBeforeLast"/&gt;
 *     &lt;enumeration value="startOfTheYearBeforeLast"/&gt;
 *     &lt;enumeration value="startOfThisBusinessWeek"/&gt;
 *     &lt;enumeration value="startOfThisFiscalHalf"/&gt;
 *     &lt;enumeration value="startOfThisFiscalQuarter"/&gt;
 *     &lt;enumeration value="startOfThisFiscalYear"/&gt;
 *     &lt;enumeration value="startOfThisMonth"/&gt;
 *     &lt;enumeration value="startOfThisWeek"/&gt;
 *     &lt;enumeration value="startOfThisYear"/&gt;
 *     &lt;enumeration value="thisBusinessWeek"/&gt;
 *     &lt;enumeration value="thisFiscalHalf"/&gt;
 *     &lt;enumeration value="thisFiscalHalfToDate"/&gt;
 *     &lt;enumeration value="thisFiscalQuarter"/&gt;
 *     &lt;enumeration value="thisFiscalQuarterToDate"/&gt;
 *     &lt;enumeration value="thisFiscalYear"/&gt;
 *     &lt;enumeration value="thisFiscalYearToDate"/&gt;
 *     &lt;enumeration value="thisMonth"/&gt;
 *     &lt;enumeration value="thisMonthToDate"/&gt;
 *     &lt;enumeration value="thisRollingHalf"/&gt;
 *     &lt;enumeration value="thisRollingQuarter"/&gt;
 *     &lt;enumeration value="thisRollingYear"/&gt;
 *     &lt;enumeration value="thisWeek"/&gt;
 *     &lt;enumeration value="thisWeekToDate"/&gt;
 *     &lt;enumeration value="thisYear"/&gt;
 *     &lt;enumeration value="threeMonthsAgo"/&gt;
 *     &lt;enumeration value="threeQuartersAgo"/&gt;
 *     &lt;enumeration value="threeYearsAgo"/&gt;
 *     &lt;enumeration value="today"/&gt;
 *     &lt;enumeration value="tomorrow"/&gt;
 *     &lt;enumeration value="twoDaysAgo"/&gt;
 *     &lt;enumeration value="weekBeforeLast"/&gt;
 *     &lt;enumeration value="weekBeforeLastToDate"/&gt;
 *     &lt;enumeration value="yesterday"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SearchDate", namespace = "urn:types.core_2014_2.platform.webservices.netsuite.com")
@XmlEnum
public enum SearchDate {

    @XmlEnumValue("fiscalHalfBeforeLast")
    FISCAL_HALF_BEFORE_LAST("fiscalHalfBeforeLast"),
    @XmlEnumValue("fiscalHalfBeforeLastToDate")
    FISCAL_HALF_BEFORE_LAST_TO_DATE("fiscalHalfBeforeLastToDate"),
    @XmlEnumValue("fiscalQuarterBeforeLast")
    FISCAL_QUARTER_BEFORE_LAST("fiscalQuarterBeforeLast"),
    @XmlEnumValue("fiscalQuarterBeforeLastToDate")
    FISCAL_QUARTER_BEFORE_LAST_TO_DATE("fiscalQuarterBeforeLastToDate"),
    @XmlEnumValue("fiscalYearBeforeLast")
    FISCAL_YEAR_BEFORE_LAST("fiscalYearBeforeLast"),
    @XmlEnumValue("fiscalYearBeforeLastToDate")
    FISCAL_YEAR_BEFORE_LAST_TO_DATE("fiscalYearBeforeLastToDate"),
    @XmlEnumValue("lastBusinessWeek")
    LAST_BUSINESS_WEEK("lastBusinessWeek"),
    @XmlEnumValue("lastFiscalHalf")
    LAST_FISCAL_HALF("lastFiscalHalf"),
    @XmlEnumValue("lastFiscalHalfOneYearAgo")
    LAST_FISCAL_HALF_ONE_YEAR_AGO("lastFiscalHalfOneYearAgo"),
    @XmlEnumValue("lastFiscalHalfToDate")
    LAST_FISCAL_HALF_TO_DATE("lastFiscalHalfToDate"),
    @XmlEnumValue("lastFiscalQuarter")
    LAST_FISCAL_QUARTER("lastFiscalQuarter"),
    @XmlEnumValue("lastFiscalQuarterOneYearAgo")
    LAST_FISCAL_QUARTER_ONE_YEAR_AGO("lastFiscalQuarterOneYearAgo"),
    @XmlEnumValue("lastFiscalQuarterToDate")
    LAST_FISCAL_QUARTER_TO_DATE("lastFiscalQuarterToDate"),
    @XmlEnumValue("lastFiscalYear")
    LAST_FISCAL_YEAR("lastFiscalYear"),
    @XmlEnumValue("lastFiscalYearToDate")
    LAST_FISCAL_YEAR_TO_DATE("lastFiscalYearToDate"),
    @XmlEnumValue("lastMonth")
    LAST_MONTH("lastMonth"),
    @XmlEnumValue("lastMonthOneQuarterAgo")
    LAST_MONTH_ONE_QUARTER_AGO("lastMonthOneQuarterAgo"),
    @XmlEnumValue("lastMonthOneYearAgo")
    LAST_MONTH_ONE_YEAR_AGO("lastMonthOneYearAgo"),
    @XmlEnumValue("lastMonthToDate")
    LAST_MONTH_TO_DATE("lastMonthToDate"),
    @XmlEnumValue("lastMonthTwoQuartersAgo")
    LAST_MONTH_TWO_QUARTERS_AGO("lastMonthTwoQuartersAgo"),
    @XmlEnumValue("lastMonthTwoYearsAgo")
    LAST_MONTH_TWO_YEARS_AGO("lastMonthTwoYearsAgo"),
    @XmlEnumValue("lastQuarterTwoYearsAgo")
    LAST_QUARTER_TWO_YEARS_AGO("lastQuarterTwoYearsAgo"),
    @XmlEnumValue("lastRollingHalf")
    LAST_ROLLING_HALF("lastRollingHalf"),
    @XmlEnumValue("lastRollingQuarter")
    LAST_ROLLING_QUARTER("lastRollingQuarter"),
    @XmlEnumValue("lastRollingYear")
    LAST_ROLLING_YEAR("lastRollingYear"),
    @XmlEnumValue("lastWeek")
    LAST_WEEK("lastWeek"),
    @XmlEnumValue("lastWeekToDate")
    LAST_WEEK_TO_DATE("lastWeekToDate"),
    @XmlEnumValue("monthBeforeLast")
    MONTH_BEFORE_LAST("monthBeforeLast"),
    @XmlEnumValue("monthBeforeLastToDate")
    MONTH_BEFORE_LAST_TO_DATE("monthBeforeLastToDate"),
    @XmlEnumValue("nextBusinessWeek")
    NEXT_BUSINESS_WEEK("nextBusinessWeek"),
    @XmlEnumValue("nextFiscalHalf")
    NEXT_FISCAL_HALF("nextFiscalHalf"),
    @XmlEnumValue("nextFiscalQuarter")
    NEXT_FISCAL_QUARTER("nextFiscalQuarter"),
    @XmlEnumValue("nextFiscalYear")
    NEXT_FISCAL_YEAR("nextFiscalYear"),
    @XmlEnumValue("nextFourWeeks")
    NEXT_FOUR_WEEKS("nextFourWeeks"),
    @XmlEnumValue("nextMonth")
    NEXT_MONTH("nextMonth"),
    @XmlEnumValue("nextOneHalf")
    NEXT_ONE_HALF("nextOneHalf"),
    @XmlEnumValue("nextOneMonth")
    NEXT_ONE_MONTH("nextOneMonth"),
    @XmlEnumValue("nextOneQuarter")
    NEXT_ONE_QUARTER("nextOneQuarter"),
    @XmlEnumValue("nextOneWeek")
    NEXT_ONE_WEEK("nextOneWeek"),
    @XmlEnumValue("nextOneYear")
    NEXT_ONE_YEAR("nextOneYear"),
    @XmlEnumValue("nextWeek")
    NEXT_WEEK("nextWeek"),
    @XmlEnumValue("oneYearBeforeLast")
    ONE_YEAR_BEFORE_LAST("oneYearBeforeLast"),
    @XmlEnumValue("previousMonthsLastFiscalHalf")
    PREVIOUS_MONTHS_LAST_FISCAL_HALF("previousMonthsLastFiscalHalf"),
    @XmlEnumValue("previousMonthsLastFiscalQuarter")
    PREVIOUS_MONTHS_LAST_FISCAL_QUARTER("previousMonthsLastFiscalQuarter"),
    @XmlEnumValue("previousMonthsLastFiscalYear")
    PREVIOUS_MONTHS_LAST_FISCAL_YEAR("previousMonthsLastFiscalYear"),
    @XmlEnumValue("previousMonthsSameFiscalHalfLastYear")
    PREVIOUS_MONTHS_SAME_FISCAL_HALF_LAST_YEAR("previousMonthsSameFiscalHalfLastYear"),
    @XmlEnumValue("previousMonthsSameFiscalQuartherLastFiscalYear")
    PREVIOUS_MONTHS_SAME_FISCAL_QUARTHER_LAST_FISCAL_YEAR("previousMonthsSameFiscalQuartherLastFiscalYear"),
    @XmlEnumValue("previousMonthsThisFiscalHalf")
    PREVIOUS_MONTHS_THIS_FISCAL_HALF("previousMonthsThisFiscalHalf"),
    @XmlEnumValue("previousMonthsThisFiscalQuarter")
    PREVIOUS_MONTHS_THIS_FISCAL_QUARTER("previousMonthsThisFiscalQuarter"),
    @XmlEnumValue("previousMonthsThisFiscalYear")
    PREVIOUS_MONTHS_THIS_FISCAL_YEAR("previousMonthsThisFiscalYear"),
    @XmlEnumValue("previousOneDay")
    PREVIOUS_ONE_DAY("previousOneDay"),
    @XmlEnumValue("previousOneHalf")
    PREVIOUS_ONE_HALF("previousOneHalf"),
    @XmlEnumValue("previousOneMonth")
    PREVIOUS_ONE_MONTH("previousOneMonth"),
    @XmlEnumValue("previousOneQuarter")
    PREVIOUS_ONE_QUARTER("previousOneQuarter"),
    @XmlEnumValue("previousOneWeek")
    PREVIOUS_ONE_WEEK("previousOneWeek"),
    @XmlEnumValue("previousOneYear")
    PREVIOUS_ONE_YEAR("previousOneYear"),
    @XmlEnumValue("previousQuartersLastFiscalYear")
    PREVIOUS_QUARTERS_LAST_FISCAL_YEAR("previousQuartersLastFiscalYear"),
    @XmlEnumValue("previousQuartersThisFiscalYear")
    PREVIOUS_QUARTERS_THIS_FISCAL_YEAR("previousQuartersThisFiscalYear"),
    @XmlEnumValue("previousRollingHalf")
    PREVIOUS_ROLLING_HALF("previousRollingHalf"),
    @XmlEnumValue("previousRollingQuarter")
    PREVIOUS_ROLLING_QUARTER("previousRollingQuarter"),
    @XmlEnumValue("previousRollingYear")
    PREVIOUS_ROLLING_YEAR("previousRollingYear"),
    @XmlEnumValue("sameDayFiscalQuarterBeforeLast")
    SAME_DAY_FISCAL_QUARTER_BEFORE_LAST("sameDayFiscalQuarterBeforeLast"),
    @XmlEnumValue("sameDayFiscalYearBeforeLast")
    SAME_DAY_FISCAL_YEAR_BEFORE_LAST("sameDayFiscalYearBeforeLast"),
    @XmlEnumValue("sameDayLastFiscalQuarter")
    SAME_DAY_LAST_FISCAL_QUARTER("sameDayLastFiscalQuarter"),
    @XmlEnumValue("sameDayLastFiscalYear")
    SAME_DAY_LAST_FISCAL_YEAR("sameDayLastFiscalYear"),
    @XmlEnumValue("sameDayLastMonth")
    SAME_DAY_LAST_MONTH("sameDayLastMonth"),
    @XmlEnumValue("sameDayLastWeek")
    SAME_DAY_LAST_WEEK("sameDayLastWeek"),
    @XmlEnumValue("sameDayMonthBeforeLast")
    SAME_DAY_MONTH_BEFORE_LAST("sameDayMonthBeforeLast"),
    @XmlEnumValue("sameDayWeekBeforeLast")
    SAME_DAY_WEEK_BEFORE_LAST("sameDayWeekBeforeLast"),
    @XmlEnumValue("sameFiscalQuarterFiscalYearBeforeLast")
    SAME_FISCAL_QUARTER_FISCAL_YEAR_BEFORE_LAST("sameFiscalQuarterFiscalYearBeforeLast"),
    @XmlEnumValue("sameHalfLastFiscalYearToDate")
    SAME_HALF_LAST_FISCAL_YEAR_TO_DATE("sameHalfLastFiscalYearToDate"),
    @XmlEnumValue("sameMonthFiscalQuarterBeforeLast")
    SAME_MONTH_FISCAL_QUARTER_BEFORE_LAST("sameMonthFiscalQuarterBeforeLast"),
    @XmlEnumValue("sameMonthFiscalYearBeforeLast")
    SAME_MONTH_FISCAL_YEAR_BEFORE_LAST("sameMonthFiscalYearBeforeLast"),
    @XmlEnumValue("sameMonthLastFiscalQuarter")
    SAME_MONTH_LAST_FISCAL_QUARTER("sameMonthLastFiscalQuarter"),
    @XmlEnumValue("sameMonthLastFiscalQuarterToDate")
    SAME_MONTH_LAST_FISCAL_QUARTER_TO_DATE("sameMonthLastFiscalQuarterToDate"),
    @XmlEnumValue("sameMonthLastFiscalYear")
    SAME_MONTH_LAST_FISCAL_YEAR("sameMonthLastFiscalYear"),
    @XmlEnumValue("sameMonthLastFiscalYearToDate")
    SAME_MONTH_LAST_FISCAL_YEAR_TO_DATE("sameMonthLastFiscalYearToDate"),
    @XmlEnumValue("sameQuarterLastFiscalYear")
    SAME_QUARTER_LAST_FISCAL_YEAR("sameQuarterLastFiscalYear"),
    @XmlEnumValue("sameQuarterLastFiscalYearToDate")
    SAME_QUARTER_LAST_FISCAL_YEAR_TO_DATE("sameQuarterLastFiscalYearToDate"),
    @XmlEnumValue("sameWeekFiscalYearBeforeLast")
    SAME_WEEK_FISCAL_YEAR_BEFORE_LAST("sameWeekFiscalYearBeforeLast"),
    @XmlEnumValue("sameWeekLastFiscalYear")
    SAME_WEEK_LAST_FISCAL_YEAR("sameWeekLastFiscalYear"),
    @XmlEnumValue("startOfLastBusinessWeek")
    START_OF_LAST_BUSINESS_WEEK("startOfLastBusinessWeek"),
    @XmlEnumValue("startOfLastFiscalHalf")
    START_OF_LAST_FISCAL_HALF("startOfLastFiscalHalf"),
    @XmlEnumValue("startOfLastFiscalQuarter")
    START_OF_LAST_FISCAL_QUARTER("startOfLastFiscalQuarter"),
    @XmlEnumValue("startOfLastFiscalYear")
    START_OF_LAST_FISCAL_YEAR("startOfLastFiscalYear"),
    @XmlEnumValue("startOfLastHalfOneYearAgo")
    START_OF_LAST_HALF_ONE_YEAR_AGO("startOfLastHalfOneYearAgo"),
    @XmlEnumValue("startOfLastMonth")
    START_OF_LAST_MONTH("startOfLastMonth"),
    @XmlEnumValue("startOfLastMonthOneQuarterAgo")
    START_OF_LAST_MONTH_ONE_QUARTER_AGO("startOfLastMonthOneQuarterAgo"),
    @XmlEnumValue("startOfLastMonthOneYearAgo")
    START_OF_LAST_MONTH_ONE_YEAR_AGO("startOfLastMonthOneYearAgo"),
    @XmlEnumValue("startOfLastQuarterOneYearAgo")
    START_OF_LAST_QUARTER_ONE_YEAR_AGO("startOfLastQuarterOneYearAgo"),
    @XmlEnumValue("startOfLastRollingHalf")
    START_OF_LAST_ROLLING_HALF("startOfLastRollingHalf"),
    @XmlEnumValue("startOfLastRollingQuarter")
    START_OF_LAST_ROLLING_QUARTER("startOfLastRollingQuarter"),
    @XmlEnumValue("startOfLastRollingYear")
    START_OF_LAST_ROLLING_YEAR("startOfLastRollingYear"),
    @XmlEnumValue("startOfLastWeek")
    START_OF_LAST_WEEK("startOfLastWeek"),
    @XmlEnumValue("startOfNextBusinessWeek")
    START_OF_NEXT_BUSINESS_WEEK("startOfNextBusinessWeek"),
    @XmlEnumValue("startOfNextFiscalHalf")
    START_OF_NEXT_FISCAL_HALF("startOfNextFiscalHalf"),
    @XmlEnumValue("startOfNextFiscalQuarter")
    START_OF_NEXT_FISCAL_QUARTER("startOfNextFiscalQuarter"),
    @XmlEnumValue("startOfNextMonth")
    START_OF_NEXT_MONTH("startOfNextMonth"),
    @XmlEnumValue("startOfNextWeek")
    START_OF_NEXT_WEEK("startOfNextWeek"),
    @XmlEnumValue("startOfNextYear")
    START_OF_NEXT_YEAR("startOfNextYear"),
    @XmlEnumValue("startOfPreviousRollingHalf")
    START_OF_PREVIOUS_ROLLING_HALF("startOfPreviousRollingHalf"),
    @XmlEnumValue("startOfPreviousRollingQuarter")
    START_OF_PREVIOUS_ROLLING_QUARTER("startOfPreviousRollingQuarter"),
    @XmlEnumValue("startOfPreviousRollingYear")
    START_OF_PREVIOUS_ROLLING_YEAR("startOfPreviousRollingYear"),
    @XmlEnumValue("startOfSameHalfLastFiscalYear")
    START_OF_SAME_HALF_LAST_FISCAL_YEAR("startOfSameHalfLastFiscalYear"),
    @XmlEnumValue("startOfSameMonthLastFiscalQuarter")
    START_OF_SAME_MONTH_LAST_FISCAL_QUARTER("startOfSameMonthLastFiscalQuarter"),
    @XmlEnumValue("startOfSameMonthLastFiscalYear")
    START_OF_SAME_MONTH_LAST_FISCAL_YEAR("startOfSameMonthLastFiscalYear"),
    @XmlEnumValue("startOfSameQuarterLastFiscalYear")
    START_OF_SAME_QUARTER_LAST_FISCAL_YEAR("startOfSameQuarterLastFiscalYear"),
    @XmlEnumValue("startOfTheHalfBeforeLast")
    START_OF_THE_HALF_BEFORE_LAST("startOfTheHalfBeforeLast"),
    @XmlEnumValue("startOfTheMonthBeforeLast")
    START_OF_THE_MONTH_BEFORE_LAST("startOfTheMonthBeforeLast"),
    @XmlEnumValue("startOfTheQuarterBeforeLast")
    START_OF_THE_QUARTER_BEFORE_LAST("startOfTheQuarterBeforeLast"),
    @XmlEnumValue("startOfTheWeekBeforeLast")
    START_OF_THE_WEEK_BEFORE_LAST("startOfTheWeekBeforeLast"),
    @XmlEnumValue("startOfTheYearBeforeLast")
    START_OF_THE_YEAR_BEFORE_LAST("startOfTheYearBeforeLast"),
    @XmlEnumValue("startOfThisBusinessWeek")
    START_OF_THIS_BUSINESS_WEEK("startOfThisBusinessWeek"),
    @XmlEnumValue("startOfThisFiscalHalf")
    START_OF_THIS_FISCAL_HALF("startOfThisFiscalHalf"),
    @XmlEnumValue("startOfThisFiscalQuarter")
    START_OF_THIS_FISCAL_QUARTER("startOfThisFiscalQuarter"),
    @XmlEnumValue("startOfThisFiscalYear")
    START_OF_THIS_FISCAL_YEAR("startOfThisFiscalYear"),
    @XmlEnumValue("startOfThisMonth")
    START_OF_THIS_MONTH("startOfThisMonth"),
    @XmlEnumValue("startOfThisWeek")
    START_OF_THIS_WEEK("startOfThisWeek"),
    @XmlEnumValue("startOfThisYear")
    START_OF_THIS_YEAR("startOfThisYear"),
    @XmlEnumValue("thisBusinessWeek")
    THIS_BUSINESS_WEEK("thisBusinessWeek"),
    @XmlEnumValue("thisFiscalHalf")
    THIS_FISCAL_HALF("thisFiscalHalf"),
    @XmlEnumValue("thisFiscalHalfToDate")
    THIS_FISCAL_HALF_TO_DATE("thisFiscalHalfToDate"),
    @XmlEnumValue("thisFiscalQuarter")
    THIS_FISCAL_QUARTER("thisFiscalQuarter"),
    @XmlEnumValue("thisFiscalQuarterToDate")
    THIS_FISCAL_QUARTER_TO_DATE("thisFiscalQuarterToDate"),
    @XmlEnumValue("thisFiscalYear")
    THIS_FISCAL_YEAR("thisFiscalYear"),
    @XmlEnumValue("thisFiscalYearToDate")
    THIS_FISCAL_YEAR_TO_DATE("thisFiscalYearToDate"),
    @XmlEnumValue("thisMonth")
    THIS_MONTH("thisMonth"),
    @XmlEnumValue("thisMonthToDate")
    THIS_MONTH_TO_DATE("thisMonthToDate"),
    @XmlEnumValue("thisRollingHalf")
    THIS_ROLLING_HALF("thisRollingHalf"),
    @XmlEnumValue("thisRollingQuarter")
    THIS_ROLLING_QUARTER("thisRollingQuarter"),
    @XmlEnumValue("thisRollingYear")
    THIS_ROLLING_YEAR("thisRollingYear"),
    @XmlEnumValue("thisWeek")
    THIS_WEEK("thisWeek"),
    @XmlEnumValue("thisWeekToDate")
    THIS_WEEK_TO_DATE("thisWeekToDate"),
    @XmlEnumValue("thisYear")
    THIS_YEAR("thisYear"),
    @XmlEnumValue("threeMonthsAgo")
    THREE_MONTHS_AGO("threeMonthsAgo"),
    @XmlEnumValue("threeQuartersAgo")
    THREE_QUARTERS_AGO("threeQuartersAgo"),
    @XmlEnumValue("threeYearsAgo")
    THREE_YEARS_AGO("threeYearsAgo"),
    @XmlEnumValue("today")
    TODAY("today"),
    @XmlEnumValue("tomorrow")
    TOMORROW("tomorrow"),
    @XmlEnumValue("twoDaysAgo")
    TWO_DAYS_AGO("twoDaysAgo"),
    @XmlEnumValue("weekBeforeLast")
    WEEK_BEFORE_LAST("weekBeforeLast"),
    @XmlEnumValue("weekBeforeLastToDate")
    WEEK_BEFORE_LAST_TO_DATE("weekBeforeLastToDate"),
    @XmlEnumValue("yesterday")
    YESTERDAY("yesterday");
    private final String value;

    SearchDate(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchDate fromValue(String v) {
        for (SearchDate c: SearchDate.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
