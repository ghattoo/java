package ha;

public class hagyakorlas {

	public static void main(String[] args) {
		//int eletkor = 0;
		//int eletkor = -2;
		//int eletkor = 1;
		//int eletkor = 5;
		//int eletkor = 9;
		//int eletkor = 16;
		int eletkor = 18;
		boolean sor = true;
		//boolean sor = false;
		
		//{}
		if (eletkor <= 0) { 
			System.out.println("M�g meg sem sz�lett�l");
			System.out.println(", de m�r �ton vagy"); //sysout -> ctrl+space!!!
		}
		
		else if (eletkor > 0 && eletkor < 5) // igaz && igaz miatt
			System.out.println("Kicsi baba vagy!");
		
		else if (eletkor >= 5 && eletkor < 8)
			System.out.println("Tudsz egyed�l pisilni");
		
		else if (eletkor >= 8 && eletkor < 15)
			System.out.println("M�r suliba j�rsz");
		
		else if (eletkor >= 15 && eletkor < 18)
			System.out.println("M�r csajozol, de m�g nem pi�lhatsz");
		
		else {
			
			System.out.println("Nagykor� vagy, ihatsz s�rt meg p�link�t is");
			
			if (sor)
				System.out.println("Csapos hozz�l s�rt!");
			else
				System.out.println("Ink�bb p�link�t hozz!");
			
		}
	}

}
