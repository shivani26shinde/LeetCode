# Merge two sorted arrays

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
	
		// 2nd array is empty
        if(n == 0){
            return;
        }
		
		// 1st array is empty
        if(m == 0){
            for(int s=0;s<nums2.length;s++){
                nums1[s] = nums2[s];
            } 
            return;
        }
		
		// Both the arrays are empty
        if(m == 0 && n == 0){
            return;
        }
		
        int[] temp = new int[m+n];
        int i=0;
        int j=0;
        int k=0;
		
		// Iterate till the end of shorter array
        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                temp[k] = nums1[i];
                i++;
                k++;
            }
            else{
                temp[k] = nums2[j];
                j++;
                k++;
            }
        }
		
		// Add remaining elements of the longest array
        while(i < m){
            temp[k] = nums1[i];
            k++;
            i++;
        }
		
		// Add remaining elements of the longest array
        while(j < n){
            temp[k] = nums2[j];
            k++;
            j++;
        }
		
		// Copy elements of the new array to the 1st array
        for(int s=0;s<temp.length;s++){
            nums1[s] = temp[s];
        }
        return;
    }
}