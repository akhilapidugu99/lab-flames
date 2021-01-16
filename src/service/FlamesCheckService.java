package service;

// Create a class called FlamesCheckService
// FlamesCheckService has a method findFlames to find the flames between two names
// char findFlames(String name1, String name2) takes two strings as arguments
// Your task is to calculate the flames value and return the corresponding character as output 
// You must return only the following values ['f','l','a','m','e','s']
// change the return value at the end of the method corresponding to your return value



public class FlamesCheckService{
	public char findFlames(String name1,String name2) {
		
		StringBuffer s1=new StringBuffer(name1);
		StringBuffer s2=new StringBuffer(name2);
		
		char c,d,e='\0';
		for(int i=0;i<s1.length();i++)
		{
			c=s1.charAt(i);
			for(int j=0;j<s2.length();j++)
			{
				d=s2.charAt(j);
				if(c==d)
				{
					s1.deleteCharAt(i);
					s2.deleteCharAt(j);
					i--;
					j--;
					break;
				}
			}
		}
		s1=s1.append(s2);
		int n=6,l=0;
		String s3="flames";
		while(n>1)
		{
			for(int m=1;m<s1.length();m++)
			{
				if(s3.charAt(l)!='x')
				{
					l++;
					if(l==6)
					l=0;
				}
				else
				{
					l++;
					if(l==6)
					l=0;
					m--;
				}
			}
			while(s3.charAt(l)=='x')
			{
				l++;
				if(l==6)
				l=0;
			}
			s3=s3.substring(0,l)+"x"+s3.substring(l+1);
			n--;
		}
		
		for(int i=0;i<s3.length();i++)
		{
			if(s3.charAt(i)!='x')
			e=s3.charAt(i);
		}
		return e;		
	}
}