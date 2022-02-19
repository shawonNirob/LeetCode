/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int h=n,l=1, mid;
        int result=0;
        while(l<=h){
            mid=l+(h-l)/2;
            if(isBadVersion(mid)){
                result=mid;
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return result;
    }
}