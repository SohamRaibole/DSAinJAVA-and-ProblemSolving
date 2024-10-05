public class Rotatedsortedarray {
    public static int search(int arr[],int tar,int si,int ei){

        int mid =(si+ei)/2;
         if(si>=ei){
            return -1;
         }
        if(tar == arr[mid]){
            return mid;
        }

        if(arr[si]<=arr[mid]){
            //case1
            if(arr[si]<=tar && tar<= mid){
              return  search(arr, tar, si, mid-1);
            }
            else{
                return search(arr, tar, mid+1, ei);
            }
        }
        else{
            if(mid<=tar && tar<=ei){
               return search(arr, tar, mid+1, ei);
            }
            else{
               return search(arr, tar, si, mid-1);
            }
        }


    }
    public static void main(String[] args) {
        int arr[]={3,4,6,7,0,1,2};
        int ind=search(arr, 1, 0, arr.length);
        System.out.println(ind);
    }
    
}
