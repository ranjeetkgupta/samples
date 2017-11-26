package com.projectx.dynamic;

public class MaxCoin {
   public static void main(String[] args) {
		int [] coins = new int []{9,6,5,1,};
		
	    System.out.println("min coins >>" + minCoins(coins,11));
}

private static int minCoins(int[] coins, int val) {

	int min_coin = Integer.MAX_VALUE;
	int min_coin_current = Integer.MAX_VALUE;
	
	if(val == 0)
		return 0;
	
	for (int coin:  coins)
	{
	   if(coin <= val)
	   {
		   min_coin_current = 1 + minCoins(coins, val-coin);
		   
	   }
	
	   if(min_coin > min_coin_current)
		   min_coin = min_coin_current;	   
	}
	
	return min_coin;
	
}
   
	

	
	
}
