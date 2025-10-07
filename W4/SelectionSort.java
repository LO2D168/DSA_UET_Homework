import java.util.Scanner;
import java.util.Arrays;

public class SelectionSort {
    static void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int m = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[m]) {
                    m = j;
                }
            }
            int t = a[i];
            a[i] = a[m];
            a[m] = t;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
