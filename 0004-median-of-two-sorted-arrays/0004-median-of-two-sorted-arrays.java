class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i,j,k=0;
        int n=nums1.length;
        int m=nums2.length;
        int n1[]=new int[m+n];
        for(i=0;i<n;i++){
            n1[k++]=nums1[i];
        }
        for(j=0;j<m;j++){
            n1[k++]=nums2[j];
        }
        Arrays.sort(n1);
           
        double med;
        int l=n+m;
        if(l%2!=0)
            med=n1[l/2];
        else
            med=(n1[l/2]+n1[(l/2)-1])/2.0;

        return med;
        
    }
}