/*
 * PowerRe.java
 * Recursion challenges for HigherLevel Computer science
 * 
 */


public class PowerRe 
{
	static double power(int x, int y)
	{
		double c;
		if (y>0)
		{
			return (x * power(x,y-1));
		}
		else if (y<0)
		{
			return (x* power(x,y+1));
			//c = (x * power(x,y+1));
			//System.out.println(c);
			//return (1.0/c);
		}
		else
		{	
			return 1;
		} 
	}
	static int multi(int x, int y)
	{
		if (y>0)
		{
			return x + multi(x,y-1);
		}
		else
		{
			return 0;
		}
	}
	static void binry(int n)
	{
		if (n == 0)
		{
			System.out.println("");
		}
		else
		{
			//return g;
			binry(n/2);
		}
		System.out.print(n%2);
	}
	static void tri(int n)
	{
		int k = 0;
		if (n != 0)
		{
			for (int i = 0 ; i < n ; i++)
			{
				for (int c = 1 ; c < i+2 ; c++)
				{
					System.out.print("*");
					k++;
				}
				System.out.println(" ");
			}
			System.out.println(k);
			System.out.println("---------------");
			tri(n-1);
		}
		else if ( n == 0 )
		{
			System.out.println("Don work man");
		}
		else
		{
			System.out.println("*");
			System.out.println("1");
		}
	}
	public static void main (String[] args) 
	{
		int x = IBIO.inputInt("x:");
		int y = IBIO.inputInt("y:");
		int n = IBIO.inputInt("n:");
		System.out.println(power(x,y));
		System.out.println(multi(x,y));
		System.out.println("=====");
		binry(n);
		System.out.println("");
		System.out.println("=====");
		tri(n);
	}
}

