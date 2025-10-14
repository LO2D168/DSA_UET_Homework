package DSA.W6;

import java.util.Scanner;

public class IntroTutorial {
    static int binarySearch(int[] a, int x) {
        int l = 0, r = a.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a[mid] == x) return mid;
            if (a[mid] < x) l = mid + 1;
            else r = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        System.out.println(binarySearch(a, v));
    }
}
