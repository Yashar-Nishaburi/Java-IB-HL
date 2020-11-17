/*
 * RecCircle.java
 * 
 * Copyright 2020 Yashar Nishaburi <yasharnishabur>
 * 
 * 
 */


public class RecCircle
{
	public static void wait(int ms)
	{
		try
		{
			Thread.sleep(ms);
		}
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
	}
	public static void circledraw(int n, double x, double y, double r)
	{
		if (n == 1)
		{
			if (r > 0) 
			{
			StdDraw.circle(x,y,r);
			wait(10);
			circledraw(n,x,y,(r-0.01));
			
			}
			else
			{
				return;
			}
		}
		if (n == 0)
		{
			if (r > 0) 
			{
			//wait(10);
			circledraw(n,x,y,(r-0.01));
			}
			else
			{
				return;
			}
			StdDraw.circle(x,y,r);
			wait(10);
		}
	}
	public static void main (String[] args) 
	{
		int n = IBIO.inputInt("n");
		double x = 0.5;
		double y = 0.5;
		double r = 0.7;
		while (true)
		{
			circledraw(n,x,y,r);
			StdDraw.clear();
		}
	}
}

