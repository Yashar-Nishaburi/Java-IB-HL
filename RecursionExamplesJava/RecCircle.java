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
	public static void circledraw(int n, double x, double y, double r, int RR, int GG, int BB)
	{
		if (n == 1)
		{
			if (r > 0) 
			{
			StdDraw.circle(x,y,r);
			wait(10);
			//StdDraw.clear();
			RR = RR + 5;
			StdDraw.setPenColor(RR,GG,BB);
			circledraw(n,x,y,(r-0.01),RR,GG,BB);
			//StdDraw.clear();
			//RR = 0;
			}
			else
			{
				StdDraw.setPenColor(0, 0, 0);
				return;
			}
		}
		if (n == 0)
		{
			if (r > 0) 
			{
			//wait(10);
			circledraw(n,x,y,(r-0.01),RR,GG,BB);
			}
			else
			{
				return;
			}
			StdDraw.circle(x,y,r);
			wait(50);
		}
	}
	public static void main (String[] args) 
	{
		int RR = 0;
		int GG = 0;
		int BB = 0;
		int n = IBIO.inputInt("n");
		double x = 0.5;
		double y = 0.5;
		double r = 0.5;
		while (true)
		{
			//RR = 0;
			circledraw(n,x,y,r,RR,GG,BB);
			StdDraw.clear();
			//RR = 0;
		}
	}
}

