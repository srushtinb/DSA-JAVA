class Solution {
    public double myPow(double x, int n) {
        double ans = 1.0;
        long newn = n;

        if(newn < 0) newn = -1 * newn;
        while(newn > 0){
            if(newn % 2 == 0){
                x = x * x;
                newn = newn / 2;        
            }
            else if(newn % 2 == 1){
                ans = ans * x;
                newn = newn - 1;
            }
        }
        if(n < 0) ans = (double)(1.0) / (double)(ans);
        return ans;
    }
}