class Solution {
    public int scoreOfString(String s) {
        char ch[] = s.toCharArray();
        int n=ch.length;
        int a[]=new int[n];
        int h=0;
        for(int i=0;i<n;i++)
        {
          a[i]=ch[i];
        }
        for(int j=0;j<n-1;j++)
        {
           h+=Math.abs(a[j]-a[j+1]);
        }
        return h;
    }
}