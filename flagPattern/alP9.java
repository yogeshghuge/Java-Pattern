/*
A
Ab
AbC
AbCd
AbCdE
AbCd
AbC
Ab
A
*/

class alP9
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1; i<=(n*2)-1;i++)
		{
			if(i<=n)
			{
				for(int j=1;j<=i;j++)
				if(j%2!=0)
					System.out.print((char)(j+64));
				else
					System.out.print((char)(j+96));
			}
			else
			{
				for(int j=1; j<=(n*2)-i;j++)
				if(j%2!=0)
					System.out.print((char)(j+64));
				else
					System.out.print((char)(j+96));

			}

			System.out.println();
		}
	}
}