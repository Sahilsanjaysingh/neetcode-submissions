class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas=0;
        int totalCost=0;
        for(int i=0; i<gas.length; i++){
            totalGas +=gas[i];
            totalCost += cost[i];
        }

        if(totalGas<totalCost){
            return -1;
        }

        int currgas=0;
        int str=0;

        for(int i=0; i<gas.length; i++){
            currgas += gas[i]-cost[i];
        
        if(currgas<0){
            str=i+1;
            currgas=0;
        }
        }
        return str;
    }
    
}
