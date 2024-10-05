public class MergeRev {
    // Function to print the array
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Function to recursively divide and merge the array
    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = (si + ei) / 2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);  // Merge the two halves
    }

    // Function to merge two sorted halves of the array
    public static void merge(int arr[], int si, int mid, int ei) {
        int i = si;
        int j = mid + 1;
        int k = 0;

        // Corrected size for temp[]
        int temp[] = new int[ei - si + 1];

        // Merging the two sorted halves in reverse order (descending)
        while (i <= mid && j <= ei) {
            if (arr[i] > arr[j]) {
                temp[k++] = arr[i++];  // Take from the left half if it's larger
            } else {
                temp[k++] = arr[j++];  // Take from the right half if it's larger
            }
        }

        // Copy remaining elements from the left half, if any
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from the right half, if any
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy the merged elements back to the original array
        for (k = 0, i = si; i <= ei; k++, i++) {
            arr[i] = temp[k];
        }
    }

    // Main function
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};  // Input array
        mergeSort(arr, 0, arr.length - 1);  // Call merge sort on the full array
        printArr(arr);  // Print the sorted array
    }
}
