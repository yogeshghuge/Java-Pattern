class  Pattern
{
	public static void main(String args[])
	{
		int n=5;
	/*
		11111
		22222
		33333
		44444
		55555
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	*/

	/*
		55555
		44444
		33333
		22222
		11111

		for(int i=n; i>=1; i--)
		{
			for(int j=1; j<=n;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	*/

	/*
		12345
		12345
		12345
		12345
		12345


		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	*/

	/*
		54321
		54321
		54321
		54321
		54321

	
		for(int i=1; i<=n;i++)
		{
			for(int j=n; j>=1; j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	*/


         /*
		AAAAA
		BBBBB
		CCCCC
		DDDDD
		EEEEE
		
		for(int i=1; i<=n;i++)
		{
			for(int j=1; j<=n; j++)
			{
				System.out.print((char)(i+64));
			}
			System.out.println();
		}
	*/
	/*
		eeeee
		ddddd
		ccccc	
		bbbbb
		aaaaa
 
		for(int i=n; i>=1;i--)
		{
			for(int j=1; j<=n;j++)
			{
				System.out.print((char)(i+96));
			}
			System.out.println();
		}
	*/
		
	/*
		ABCDE
		ABCDE
		ABCDE
		ABCDE
		ABCDE
	
			for(int i=1; i<=n;i++)
			{
				for(int j=1; j<=n; j++)
				{	
					System.out.print((char)(j+64));
				}
				System.out.println();
			}	
	*/
	/*
		edcba
		edcba
		edcba
		edcba
		edcba
			for(int i=1; i<=n;i++)	
			{
				for(int j=n; j>=1;j--)
				{
					System.out.print((char)(j+96));
				}
				System.out.println();
			}
  	*/	
	
	}
}