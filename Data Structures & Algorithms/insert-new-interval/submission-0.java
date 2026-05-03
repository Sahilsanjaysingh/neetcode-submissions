class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list= new ArrayList<>();

        //add all interval
        for(int []inter : intervals){
            list.add(inter);
        }

        list.add(newInterval);

        Collections.sort(list,(a,b)->a[0]-b[0]);

        List<int[]> result= new ArrayList<>();

        for(int[]curr : list){
            if(result.isEmpty() || result.get(result.size()-1)[1]<curr[0]){
                result.add(curr);
            }else{
                result.get(result.size()-1)[1]=Math.max(result.get(result.size()-1)[1],curr[1]);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
