class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1= nums1.length;
        int len2= nums2.length;

        int []mer= new int[len1+len2];
        int tlen=mer.length;
        
        int k=0;
        for(int i=0; i<len1; i++){
            mer[k++]= nums1[i];
        }
        for(int i=0; i<len2; i++){
            mer[k++]=nums2[i];
        }
        Arrays.sort(mer);

        // int tlen= mer.length;

        if(tlen%2==0){
            return(mer[tlen/2]+mer[tlen/2-1])/2.0;
        }else{
            return mer[tlen/2];
        }
       
    }
}
