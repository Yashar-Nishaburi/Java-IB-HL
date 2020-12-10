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
		while (x <= 1)
		{
			System.out.println("invalid number ");
			x = IBIO.inputInt("Enter a number: ");
		}
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
	static void ex5 () //exercise 4.1
	{
		int n = 0;
		int v = 0;
		int b = 0;
		while ( n!= 3 )
		{
		v = IBIO.inputInt(" enter first number ");
		b = IBIO.inputInt(" enter second number ");
		n = IBIO.inputInt(" Press [1] for multi or [2] for add - [3] quits - ");
		switch (n) 
		{
			case 1:
				System.out.println(v*b);
				break;
			case 2:
				System.out.println(v+b);
				break;
			case 3:
				System.out.println("~Quit~");
				break;
			default:
				System.out.println("Err-Invalid imput format");
		}
		}
	}
//=============================================================================================
	static void ex6 () //exercise 4.2
	{
		int sum = 0;
		int r = 0;
		for (int i = 1 ; i <= 1000 ; i++)
		{
			r = i % 3;
			switch (r)
			{
				case 0:
					sum = sum + ( i * -5);
					break;
				case 1:
					sum = sum + ( i * 7);
					break;
				case 2:
					sum = sum + ( i * 2);
					break;
				default:
					break;
			}
		}
		System.out.println(sum);
	}
//=============================================================================================
	static void ex7 () //exercise 2.1
	{
		int n = IBIO.inputInt("input a number between 50 and 60: ");
		if (n > 60 || n < 50)
		{
			System.out.println("Number was too big / too small");
		}
	}
//=============================================================================================
	static void ex8 () //exercise 2.2
	{
		int n = IBIO.inputInt("Number: ");
		if ( n % 2 == 0 )
		{
			System.out.println("Number is even");
		}else
		{
			System.out.println("Number is odd");
		}
	}
//=============================================================================================
	static void ex9 () //exercise 2.4
	{
		for ( int i = 1 ; i <=10 ; i++)
		{
			System.out.print(i + "- " + i*i + " ~~ ");
		}
		System.out.println("");
	}
//=============================================================================================
	static void ex10 () //exercise 2.5
	{
		for ( int i = 1 ; i <= 100 ; i++)
		{
			if ( i%2 == 0 )
			{
				System.out.print(i + "~~");
			}
		}System.out.println("");
	}
//=============================================================================================
	static void ex11 () //exercise 2.6+2.7
	{
		for ( int i = 1 ; i <= 100 ; i++)
		{
			if ( i%2 == 0 && i%3 == 0)
			{
				System.out.print(i + "~~");
			}
		}System.out.println("");
	}
//=============================================================================================
	static void ex12 () //exercise 2.8
	{
		int counter = 0;
		for ( int i = 1 ; i <= 1000000 ; i ++)
		{
			if (i%2 !=0 && i%3 !=0 && i%5 !=0 && i%7 !=0)
			{
				counter++;
			}
		}System.out.println("Counter: " + counter);
	}
//=============================================================================================
//=============================================================================================
//=============================================================================================
	public static void main (String[] args) 
	{
		System.out.println("//exercise 3.1");
		ex1();
		System.out.println("//exercise 3.2");
		ex2();
		System.out.println("//exercise 3.3");
		ex3();
		System.out.println("//exercise 3.4");
		ex4();
		System.out.println("//exercise 4.1");
		ex5();
		System.out.println("//exercise 4.2");
		ex6();
		System.out.println("//exercise 2.1");
		ex7();
		System.out.println("//exercise 2.2");
		ex8();
		System.out.println("//exercise 2.4");
		ex9();
		System.out.println("//exersice 2.5");
		ex10();
		System.out.println("//exersice 2.6+2.7");
		ex11();
		System.out.println("//exercise 2.8 - Question header wrong (should be 2 and 3 and 5 and 7*");
		ex12();
	}
}

