class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> diffTarget = new HashMap<>();

        for(int i=0 ; i<nums.length; i++){

            diffTarget.put(target - nums[i], i );

        }

/*
 k, v
 0, [4]
 1, [3]
 2, [2]
 3, [1]

 4, 0
 3, 1
 2, 2
 1 ,3
*/


        for(int i=0 ; i<nums.length; i++){
Integer index= diffTarget.get(nums[i]);

            if(index != null && index != i){

                if(index < i  )
                return new int[]{index,i};
                else 
              return new int[]{i,index};
            }
        }
return null;
    }
}
