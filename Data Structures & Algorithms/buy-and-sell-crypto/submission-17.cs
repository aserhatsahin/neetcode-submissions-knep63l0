public class Solution {
    public int MaxProfit(int[] prices) {
        
// price[i] price of NeetCoin on i th day

// we may choose not to make any transactoions

//arraydeki minimumu ve maximumu tutucaz surekli ve 


// min degeri aldiktan sonra maximum kari belirlemek
// icin arrayin kalan elemanlarindan en yuksek olani bulabilmemiz lazim
// min deger 1 ise bir daha min kontrol etmeye gerek yok
// ve min deger son eleman olursa kar zarar hesaplayamayiz veya 
// array giderek azaliyorsa direkt kar zarar 0 dememiz lazim


int maxP = 0;
int minBuy = prices[0];
foreach(int sell in prices){
    maxP= Math.Max(maxP, sell - minBuy);
    minBuy = Math.Min(sell, minBuy);

}
return maxP;
}



}
