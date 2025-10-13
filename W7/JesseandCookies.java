package DSA.W7;

import edu.princeton.cs.algs4.StdOut;

import java.util.PriorityQueue;
import java.util.Scanner;

public class JesseandCookies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) pq.add(sc.nextInt());

        int steps = 0;
        while (pq.size() > 1 && pq.peek() < k) {
            int m1 = pq.poll();
            int m2 = pq.poll();
            pq.add(m1 + 2 * m2);
            steps++;
        }

        if (pq.peek() != null && pq.peek() >= k)
            StdOut.println("So lan can thuc hien: " + steps);
        else
            StdOut.println("-1 (Khong the dat du K)");
    }
}
