
public class Strings4Practise4 {

	public static void main(String[] args) {

		String s1="iNeuron";
		String s2="";
		//int i;
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}
		System.out.println(s2);
		

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
