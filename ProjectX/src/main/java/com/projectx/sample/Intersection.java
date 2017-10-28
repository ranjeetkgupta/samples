package com.projectx.sample;

import java.util.Arrays;


public class Intersection {

	public static void main(String[] args) {
		 
		
		
		System.out.println(Arrays.toString(intersection(new int[] {1,5,6,8,21,1}, new int[] {3,6,8,21})));

	
}

	private static int[] intersection(int[] is, int[] is2) {

		int i =0, j = 0, k = 0;
		int[] result = new int[is.length];

		for (int m = 0 ; m < is.length + is2.length; m++)
		{
			if (is[i] > is2[j])
				j++;
			if (is[i] < is2[j])
				i++;
			if (is[i] == is2[j]) {
				result[k] = is[i];
				k++;
				i++;
				j++;
			}
			
			if(j == is2.length || i == is.length)
				break;
			
		}
		
		System.out.println(i+ "" + j + "" + k);
		return result;
	}



	
}