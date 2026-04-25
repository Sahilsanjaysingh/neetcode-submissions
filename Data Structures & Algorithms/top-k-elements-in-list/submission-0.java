class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket= new List[nums.length+1];
        Map <Integer ,Integer> map= new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        } 
        for(int key : map.keySet()){
            int freq = map.get(key);
            if(bucket[freq]==null){
                bucket[freq]= new ArrayList<>();
            }
            bucket[freq].add(key);
        }
        int[]res= new int[k];
        int counter=0;
        for(int pop= bucket.length-1; pop>=0 && counter < k; pop--){
            if(bucket[pop]!=null){
                for(Integer integer: bucket[pop]){
                    res[counter++]= integer;
                }
            }
        }
         return res;
    }
}
