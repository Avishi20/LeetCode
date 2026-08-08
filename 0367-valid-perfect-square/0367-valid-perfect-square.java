class Solution {
    public boolean isPerfectSquare(int x) {
        if(x == 0 || x == 1){
            return true;
        }
        int low = 1;
        int high = x;
        int ans = 0;

        while( low <= high){
            int mid = low + (high- low)/2;
            long square = (long) mid * mid;

            if( square == x){
                return true;
            }
            else if(square < x){
                low = mid +1;
            }
            else{
                high = mid -1;
            }
        }
        return false;
    }
}