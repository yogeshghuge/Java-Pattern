/*
*********

*   *   *

*   *   *

*********

*   *   *

*   *   *

*********

*/
class starHw10
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1; i<=(n*2)-1;i++)
			System.out.print("*");
		System.out.println();
		
		for(int j=1; j<=n;j++)
		{
			for(int k=1; k<=(n*2)-1;k++)
			{
				if((k==1 || k==n || k==(n*2)-1)&& (j%2==0))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		for(int i=1; i<=(n*2)-1;i++)
			System.out.print("*");
		System.out.println();
		
		for(int j=1; j<=n;j++)
		{
			for(int k=1; k<=(n*2)-1;k++)
			{
				if((k==1 || k==n || k==(n*2)-1)&& (j%2==0))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		for(int i=1; i<=(n*2)-1;i++)
			System.out.print("*");
		System.out.println();

	
	}
}
