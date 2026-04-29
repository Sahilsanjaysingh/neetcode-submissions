class Solution {
    public int[] twoSum(int[] nums, int target) {
        // for(int i=0;i<nums.length; i++){
        //     for(int j=0; j<nums.length; j++){
        //         if(i!=j && nums[i]+nums[j]== target){
        //             return new int[]{i, j};
        //         }
        //     }
        // }
        // return new int []{-1,-1};

        // Approach two HashMap
        HashMap<Integer, Integer> see= new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int comp= target- nums[i];
            if(see.containsKey(comp)){
                return new int []{see.get(comp),i};
            }
            see.put (nums[i],i);
        }
        return new int []{-1,-1};

        
    }
}
