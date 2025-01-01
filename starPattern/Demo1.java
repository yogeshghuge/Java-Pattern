/*
*****  *****  *****
*   *  *   *  *   *
*   *  *   *  *   *
*   *  *   *  *   *
*****  *****  *****

 *****  *****
 *   *  *   *
 *   *  *   *
 *   *  *   *
 *****  *****

*****  *****  *****
*   *  *   *  *   *
*   *  *   *  *   *
*   *  *   *  *   *
*****  *****  *****

 *****  *****
 *   *  *   *
 *   *  *   *
 *   *  *   *
 *****  *****

*****  *****  *****
*   *  *   *  *   *
*   *  *   *  *   *
*   *  *   *  *   *
*****  *****  *****
*/class Demo1
{
	public static void main(String args[])
	{
		int n=5;
		for(int l=1; l<=n;l++)
		{
			for(int k=1; k<=n;k++)
			{
				for(int j=1;j<=n;j++)
				{
					for(int i=1;i<=n;i++)
					{
						if((j%2!=0 && l%2!=0)||(j%2==0 && l%2==0))
							if(i==n||i==1 ||k==1 || k==n)
							System.out.print("*");
						else
							System.out.print(" ");
					}
					System.out.print(" "); 
				}
				System.out.println();
			}
			System.out.println();

		}
		
	}
}
