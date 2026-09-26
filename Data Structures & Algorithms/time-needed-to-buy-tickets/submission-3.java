class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        // k kisisinin bilet sayisi ne kadar atiyorum 3 eger sirada 3 ten az ve 3 tane olan herkesi kendi bilet sayisi kadar tur beklemesi gerekiyor yani sirada 4 kisi var ve k mesela 3. kisi ise 2 bilet alacaksa onundeki kisilerin biletlerini beklemesi lazim sadece son turda arkasinda kalan kisiler kadar beklemeyecek 

            // int sum = 0 ;
            int mult = 0;
            for(int i = 0  ;i < tickets.length ; i++){
            
                    // sum+= tickets[i];
                if( i <= k ){
                    // if( tickets[i] >= tickets[k]){
                    //     mult += tickets[k]; 
                    // }
                    // else{
                    //     mult+= tickets[i];
                    // }
                    mult+=Math.min(tickets[k],tickets[i]);
                }
                else {

                    // if( tickets[i] >= tickets[k]){
                    //     mult += tickets[k] - 1 ; 
                    // }
                    // else{
                    //     mult+= tickets[i];
                    // }
                    mult+=Math.min(tickets[k]-1,tickets[i]);
                }
            }
        return mult;
    }
}