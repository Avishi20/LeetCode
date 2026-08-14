class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < k; i++) {
            if ("aeiou".contains(""+s.charAt(i))) {
                count++;
            }
        }
        max = count;
         for (int i = k; i < s.length(); i++) {
            if ("aeiou".contains(""+s.charAt(i))) {
                count++;
            }
            if ("aeiou".contains(""+s.charAt(i - k))) {
                count--;
            }
        max = Math.max(max, count);
        }
        return max;
          
            
}
}