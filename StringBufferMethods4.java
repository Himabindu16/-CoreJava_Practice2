
public class StringBufferMethods4 {

	public static void main(String[] args) {

//		StringBuffer sb = new StringBuffer("abcdef");
//		sb.insert(2,"xyz");
//		System.out.println(sb);
//		sb.insert(11, 9);//StringIndexOutOfBoundsException
//		System.out.println(sb);
		
		StringBuffer sb = new StringBuffer("abcdefgh");
		System.out.println(sb.capacity());//24
		
		sb.insert(2,"xyz");
		System.out.println(sb);
		
		sb.insert(11, 9);
		System.out.println(sb);
		
	}

}
