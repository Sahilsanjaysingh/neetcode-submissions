class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low =1;
        int high =0;

        for(int x:piles){
            high= Math.max(high, x);
        }
        while(low<= high){
            int mid= low+(high-low)/2;
            int total=0;
            for(int i=0;i<piles.length; i++){
                total+= Math.ceil((double)piles[i]/mid);
            }
            if(total<= h){
                high= mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}
