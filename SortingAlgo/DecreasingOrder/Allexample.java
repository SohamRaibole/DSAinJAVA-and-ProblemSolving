import java.util.*;

public class Allexample {
    public static void Bubble(int arr[]){
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
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
    System.out.println();
  }

       public static void selection(int arr[]){

    for (int i=0;i<arr.length;i++){
        int maxpos =i;
        for (int j=i+1;j<arr.length-1;j++){
            if (arr[maxpos]<arr[j]){
                maxpos=j; 
            }
        }
        int temp=maxpos;
        maxpos=i;
        i=temp;
    }
  }
    public static void insert(int arr[]){
        for (int i=1;i<arr.length;i++){
            int prev=i-1;
            int curr=i;
            if (curr<prev && prev>=0){
                arr [prev]=arr [prev+1];

            } arr [prev+1]=arr[curr];
        }

    }


    public static void main(String[] args) {
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        Bubble(arr);
        printArr(arr);
        selection(arr);;
        printArr(arr);
        insert(arr);
        printArr(arr);
    }
}
