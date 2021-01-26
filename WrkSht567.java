/*
 * WrkSht567.java
 * 
 * Copyright 2021 Yashar Nishaburi <yasharnishaburi@10-72-120-145.wifi.8.s.pas.ofs.edu.sg>
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


public class WrkSht567 
{
	static void ex1() //exercise 5.1
	{
		double n = 0;
		double t = 1;
		for ( int i = 1 ; i <= 100 ; i++ )
		{
			for ( int k = 1 ; k <= i ; k++ )
			{
				t = t * 5;
			}
			//System.out.println(t);
			n = n + ( 1 / t );
			//System.out.println(n);
			t = 1;
		}
		System.out.println(n);
	}
//=============================================================================================
	static void ex2() //exercise 5.2
	{
		double n = 0;
		double t = 0;
		double k = 0;
		for ( int i = 1 ; i <= 100 ; i++ )
		{
			t = i * i;
			//System.out.println(i + " " + t);
			k = 1/t ; 
			n = n+k;
		}
		System.out.println(n);
	}
//=============================================================================================
	static void ex3() //exercise 5.3
	{
		double n = 0;
		double t = 1;
		int s = 1;
		double k = 0;
		for ( int i = 1 ; i <=10000 ; i++ )
		{
			k = (1 / t) * s;
			//System.out.println(k + " " + t + " " + n );
			n =  n + k;
			t = t + 2;
			s = s * -1;
		}
		System.out.println(n*4);
	}
//=============================================================================================
	static void ex4() // exercise 5.4
	{
		double s = 1;
		double k = 1;
		int t = 3;
		double n = 0;
		for ( int i = 1 ; i <= 99 ; i++ )
		{
			for ( int q = 1 ; q <= i ; q++ )
			{
				k = k * q;
				//System.out.print(q);
			}
			for ( int j = 1 ; j <= i ; j++ )
			{
				s = s * t;
				//System.out.print(t);
				t = t + 2;
			}
			//System.out.println(s);
			n = n + ( k / s );
			s = 1;
			t = 3;
			k = 1;
		}
		System.out.println((n+1)*2);
	}
//=============================================================================================
//=============================================================================================
//=============================================================================================
	public static void main (String[] args) 
	{
		System.out.println("//exercise 5.1");
		ex1();
		System.out.println("//exercise 5.2");
		ex2();
		System.out.println("//exercise 5.3");
		ex3();
		System.out.println("//exercise 5.4");
		ex4();
	}
}

