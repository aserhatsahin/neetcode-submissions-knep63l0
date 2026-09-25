class Solution {
    public int maxProfit(int[] prices) {
        // one day to buy 
        // one day to sell
        // return the max profit if it exists otherwise no transactions 
        //sececeksin bir gun mesela alis fiyati olarak ve eger fiyat olarak daha yuksegi olmazsa transaction yapilmayacak

        // buy ve sell olur ve bunlari karsilastirarak baslanabilir 

        int l = 0, r = 1, maxP=0;

        while (r < prices.length){
                    if(prices[l] < prices[r]){
                        int profit = prices[r] - prices[l];

                        maxP = Math.max(maxP,profit);
                    }else { 
                        l = r;
                    }
            r++;
        }
        return maxP;
    }
}
