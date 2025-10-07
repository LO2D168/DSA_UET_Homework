import edu.princeton.cs.algs4.*;
import java.util.*;

public class InsertionSortTest {

    public static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        In in = new In("C:\\Lang Turtorial\\Java Tutorial\\DSA_UET\\algs4-data\\algs4-data\\4Kints.txt");
        int[] a = in.readAllInts();

        long start = System.currentTimeMillis();
        insertionSort(a);
        long end = System.currentTimeMillis();

        System.out.println("Thời gian chạy: " + (end - start) + "ms");
    }
}
