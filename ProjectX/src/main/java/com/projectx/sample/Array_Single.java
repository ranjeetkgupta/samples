package com.projectx.sample;

public class Array_Single {

	public static void main(String[] args) {
		 
		
		
		System.out.println(findUnique(new int[] {7,5,6,6,5,7,4,4,1,1,3,3,12,11,11}));

	
}

	private static int findUnique(int[] is) {

		int xor_val = is[0];
		for(int i = 1 ; i < is.length ; i++)
	    {
			xor_val = xor_val ^ is[i];
			
		}
		
		return xor_val ;
	}


}