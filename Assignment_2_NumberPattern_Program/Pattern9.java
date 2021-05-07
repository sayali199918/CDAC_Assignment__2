public class Pattern9
{
	public static void main(String[] args)
	{
		int alpha=64;
		for (int i = 1; i <= 5; i++) 
            { 
             for (int j = 5; j > i; j--)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++)
			{
				System.out.print((char)(alpha+k) + " ");
			}
			System.out.println();
		}
	}
}