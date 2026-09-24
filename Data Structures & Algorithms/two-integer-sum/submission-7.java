class Solution {
    public int[] twoSum(int[] nums, int target) {
    //arrayyin oyle 2 elemanini alalim ki bu iki elemanin toplami target degerimize esit olsun
    // baslangicta array elemanlarini gezerken ilk elemanin degerinio targetten cikaririz daha sonrasinda o degere esit olani bulmaya calisiriz her buldugumuz indexi de yeni bir arraye kaydederiz ? 
    //ama ilk degeri kadyedersek mesela [1,2,5] target = 7 oldugunda yanlis cikar 
    // belki bir hash map tutabiliriz key -> i  value -> (target - nums[i])
    // daha sonrasinda HashMap valuelarini arrayle checkleriz ?
    // hashmapi value -> index diyye tutmak daha mantikli

    HashMap<Integer,Integer> diffTarget = new HashMap<>();

    int needed;
        for(int i = 0 ; i<nums.length ; i++){

            needed = target - nums[i];

            if(diffTarget.containsKey(needed)){
                int[] targetInd = new int[2];

                targetInd[0] = diffTarget.get(needed);
                targetInd[1] = i;

                return targetInd;
            }
            diffTarget.put(nums[i], i);
        }
return null;
    }
}
