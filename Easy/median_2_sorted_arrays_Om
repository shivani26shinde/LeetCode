# Median of two sorted arrays 
# Complexity: O(m+n)

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<nums1.length;i++){
            pq.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            pq.add(nums2[i]);
        }
        int indexOfMiddleNumber = pq.size()/2;
        if(pq.size()%2 == 1){
            for(int index = 0; index < indexOfMiddleNumber; ++index) {
                pq.poll();
            }
            int middleNumber = pq.poll();
            return (double) middleNumber;
        }
        else{
            for(int index=0;index<indexOfMiddleNumber-1;index++) {
                pq.poll();
            }
            double first = (double) pq.poll();
            double second = (double) pq.poll();
            double val = (first+second)/2;
            return val;
        }
    }
}
