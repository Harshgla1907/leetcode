class Solution {
    public int searchInsert(int[] a, int t) {
        int left = 0;
        int right = a.length-1;
        while(left<=right){
            int mid = left +(right - left )/2;
            if (a[mid] == t) {
                return mid;
            }
            else if (a[mid] < t) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        
        return left;

        
    }
}