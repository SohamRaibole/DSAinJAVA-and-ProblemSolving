import java.util.*;

public class assg2 {
    public static int Stock(int prices[]){
     
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;

    for (int i=0;i<prices.length;i++){
        if (buyprice<prices[i]){
            int profit=prices[i]-buyprice;
            maxprofit=Math.max(maxprofit, profit);

        }
        else{
            buyprice=prices[i];
        }
    }

     return maxprofit; 


    } 






    public static void main(String[] args) {
        int prices[]={7,6,4,3,2,1};
        System.out.println(Stock(prices));
    }
}
