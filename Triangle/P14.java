/*
5
45
345
2345
12345
*/

class P14
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n; i>=1; i--)
		{
			for(int j=i; j<=n; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
