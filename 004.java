import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double[] sum = new double[nums1.length + nums2.length];
        
        for (int i = 0; i < nums1.length; i++){
            sum[i] = nums1[i];
        }

        for (int i = 0; i < nums2.length; i++){
            sum[nums1.length + i] = nums2[i];
        }

        Arrays.sort(sum);

        if(sum.length % 2 == 0){
            double result = sum[sum.length / 2 - 1] + sum[sum.length / 2];
            return (result) / 2;
        }else{
            return sum[sum.length / 2];
        }
    }
}