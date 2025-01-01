class triangle
{
	public static void main(String args[])
	{
		int n=5;
	/*
		1
		22
		333
		4444
		55555
				
		for(int i=1;i<=n;i++)
		{
			for(int j=i; j>=1;j--)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	*/


/*
5
44
333
2222
11111

	for(int i=n; i>=1;i--)
	{
		for(int j=i;j<=n;j++)
		{
			System.out.print(i);
		}
		System.out.println();
	}
	
*/
	/*

		1
		12
		123
		1234
		12345


		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	*/
/*
1
21
321
4321
54321
		for(int i=1; i<=n;i++)
		{
			for(int j=i; j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
*/
	/*
	5
	54
	543
	5432
	54321

		for(int i=n;i>=1;i--)
		{
			for(int j=n; j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	*/

/*
5
45
345
2345
12345
		for(int i=n;i>=1;i--)
		{
			for(int j=i; j<=n;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
*/
	/*
		A
		BB
		CCC
		DDDD
		EEEEE	


		for(int i=1;i<=n;i++)
		{
			for(int j=i; j>=1; j--)
			{
				System.out.print((char)(i+64));
			}
			System.out.println();
		}
	*/
	/*
		e
		dd
		ccc
		bbbb
		aaaaa


		for(int i=n;i>=1;i--)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print((char)(i+96));
			}
			System.out.println();
		}
	*/



/*
A
AB
ABC
ABCD
ABCDE
		for(int i=1;i<=n;i++)
		{
			for(int j=1; j<=i;j++)
			{
				System.out.print((char)(j+64));
			}
			System.out.println();
		}
*/

	/*
		a
		ba
		cba
		dcba
		edcba

		for(int i=1;i<=n;i++)
		{
			for(int j=i; j>=1;j--)
			{
				System.out.print((char)(j+96));
			}
			System.out.println();
		}
	*/
	
		for(int i=n;i>=1;i--)
		{
			for(int j=n; j<=i;j++)
			{
				System.out.print((char)(i+64));
			}
			System.out.println();
		}
	}
}
	