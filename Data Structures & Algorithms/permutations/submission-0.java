class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        helper(nums, used, new ArrayList<>(), result);
        return result;
    }

    private void helper(int[] nums, boolean[] used, List<Integer> curr, List<List<Integer>> result) {
        // Base case
        if (curr.size() == nums.length) {
            result.add(new ArrayList<>(curr));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;

            // Choose
            used[i] = true;
            curr.add(nums[i]);

            // Explore
            helper(nums, used, curr, result);

            // Backtrack
            curr.remove(curr.size() - 1);
            used[i] = false;
        }
    }
}
