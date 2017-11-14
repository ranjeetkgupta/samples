package com.projectx.dynamic;

public class MaxSubArray {

	
	public static void main(String[] args) {
		
		
	int[] arr = new int[] {-2,-3,-44,-1,-2,-1,-5,-3};
	System.out.println("max subarray sum >>" + maxSubArrayDynamic(arr));
	
	System.out.println("max subarray sum >>" + maxSubArray(arr));
		
	}

	private static int maxSubArray(int[] arr) {
	
      int maxSumRecent = 0;
      int maxSumSoFar = 0;
		
      boolean allNegatives = true;
      int smallest = Integer.MAX_VALUE;
		
      for(int i=0 ; i<arr.length;i++)
      {
    	  
    	  if(smallest > arr[i])
    		  smallest = arr[i];
    	  
    	  maxSumRecent = maxSumRecent + arr[i];
    	  if(maxSumRecent <= 0)
    	  {
    		  maxSumRecent = 0;
    	  
    	  }
    	  else {
    		  allNegatives = false;
    	  if(maxSumSoFar < maxSumRecent)
    		  maxSumSoFar = maxSumRecent;
    	  
    	  
    	  }
      }
      
      
        if(allNegatives)
        	return smallest;
		return maxSumSoFar;
	}
	
	
	
	private static int maxSubArrayDynamic(int[] arr) {

		int maxSumRecent = arr[0];
		int maxSumSoFar = arr[0];

		for (int i = 1; i < arr.length; i++) {

			maxSumRecent = Integer.max(arr[i], maxSumRecent + arr[i]);
			maxSumSoFar = Integer.max(maxSumSoFar, maxSumRecent);
		}

		return maxSumSoFar;
	}
	
	
	
}

