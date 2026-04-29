class Solution {
    public boolean isPalindrome(String s) {
        //step1 clean the string
        //ste2 reversed the clean string
        //step3 caompare

        // StringBuilder cleaned = new StringBuilder();
        // for(char ch: s.toCharArray()) {
        //     if(Character.isLetterOrDigit(ch)){
        //         cleaned.append(Character.toLowerCase(ch));
        //     }
        // }

        // String original= cleaned.toString();
        // String reversed= new StringBuilder(original).reverse().toString();
        
        // return original.equals(reversed);

        int left =0;
        int right=s.length()-1;
        while(left<right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
         
    }
}
