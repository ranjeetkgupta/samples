package com.projectx.sort;

import java.util.Arrays;

public class Quicksort {

	public static void main(String[] args) {
		 
		
		int[]  array = new int[] {7,15,17,8,5,9,1,11,2,14,10,21};
		quicksort(array,0,11);
		System.out.println(Arrays.toString(array));
}

	private static void quicksort(int[] is,int start, int end) {
	
		if(start >= end)
			return;
		
		int partition = partition(is,start,end);
		quicksort(is,start,partition -1);
		quicksort(is,partition + 1,end);
	}

	private static int partition(int[] is, int start, int end) {
	
		int pivot_index = end;
		int pivot = is[pivot_index];
	   end = end -1;
	   while (start < end)
	   {
		   
		   while(is[start] < pivot && start < end)
		   {
			   start ++;
		   }
		   
		   while(is[end] > pivot && start < end)
		   {
			   end --;
		   }
		   
		   if(start < end)
		   swap(is,start,end);
		   
	   }
		
	   System.out.println("swaping >>" +  Arrays.toString(is)+ ">>" + start + "" + end);
	   
	   int partiton = pivot_index ;
	   if (is[start] > is[pivot_index]) {
	   
	   swap(is,start,pivot_index);
	   partiton = start;
	   }
		return partiton;
	}

	private static void swap(int[] is, int start, int end) {

		int temp = is[start];
		is[start] = is[end];
		is[end] = temp;

	}

}