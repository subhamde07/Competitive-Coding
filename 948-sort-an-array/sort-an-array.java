class Solution {
    void swap(int[] arr, int st, int lt) {
        int temp = arr[st];
        arr[st] = arr[lt];
        arr[lt] = temp;
    }

    int medianOfThree(int[] arr, int start, int end) {
        int mid = start + (end - start) / 2;
        if (arr[start] > arr[mid]) {
            swap(arr, start, mid);
        }
        if (arr[start] > arr[end]) {
            swap(arr, start, end);
        }
        if (arr[mid] > arr[end]) {
            swap(arr, mid, end);
        }
        swap(arr, mid, end - 1); // Hide pivot at end-1
        return arr[end - 1];
    }

    public int partition(int[] arr, int start, int end) {
        int pivot = medianOfThree(arr, start, end);
        int i = start;
        int j = end - 1;

        while (true) {
            while (arr[++i] < pivot) {
                // No action needed, just move i right
            }
            while (arr[--j] > pivot) {
                // No action needed, just move j left
            }
            if (i >= j) {
                break;
            }
            swap(arr, i, j);
        }
        swap(arr, i, end - 1); // Restore pivot
        return i;
    }

    public void quickSort(int[] arr, int start, int end) {
        if (start + 10 <= end) {
            int pivot = partition(arr, start, end);
            quickSort(arr, start, pivot - 1);
            quickSort(arr, pivot + 1, end);
        } else {
            insertionSort(arr, start, end);
        }
    }

    public void insertionSort(int[] arr, int start, int end) {
        for (int i = start + 1; i <= end; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= start && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

}