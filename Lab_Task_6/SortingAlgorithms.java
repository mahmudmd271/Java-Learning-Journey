import java.util.Arrays;

public class SortingAlgorithms{
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n-1; i++) {
            for(int j = 0; j < n-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n-1; i++) {
            int minIndex = i;
            for(int j = i+1; j < n; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if(left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i=0; i<n1; i++) L[i] = arr[left + i];
        for(int j=0; j<n2; j++) R[j] = arr[mid + 1 + j];

        int i=0, j=0, k=left;

        while(i<n1 && j<n2) {
            if(L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }
        while(i<n1) arr[k++] = L[i++];
        while(j<n2) arr[k++] = R[j++];
    }

    public static void main(String[] args) {
        int[] arr1 = {64, 25, 12, 22, 11};
        int[] arr2 = arr1.clone();
        int[] arr3 = arr1.clone();
        
        System.out.println("Sample Input:"+Arrays.toString(arr1));
        bubbleSort(arr1);
        System.out.println("Bubble Sort: " + Arrays.toString(arr1));

        selectionSort(arr2);
        System.out.println("Selection Sort: " + Arrays.toString(arr2));

        mergeSort(arr3, 0, arr3.length-1);
        System.out.println("Merge Sort: " + Arrays.toString(arr3));
    }
}
