import java.util.*; 
class Indexfind
{
	public static void main (String[] args)
	{
		
		Scanner input=new Scanner(System.in);
	 
		String  str=Integer.toBinaryString(input.nextInt());
		  
			 
			 String str1="";
			for(int j=str.length()-1;j>=0;j--)
			{
				 str1=str1+str.charAt(j);
			}
			for(int j=0;j<str1.length();j++)
			{
				if(str1.charAt(j)=='1')
				{
					System.out.print(j+1);
					break;
				}
			}


		input.close();
	}
}	
