public class Solution {
    public int[] TopKFrequent(int[] nums, int k) {
        //frequencysini tutmamiz gerekiyor sayilarin bunun icin hashmap kullanabiliriz 
        // ve countla arttiririz 

        Dictionary<int,int> numFreq = new Dictionary<int,int>();

        List<int>[] freq = new List<int>[nums.Length + 1];

        for (int i = 0; i < freq.Length; i++){
                freq[i] = new List<int>();  
        }
    
        for(int i = 0 ; i < nums.Length ; i++){

                if(numFreq.ContainsKey(nums[i])){
                        numFreq[nums[i]]++;

                }
                else 
                    numFreq[nums[i]] = 1;

        }

        foreach(var entry in numFreq){
            freq[entry.Value].Add(entry.Key);
        }

        int[] res = new int[k];
        int index = 0 ;
        for(int i = freq.Length - 1; i > 0 && index < k; i--){

                    foreach(int n in freq[i]){
                            res[index++] = n ;
                                if(index == k ){
                                    return res;
                                }
                    }

        }
return res; 

// bu asamada elimizde bir hash map var [numFreq] icinde sayilar ve
// kac defa tekrar ettikleri yaziyor mesela
// verilen array [1,2,2,3,3,3 k=2   
/* numFreq[1] = 1
   numFreq[2] = 2
   numFreq[3] = 3
   
     */
//dictionarydeki en yuksek freqleri k ya gore ayiricaz ve  arraye atip listeliycez
// kurdugumuz algoritmada k kadar donen
// bir loop olabilir belki ama bunun icin once sortlamak gerekiyor dictionaryi 
// 
        









    }
}
