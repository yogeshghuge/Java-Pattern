/*

*
 *
  *
   *
    *
    *
   *
  *
 *
*

*/

class starHw7
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1; i<=n;i++)
		{
			for(int j=1; j<=n;j++)
				System.out.print((i==j)?"*":" ");

			
			System.out.println();
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
				System.out.print((j==n)?"*":" ");						System.out.println();
		}

	}
}