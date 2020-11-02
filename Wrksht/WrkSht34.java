/*
 * WrkSht34.java
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


public class WrkSht34
{
	static void ex1 () //exercise 3.1
	{
		int x;
		do
		{ 
			x = IBIO.inputInt("enter a number less than 100 and more than or equal to 0 ");
		} while (x >= 100 || x < 0 );
		System.out.println("thank you");
	}
//=============================================================================================
	static void ex2 () //exercise 3.2
	{
		int i = 1;
		int x = IBIO.inputInt("Enter a number: ");
		do
		{ 
			i++;
		} while (x % i != 0);
		if ( i == x)
		{
			System.out.println("Prime");
		}
		else 
		{
			System.out.println("Smallest prime is " + i);
		}
	}
//=============================================================================================
	static void ex3 () //exercise 3.3 
	{
		int sum = 0;
		int n = IBIO.inputInt(" enter a number ");
		do
		{ 
			int digit = n % 10; // get right most digit
			digit = digit * digit * digit;
			sum = sum + digit; // add to units digits
			n = n / 10; // make new number
		} while ( n != 0);
		System.out.println("the sum of the digits of the number is " + sum);
	}
//=============================================================================================
	static void ex4 () //exercise 3.4
	{
		int c = 0;
		int n = IBIO.inputInt(" enter starting number ");
		do 
		{
			System.out.println( n + ", " );
			if ( n % 2 == 0 )
			{
				n = n / 2;
			}
			else
			{
				n = (n*3)+1;
			}
		}while ( n != 1 );
		System.out.println("1");
	}
//=============================================================================================
	static void ex5 () //exersice 4.1
	{
		int v = IBIO.inputInt(" enter first number ");
		int b = IBIO.inputInt(" enter second number ");
		int n = IBIO.inputInt(" Press [1] for multi or [2] for add ");
	}
//=============================================================================================
//=============================================================================================
//=============================================================================================
	public static void main (String[] args) 
	{
		ex1();
		ex2();
		ex3();
		ex4();
		ex5();
	}
}

