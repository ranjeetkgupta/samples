package com.projectx.dynamic;

public class RodCutting {

	
	
    public static void main(String args[])
    {
        int arr[] = new int[] {1, 5, 8, 9, 10, 17, 17, 20};
        int size = arr.length;
        System.out.println("Maximum Obtainable Value is " +
                            cutRod(arr, size));
    }

	private static int cutRod(int[] price, int size) {
		
		int[] costSizeArray = new int[size+1];
		costSizeArray[0] = 0;
		for(int i = 1 ; i <= size ; i ++)
		{
			int max = Integer.MIN_VALUE;
			for(int j=0 ; j<i ; j++)
			{
				
                 max = Math.max(max, price[j] + costSizeArray[i-j-1]);				
			}
			costSizeArray[i] = max;
			
		}
		
		return costSizeArray[size];
	}
    
    
    
    
}
