class Solution {
    public int characterReplacement(String s, int k) {
          HashMap<Character, Integer> map = new HashMap<>();
         int left =0;
         int maxFreq=0;
         int maxlen=0;
         for(int right=0; right<s.length(); right++){
            char current= s.charAt(right);
            map.put(current, map.getOrDefault(current, 0) +1);
            
            maxFreq= Math.max(maxFreq, map.get(current));

            while((right- left+1) - maxFreq > k){

                char leftchar= s.charAt(left);
                map.put(leftchar, map.get(leftchar)-1);
                left++;
            }

            maxlen=Math.max(maxlen, right -left +1);
         }
         return maxlen;
    }
}


