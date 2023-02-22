
public class Strings5 {

	public static void main(String[] args) {

		String s1 ="Alien";
		String s2 ="alien";
		String s3 = new String("Alien");
		System.out.println(s1==s2);//case sensitivity
		System.out.println(s1==s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));// ignore cases
		
	}

}
