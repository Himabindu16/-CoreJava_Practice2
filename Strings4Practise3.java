
public class Strings4Practise3 {

	public static void main(String[] args) {
				
		String s1="GloBAl";
		String s2="";
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='a'&&s1.charAt(i)<='z') 
			{
				s2=s2+(char)(s1.charAt(i)-32);
			}
			else
			{
				s2=s2+(char)(s1.charAt(i)+32);
			}
		}
		System.out.println(s2);
	}
}
