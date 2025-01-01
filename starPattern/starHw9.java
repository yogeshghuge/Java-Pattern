/*
     *
    * *
   *   *
  *     *
 *       *
 *       *
  *     *
   *   *
    * *
     *
*/

class starHw9
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1; i<=n;i++)
		{
			for(int j=i; j<=n;j++)
				System.out.print(" ");
			System.out.print("*");
		
			if(i!=1)
			{
				for(int j=1; j<=(i*2)-3;j++)
					System.out.print(" ");
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n; i>=1;i--)
		{
			for(int j=i; j<=n;j++)
				System.out.print(" ");
			System.out.print("*");
		
			if(i!=1)
			{
				for(int j=1; j<=(i*2)-3;j++)
					System.out.print(" ");
				System.out.print("*");
			}
			System.out.println();
		}

	}
}