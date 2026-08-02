class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        HashMap<Character, Integer> mapone= new HashMap<>();
        for(int i=0; i<s1.length(); i++){
            char present= s1.charAt(i);
            mapone.put(present, mapone.getOrDefault(present, 0)+1);
        }
        HashMap<Character, Integer> maptwo= new HashMap<>();

        int left=0;
        int max_window=s1.length();
        
        for(int right=0; right<s2.length(); right++){
             char current= s2.charAt(right);
              maptwo.put(current, maptwo.getOrDefault(current, 0) +1);
             

              if(right-left+1 > max_window){
                char remove= s2.charAt(left);
                maptwo.put(remove, maptwo.get(remove)-1);
                if(maptwo.get(remove)==0){
                    maptwo.remove(remove);
                }
                left++;
              }

              if(right-left+1==max_window){
                if(mapone.equals(maptwo)){
                    return true;
                }
              }
        }
        return false;
    }
}
