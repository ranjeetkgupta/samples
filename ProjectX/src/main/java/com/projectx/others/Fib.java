package com.projectx.others;

import java.util.Arrays;

public class Fib {
	
	public static void main(String[] args) {
	
		
		System.out.println(Arrays.toString(fib(20)));
	}

	private static int[] fib(int i) {
		
		int [] results = new int[i];
        fibo(i,results);
		return results;
	}
	
	
	
	
	
	

	private static int fibo(int i, int[] results) {
      
		if(i ==0)
		{
			return 0;
		}
		
		if(i ==1)
		{
			results[i-1] = 1 ;
		}
		
			
		
		if(results[i-1] != 0)
		{
			return results[i-1];
		}
		int fibb_number = fibo(i-1,results) + fibo(i-2,results);
		results[i-1] = fibb_number;
		return fibb_number;
		
	}
}
