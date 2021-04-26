package maven1;
import static org.junit.Assert.assertEquals;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
  
public class TDDTest {
	TDDExp obj;
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}
	@Before
	public void setUp() {
		System.out.println("Before test");
		obj = new TDDExp();
	}
	@After
	public void setDown() {
		System.out.println("After test");
		obj = null;
	}
	@Test
	public void squareTest1() {
		System.out.println("Test1 method");
		assertEquals(16,obj.square(4));
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
	

}
