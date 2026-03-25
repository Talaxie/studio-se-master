package org.talend.msg.utils;

import org.apache.poi.hsmf.exceptions.ChunkNotFoundException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;

public class MsgMailUtilTest {

	@Rule
	public TemporaryFolder folder = new TemporaryFolder();

	@Test
	public void test() throws IOException, ChunkNotFoundException {
		File outDir = folder.newFolder("out");

		MsgMailUtil msgMailUtil_tFileInputMail_1 = new MsgMailUtil(this.getClass().getClassLoader().getResource("test.msg").getPath(),
				outDir.getAbsolutePath());

		msgMailUtil_tFileInputMail_1.getAttachments();

		Assert.assertEquals("Chaudhari,Pankaj", msgMailUtil_tFileInputMail_1.processMessage("From"));
	}

}