/*
    O
   NM
  LKJ
 IHGF
EDCBA
*/

class P82
{
	public static void main(String args[])
	{
		int n=5;
		int count=(n*(n+1))/2;
		for(int i=1; i<=n;i++)
		{
			int c=count;
			for(int j=i; j<n; j++)
			{
				System.out.print(" ");
			}
			for(int j=i; j>=1; j--)
			{
				System.out.print((char)(c+64));
				c--;
			}
			System.out.println();
			count-=i;
		}
	}
}