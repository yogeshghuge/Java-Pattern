/*
AAAAA
BBBBB
CCCCC
DDDDD
EEEEE
*/

class P5
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1; j<=5; j++)
			{
				System.out.print((char)(i+64));
			}
			System.out.println();
		}
	}
}