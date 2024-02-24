public class Prac7 {
    public int maxProfit(int[] prices) {
        int profitValue = 0;
        int buyValue = prices[0];
        for(int i=1; i<prices.length;i++) {
            if(buyValue > prices[i]) {
                buyValue = prices[i];
            } else {
                if(profitValue < prices[i] - buyValue){
                    profitValue = prices[i] - buyValue;
                }
            }
        }
        return profitValue;
    }
}
