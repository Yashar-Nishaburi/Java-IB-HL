/*
 * untitled.java
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


// Java program to demonstrate read and write of image 
import java.io.File; 
import java.io.IOException; 
import java.awt.image.BufferedImage; 
import javax.imageio.ImageIO; 

public class ImageRead 
{ 
	public static void main(String args[])throws IOException 
	{ 
		int width = 963; //width of the image 
		int height = 640; //height of the image 

		// For storing image in RAM 
		BufferedImage image = null; 

		// READ IMAGE 
		try
		{ 
			File input_file = new File("/Users/yasharnishaburi/Downloads/Test.png"); //image file path 

			/* create an object of BufferedImage type and pass 
			as parameter the width, height and image int 
			type.TYPE_INT_ARGB means that we are representing 
			the Alpha, Red, Green and Blue component of the 
			image pixel using 8 bit integer value. */
			image = new BufferedImage(width, height, 
									BufferedImage.TYPE_INT_ARGB); 

			// Reading input file 
			image = ImageIO.read(input_file); 

			System.out.println("Reading complete."); 
		} 
		catch(IOException e) 
		{ 
			System.out.println("Error: "+e); 
		} 

		// WRITE IMAGE 
		try
		{ 
			// Output file path 
			File output_file = new File("G:\\Out.jpg"); 

			// Writing to file taking type and path as 
			ImageIO.write(image, "jpg", output_file); 

			System.out.println("Writing complete."); 
		} 
		catch(IOException e) 
		{ 
			System.out.println("Error: "+e); 
		} 
	}//main() ends here 
}//class ends here 


