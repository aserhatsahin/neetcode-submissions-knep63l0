
public class Solution {
    public bool hasDuplicate(int[] nums) {
    HashSet<int>  hs = new HashSet<int>();

   
    foreach(int num in nums){
            hs.Add(num);
    
        
    }
    if (hs.Count != nums.Length){
        return true;
    }
return false;
    }
}
