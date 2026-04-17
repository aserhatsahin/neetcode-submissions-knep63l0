public class Solution {
    public int Search(int[] nums, int target) {
        
int arrLen = nums.Length;
int low = 0, high = arrLen-1 ,mid;

while (low <= high){

    mid =low + (high - low)/2;

    if (nums[mid] == target)
            return mid;

    if(nums[mid] < target ){
        low = mid + 1;
    }
    if (nums[mid] > target){
        high = mid - 1;
    }
     



}

return -1;


    }
}
