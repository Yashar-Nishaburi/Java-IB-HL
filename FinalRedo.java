/*
 * FinalRedo.java
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


public class FinalRedo
{
	public static void main (String[] args) 
	{
		System.out.println("Yashar Nishaburi");
		int n = IBIO.inputInt("Input a number:");
		while ( n >= 10 || n <= 0)
		{ 
		n = IBIO.inputInt("Input a number:");
		}
		for ( int i = 1 ; i <= n ; i++ )
		{
			 System.out.print(i);
		}
	}
}

