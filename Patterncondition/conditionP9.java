/*
A2345
A2344
A2333
A2222
AAAAA
*/

class conditionP9
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n; i>=1; i--)
		{
			for(int j=1; j<=n;j++)
			{
				if(i==1 || j==1)
					System.out.print("A");
				else if(i<j)
				{
					System.out.print(i);
				}
				else
				{
					System.out.print(j);
				}
			}
			System.out.println();
		}
	}
}