public class Solution {
    public int[] TwoSum(int[] nums, int target) {
  
        Dictionary<int, int> diffToIdx = new Dictionary<int, int>();
        int len = nums.Length;


       for (int i = 0; i < len; i++)
    {
        int complement = target - nums[i];
            if (diffToIdx.ContainsKey(complement))
            {
                return new int[] { diffToIdx[complement], i };
            }
        diffToIdx[nums[i]] = i;
    }
        return null;


        // for (int i = 0; i < len; i++)
        // {
        //     int diff = target - nums[i];
        //     diffToIdx[diff] = i;
        // }

        // for (int i = 0; i < len; i++)
        // {
        //     if (diffToIdx.ContainsKey(nums[i]))
        //     {
        //         int complementIdx = diffToIdx[nums[i]];

        //         if (complementIdx != i)
        //         {
        //             if (i < complementIdx)
        //             {
        //                 return new int[] { i, complementIdx };
        //             }
        //             else
        //             {
        //                 return new int[] { complementIdx, i };
        //             }
        //         }
        //     }
        // }

    }
}




