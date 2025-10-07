import edu.princeton.cs.algs4.*;
import java.util.*;

public class SelectionSortTest {

    public static void selectionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            int t = a[i];
            a[i] = a[min];
            a[min] = t;
        }
    }

    public static void main(String[] args) {
        In in = new In("C:\\Lang Turtorial\\Java Tutorial\\DSA_UET\\algs4-data\\algs4-data\\4Kints.txt");
        int[] a = in.readAllInts();

        long start = System.currentTimeMillis();
        selectionSort(a);
        long end = System.currentTimeMillis();

        System.out.println("Thời gian chạy: " + (end - start) + "ms");
    }
}
