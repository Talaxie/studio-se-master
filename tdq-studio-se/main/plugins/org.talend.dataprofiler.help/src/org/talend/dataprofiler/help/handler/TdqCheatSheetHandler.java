// ============================================================================
//
// Copyright (C) 2006-2021 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.dataprofiler.help.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.internal.cheatsheets.actions.CheatSheetCategoryBasedSelectionAction;

/**
 * DOC TdqCheatSheetHandler class global comment. Detailled comment
 * 
 * @author xqliu
 *
 */
public class TdqCheatSheetHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent arg0) throws ExecutionException {
		CheatSheetCategoryBasedSelectionAction cscAction = new CheatSheetCategoryBasedSelectionAction();
		cscAction.run();
		return null;
	}

}
