class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result= new ArrayList<>();
        backtrack(0, nums, target, new ArrayList<>(), result);
        return result;
    }
    private void backtrack(int index, int []nums, int target, List<Integer>curr, List<List<Integer>>result){
        if(target==0){
            result.add(new ArrayList<>(curr));
            return;
        }
        if(index== nums.length)return;

        if(nums[index]<=target){
            curr.add(nums[index]);
            backtrack(index, nums, target-nums[index], curr, result);
            curr.remove(curr.size()-1);
        }
        backtrack(index+1, nums, target, curr, result);
    }

}
