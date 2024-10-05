public class Indices {
    public static void ind(int arr[],int key,int i){
        if( i==arr.length){
            return ;
        }
        if(arr[i]==key){
            System.out.print(i+" ");

        }
        ind(arr, key, i+1);
    }
public static void main(String[] args) {
    int arr[]={2,3,4,2,5,2,3};
    ind(arr, 2, 0);
}
    
}
