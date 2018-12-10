package simple;

/**
 * Created by gmg on 2018/12/10.
 * 股票 动态规划
 */
public class StockSolution
{
    /**
     * @param prices: Given an integer array
     * @return: Maximum profit
     */
    public static int maxProfit(int[] prices) {
        // write your code here
        int result = 0;
        if( prices == null || prices.length == 0)
            return 0;
        int minbuy = prices[0];
        for(int i = 1;i< prices.length ;i++){
            // 最小的购买，最大的卖
            result = Math.max(result,prices[i] - minbuy);
            minbuy = Math.min(minbuy,prices[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[]a={2,1,4,2,6};
        System.out.println(maxProfit(a));
    }
}
