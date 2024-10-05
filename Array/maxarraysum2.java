import java.util.*;
                               //prefix method of Maxsubarray sum
public class maxarraysum2 {

    public static void maxsum(int numbers[]){
      int currsum=0;
      int max=Integer.MIN_VALUE;
      int prefix[]=new int[numbers.length];
      prefix[0]=numbers[0];
      for (int i=1;i<prefix.length;i++)
      {
        prefix[i]= prefix[i-1]+numbers[i];
      }

      for(int i=0;i<numbers.length;i++){
        int start=i;
        for(int j=0;j<numbers.length;j++){
            int end=j;
            
            currsum=start == 0 ? prefix[end] : prefix[end]-prefix[start-1];
            
            if (max<currsum){
                max=currsum;
            }
        }
      }
      System.out.println(max);
    }
    public static void main(String[] args) {
        int numbers[]={0,2,4,6,8};
        maxsum(numbers);
    }







    }
    

