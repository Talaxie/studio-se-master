/*
 * Copyright (C) 2007 SQL Explorer Development Team
 * http://sourceforge.net/projects/eclipsesql
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package net.sourceforge.sqlexplorer.dbproduct;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Driver;
import java.util.HashMap;

import net.sourceforge.sqlexplorer.plugin.SQLExplorerPlugin;

/**
 * Accessor class for obtaining a platform-specific instance of DatabaseProduct.
 * Uses reflection to identify an instance class and then call a public static
 * member called getProductInstance() to get a singleton to return.
 * 
 * If a platform-specific version cannot be found, the DefaultDatabaseProduct is 
 * used instead
 * 
 * @see DatabaseProduct
 * @author John Spackman
 *
 */
public final class DatabaseProductFactory {

	// Name of the accessor function that returns a platform-specific singleton
	//	instance of DatabaseProduct
	private static final String GET_PRODUCT_INSTANCE = "getProductInstance";
	
	// We guarantee to always be able to provide an instance; this is the one we
	//	provide if none has been implemented for the given database platform
	private static DefaultDatabaseProduct s_defaultProduct;
	
	private static HashMap<String, DatabaseProduct> instances = new HashMap<String, DatabaseProduct>();
	
	public static Driver loadDriver(ManagedDriver driver) throws ClassNotFoundException {
        if (driver.getDriverClassName() == null)
        	return null;
		DatabaseProduct product = getInstance(driver);
		if (product == null)
			throw new ClassNotFoundException(driver.getDriverClassName());
		return product.getDriver(driver);
	}
	
	/**
	 * Returns an instance of DatabaseProduct for the platform at the connection
	 * held by the connection
	 * @param node the connected node
	 * @return a DatabaseProduct for the platform, never returns null
	 */
	public static DatabaseProduct getInstance(ManagedDriver driver) {
		DatabaseProduct product = getProductInternal(driver);
		if (product != null)
			return product;
        
        if (s_defaultProduct == null)
        	s_defaultProduct = new DefaultDatabaseProduct();

        return s_defaultProduct;
	}

	private static DatabaseProduct getProductInternal(ManagedDriver driver) {
		// This gets us, eg, "oracle" or "mssql"
        //String productName = node.getRoot().getDatabaseProductName().toLowerCase().trim();
		String str = driver.getUrl();
		String[] strs = (str != null) ? str.split(":") : null;
		String productName = (strs != null && strs.length > 1) ? strs[1] : null;
        DatabaseProduct result = productName != null ? instances.get(productName) : null;
        if (result != null)
        	return result;
        
        // Insert the database name just before our package name, eg so we get
        //	net.sourceforge.sqlexplorer.database-platform-name.dbproduct.DatabaseProduct
        StringBuffer sb = new StringBuffer(DatabaseProduct.class.getName());
        int pos = sb.lastIndexOf(".");
        pos = sb.lastIndexOf(".", pos - 1);
        sb.insert(pos, '.' + productName);
        String className = sb.toString();
        
        // Use reflection to find it
        Exception ex = null;
        try {
        	// Locate the method
	        Class clazz = Class.forName(className);
	        Method method = clazz.getMethod(GET_PRODUCT_INSTANCE, new Class[0]);
	        
	        // Call the method; it's static and has no parameters so both args are null (1st arg is "this") 
	        result = (DatabaseProduct) method.invoke(null, (Object[])null);
	        instances.put(productName, result);
	        return result;
        } catch(IllegalAccessException e) {
        	ex = e;
        } catch(InvocationTargetException e) {
        	ex = e;
        } catch(ClassNotFoundException e) {
        	ex = null;
        } catch(NoSuchMethodException e) {
        	ex = e;
        }
        if (ex != null)
        	SQLExplorerPlugin.error("Could not instantiate DatabasePlatform", ex);

        return null;
	}
	
}
