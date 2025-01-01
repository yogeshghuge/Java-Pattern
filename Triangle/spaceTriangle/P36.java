/*
    1
   21
  321
 4321
54321
*/

class P36
{
	public static void main(String argss[])
	{
		int n=5;
		for(int i=1; i<=n;i++)
		{
			for(int j=i; j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=i; j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
		