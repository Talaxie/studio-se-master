package org.talend.parquet.utils;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import org.talend.parquet.data.simple.NanoTime;

import jodd.time.JulianDate;

public class NanoTimeUtils {

	/**
	 * Number of days between Julian day epoch (January 1, 4713 BC) and Unix day
	 * epoch (January 1, 1970). The value of this constant is {@value}.
	 */
	public static final long JULIAN_EPOCH_OFFSET_DAYS = 2440588;
	private static final long MILLIS_IN_DAY = TimeUnit.DAYS.toMillis(1);
	private static final long NANOS_PER_MILLISECOND = TimeUnit.MILLISECONDS.toNanos(1);

	static final long NANOS_PER_HOUR = java.util.concurrent.TimeUnit.HOURS.toNanos(1);
	static final long NANOS_PER_MINUTE = java.util.concurrent.TimeUnit.MINUTES.toNanos(1);
	static final long NANOS_PER_SECOND = java.util.concurrent.TimeUnit.SECONDS.toNanos(1);
	static final long NANOS_PER_DAY = java.util.concurrent.TimeUnit.DAYS.toNanos(1);

	private static final ThreadLocal<java.util.Calendar> parquetGMTCalendar = new ThreadLocal<Calendar>();
	private static final ThreadLocal<Calendar> parquetLocalCalendar = new ThreadLocal<Calendar>();

	private static Calendar getGMTCalendar() {
		// Calendar.getInstance calculates the current-time needlessly, so cache
		// an instance.
		if (parquetGMTCalendar.get() == null) {
			parquetGMTCalendar.set(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
		}
		return parquetGMTCalendar.get();
	}

	private static Calendar getLocalCalendar() {
		if (parquetLocalCalendar.get() == null) {
			parquetLocalCalendar.set(Calendar.getInstance());
		}
		return parquetLocalCalendar.get();
	}

	private static Calendar getCalendar(boolean skipConversion) {
		Calendar calendar = skipConversion ? getLocalCalendar() : getGMTCalendar();
		calendar.clear();
		return calendar;
	}

	/**
	 * Converts a timestamp to NanoTime.
	 */
	public static NanoTime getNanoTime(Timestamp ts, boolean skipConversion) {

		Calendar calendar = getCalendar(skipConversion);
		calendar.setTimeInMillis(ts.getTime());
		int year = calendar.get(Calendar.YEAR);
		if (calendar.get(Calendar.ERA) == GregorianCalendar.BC) {
			year = 1 - year;
		}
		JulianDate jDateTime;
		jDateTime = JulianDate.of(year, calendar.get(Calendar.MONTH) + 1, // java calendar index starting at 1.
				calendar.get(Calendar.DAY_OF_MONTH), 0, 0, 0, 0);
		int days = jDateTime.getJulianDayNumber();

		long hour = calendar.get(Calendar.HOUR_OF_DAY);
		long minute = calendar.get(Calendar.MINUTE);
		long second = calendar.get(Calendar.SECOND);
		long nanos = ts.getNanos();
		long nanosOfDay = nanos + NANOS_PER_SECOND * second + NANOS_PER_MINUTE * minute + NANOS_PER_HOUR * hour;

		return new NanoTime(days, nanosOfDay);
	}

	public static Timestamp getTimestamp(NanoTime nt, boolean skipConversion) {
		int julianDay = nt.getJulianDay();
		long nanosOfDay = nt.getTimeOfDayNanos();

		long remainder = nanosOfDay;
		julianDay += remainder / NANOS_PER_DAY;
		remainder %= NANOS_PER_DAY;
		if (remainder < 0) {
			remainder += NANOS_PER_DAY;
			julianDay--;
		}

		JulianDate jDateTime = new JulianDate((double) julianDay);
		LocalDateTime datetime = jDateTime.toLocalDateTime();
		Calendar calendar = getCalendar(skipConversion);
		calendar.set(Calendar.YEAR, datetime.getYear());
		calendar.set(Calendar.MONTH, datetime.getMonthValue() - 1);
		calendar.set(Calendar.DAY_OF_MONTH, datetime.getYear());

		int hour = (int) (remainder / (NANOS_PER_HOUR));
		remainder = remainder % (NANOS_PER_HOUR);
		int minutes = (int) (remainder / (NANOS_PER_MINUTE));
		remainder = remainder % (NANOS_PER_MINUTE);
		int seconds = (int) (remainder / (NANOS_PER_SECOND));
		long nanos = remainder % NANOS_PER_SECOND;

		calendar.set(Calendar.HOUR_OF_DAY, hour);
		calendar.set(Calendar.MINUTE, minutes);
		calendar.set(Calendar.SECOND, seconds);
		Timestamp ts = new Timestamp(calendar.getTimeInMillis());
		ts.setNanos((int) nanos);
		return ts;
	}

	/**
	 * Returns timestamp millis from NanoTime type value.
	 *
	 * @param nt NanoTime value
	 * @return timestamp in millis
	 */
	public static long getTimestampMillis(NanoTime nt) {
		long timeOfDayNanos = nt.getTimeOfDayNanos();
		int julianDay = nt.getJulianDay();

		return (julianDay - JULIAN_EPOCH_OFFSET_DAYS) * MILLIS_IN_DAY + (timeOfDayNanos / NANOS_PER_MILLISECOND);
	}

	public static Timestamp getTimestamp(NanoTime nt) {
		Timestamp ts = new Timestamp(getTimestampMillis(nt));
		ts.setNanos((int) (nt.getTimeOfDayNanos() % 1000000000));
		return ts;
	}
}
