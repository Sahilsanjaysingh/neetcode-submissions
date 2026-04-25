class Solution {
    public int search(int[] nums, int target) {

        // for(int i=0; i<nums.length; i++){
        //     if(nums[i]==target){
        //         return i;
        //     }
        // }
        // return -1;// O(n)


        int left=0;
        int right=nums.length-1;

        while(left<right){
            int mid= left+(right-left)/2;

            if(nums[mid]> nums[right]){
                left= mid+1;
            }
            else{
                right=mid;
            }
        }

        int pivot = left;

        left=0;
        right= nums.length-1;

        if(target>= nums[pivot] && target<= nums[right]){
            left= pivot;
        }else{
            right=pivot-1;
        }

        while(left<= right){
            int mid=left+(right-left)/2;
            if(nums[mid]== target) return mid;
            else if(nums[mid]<target) left=mid+1;
            else right= mid-1;
        }
         return -1;
    }
}
