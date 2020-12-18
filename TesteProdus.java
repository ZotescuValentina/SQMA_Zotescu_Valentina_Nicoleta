import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class TesteProdus {
	
	
	ArrayList<Integer> noteProdus;
	Produs produsNotat;
	
	

	@Before
	public void setUp() throws Exception {
		noteProdus = new ArrayList<Integer>();
		noteProdus.add(10);
		noteProdus.add(10);
		noteProdus.add(10);
		noteProdus.add(8);
		noteProdus.add(8);
		noteProdus.add(6);
		noteProdus.add(7);
		noteProdus.add(7);

		produsNotat = new Produs(noteProdus, "produsNotat");
				
	}

	@Test
	public void testNota() {
		int rezultat=produsNotat.NotaMedieProdus();
		int rezultatAsteptat=8;
		assertEquals(rezultatAsteptat, rezultat);
	}
	
	

}
