package aritmetikai_operatorok;

public class aritm_Oper {

	public static void main(String[] args) {
		// aritmetikai oper�torok (+ - * / %'modulo' ++ --)
		//++=inkrement; --=dekrement
		int szam1 = 7;
		int szam2 = 5;
		int szam3 = szam1 + szam2; //osszeadas
		int szam4 = szam1 - szam2; //kivonas
		int szam5 = szam1 * szam2; //szorzas
		float szam6 = 7f / szam2; //osztas decim�lis sz�mhoz float
		int szam6b = 7 % 3;
		int szam7 = szam1 % szam2; //modulo - 
		int szam40 = 6 + 5 * 2; //(6 + 5) * 2
		
		System.out.println("Osszeadas: " + szam3);
		System.out.println("Kivonas: " + szam4);
		System.out.println("Szorzas: " + szam5);
		System.out.println("Osztas: " + szam6);
		System.out.println("Modulo mas ertekkel: " + szam6b);
		System.out.println("Modulo: " + szam7 + " a marad�k osztas utan");
		szam3++; //szam3 += 1 or szam3 = szam3 + 1;
		System.out.println("Osszeadas es inkrement: " + szam3);
		szam3--;
		System.out.println("Osszeadas es dekrement: " + szam3);
		//precedencia; �s aritmetika
		System.out.println("Precedencia: " + szam40);
		
		// �sszehasonlito operatorok (== > < != >= <= )
		szam2 = 3; //ez hozz�rendel�s, nem �sszet�vesztend� a == el!!!
		System.out.println();
		System.out.println("A szamaim: " + szam1 + "; " + szam2);
		System.out.println("Egynlok e: " + (szam1 == szam2));
		System.out.println("Nagyobb e: " + (szam1 > szam2));
		System.out.println("Kisebb e: " + (szam1 < szam2));
		System.out.println("Nemegyenlo e: " + (szam1 != szam2));
		System.out.println("Nagyobb vagy egyenlo e: " + (szam1 >= szam2));
		System.out.println("Kisebb vagy egyenlo e: " + (szam1 <= szam2));
		
		// logikai operatorok (&&-and; ||-or; !-not)
		
		System.out.println(szam1 != szam2 && szam1 > szam2); //igaz
		System.out.println(szam1 != szam2 && szam1 < szam2); //hamis
		System.out.println(szam1 != szam2 || szam1 < szam2);
		
		//Single line comment
		
		/* multi line comment
		 * 
		 * true && true = true - and
		 * false && false = false
		 * true && false = false
		 * false && true = false
		 * 
		 * false || false = false - or
		 * false || true = true
		 * true || false = true
		 * true || true = true
		 *
		 */
		
		
		
		//bitv�jsz oper�torok ()
	}

}
