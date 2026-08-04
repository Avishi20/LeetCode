class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        
        int[] freq = new int[51];

        // Count frequency
        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;
        }

        int ans = 0;

        // XOR numbers that appear twice
        for (int i = 1; i <= 50; i++) {
            if (freq[i] == 2) {
                ans ^= i;
            }
        }

        return ans;
    }
}