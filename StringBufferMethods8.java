
public class StringBufferMethods8 {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer(1000);
		System.out.println(sb.capacity());
		sb.append("iNeuron");
		System.out.println(sb.capacity());
	}

}
