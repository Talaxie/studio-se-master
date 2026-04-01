package routines.system;

import junit.framework.TestCase;

import org.junit.Test;

public class JSONObjectTest extends TestCase {
	
	public class Bean {
		public int id;
		public String Name;
		
		public int getId() {
			return this.id;
		}
		
		public String getName() {
			return this.Name;
		}
		
		public Bean(int id,String name) {
			this.id = id;
			this.Name = name;
		}
	}
	
	public class EvilBean {
		public int id;
		
		public int getId() {
			//do something evil
			return this.id;
		}
		
		public EvilBean(int id) {
			this.id = id;
		}
	}
	
	@Test
	public void test() throws JSONException {
		Bean bean = new Bean(1,"wangwei");
		JSONObject object = new JSONObject(bean, Bean.class);
		
		assertEquals(false, object.isNull("id"));
		assertEquals(1, object.get("id"));
		
		assertEquals(true, object.isNull("name"));
		assertEquals(false, object.isNull("Name"));
		assertEquals("wangwei", object.get("Name"));
	}

	@Test
	public void testScriptInject() {
		EvilBean evil = new EvilBean(1);
		try {
			new JSONObject(evil, Bean.class);
			fail();
		} catch(JSONException e) {
		}
	}
	
}