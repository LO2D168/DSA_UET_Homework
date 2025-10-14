package DSA.W6;

import edu.princeton.cs.algs4.In;

import java.util.Arrays;

public class MergeSortTest {
    static void mergeSort(int[] a, int l, int r) {
        if (l >= r) return;
        int m = (l + r) / 2;
        mergeSort(a, l, m);
        mergeSort(a, m + 1, r);
        merge(a, l, m, r);
    }

    static void merge(int[] a, int l, int m, int r) {
        int[] left = Arrays.copyOfRange(a, l, m + 1);
        int[] right = Arrays.copyOfRange(a, m + 1, r + 1);
        int i = 0, j = 0, k = l;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) a[k++] = left[i++];
            else a[k++] = right[j++];
        }
        while (i < left.length) a[k++] = left[i++];
        while (j < right.length) a[k++] = right[j++];
    }

    public static void main(String[] args) {
        In in = new In("C:\\Lang Turtorial\\Java Tutorial\\DSA_UET\\algs4-data\\algs4-data\\4Kints.txt");
        int[] a = in.readAllInts();
        long start = System.currentTimeMillis();
        mergeSort(a, 0, a.length - 1);
        long end = System.currentTimeMillis();
    }
}
