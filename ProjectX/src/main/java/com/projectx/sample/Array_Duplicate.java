package com.projectx.sample;

import java.util.Arrays;
import java.util.BitSet;




public class Array_Duplicate {

	public static void main(String[] args) {
		 
		
		
		System.out.println(Arrays.toString(removeDuplicates(new int[] {1,5,3,3,6,36,7,8,8,8,2,1})));

	
}

	private static int[] removeDuplicates(int[] input) {
    
		 Arrays.sort(input);
		 System.out.println("sorted array is >>>" + Arrays.toString(input));
		 int[] result = new int[input.length];
		 result[0] = input[0];
		 int prev = input[0];
		 int j = 1;
		 for (int i = 1 ; i <input.length ; i ++)
		 {
			 int c = input[i];
			 if (c != prev)
			 {
				 result[j] = c;
				 j++;
			 }
			 prev = c;
			 
		 }
		 
		System.out.println(" array is >>>" + Arrays.toString(result));
		int[] result_compacted = Arrays.copyOf(result, j);
		return result_compacted;
		
	}
}