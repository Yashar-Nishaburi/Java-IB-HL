/*
 * Mock2.java
 * 
 * Copyright 2020 Yashar Nishaburi <yasharnishaburi>
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


public class Mock2
{
	static void decfix(double Sum, int c)
	{
		double av = Sum/c;
		double y = (av % 1)*1000;
		//System.out.println(y);
		System.out.print("Clean: ");
		System.out.print( (int) av + ".");
		System.out.println( (int) y );
	}
	public static void main (String[] args) 
	{
		double Sum = 0;
		int Min = 999999999; 
		int Max = 0;
		int Prime = 0;
		int test = 0;
		int c = 0;
		System.out.println("Yashar Nishaburi");
		//int c = IBIO.inputInt("How many numbers to prossess: ");
		/*
		while (c < 5)
		{
			System.out.println("Error - Number out of range");
			c = IBIO.inputInt("How many numbers to pressess: ");
		}
		*/
		int x = 0;
		do
		{
			x = IBIO.inputInt("Input number: ");
			if (x >=0)
			{
				c++;
				for (int k = 2 ; k < x ; k++)
				{
					if ((x % k) == 0)
					{
						test++;
					}
				}
				if (test == 0)
				{
					Prime++;
				}
				test = 0;
				if ( x > Max )
				{
					Max = x;
				}
				if ( x < Min)
				{
					Min = x;
				}
				Sum = Sum + x;
			}
		}while (x >= 0);
		System.out.println("Min: " + Min + "   Max: " + Max );
		System.out.println("Range: " + (Max-Min));
		System.out.println("Average: " + (Sum/c));
		System.out.println("Number of primes: " + Prime );
		decfix(Sum,c);
	}
}

