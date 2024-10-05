import java.util.*;
                               //Brute method of Maxsubarray sum
public class maxarraysum {

    public static void maxsum(int numbers[]){
      int currsum=0;
      int max=Integer.MIN_VALUE;
      for(int i=0;i<numbers.length;i++){
        int start=i;
        for(int j=0;j<numbers.length;j++){
            int end=j;
            for(int k=start;k<=end;k++){
                currsum+= numbers[k];
            }
            System.out.println(currsum+" ");
            if (max<currsum){
                max=currsum;
            }
        }
      }
      System.out.println(max);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8};
        maxsum(numbers);
    }







    }
    

