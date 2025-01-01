/*
*****
   *
  *
 *
******
*/

class starHw12
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1; i<=n;i++)
		{
			for(int j=i; j<=n;j++)
				System.out.print((j==n|| i==1)?"*":" ");
			for(int j=1; j<=n;j++)
				System.out.print((i==n)?"*":" ");

			System.out.println();
		}
	}
}