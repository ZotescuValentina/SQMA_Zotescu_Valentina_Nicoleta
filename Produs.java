import java.util.ArrayList;

public class Produs {

	ArrayList<Integer> noteProdus = null;
	String numeProdus = null;
	int stocProdus; 
	int cantitateComandata; 
	
	public Produs(ArrayList<Integer> noteProdus, String numeProdus) {
		this.noteProdus = noteProdus;
		this.numeProdus = numeProdus;
	}
	
	public Produs(int stocProdus, int cantitateComandata, String numeProdus) {
		this.stocProdus = stocProdus;
		this.cantitateComandata = cantitateComandata; 
		this.numeProdus = numeProdus;
		
	}
	
	
	
	public int NotaMedieProdus() {
		int medie=0;
		
		for(int i=0; i< this.noteProdus.size(); i++) {
			medie+=this.noteProdus.get(i);
			
		}
		
		medie/=this.noteProdus.size();
		return medie;
		
	}
	
	public void stocVsCantitateComandata() throws Exception {
		
		if(stocProdus < cantitateComandata) throw new Exception();
		
		System.out.println("Produsul poate fi comandat intrucat stocul este > decat cantitatea comandata");
		
		
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> noteProdus = new ArrayList<Integer>();
		noteProdus.add(10);
		noteProdus.add(8);
		noteProdus.add(7);
		Produs produs = new Produs(noteProdus, "produsNotat");
		int ratingMediu = produs.NotaMedieProdus();
		System.out.println(ratingMediu + " ");
		
	}
	
}

