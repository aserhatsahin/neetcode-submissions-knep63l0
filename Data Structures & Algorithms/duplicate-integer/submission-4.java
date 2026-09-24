class Solution {
    public boolean hasDuplicate(int[] nums) {
        //arrayy of nums 
        //return true if any value appears more than once 
        // we need unique element holder ds // hashset ? 

        HashSet<Integer> noDuplicate = new HashSet<Integer>();

        for(int num : nums){

            
            if(noDuplicate.contains(num)){
                return true;
            }
            noDuplicate.add(num);
        }
    return false;

    }
}