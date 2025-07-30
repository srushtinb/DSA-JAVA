class Solution {
    static int max(int a[]){
        int m=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>m)
                m=a[i];
        }
        return m;
    }
    static int mineatingspeed(int a[],int h){
        int totalt=0;
        for(int i=0;i<a.length;i++){
            int q=a[i]/h;   // 5/4->1
            int r=a[i]%h; // 5%4->1
            if(r>0)
                totalt+=q+1;
            else
                totalt+=q;
        }
        return totalt;
    }
    static int totaltime(int a[],int h){
        int s=1,e=max(a);
        while(s<e){
            int mid=s+(e-s)/2;
            if(mineatingspeed(a,mid)>h)
                s=mid+1;
            else
                e=mid;
        }
        return s;
    }
    public int minEatingSpeed(int[] b, int h) {
        return totaltime(b,h);
    }
}