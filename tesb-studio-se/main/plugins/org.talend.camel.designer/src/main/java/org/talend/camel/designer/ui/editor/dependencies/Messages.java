package org.talend.camel.designer.ui.editor.dependencies;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.talend.camel.designer.ui.editor.dependencies.messages"; //$NON-NLS-1$
	public static String CamelDependenciesEditor_Resources;
    public static String EditDependenciesContextualAction_ActionName;
    public static String NewDependencyItemDialog_addTitle;
    public static String NewDependencyItemDialog_addMsg;
    public static String NewDependencyItemDialog_editTitle;
    public static String NewDependencyItemDialog_editMsg;
	public static String NewDependencyItemDialog_existCheckMessage;
	public static String NewDependencyItemDialog_name;
	public static String NewDependencyItemDialog_optional;
	public static String RouterDependenciesEditor_classpathSec;
	public static String RouterDependenciesEditor_exportPackage;
	public static String RouterDependenciesEditor_filterLabel;
	public static String RouterDependenciesEditor_hideBuiltInItems;
	public static String RouterDependenciesEditor_importPackageSec;
	public static String RouterDependenciesEditor_KeyBindingw;
	public static String RouterDependenciesEditor_multiItemsSelectedStatusMsg;
	public static String RouterDependenciesEditor_refreshDependenciesTooltip;
	public static String RouterDependenciesEditor_requireBundleSec;
	public static String RouterDependenciesPanel_addBtn;
	public static String RouterDependenciesPanel_deleteMsg;
	public static String RouterDependenciesPanel_deleteTitle;
	public static String RouterDependenciesPanel_deselectAll;
	public static String RouterDependenciesPanel_downBtn;
	public static String RouterDependenciesPanel_editBtn;
	public static String RouterDependenciesPanel_removeBtn;
	public static String RouterDependenciesPanel_selectAll;
	public static String RouterDependenciesPanel_upBtn;

	public static String DependencyVersionDialog_versionRangeError;
	public static String NewOrEditDependencyDialog_properties;

	public static String DependenceVersionPart_groupText;
	public static String DependencyVersionPart_version;
	public static String DependencyVersionPart_minimumVersion;
	public static String DependencyVersionPart_maximumVersion;
	public static String DependencyVersionPart_comboInclusive;
	public static String DependencyVersionPart_comboExclusive;
    public static String ManageRouteResourceDialog_routeCol;
    public static String ManageRouteResourceDialog_Version;
    public static String ManageRouteResourceDialog_Path;
    public static String ManageRouteResourceDialog_CopyPath;
    public static String ManageRouteResourceDialog_usedBy;
    public static String ManageRouteResourceDialog_copyTitle;
    public static String ManageRouteResourceDialog_copyMsg;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
