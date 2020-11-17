/*
 * Mock3.java
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


public class Mock3 
{
	public static void main (String[] args) 
	{
		int m = 0;
		System.out.println("Yashar Nishaburi");
		int n = 9999;
		while (n != 0)
		{
		n = IBIO.inputInt("Enter a number from 1 to 9: ");
		if (n == 0)
		{
			System.exit(0);
		}
		while (n<1 || n>9)
		{
		System.out.println("-Error enter valid number");
		n = IBIO.inputInt("Enter a number from 1 to 9: ");
		if (n == 0)
		{
			System.exit(0);
		}
		}
		for (int l = 1 ; l <= n ; l++)
		{
			for (int i = 1 ; i <= 20 ; i++)
			{
				if (i<10)
				{
				System.out.print(l + " x  " + i + " = ");
				}
				else
				{
				System.out.print(l + " x " + i + " = ");
				}
				m = i * l;
				int c = 0;
				int k = 1;
				int t = 0;
				while (c != 1)
				{
					if (m/k >= 1)
					{
						t++;
					}
					else
					{
						c++;
					}
					k = k*10;
				}
				int space = 4 - t;
				for ( int j = 1 ; j <= space ; j++)
				{
					System.out.print(" ");
				}
				System.out.println(m);
			}
			System.out.println("-------------");
		}
		}
	}
}

