package com.projectx.string;

import java.util.Arrays;

import javax.print.DocFlavor.INPUT_STREAM;

public class FirstNonRepeatingChar {

	
	public static char[] getCount(String in)

	{
		char[] countArray = new char[256];

		for (int i = 0; i < in.length(); i++) {
			System.out.println("----");
			System.out.println(in.charAt(i));
			
			System.out.println(countArray[in.charAt(i)]);
			countArray[in.charAt(i)]++;
			System.out.println(countArray[in.charAt(i)]);

		}
		return countArray;
	}
	
	public static void main(String[] args) {
		
		
		char[] cArray = getCount("AAAAAAAAAAAAAAAAAAAAAAAANothingisimpossibleX");
		System.out.println(Arrays.toString(cArray));
		
	}
	
	
/*	public static char findNonRep(String in)

	{
		char[] countArray = getCount(in);
		
		
		
	}*/
	
	
	
}
