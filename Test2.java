/*
 * Test2.java
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


public class Test2
{
	static void Fibo(int n)
	{
		long t1 = 0;
		long t2 = 1; 
		long t3 = 0;
		double sum = 1;
		double avg = 0;
//-------------------------------------------------------------------Exeptions 
		if ( n == 1)
		{
			System.out.print(t1 + "; " + t2);
		}
//-------------------------------------------------------------------n less than 20
		if ( n<=20 )
		{
			for (int i = 2 ; i <= n ; i++)
			{
				if (i==2)
				{
					System.out.print(t1 + "; " + t2);
				}
			t3 = t2 + t1;
			System.out.print("; " + t3);
			t1 = t2;
			t2 = t3;
			sum = sum + t3;
			}
			avg = sum / n;
		}
//-------------------------------------------------------------------n more than 20 
		if ( n > 20)
		{
			for (int i = 2 ; i <= n ; i++)
			{
			t3 = t2 + t1;
			t1 = t2;
			t2 = t3;
			sum = sum + t3;
			}
			System.out.println(t3);
			int c = 0;
			long k = 1;
			int t = 0;
			while (c != 1)
			{
				if (t3/k >= 1)
				{
					t++;
				}
				else
				{
					c++;
				}
				k = k*10;
			}
			System.out.print(t3 + " Has " + t + " digits");
			avg = sum / n;
		}
		System.out.println(" ");
		if (n!=0)
		{
		System.out.println("Average: " + avg);
		System.out.println("----------------------------------------------------------");
		}
		
		return;
	}
//-------------------------------------------------------------------final loop
	public static void main (String[] args) 
	{
		System.out.println("Yashar Nishaburi");
		int n = 1;
		while ( n != 0 )
		{
			n = IBIO.inputInt("Number of terms: ");
			while (n<0)
			{
				System.out.println("Err - Number out of range");
				n = IBIO.inputInt("Number of terms: ");
			}
			Fibo(n);
		}
	}
}

