import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteCantitateComandataProdus {

	Produs produsComandat;
	int cantitateComandata = 10;
	int stocProdus = 9;
	String numeProdus = "produsComandat";
	
	
	@Before
	public void setUp() throws Exception {
		produsComandat = new Produs(stocProdus, cantitateComandata, numeProdus);
	}

	@Test
	public void test() {
		try{
			produsComandat.stocVsCantitateComandata();
			fail("Nu se remarca problemele stoc-cantitate comandata. Testul ar fi trebuit sa pice ");
		}catch(Exception er){
			
		}
	}

}
