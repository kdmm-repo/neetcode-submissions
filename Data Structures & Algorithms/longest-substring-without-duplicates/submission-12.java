class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLen = 0; 
        for(int i=0; i<n ; i++) {
            Set<Character> cs = new HashSet();
            int size =0;
            for(int j=i; j<n ; j++){
                if(cs.contains(s.charAt(j))){
                    break;
                } 
                cs.add(s.charAt(j));
                maxLen = Math.max(maxLen, cs.size());
            }
            
        }
        return  maxLen ;
    }
}
