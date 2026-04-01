// ============================================================================
//
// Copyright (C) 2006-2022 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.commons.ui.runtime.image;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.eclipse.jface.resource.ImageDescriptor;
import org.junit.Test;

public class ImageUtilsTest {
    
    @Test
    public void testCreateImageFromData() {
        IImage icon = ECoreImage.PROCESS_ICON;
        ImageDescriptor imgDesc = ImageDescriptor.createFromFile(icon.getLocation(), icon.getPath());
        
        byte[] data1 = ImageUtils.saveImageToData(imgDesc);
        byte[] data2 = new byte[data1.length];
        System.arraycopy(data1, 0, data2, 0, data1.length);
        assertTrue(Arrays.equals(data1, data2));
        
        ImageDescriptor createdImageFromData1 = ImageUtils.createImageFromData(data1);
        ImageDescriptor createdImageFromData2 = ImageUtils.createImageFromData(data2);
        assertEquals(createdImageFromData2, createdImageFromData1);
    }
    
    @Test
    public void testDisposeImages() {
        IImage icon = ECoreImage.PROCESS_ICON;
        ImageDescriptor imgDesc = ImageDescriptor.createFromFile(icon.getLocation(), icon.getPath());
        
        byte[] data1 = ImageUtils.saveImageToData(imgDesc);
        byte[] data2 = new byte[data1.length];
        System.arraycopy(data1, 0, data2, 0, data1.length);
        assertTrue(Arrays.equals(data1, data2));
        
        ImageDescriptor createdImageFromData1 = ImageUtils.createImageFromData(data1);
        ImageUtils.disposeImages(data2);
        ImageDescriptor createdImageFromData2 = ImageUtils.createImageFromData(data1);
        assertNotSame(createdImageFromData1, createdImageFromData2);
    }
}
