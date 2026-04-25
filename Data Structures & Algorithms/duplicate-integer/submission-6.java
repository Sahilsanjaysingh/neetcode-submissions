// class Solution {
//     public boolean hasDuplicate(int[] nums) {
//         int n= nums.length;
//         for (int i=0;i<n; i++){
//             for(int j=i+1; j<n; j++){
//                 if(nums[i]==nums[j]){return true; }
//             }
//         }
//         return false;
//     }
// }


class Solution{
    public boolean hasDuplicate(int[] nums){
        HashSet<Integer> seen= new HashSet<>();
        for(int num:nums){
            if(!seen.add(num)){
                return true;
            }
        }
        return false;
    }
}