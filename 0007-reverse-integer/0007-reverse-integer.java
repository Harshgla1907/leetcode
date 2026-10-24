class Solution {
    public int reverse(int x) {
       long s=0;
       while(x!=0)
       {
        int r=x%10;
        x=x/10;
        s=s*10+r;
       }
       return (s<Integer.MIN_VALUE || s>Integer.MAX_VALUE)? 0:(int)s;
       
        }
}