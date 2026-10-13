// ============================================================================
//
// Copyright (C) 2006-2021 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.designer.core.ui.routine;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.talend.core.model.properties.PropertiesFactory;
import org.talend.core.model.properties.Property;
import org.talend.core.model.properties.RoutinesJarItem;
import org.talend.designer.core.model.utils.emf.component.ComponentFactory;
import org.talend.designer.core.model.utils.emf.component.IMPORTType;

public class ShowRoutineItemsLabelProviderTest {

    @Test
    public void testRoutinesJarLabelShowsMavenCoordinates() {
        Property property = PropertiesFactory.eINSTANCE.createProperty();
        property.setLabel("konvertilo");
        RoutinesJarItem item = PropertiesFactory.eINSTANCE.createRoutinesJarItem();
        item.setProperty(property);
        item.setRoutinesJarType(PropertiesFactory.eINSTANCE.createRoutinesJarType());

        IMPORTType dependency = ComponentFactory.eINSTANCE.createIMPORTType();
        dependency.setMODULE("i-1.0.70.jar");
        dependency.setMVN("mvn:com.konvertilo/i/1.0.70/jar");
        item.getRoutinesJarType().getImports().add(dependency);

        assertEquals("konvertilo  [mvn:com.konvertilo/i/1.0.70/jar]",
                ShowRoutineItemsLabelProvider.getPropertyLabel(property));
    }

    @Test
    public void testRoutinesJarLabelFallsBackToModuleName() {
        Property property = PropertiesFactory.eINSTANCE.createProperty();
        property.setLabel("custom-routines");
        RoutinesJarItem item = PropertiesFactory.eINSTANCE.createRoutinesJarItem();
        item.setProperty(property);
        item.setRoutinesJarType(PropertiesFactory.eINSTANCE.createRoutinesJarType());

        IMPORTType dependency = ComponentFactory.eINSTANCE.createIMPORTType();
        dependency.setMODULE("local-library.jar");
        dependency.setMVN(" ");
        item.getRoutinesJarType().getImports().add(dependency);

        assertEquals("custom-routines  [local-library.jar]", ShowRoutineItemsLabelProvider.getPropertyLabel(property));
    }
}
