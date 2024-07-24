public class MaxProfitOnStock{
    public int MaxProfit(int[] prices){
        int buy = prices[0];
        int profit = 0;

        for(int i=1; i<prices.length;i++){
            if(buy<prices[i]){
                profit = Math.max(prices[i]-buy,profit);
            }
            else{
                buy = prices[i];
            }        
        }
        return profit;
    }
    public static void main(String args[]){
        MaxProfitOnStock maxProfitOnSt = new MaxProfitOnStock();

        int prices[] = {7,1,5,3,6,4};
        System.out.println("Max profit is: "+maxProfitOnSt.MaxProfit(prices));

        int prices1[] = {7,6,4,3,1};
        System.out.println("Max profit is: "+maxProfitOnSt.MaxProfit(prices1));
    }  
}