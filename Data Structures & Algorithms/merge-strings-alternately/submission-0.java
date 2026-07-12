 class Solution{
        public String mergeAlternately(String word1, String word2){
            
            char[]ans=new char[word1.length() + word2.length()];
            int k=0;
            for(int i=0; i<word1.length(); i++){
                for (int j = i; j < word2.length() && j == i; j++){
                    ans[k++]=word1.charAt(i);
                    ans[k++]=word2.charAt(i);
                }
            }

            for(int i=word2.length(); i<word1.length(); i++){
                ans[k++]=word1.charAt(i);
            }
            for (int j = word1.length(); j < word2.length(); j++) {
            ans[k++] = word2.charAt(j);
        }
return new String(ans);
        }
        
    }