// ============================================================================
package org.talend.camel.designer.migration;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Properties;

/**
 * DOC GangLiu class global comment. Detailled comment
 */
public class FinalVersionUpgradeMigrationTask extends
		CMessgingEndpointSwitchVersionTask {

	private Properties properties = new Properties();
	
	public FinalVersionUpgradeMigrationTask(){
		try {
			loadVersionsMap();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void loadVersionsMap() throws IOException {
		InputStream is = getClass().getResourceAsStream("VersionMigrationMap.properties");
		properties.load(is);
		is.close();
	}

	public Date getOrder() {
		GregorianCalendar gc = new GregorianCalendar(2012, 11, 2, 14, 00, 00);
		return gc.getTime();
	}

	/**
	 * 
	 * DOC LiXP Comment method "switchVersion".
	 * 
	 * @param evtValue
	 * @param properties
	 * @return
	 */
	protected String switchVersion(String evtValue) {
		if (evtValue == null) {
			return evtValue;
		}
		int index = evtValue.lastIndexOf('-');
		if(index != -1){
			evtValue = evtValue.substring(0, index);
		}
		return properties.getProperty(evtValue);
	}

}
