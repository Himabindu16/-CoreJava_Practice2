
public class StringBufferMethods5 {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("sachinrameshtendulkar");
		System.out.println(sb.capacity());//21+16=37
		System.out.println(sb.length());//21
		
		System.out.println("*******************");
		
		sb.delete(6, 12);
		System.out.println(sb);//sachintendulkar
		
		sb.deleteCharAt(6);
		System.out.println(sb);//sachinendulkar
	
		sb.deleteCharAt(21);
		System.out.println(sb);//StringIndexOutOfBoundsException
	
	}
}
