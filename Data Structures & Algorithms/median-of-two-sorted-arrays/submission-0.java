class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] com = new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++){
            com[i]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            com[nums1.length+i]=nums2[i];
        }
        Arrays.sort(com);
        if(com.length%2!=0){
            return (double) com[com.length/2];
        } else {
            return (double) (com[com.length/2]+com[(com.length-1)/2])/2;
        }
    }
}
