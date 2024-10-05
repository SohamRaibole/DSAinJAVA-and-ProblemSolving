public class FirstOccurance {
    public static int FirstOcc(int arr[],int key, int i){
        if(i== arr.length){
            return -1;
        }
        if (arr[i]== key){
            return i;
        }

        return FirstOcc(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[]= {1,1,2,3,4,3,5,7,8,9};
        System.out.println(FirstOcc(arr, 5, 0));
    }
    
}
