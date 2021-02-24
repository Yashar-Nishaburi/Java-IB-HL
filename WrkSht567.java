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
	static String func(int k)
	{
		String n = " ";
		for (int j = 0 ; j < 10 ; j ++) 
		{
			n += "-";
		}
		for ( int i = 0 ; i < k ; i++)
		{
			n += "* ";
		}
		return n;
	}

	static void ex5() // exercise 6.1 
	{
		int row = IBIO.inputInt(" How many rows? ( a '-' is a space ) ");
		String nf = func(row);
		for (int i = 0 ; i < row ; i++)
		{
			System.out.println(nf);
		}
	}
//=============================================================================================
	static void ex6() // exercise 6.2
	{
		int row =IBIO.inputInt("How many stars max? ");
		for ( int i = 1 ; i <= (row) ; i++ )
		{
			for ( int j = 0 ; j < i ; j++)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		} 
		for ( int i = row ; i > 0 ; i-- )
		{
			for ( int j = 1 ; j < i ; j++)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
//=============================================================================================
	static String line(int n)
	{
		String ln = "";
		for ( int i = 0 ; i <= n ; i++)
		{
			ln += "* ";
		}
		return (ln);
	}

	//failed attempt
	static String Space(int n)
	{
		String sp = "";
		for ( int i = 0 ; i <= n ; i++)
		{
			sp += "- ";
		}
		return (sp);
	}

	static void ex7() // exersice 6.3
	{
		int num = IBIO.inputInt(" How many starts? "); 
		String lnf= line(num);
		String spf= Space(num);
		for ( int i = num ; i > 0 ; i--)
		{
			for ( int q = 0 ; q < i ; q++)
			{
				System.out.print("  ");
			}
			System.out.println(lnf);
			
		}
		for ( int j = 0 ; j <= num ; j++ )
		{
			for ( int q = 0 ; q < j ; q++)
			{
				System.out.print("  ");
			}
			System.out.println(lnf);
		}
	}
//=============================================================================================
	static void ex8() // exersice 7.1
	{ 
		double xx = 1;
		double temp1 = 0;
		double temp2 = 0;
		for (int i = 0; i < 10; i++)
		{
			xx = xx * 3.732;
			temp1 = xx * 100;
			temp2 = (int) temp1;
			System.out.println(temp2/100);
		}
	}
//=============================================================================================
	static String spc(double n)
	{
		String xxx = "" + n;
		int z = xxx.indexOf('.');
		String sp = "";
		for (int i = 0 ; i < (6-z) ; i++)
		{
			sp += " ";
		}
		return(sp);
	}
	static void ex9() // exersice 7.2
	{ 
		double xx = 1;
		String yy = "";
		for (int i = 0; i < 10; i++)
		{
			xx = xx * 3.732;
			yy = spc(xx);
			System.out.print(yy);
			System.out.println(xx);
		}
	}
//=============================================================================================
//=============================================================================================
	public static void main (String[] args) 
	{
		System.out.println("***");
		System.out.println("Uncomment exercise code from main function");
		//System.out.println("//exercise 5.1"); ex1();
		//System.out.println("//exercise 5.2"); ex2();
		//System.out.println("//exercise 5.3"); ex3();
		//System.out.println("//exercise 5.4"); ex4();
		//System.out.println("//exercise 6.1"); ex5();
		//System.out.println("//exercise 6.2"); ex6();
		//System.out.println("//exercise 6.3"); ex7();
		//System.out.println("//exercise 7.1"); ex8();
		//System.out.println("//exercise 7.2"); ex9();
	}
}

