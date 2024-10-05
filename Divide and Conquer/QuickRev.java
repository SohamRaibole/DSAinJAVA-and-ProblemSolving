public class QuickRev {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void Quick(int arr[],int si, int ei){
        if(si>=ei){
            return;
        }
        int pIdx= partition(arr,si,ei);
        Quick(arr, si, pIdx-1);
        Quick(arr, pIdx+1, ei);
    }
    public static int partition(int arr[], int si, int ei){
        int pivot=arr[ei];
        int i=si-1;
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                int temp= arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }
        }
        i++;
        int temp= pivot;
                arr[ei]=arr[i];
                arr[i]=temp;
                return i;
}
public static void main(String[] args) {
    int arr[]= {7,5,4,3,2,1};
    Quick(arr, 0, arr.length-1);
    printArr(arr);
}
}
