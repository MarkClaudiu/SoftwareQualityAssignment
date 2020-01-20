import static org.junit.Assert.*;

import org.junit.Test;

public class CaineTest {

	@Test
	public void testSetNume() {
		String nume = "Azorel";
		Caine caine = new Caine(nume);
		assertEquals(nume,caine.getNume());
	}

}
