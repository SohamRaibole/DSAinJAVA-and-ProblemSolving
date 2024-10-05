import java.util.*;

public class ex2 {
    public static void  sum(int nums[][]){
  
        int sum=0;
         for (int i=1;i<nums.length-1;i++){
              
            for (int j=0;j<nums[0].length;j++){
                sum+=nums[i][j];


            }
         }

System.out.println(sum);

    }
    public static void main(String[] args) {   //sum of second row
        int[][] nums = { {1,4,9},
                         {11,4,3},
                         {2,2,3} };
                         sum(nums);
    }
}
