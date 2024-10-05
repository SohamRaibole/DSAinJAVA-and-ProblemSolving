import java.util.*;
public class Quicksort {
    public static  void quick(int arr[],int si,int ei){

        if(si>=ei){
            return;
        }
        int pidx= partition(arr,si,ei);
        quick(arr, si, pidx-1);
        quick(arr, pidx+1, ei);
    }
    public  static int partition(int arr[],int si, int ei){
        int pivot=arr[ei];
        int i=si-1;
          
        for(int j=si;j<ei;j++){
            if(arr[j]<=arr[ei]){
                i++;
                int temp=arr[j];
                 arr[j]=arr[i];
                 arr[i]=temp;
                 
            }
             }
             i++;
            int temp=pivot;
                 arr[ei]=arr[i]; // here the pivot is changed
                 arr[i]=temp;
                 return i;

    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={5,3,7,2,4};
        quick(arr, 0,4);
        print(arr);

    }
    
}
