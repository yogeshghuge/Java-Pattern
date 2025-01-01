/*
1
2
3
1
5
6
7
2
9
10
11
3
*/

class impDemo2
{
	public static void main(String args[])
	{
		for(int i=1; i<=12; i++)
		{
		/*	
			if(i%4==0)
			{
				System.out.println(i/4);
			}	
			else
				System.out.println(i);
		*/

			System.out.println((i%4==0)?i/4:i);
		
		}
	}
}