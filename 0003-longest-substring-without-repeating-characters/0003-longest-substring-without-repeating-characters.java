class Solution {
        public int lengthOfLongestSubstring(String s) {
                boolean[] seen = new boolean[128];
                        int left = 0, right = 0;
                                int maxLen = 0;

                                        while (right < s.length()) {
                                                    char ch = s.charAt(right);

                                                                while (seen[ch]) {
                                                                                seen[s.charAt(left)] = false;
                                                                                                left++;
                                                                                                            }

                                                                                                                        seen[ch] = true;
                                                                                                                                    maxLen = Math.max(maxLen, right - left + 1);
                                                                                                                                                right++;
                                                                                                                                                        }

                                                                                                                                                                return maxLen;
                                                                                                                                                                    }
                                                                                                                                                                    }
