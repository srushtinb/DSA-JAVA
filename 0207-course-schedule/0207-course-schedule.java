class Solution {
     HashMap<Integer,List<Integer>> hm=new HashMap<>();
    Set<Integer> visSet=new HashSet<>();
    public boolean canFinish(int numCourses, int[][] prerequisites) {
       
        for(int i=0;i<numCourses;i++)
            hm.put(i,new ArrayList<Integer>());
        for(int[] pre:prerequisites){
            hm.get(pre[0]).add(pre[1]);
        }
        for(int i=0;i<numCourses;i++)
        {
            if(!dfs(i))
                return false;
        }
        return true;
    }
    public boolean dfs(int course)
    {
        if(visSet.contains(course))
            return false;
        if(hm.get(course).isEmpty())
        {
            return true;
        }
        visSet.add(course);
        for (int pre : hm.get(course)) 
        {
            if(!dfs(pre))
            {
                return false;
            }
        }
        visSet.remove(course);
        hm.put(course,new ArrayList<Integer>());
        return true;
    }
    
} 