
public class StringBufferMethods9 {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		
		sb.ensureCapacity(10000);
		System.out.println(sb.capacity());

	}
}
