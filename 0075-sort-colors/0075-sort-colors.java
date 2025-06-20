class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int temp;
        for(int i=n-1;i>0;i--){
            for(int j=i-1;j>=0;j--)
            if(nums[i]<nums[j]){
                temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        
          
                System.out.print(nums[i]+",");
        }
    }
}
    