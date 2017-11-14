package com.projectx.dynamic;

import java.util.Arrays;

public class MaxSubString {

	
	public static void main(String[] args) {
		
		
    String str1= "weqinterviewuoi";
    String str2= "mmnmnmqinterview1213";
		
 //     String str1= "xmeabc";
 //     String str2= "zymen";
    
    System.out.println("max substr length >>" + maxSubstr(str1,str2));
    
		
	}

	private static int maxSubstr(String str1, String str2) {


		int[][] lengths = new int[str1.length()+1][str2.length()+1];
		
		
		int max = Integer.MIN_VALUE;
		int x_index = 0;
		int y_index = 0;
		
		
		
		for(int i=0; i<str1.length();i++)
		{
			
			for(int j=0; j<str2.length();j++)
			{
				
				if(str1.charAt(i) == str2.charAt(j))
				{
					lengths[i+1][j+1] = lengths[i][j] + 1;			
					if(max < lengths[i+1][j+1] )
					{
						max = lengths[i+1][j+1] ;	
						
						x_index = i + 1;
						y_index = j + 1;
						
					}
					
				}
				
				else
				{
					lengths[i+1][j+1] = lengths[i+1][j];
					
				}
				
			}
			
			
			
			
			
		}
		
		System.out.println(str1.substring(x_index - max , x_index));
		System.out.println(Arrays.deepToString(lengths));
		return max;
		
		
	}

	
	
	
}

