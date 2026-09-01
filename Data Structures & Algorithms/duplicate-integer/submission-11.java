class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Arrays.sort(nums);
        // for(int i=0; i<nums.length-1;  i++){
        //     if(nums[i]==nums[i+1]) return true;
        // }
        // return false;

    // use hashset 
    HashSet<Integer> seen= new HashSet<>();
    for(int num : nums){
        if(!seen.add(num)){
            return true;
        }
    }
    return false;

    }

}