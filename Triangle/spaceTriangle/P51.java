/*
AAAAA
BBBB
CCC
DD
E
*/

class P51
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i; j>n;j--)
			{
				System.out.print(" ");
			}
			for(int j=n; j>=i; j--)
			{
				System.out.print((char)(i+64));
			}
			System.out.println();
		}
	}
}