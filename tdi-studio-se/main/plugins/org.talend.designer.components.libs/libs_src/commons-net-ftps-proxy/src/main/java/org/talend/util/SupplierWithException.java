package org.talend.util;


//TODO consider to move to the studio routines or to the separate util library when not only FTP+S need to use it
/**
 * Used as a functional interface to execute methods which might throw an Exception
 * in lambda in tFtpPut component for FTP&FTPS mode
 * @param <R> return type
 * @param <E> type of the expected Exception function would throw
 */
@FunctionalInterface
public interface SupplierWithException<R,E extends Exception> {
    R get() throws E;
}
