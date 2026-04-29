class Solution {
    public boolean isPalindrome(String s) {
        //step1 clean the string
        //ste2 reversed the clean string
        //step3 caompare

        StringBuilder cleaned = new StringBuilder();
        for(char ch: s.toCharArray()) {
            if(Character.isLetterOrDigit(ch)){
                cleaned.append(Character.toLowerCase(ch));
            }
        }

        String original= cleaned.toString();
        String reversed= new StringBuilder(original).reverse().toString();
        
        return original.equals(reversed);
    }
}
