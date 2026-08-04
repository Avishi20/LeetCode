class Solution {
    public int[] singleNumber(int[] nums) {
       int XOR =0 ;
       for(int i =0 ; i <= nums.length -1; i++){
        XOR ^= nums[i];
       } 
       int right = XOR & -XOR;
       int x =0 , y=0;
       for(int i =0 ; i<= nums.length -1;i++){
            if((nums[i] & right)!=0){
                 x ^= nums[i];
            }
            else{
                y ^= nums[i]; 
            }
       }
        return new int[]{x, y};
    }
}