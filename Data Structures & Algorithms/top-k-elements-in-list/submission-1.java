class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq= new HashMap<>();
        for(int i=0; i<nums.length; i++){
            freq.put(nums[i], freq.getOrDefault(nums[i], 0)+1);
        }
        List<Map.Entry<Integer, Integer>>list= new ArrayList<>(freq.entrySet());
        list.sort((a,b)-> b.getValue()-a.getValue());
        int []result= new int[k];
        for(int i=0; i<k; i++){
            result[i]= list.get(i).getKey();
        }
        return result;

        
    }
}
