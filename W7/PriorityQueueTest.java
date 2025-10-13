package DSA.W7;

import edu.princeton.cs.algs4.Heap;
import edu.princeton.cs.algs4.MaxPQ;
import edu.princeton.cs.algs4.MinPQ;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;
import java.util.Scanner;

public class PriorityQueueTest {
    public static void main(String[] args) {
        MinPQ<Integer> minpq = new MinPQ<>();
        MaxPQ<Integer> maxpq = new MaxPQ<>();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a  = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            minpq.insert(a[i]);
            maxpq.insert(a[i]);
        }

        StdOut.println("MinPQ: ");
        while (!minpq.isEmpty()) StdOut.print(minpq.delMin() + " ");
        StdOut.println("\nMaxPQ: ");
        while (!maxpq.isEmpty()) StdOut.print(maxpq.delMax() + " ");
        StdOut.println();

        Integer[] arr = Arrays.stream(a).boxed().toArray(Integer[]::new);
        Heap.sort(arr);
        for (int x : arr) StdOut.print(x + " ");
        StdOut.println();
    }
}
