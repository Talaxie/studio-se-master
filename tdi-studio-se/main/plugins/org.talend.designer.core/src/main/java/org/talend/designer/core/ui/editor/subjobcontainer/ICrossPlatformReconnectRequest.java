// ============================================================================
//
// Copyright (C) 2006-2023 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.designer.core.ui.editor.subjobcontainer;

import org.talend.designer.core.ui.editor.connections.ICrossPlatformConnectionPart;

public interface ICrossPlatformReconnectRequest extends ICrossPlatformLocationRequest {

    ICrossPlatformConnectionPart getConnectionEditPart();

    void setConnectionEditPart(ICrossPlatformConnectionPart part);

    ICrossPlatformEditPart getTarget();

    void setTargetEditPart(ICrossPlatformEditPart ep);

}