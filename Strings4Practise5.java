
public class Strings4Practise5 {

	public static void main(String[] args) {

		String s3="Think Twice";
		String s4="";
		
		String a[]=s3.split(" ");
		
		for(int i=a.length-1;i>=0;i--)
		{
			s4=s4+a[i]+" ";
		}
		System.out.println(s4);
	}

}
