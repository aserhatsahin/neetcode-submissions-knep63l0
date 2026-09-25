class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> indice = new HashMap<Integer,Integer>();

        int needed;

        for(int i = 0 ; i < nums.length ; i ++){

                needed = target - nums[i];

                if(indice.containsKey(needed)){
                    return new int[]{indice.get(needed),i};
                }
                
                indice.put(nums[i], i);


        }
            return null;
    }
}
