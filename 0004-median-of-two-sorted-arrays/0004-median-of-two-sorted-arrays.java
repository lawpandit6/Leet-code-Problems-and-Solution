class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergeArrays=mergeTwoArrays(nums1,nums2);
        int n=mergeArrays.length;
        if(n%2!=0){
            return (double)mergeArrays[n/2];
        }else{
            n/=2;
            return (double)(mergeArrays[n-1]+mergeArrays[n])/2;
        }
        
    }
    public int[] mergeTwoArrays(int[] nums1,int[] nums2){
        int i=0,j=0,k=0;
        int[] merge=new int[nums1.length+nums2.length];
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                merge[k]=nums1[i];
                k++;
                i++;
            }else{
                merge[k]=nums2[j];
                k++;
                j++;
            }
        }
        while(i<nums1.length){
            merge[k]=nums1[i];
            i++;
            k++;
        }
        while(j<nums2.length){
            merge[k]=nums2[j];
            j++;
            k++;
        }
        return merge;
    }
}