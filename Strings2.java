
public class Strings2 {

	public static void main(String[] args) {
		
		String s1 = "Alien";//s1 and s2 same memory, so true
		String s2 = "Alien";
		
		String s3 = new String("Alien");
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
	}

}
