import static org.junit.Assert.*;

import org.junit.Test;

public class DovleacTest {

	@Test
	public void test() {
		int greutate = 100;
		Dovleac d = new Dovleac(greutate);
		assertEquals(greutate, d.getGreutate());
	}

}
