class Solution {
    public int search(int[] nums, int target) {
       int start=0;
       int endarr=nums.length-1;
       while (start<=endarr){
        int mid= (start+endarr)/2;

        if(target>nums[mid]){
            start=mid+1;
        }
        else if(target<nums[mid]){
            endarr =mid-1;
        }else { 
            return mid;
            }
       }
       return -1;
    }
}
