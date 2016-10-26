package uebung_3_4;

public class Binomialkoeffizienten {

	public static void main(String[] args) {
		double n= 7;
		double k= 6; 	
		double zaehler = 2;
		double fakultaetn = 1;
		double fakultaetk = 1;
		double fakultaetnk= 1;

		for (zaehler = 2; zaehler <= n; zaehler++) {
			fakultaetn = fakultaetn * zaehler;}
		
		for (zaehler = 2; zaehler <= k; zaehler++) {
			fakultaetk = fakultaetk * zaehler;}
		
		for (zaehler = 2; zaehler <= (n-k); zaehler++) {
			fakultaetnk = fakultaetnk * zaehler;}

		
		double Binomialkoeffizienten = (fakultaetn / (fakultaetk*fakultaetnk));
		
		
					
				System.out.println(Binomialkoeffizienten);
				System.out.println(fakultaetn);
				System.out.println(fakultaetk);

		
	}

}
