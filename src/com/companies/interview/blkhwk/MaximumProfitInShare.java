package com.companies.interview.blkhwk;

/*
 Share price .. find profit.
 Asked by BlackHawk B'lore
 */
public class MaximumProfitInShare {

	public static void main(String[] args) {
		int[] stockPrice = {100, 109, 124, 90, 101, 95};
		//int[] stockPrice = {100, 109, 124, 145, 150, 190};
		//int[] stockPrice = {100, 95, 94, 90, 50, 30};
		//int[] stockPrice = {95, 100};
		//int output = 24;
		// int out = 40

		int maxProfit = 0;
		int initialPrice = stockPrice[0];
		for (int i=1 ; i < stockPrice.length; i ++) {
			int dayProfit = 0;
			if (stockPrice[i] > initialPrice) {
				dayProfit = stockPrice[i] - initialPrice;
			}
			else if (stockPrice[i] < initialPrice) {
				initialPrice = stockPrice[i];
			}

			maxProfit = Math.max(maxProfit, dayProfit);
		}

		System.out.println(maxProfit);

	}
}
