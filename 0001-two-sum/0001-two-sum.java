class Solution {
    public int[] twoSum(int[] nums, int target) {
        int indices[]= new int[2];
        for(int i=0 ;i<=nums.length-1;i++){
            for(int j=i+1 ;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    indices[0]=i;
                    indices[1]=j;
                    return indices;
                }
            }
        }
            return indices;
    }
}


//another approach 
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();

        int n=nums.length;
        for(int i=0;i<n;i++){
            int complement=target-nums[i];
        if(map.containsKey(complement)){
            return new int[]{map.get(complement),i};
        }
     map.put(nums[i],i);
        }
        return new int[]{};
    }
}
