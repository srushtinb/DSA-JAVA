class Solution {
    public int twoEggDrop(int n) {
        int sum=0;
        for(int i=0;i<=n;i++){
            sum+=i;
            if(sum>=n)
                return i;
        }
        return n;
            
    }

}