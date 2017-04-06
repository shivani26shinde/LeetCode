# First Bad version

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if(n==0){
            return -1;
        }
        if(n==1){
            if(isBadVersion(n) == true){
                return n;
            }
            else{
                return -1;
            }
        }
        int start = 1;
        int end = n;
        int mid;
        while(start+1 < end){
            mid = start + (end-start)/2;
            boolean b = isBadVersion(mid);
            if(b == true){
                end = mid;
            }
            else{
                start = mid;
            }
        }
        if(isBadVersion(start) == true){
            return start;
        }
        if(isBadVersion(end) == true){
            return end;
        }
        return -1;
    }
}