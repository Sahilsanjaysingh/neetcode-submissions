class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> result= new ArrayList<>();
        for(int i=0; i<numCourses; i++){
            result.add(new ArrayList<>());
        }
        for(int[] p: prerequisites){
            int course= p[0];
            int prereq=p[1];
            result.get(prereq).add(course);
        }

        for(int i=0; i<numCourses; i++){
             boolean[] visiting = new boolean[numCourses];

            if(hasCycle(i, result, visiting)) {
                return false;
            }
        }
        return true;
    }
     public boolean hasCycle(int node,
                            List<List<Integer>> result,
                            boolean[] visiting) {

        // Cycle detected
        if(visiting[node]) {
            return true;
        }

        visiting[node] = true;

        for(int nei : result.get(node)) {

            if(hasCycle(nei, result, visiting)) {
                return true;
            }
        }

        visiting[node] = false;

        return false;
    }
}
 
