/*
EEEEE
4444E
3334E
2234E
1234E
*/

class condition10
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n; i>=1; i--)
		{
			for(int j=1; j<=n; j++)
			{
				if(i==5 || j==5)
					System.out.print("E");

				else if(i<j)
					System.out.print(j);
				else
					System.out.print(i);
			}
			System.out.println();
		}
	}
}
