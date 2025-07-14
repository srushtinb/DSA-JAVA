class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=1;i<=n;i++)
            arr.add(i);
        int idx=0;
        while(arr.size()>1){
            idx=(idx+(k-1))%arr.size();
            arr.remove(idx);

        }
        return arr.get(0);
    }
}