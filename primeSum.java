import java.util.*;
class oddCaps
{
	 
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		ArrayList<Integer> re=new ArrayList<Integer>();
		for(int i=2;i<n;i++)
		{
			int flag=0;
				for(int j=2;j<i;j++)
				{
					 
					
					if(i%j==0)
					{
						flag++;
					}
				 
				}
				if(flag==0)
				{
					re.add(i);
				}
		}
			 
				for(int i=0;i<re.size();i++)
					{	
						int sum=0;
						for(int j=0;j<re.size();j++)
						{	
							if(i!=j)
							{
								sum=re.get(i)+re.get(j);
								if(sum==n)
								{
									System.out.print(re.get(i)+" "+re.get(j));
									
									i=re.size();
									break;
									
								}
							}
						}
					}
	}
}
