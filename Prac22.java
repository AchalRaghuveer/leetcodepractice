
public class Prac22 {
	
	class Solution {
	    public int maxProfit(int[] prices) {

	        int profit =0;
	        int currentStock = -1;
	        for(int i=0; i< prices.length -1; i++) {
	            if(currentStock < 0) {
	                if(prices[i] < prices[i+1]) {
	                    currentStock = prices[i];
	                }
	            } else {
	                if(prices[i] > prices[i+1]) {
	                    profit += prices[i] - currentStock;
	                    currentStock = -1;
	                }
	            }
	        }

	        if(currentStock >=0 ) {
	            profit += prices[prices.length -1] - currentStock;
	        }

	       return profit; 
	        
	    }
	}

}
