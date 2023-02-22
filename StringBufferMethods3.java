
public class StringBufferMethods3 {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());//16
		sb.append("The value of PIE is :: ");
		sb.append(3.1414);
		sb.append(", This is exactly :: ");
		sb.append(true);
		System.out.println(sb);
		System.out.println(sb.capacity());
		
	}

}
