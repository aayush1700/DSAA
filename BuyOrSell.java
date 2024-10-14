public class BuyOrSell {
    public static void main(String[] args) {
        int prices[]={2,4,1};
        int min=prices[0];
        int profit=0;
        for(int i=0;i<prices.length;i++)
        {
            min=Math.min(min, prices[i]);
            profit=Math.max(profit,prices[i]-min);
        }
        System.out.println(profit);
    }
}
