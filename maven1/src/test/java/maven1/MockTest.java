package maven1;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
public class MockTest {
	TDDExp obj;
	
	@Before
	public void setUp() {
		obj = mock(TDDExp.class);
	}
	
	@Test
	public void testSquare() {
		when(obj.square(3)).thenReturn(34);
	}
	

}
