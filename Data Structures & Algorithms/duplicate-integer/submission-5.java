class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> appearance = new HashMap<Integer,Integer>();

    for(int num : nums){

   

            if(appearance.containsKey(num)){
                return true;
            }
                appearance.put(num,1);

    }
    return false;
    }
}