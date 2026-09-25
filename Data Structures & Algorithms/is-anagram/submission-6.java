class Solution {
    public boolean isAnagram(String s, String t) {
        char[]arr=s.toCharArray();
        char[]arrr=t.toCharArray();
        if(arr.length!=arrr.length){
            return false;
        }
        Arrays.sort(arr);
        Arrays.sort(arrr);
        // for(int i=0; i<arr.length; i++ ){
        //     for(int j=0; i<arrr.length; j++){
        //         if(arr[i]==arrr[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;
        //not working 
        return Arrays.equals(arr, arrr);
    
    }
}
