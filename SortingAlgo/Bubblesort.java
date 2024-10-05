import java.util.*;

public class Bubblesort {
 
    public static void bubble(int arr[]){

        for (int turn=0;turn<arr.length-1;turn++){    //it goes till o to n-1
            for(int j=0;j<arr.length-1-turn;j++){     //it goes till 0 to n-2 means turns are descresed
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];  //swap
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }
    public static void printArr(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        
    }

    public static void main(String[] args) {
        int arr[]={7,8,1,4,3};
        bubble(arr);
        printArr(arr);
    }
    
}
