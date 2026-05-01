class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result= new ArrayList<>();
        if(digits.length()==0)return result;
        String map[]={
            "",    //0
            "",    //1
            "abc", //2
            "def", //3
            "ghi", //4
            "jkl", //5
            "mno", //6
            "pqrs", //7
            "tuv",//8
            "wxyz",//9
        };
        helper(0, digits, new StringBuilder(), result, map);
        return result;
    }
    private void helper(int index, String digits, StringBuilder curr, List<String> result, String[]map){

        if(index== digits.length()){
            result.add(curr.toString());
            return ;
        }
        String letter= map[digits.charAt(index)-'0'];
        for (char ch : letter.toCharArray()) {
            curr.append(ch);

            helper(index + 1, digits, curr, result, map);

            curr.deleteCharAt(curr.length() - 1); // backtrack
        }

    }
}
