// ============================================================================
//
// Copyright (C) 2006-2023 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.commons.runtime.model.emf;

import java.util.Iterator;
import java.util.Map;
import java.util.StringJoiner;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.XMLSave;
import org.eclipse.emf.ecore.xmi.impl.XMISaveImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLString;

/**
 * DOC jding  class global comment. Detailled comment
 */
public class CustomXMIResource extends TalendXMIResource {

    public static final String ENCODING = "UTF-8"; //$NON-NLS-1$

    CustomXMISave xmiSave;

    public CustomXMIResource() {
        super();
    }

    public CustomXMIResource(URI uri) {
        super(uri);
    }

    @Override
    protected void init() {
        super.init();
        encoding = ENCODING;
    }

    @Override
    protected XMLSave createXMLSave() {
        xmiSave = new CustomXMISave(createXMLHelper());
        return xmiSave;
    }

    public String getResourceContent(Map<?, ?> options) {
        if (xmiSave == null) {
            createXMLSave();
        }
        return xmiSave.getXMLContent(this, options);
    }

}

class CustomXMISave extends XMISaveImpl {

    public CustomXMISave(XMLHelper helper) {
        super(helper);
    }

    public String getXMLContent(XMLResource resource, Map<?, ?> options) {
        StringJoiner strJoin = new StringJoiner("");
        super.init(resource, options);
        super.traverse(resource.getContents());
        XMLString xmlString = this.doc;
        Iterator<String> iterator = xmlString.stringIterator();
        while (iterator.hasNext()) {
            String string = (String) iterator.next();
            if (string != null) {
                strJoin.add(string);
            }
        }
        return strJoin.toString();
    }

}
