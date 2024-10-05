import java.util.*;

public class Selectionsort {
    
    public static void selection(int arr[]){

        for (int i=0;i<arr.length;i++){
            int minPos=i;
            for (int j=i+1;j<arr.length;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            int temp=arr[minPos];
            arr [minPos]=arr[i];   //swap 
            arr[i]=temp;              //in this we are finding smallest at index i and further it
                                         //will for index 1,2,3 and so on


        }

    }
   public static  void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }





    public static void main(String[] args) {
        int arr[]={5,4,1,2,3};
        selection(arr);
        printArr(arr);

    }
}
