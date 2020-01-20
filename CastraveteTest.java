import static org.junit.Assert.*;

import org.junit.Test;

public class CastraveteTest {

	@Test
	public void test() {
		int greutate = 100;
		Castravete c = new Castravete(greutate);
		assertEquals(greutate, c.getGreutate());
	}

}
