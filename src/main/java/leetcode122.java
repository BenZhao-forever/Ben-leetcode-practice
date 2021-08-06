public class leetcode122 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/",122);
    }
    public static int maxProfit(int[] prices) {
        int sum = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                sum += prices[i] - prices[i - 1];
            }
        }
        return sum;
    }
}
