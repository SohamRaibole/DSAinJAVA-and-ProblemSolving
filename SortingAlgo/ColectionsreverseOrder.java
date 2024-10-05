import java.util.*;

public class ColectionsreverseOrder {

public static void printArr(Integer arr[]){
    for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]);
    System.out.print("  ");
}}

    public static void main(String[] args) {
        Integer arr[]={12,34,23,56};
        Arrays.sort(arr,Collections.reverseOrder());
        printArr(arr);
    }
    

}