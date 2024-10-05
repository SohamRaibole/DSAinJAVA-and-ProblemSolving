import java.util.*;
public class Inbuiltsort {

    public static void printArr(int arr[])
    {
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={5,3,2,8,4};
        Arrays.sort(arr);
        printArr(arr);
        System.out.println();
        //for specific number
        Arrays.sort(arr,0,2);
        printArr(arr);
    }


    
}
