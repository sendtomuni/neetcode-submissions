class Solution {
    public int maxProfit(int[] prices) {
      int min = prices[0], max = prices[0];
      int diff = max-min;

      for (int i = 1; i < prices.length ; i++) {
        if(prices[i] < min) {
            min = prices[i];
            max = prices[i];
        }
        if(prices[i] > max) {
            max = prices[i];
        }

        diff = (diff < (max-min)) ? max-min : diff;
      }
      return diff;  
    }
}
