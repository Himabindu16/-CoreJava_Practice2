
public class Immutable_Strings5 {

	public static void main(String[] args) {
		
		String s1="Telusko" + "iNeuron";
		System.out.println(s1);	//TeluskoiNeuron
		
		String s2="Telusko" + 99;
		System.out.println(s2);	//Telusko99
		
		String s3="Telusko" + 99 + 99 + 10;
		System.out.println(s3);	//Telusko999910
		
		String s4=10 + 4 + "Telusko";
		System.out.println(s4);	//14Telusko
		
	}

}
