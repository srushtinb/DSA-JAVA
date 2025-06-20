
int maxProfit(int* prices, int pricesSize) {
   
    int i,profit=0;
    for(i=1;i<pricesSize;i++){
        if(prices[i]>prices[i-1]){
           
        profit+= prices[i]-prices[i-1];
    }
        //if(profit >max)
        //max=profit;


    }
    return profit;
}

