class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st= new Stack<>();
       
        for(String op : operations){
            if(op.equals("+")){
            int top= st.pop();
            int newScore = top+st.peek();
            st.push(top);
            st.push(newScore);
            }
            else if (op.equals("D")){
                st.push(st.peek()*2);
            }else if (op.equals("C")){
                st.pop();
            }else{
                st.push(Integer.parseInt(op));
            }
        }
        int result=0;
        for(int score:st){
            result+= score;
        }
        return result;
    }
}