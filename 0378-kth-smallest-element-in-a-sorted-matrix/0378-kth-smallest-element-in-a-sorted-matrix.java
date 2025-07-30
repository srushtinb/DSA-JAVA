class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
       for(int[] q: matrix)
        for(int n:q){
            pq.offer(n);
        }
        for(int i=0;i<k-1;i++)
            pq.poll();



        return pq.poll();
    }
    
}