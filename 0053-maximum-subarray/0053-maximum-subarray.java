class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int Sum = nums[0];
        for(int i=1;i<nums.length;i++){
            Sum = Math.max(nums[i],Sum+nums[i]);
            max=Math.max(max,Sum);
        }
        return max;
    }
}