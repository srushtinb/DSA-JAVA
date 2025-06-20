

class RecentCounter {
     Queue<Integer> requests;
 
    public RecentCounter() {
        requests = new LinkedList<>();
   
}
    public int ping(int t){
        if(requests.size()==0){
            requests.add(t);
            return 1;
        }
        else {
            int margin = t-3000;
            while(requests.size()!=0 && requests.peek()<margin){
                requests.poll();
            }
            requests.add(t);
        }
    return requests.size();
    }
}
    

  


/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */