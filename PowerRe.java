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
			c = (x * power(x,y+1));
			return (1.0/c);
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
			return;
		}
		else
		{
			int g = n % 2;
			//return g;
			binry(n/2);
			System.out.println(g);
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
	}
}

