/*
AbCdE
 AbCd
  AbC
   Ab
    A
   Ab
  AbC
 AbCd
AbCdE
*/

class alpSpace9
{
	public static void main(String arg[])
	{
		int n=5;
		for(int i=1;i<=(n*2)-1;i++)
		{
			if(i<=n)
			{
				for(int j=i; j>1; j--)
					System.out.print(" ");
				for(int j=1; j<=n-i+1;j++)
				
					if(j%2!=0)
						System.out.print((char)(j+64));
					else
						System.out.print((char)(j+96));
			}
			else
			{
				for(int j=i; j<(n*2)-1; j++)
					System.out.print(" ");
				for(int j=1; j<=i-n+1;j++)

					if(j%2!=0)
						System.out.print((char)(j+64));
					else
						System.out.print((char)(j+96));
			}
			System.out.println();
		}
	}
}