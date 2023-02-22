
public class Strings4Practise8 {

	public static void main(String[] args) {

		String s1="think twice";
		String s2 ="";
		
		String a[]= s1.split(" ");
		
		for(int i=a.length-1;i>=0;i--) 
		{
			for(int i1=s1.length()-1;i1>=0;i1--)
			{
				
				s2=s2+s1.charAt(i1)+a[i]+" ";
			}

			//s2=s2+a[i]+" ";
		}
		System.out.println(s2);
		
			
			
//		for(int i=s1.length()-1;i>=0;i--)
//		{
//			
//			s2=s2+s1.charAt(i);
//		}
//		System.out.println(s2);
		

		
			//“kniht eciwt”
	}

}
