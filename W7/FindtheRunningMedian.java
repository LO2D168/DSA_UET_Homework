package DSA.W7;

import edu.princeton.cs.algs4.StdOut;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class FindtheRunningMedian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StdOut.print("Nhap so luong N: ");
        int N = sc.nextInt();

        PriorityQueue<Integer> minPQ = new PriorityQueue<>();
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            if (maxPQ.isEmpty() || x < maxPQ.peek()) maxPQ.add(x);
            else minPQ.add(x);

            if (maxPQ.size() > minPQ.size() + 1)
                minPQ.add(maxPQ.poll());
            else if (minPQ.size() > maxPQ.size())
                maxPQ.add(minPQ.poll());

            if (maxPQ.size() == minPQ.size())
                StdOut.printf("%.1f\n", (maxPQ.peek() + minPQ.peek()) / 2.0);
            else
                StdOut.printf("%.1f\n", (double) maxPQ.peek());
        }
    }
}

