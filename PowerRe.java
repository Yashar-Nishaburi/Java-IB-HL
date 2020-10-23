/*
 * PowerRe.java
 * 
 * Copyright 2020 Yashar Nishaburi <yasharnishaburi@10-72-120-145.wifi.8.s.pas.ofs.edu.sg>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
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
	static int binry(int n)
	{
		
		if (n == 0)
		{
			return 0;
		}
		else
		{
			int g = n % 2;
			System.out.println(g);
			return (binry(n/2));
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

