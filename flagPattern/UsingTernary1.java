/*
EdCbA
dCbA
CbA
bA
A
bA
CbA
dCbA
EdCbA
*/

class  UsingTernary1
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1; i<=(n*2)-1;i++)
		{
			if(i<=n)
				for(int j=n-i+1; j>=1;j--)
					System.out.print((char)(j+((j%2!=0)?64:96)));
			else
				for(int j=i-n+1; j>=1; j--)
					System.out.print((char)(j+((j%2!=0)?64:96)));
			System.out.println();
		}
	}
}