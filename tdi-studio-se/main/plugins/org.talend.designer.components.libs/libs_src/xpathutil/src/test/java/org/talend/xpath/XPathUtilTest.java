package org.talend.xpath;

import junit.framework.TestCase;
import org.junit.Test;
import java.util.List;
import java.util.ArrayList;

public class XPathUtilTest extends TestCase {

	private static List<String> defualtNSPath = new ArrayList<String>();
	
	static {
		defualtNSPath.add("/root");
		defualtNSPath.add("/root/loop/a/b");
	}
	
	@Test
	public void testWithoutDefaultNamespace1() {
		XPathUtil util = new XPathUtil();
		assertEquals("/root/loop",util.addDefaultNSPrefix("/root/loop"));
	}
	
	@Test
	public void testWithoutDefaultNamespace2() {
		XPathUtil util = new XPathUtil();
		assertEquals("id",util.addDefaultNSPrefix("id","/root/loop"));
	}
	
	@Test
	public void testWithoutDefaultNamespace3() {
		XPathUtil util = new XPathUtil();
		assertEquals("@id",util.addDefaultNSPrefix("@id","/root/loop"));
	}
	
	@Test
	public void testWithoutDefaultNamespace4() {
		XPathUtil util = new XPathUtil();
		assertEquals("u_id",util.addDefaultNSPrefix("u_id","/root/loop"));
	}
	
	@Test
	public void testWithoutDefaultNamespace5() {
		XPathUtil util = new XPathUtil();
		assertEquals(".",util.addDefaultNSPrefix(".","/a/b/c/d"));
	}
	
	@Test
	public void testWithoutDefaultNamespace6() {
		XPathUtil util = new XPathUtil();
		assertEquals("..",util.addDefaultNSPrefix("..","/a/b/c/d"));
	}
	
	@Test
	public void testWithoutDefaultNamespace7() {
		XPathUtil util = new XPathUtil();
		assertEquals("../e/@_f",util.addDefaultNSPrefix("../e/@_f","/a/b/c/d"));
	}
	
	@Test
	public void testWithoutDefaultNamespace8() {
		XPathUtil util = new XPathUtil();
		assertEquals("../../e",util.addDefaultNSPrefix("../../e","/a/b/c/d"));
	}
	
	@Test
	public void testWithoutDefaultNamespace9() {
		XPathUtil util = new XPathUtil();
		assertEquals("/a/b/c/d/*[name()]",util.addDefaultNSPrefix("/a/b/c/d/*[name()]"));
	}
	
	@Test
	public void testWithoutDefaultNamespace10() {
		XPathUtil util = new XPathUtil();
		assertEquals(".",util.addDefaultNSPrefix(".","/a/b/c/d/*[name()]"));
	}
	
	@Test
	public void testWithoutDefaultNamespace11() {
		XPathUtil util = new XPathUtil();
		assertEquals(".",util.addDefaultNSPrefix(".","."));
	}
	
	@Test
	public void testWithoutDefaultNamespace12() {
		XPathUtil util = new XPathUtil();
		assertEquals("/",util.addDefaultNSPrefix("/"));
	}
	
	@Test
	public void testWithoutDefaultNamespace14() {
		XPathUtil util = new XPathUtil();
		assertEquals(".",util.addDefaultNSPrefix(".","/"));
	}
	
	@Test
	public void test1() {
		XPathUtil util = new XPathUtil();
		util.setDefaultNSPath(defualtNSPath);
		assertEquals("pre0:root/pre0:loop",util.addDefaultNSPrefix("/root/loop"));
	}
	
	@Test
	public void test2() {
		XPathUtil util = new XPathUtil();
		util.setDefaultNSPath(defualtNSPath);
		assertEquals("pre0:id",util.addDefaultNSPrefix("id","/root/loop"));
	}
	
	@Test
	public void test3() {
		XPathUtil util = new XPathUtil();
		util.setDefaultNSPath(defualtNSPath);
		assertEquals("pre0:person[@name='wangwei']/pre0:Value",util.addDefaultNSPrefix("person[@name='wangwei']/Value","/root/loop"));
	}
	
	@Test
	public void test4() {
		XPathUtil util = new XPathUtil();
		util.setDefaultNSPath(defualtNSPath);
		assertEquals("pre0:person[@name='wangwei']/pre0:Value",util.addDefaultNSPrefix("person[@name='wangwei']/Value","/root/loop"));
	}
	
	@Test
	public void test5() {
		XPathUtil util = new XPathUtil();
		util.setDefaultNSPath(defualtNSPath);
		assertEquals("pre0:person[@name=\"wangwei\"]/pre0:Value",util.addDefaultNSPrefix("person[@name=\"wangwei\"]/Value","/root/loop"));
	}
	
	@Test
	public void test6() {
		XPathUtil util = new XPathUtil();
		util.setDefaultNSPath(defualtNSPath);
		assertEquals("pre0:person[@name=\"wangwei\"]/pre0:Value",util.addDefaultNSPrefix("person[@name=\"wangwei\"]/Value","/root/loop"));
	}
	
	@Test
	public void test7() {
		XPathUtil util = new XPathUtil();
		util.setDefaultNSPath(defualtNSPath);
		assertEquals("pre0:person[@name='{wang.wei}']/pre0:Value",util.addDefaultNSPrefix("person[@name='{wang.wei}']/Value","/root/loop"));
	}
	
	@Test
	public void test8() {
		XPathUtil util = new XPathUtil();
		util.setDefaultNSPath(defualtNSPath);
		assertEquals("pre0:person/pre0:id/..",util.addDefaultNSPrefix("person/id/..","/root"));
	}
	
	@Test
	public void test9() {
		XPathUtil util = new XPathUtil();
		util.setDefaultNSPath(defualtNSPath);
		assertEquals("pre0:a/pre1:b/pre1:c/pre1:d",util.addDefaultNSPrefix("a/b/c/d","/root/loop"));
	}
	
	@Test
	public void test10() {
		XPathUtil util = new XPathUtil();
		util.setDefaultNSPath(defualtNSPath);
		assertEquals("pre0:root/pre0:loop/pre0:a/pre1:b/pre1:c",util.addDefaultNSPrefix("/root/loop/a/b/c"));
	}
	
	@Test
	public void test11() {
		XPathUtil util = new XPathUtil();
		util.setDefaultNSPath(defualtNSPath);
		assertEquals("pre0:root/pre0:loop/pre0:a/pre1:b[@name='{wang.wei}']/pre1:c",util.addDefaultNSPrefix("/root/loop/a/b[@name='{wang.wei}']/c"));
	}
	
	@Test
	public void test12() {
		XPathUtil util = new XPathUtil();
		util.setDefaultNSPath(defualtNSPath);
		assertEquals("pre0:root/pre0:loop/pre0:a/pre1:b/pre1:c",util.addDefaultNSPrefix("root/loop/a/b/c","."));
	}
	
	@Test
	public void test14() {
		XPathUtil util = new XPathUtil();
		util.setDefaultNSPath(defualtNSPath);
		assertEquals("pre0:root/pre0:loop/pre0:a/pre1:b/pre1:c",util.addDefaultNSPrefix("root/loop/a/b/c","/"));
	}
	
	@Test
	public void test15() {
		XPathUtil util = new XPathUtil();
		util.setDefaultNSPath(defualtNSPath);
		assertEquals("/",util.addDefaultNSPrefix("/"));
	}
	
	@Test
	public void test16() {
		XPathUtil util = new XPathUtil();
		util.setDefaultNSPath(defualtNSPath);
		assertEquals(".",util.addDefaultNSPrefix(".","/"));
	}
	
	@Test
	public void test17() {
		XPathUtil util = new XPathUtil();
		util.setDefaultNSPath(defualtNSPath);
		assertEquals("pre0:root//pre0:loop",util.addDefaultNSPrefix("/root//loop"));
	}
	
	@Test
	public void test18() {
		XPathUtil util = new XPathUtil();
		util.setDefaultNSPath(defualtNSPath);
		assertEquals("pre0:a//pre0:b",util.addDefaultNSPrefix("/a//b","/root/loop"));
	}
	
}