/**
 * RegisterUserPortType.java
 * 
 * This file was auto-generated from WSDL by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.registration.register.proxy;

public interface RegisterUserPortType extends java.rmi.Remote {

    public boolean registerUser(java.lang.String email, java.lang.String country, java.lang.String designerversion)
            throws java.rmi.RemoteException;

    public boolean registerUserWithProductName(java.lang.String email, java.lang.String country,
            java.lang.String designerversion, java.lang.String productname) throws java.rmi.RemoteException;

    public boolean registerUserWithAllUserInformations(java.lang.String email, java.lang.String country,
            java.lang.String designerversion, java.lang.String productname, java.lang.String projectLanguage,
            java.lang.String osName, java.lang.String osVersion, java.lang.String javaVersion, java.lang.String totalMemory,
            java.lang.String memRAM, java.lang.String nbProc) throws java.rmi.RemoteException;

    public java.math.BigInteger registerUserWithAllUserInformationsAndReturnId(java.lang.String email, java.lang.String country,
            java.lang.String designerversion, java.lang.String productname, java.lang.String projectLanguage,
            java.lang.String osName, java.lang.String osVersion, java.lang.String javaVersion, java.lang.String totalMemory,
            java.lang.String memRAM, java.lang.String nbProc) throws java.rmi.RemoteException;

    public java.math.BigInteger registerUserWithAllUserInformationsUniqueIdAndReturnId(java.lang.String email,
            java.lang.String country, java.lang.String designerversion, java.lang.String productname,
            java.lang.String projectLanguage, java.lang.String osName, java.lang.String osVersion, java.lang.String javaVersion,
            java.lang.String totalMemory, java.lang.String memRAM, java.lang.String nbProc, java.lang.String uniqueId)
            throws java.rmi.RemoteException;

    public org.talend.registration.register.proxy.UserRegistration[] listUsers() throws java.rmi.RemoteException;

    public java.lang.String checkUser(java.lang.String email) throws java.rmi.RemoteException;

    public java.math.BigInteger createUser(java.lang.String email, java.lang.String pseudo, java.lang.String password,
            java.lang.String firstname, java.lang.String lastname, java.lang.String country, java.lang.String designerversion,
            java.lang.String productname, java.lang.String osName, java.lang.String osVersion, java.lang.String javaVersion,
            java.lang.String totalMemory, java.lang.String memRAM, java.lang.String nbProc) throws java.rmi.RemoteException;

    public java.math.BigInteger updateUser(java.lang.String email, java.lang.String pseudo, java.lang.String passwordOld,
            java.lang.String passwordNew, java.lang.String firstname, java.lang.String lastname, java.lang.String country,
            java.lang.String designerversion, java.lang.String productname, java.lang.String osName, java.lang.String osVersion,
            java.lang.String javaVersion, java.lang.String totalMemory, java.lang.String memRAM, java.lang.String nbProc)
            throws java.rmi.RemoteException;

    public java.math.BigInteger createUser50(java.lang.String pseudo, java.lang.String password, java.lang.String firstname,
            java.lang.String lastname, java.lang.String country, java.lang.String designerversion, java.lang.String productname,
            java.lang.String osName, java.lang.String osVersion, java.lang.String javaVersion, java.lang.String totalMemory,
            java.lang.String memRAM, java.lang.String nbProc) throws java.rmi.RemoteException;

    public java.math.BigInteger createUser53(java.lang.String email, java.lang.String pseudo, java.lang.String password,
            java.lang.String firstname, java.lang.String lastname, java.lang.String country, java.lang.String designerversion,
            java.lang.String productname, java.lang.String osName, java.lang.String osVersion, java.lang.String javaVersion,
            java.lang.String totalMemory, java.lang.String memRAM, java.lang.String nbProc, java.lang.String uniqueId)
            throws java.rmi.RemoteException;

    public java.math.BigInteger updateUser53(java.lang.String pseudo, java.lang.String password, java.lang.String firstname,
            java.lang.String lastname, java.lang.String country, java.lang.String designerversion, java.lang.String productname,
            java.lang.String osName, java.lang.String osVersion, java.lang.String javaVersion, java.lang.String totalMemory,
            java.lang.String memRAM, java.lang.String nbProc, java.lang.String uniqueId) throws java.rmi.RemoteException;
}
