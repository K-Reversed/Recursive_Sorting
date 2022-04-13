public class BinarySearch {
    public static int binarySearch(int[] arr, int left, int right, int x) {
        if (right >= left) {
            int mid = (left + right) / 2;
            if (arr[mid] == x) {
                return mid;
            } else {
                if (arr[mid] > x) {
                    return binarySearch(arr, left, mid - 1, x);
                } else {
                    return binarySearch(arr, mid + 1, right, x);
                }
            }
        }
        return -1;
    }
}
