
public class StringBufferMethods1 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("abcdefghijklmnop");
		System.out.println(sb.capacity());
		sb.append("q");
		System.out.println(sb.capacity());
		sb.append("rstuvwxyz");
		System.out.println(sb.capacity());

	}
}
