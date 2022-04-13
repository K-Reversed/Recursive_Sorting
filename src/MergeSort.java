public class MergeSort {
    public static int merges;
    public static int sorts;

    public static void merge(int arr[], int left, int middle, int right) {
        merges++;
        int n1 = middle - left + 1;
        int n2 = right - middle;
        int leftArr[] = new int[n1];
        int rightArr[] = new int[n2];
        for (int i = 0; i < n1; i++)
            leftArr[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            rightArr[j] = arr[middle + 1 + j];
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    public static void sort(int arr[], int left, int right) {
        sorts++;
        if (left < right) {
            int m = (left + right) / 2;
            sort(arr, left, m);
            sort(arr, m + 1, right);
            merge(arr, left, m, right);
        }
    }
}
