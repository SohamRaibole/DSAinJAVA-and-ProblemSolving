import java.util.*;

public class Print7in2d {
  public static void print(int array[][]) {  
    int count=0;
    for(int i=0;i<array.length;i++){
        for(int j=0;j<array[0].length;j++){
            if (array[i][j] == 7){
                count++;
            }
        }
    }
System.out.println(count);
  }   

    public static void main(String[] args) {
        int[][] array = { {4,7,8},
                          {8,8,7} };
                 print(array);
    }
}
