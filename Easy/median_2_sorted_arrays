# Median of two sorted arrays 

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        return Med(nums1,nums2,0,nums1.length-1,0,nums2.length-1);
    }
    public double Med(int[] nums1, int[] nums2, int start1, int end1, int start2, int end2){
        if(start1>end1 || start2>end2){
            return -1;
        }
        double med1 = GetMed(nums1, start1, end1);
        double med2 = GetMed(nums2, start2, end2);
        if(med1 == med2){
            return med1;
        }
        if(med1>med2){
            return Med(nums1, nums2, (start1+end1)/2, end1, start2, (start2+end2)/2);
        }
        return Med(nums1, nums2, start1, (start1+end1)/2, (start2+end2)/2, end2);
    }
    public double GetMed(int[] array, int start, int end){
        int val = start+end;
        if(val%2 == 1){
            double f1 = (double) array[val/2];
            double f2 = (double) array[(val/2) + 1];
            return (f1+f2)/2;
        }
        else{
            return (double) array[val/2];
        }
    }
}
