/*
12345
 2345
  345
   45
    5
*/

class P48
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1; i<=n;i++)
		{
			for(int j=1; j<i; j++)
			{
			 	System.out.print(" ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}