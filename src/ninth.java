public class ninth {
    public static int buysellStocks(int Price[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit =0;
        for(int i =0 ; i<Price.length;i++){
            if(buyPrice < Price[i]){
                int profit = Price[i]-buyPrice;
                maxProfit = Math.max(maxProfit,profit);
            }else{
                buyPrice = Price[i];
            }

        }
        return maxProfit;
    }

    public static void main(String args[])
    {
        int Price[] = {7,1,5,3,6,4};

        System.out.println(buysellStocks(Price));
    }
}
