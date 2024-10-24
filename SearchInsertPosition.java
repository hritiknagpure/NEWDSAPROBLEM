Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4

class Solution {
    public int searchInsert(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            
             if(nums[mid]>target){
                    high=mid-1;
            }
            else if(nums[mid]<target){
                    low=mid+1;
            }
            else if(nums[mid]==target){
                return mid;
            }
        }
        return low;
        
    }
}
