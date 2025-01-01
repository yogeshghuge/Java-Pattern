/*
    e
   dd
  ccc
 bbbb
aaaaa

*/

class P40
{
	public static void main(String arg[])
	{
		int n=5;
		for(int i=n; i>=1;i--)
		{
			for(int j=1; j<i; j++)
			{
				System.out.print(" ");
			}
			for(int j=i; j<=n;j++)
			{
				System.out.print((char)(i+96));
			}
			System.out.println();
		}
	}
}