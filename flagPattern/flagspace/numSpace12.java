/*
 12345
  2345
   345
    45
     5
    45
   345
  2345
 12345
*/

class numSpace12
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1; i<=(n*2)-1; i++)
		{
			if(i<=n)
			{
				for(int j=i; j>=1;j--)
					System.out.print(" ");
				for(int j=i; j<=n; j++)
					System.out.print(j);
			}
			else
			{
				for(int j=i;j<=(n*2)-1;j++)
					System.out.print(" ");
				for(int j=(n*2)-i;j<=n;j++)
					System.out.print(j);
			}
			System.out.println();
		}
	}
}