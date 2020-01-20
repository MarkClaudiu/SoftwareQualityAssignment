import static org.junit.Assert.*;

import org.junit.Test;

public class PisicaTest {

	@Test
	public void test() {
		String nume = "Linda";
		Pisica pisica = new Pisica(nume);
		assertEquals(nume,pisica.getNume());
	}

}
