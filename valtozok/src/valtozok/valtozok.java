package valtozok;

public class valtozok {

	public static void main(String[] args) {
		//primitive types:
		byte totiByte =127;  //-128 ... 127
		short totiShort = 32767;  //-32,768 ... 32,767
		int totiInt = 2147483647; //-2,147,483,648 ... 2,147,483,647
		long totiLong = 9223372036854775807L; //-9,223,372,036,854,775,808 ... 9,223,372,036,854,775,807 
		long TotiLong = 9223372036854775807l; // ugyan az kis L-el a végén
		float totiFloat = 3.14654875f; //3.40282347 X 10_38-ikon ... 1.40239846 X 10_(-)45-iken Végére: f, F
		double totiDouble = 5.87264646464464646464646446464646464; //1.79 X 10_308-ikon ... 4.94 X 10_(-)324-iken.
		boolean totiBool = true; //false
		char totiChar = '\u0041';
		
		String totiString = "Alma"; //Ez nem primitive type!!! Javaobjektum, javaclass(javaosztály)
		
		System.out.println(totiByte);
		System.out.println(totiShort);
		System.out.println(totiInt);
		System.out.println(totiLong);
		System.out.println(TotiLong);
		System.out.println(totiFloat);
		System.out.println(totiDouble);
		System.out.println(totiBool);
		System.out.println(totiChar);
		
		System.out.println(totiString);
		System.out.println("Jaj de gyönyörû vagy te " + totiString); //String concatenation
		
		// -> /=ForwardSlash; _=UnderScore
		
	}

}
