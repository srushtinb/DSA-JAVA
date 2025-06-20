class Solution {
    public int maxProfit(int[] prices) {
        
   int n=prices.length;
    int i,min=prices[0],profit=0,max=0;
    //max=prices[0], 
    
    for(i=1;i<n;i++){
        if(prices[i]<min){
            min= prices[i];
            //max= prices[i];
        }
        profit = prices[i]-min;
        if(profit >max)
        max=profit;


    }
    return max;
}
    

    }