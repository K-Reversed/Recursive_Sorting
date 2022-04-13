import java.util.Arrays;
import java.util.Random;

public class Test {
    //

    public static void main(String[] args) {
        Random r = new Random();
        int[] i = new int[1000];
        for (int j = 0; j < i.length; j++) {
            i[j] = r.nextInt(999);
        }
        System.out.println(Arrays.toString(i));
        MergeSort.sort(i, 0, 999);
        System.out.println(Arrays.toString(i));
        int rVal = r.nextInt(999);
        System.out.println("Random value = " + rVal);
        System.out.println(rVal + " Found at Index " + BinarySearch.binarySearch(i, 0, 999, rVal));
    }
}
