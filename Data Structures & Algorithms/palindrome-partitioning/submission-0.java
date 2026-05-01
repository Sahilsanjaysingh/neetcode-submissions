class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result= new ArrayList<>();
        helper(0,s, new ArrayList<>(), result);
        return result;
    }
    public void helper(int start,String s, List<String>curr, List<List<String>> result){
        if(start== s.length()){
            result.add(new ArrayList<>(curr));
             return;
        }
        for(int i =start; i<s.length(); i++){
            if(isPalindrome(s, start, i)){
                curr.add(s.substring(start, i+1));
                helper(i+1, s, curr, result);
                curr.remove(curr.size()-1);
            }
        }
    }
    public boolean isPalindrome(String s, int l, int r){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)) {return false;}
            l++;
            r--;
        }
        return true;
    }
}
