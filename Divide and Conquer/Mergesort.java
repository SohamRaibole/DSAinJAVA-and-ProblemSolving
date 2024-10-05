class Mergesort {

    // Function to print the array
    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Merge function to recursively divide the array
    public static void merge(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        int mid = (si + ei) / 2; // Find the middle point
        merge(arr, si, mid);      // Recursively sort the first half
        merge(arr, mid+1, ei);    // Recursively sort the second half

        sort(arr, si, mid, ei);   // Merge the sorted halves
    }

    // Sort function to merge two halves
    public static void sort(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei - si + 1]; // Temporary array to store merged values
        int i = si;      // Initial index of the left subarray
        int j = mid + 1; // Initial index of the right subarray
        int k = 0;       // Initial index of the temp array

        // Merge the two subarrays into temp[]
        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy the remaining elements of the left subarray, if any
        while(i <= mid){
            temp[k++] = arr[i++];
        }

        // Copy the remaining elements of the right subarray, if any
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        // Copy the sorted subarray back to the original array
        for(k = 0, i = si; i <= ei; k++, i++){
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        // Input array
        int arr[] = {7, 4, 8, 2, 3, 4};

        // Call merge sort on the array
        merge(arr, 0, arr.length - 1);

        // Print the sorted array
        print(arr);
    }
}
