import java.util.Scanner;

public class EqualStacks {
    static int sum(int[] a) {
        int s = 0;
        for (int x : a) s += x;
        return s;
    }

    static int solve(int[] h1, int[] h2, int[] h3) {
        int s1 = sum(h1);
        int s2 = sum(h2);
        int s3 = sum(h3);
        int i = 0, j = 0, k = 0;
        while (true) {
            if (i == h1.length || j == h2.length || k == h3.length) return 0;
            if (s1 == s2 && s2 == s3) return s1;
            if (s1 >= s2 && s1 >= s3) s1 -= h1[i++];
            else if (s2 >= s1 && s2 >= s3) s2 -= h2[j++];
            else s3 -= h3[k++];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int[] h1 = new int[n1];
        int[] h2 = new int[n2];
        int[] h3 = new int[n3];
        for (int i = 0; i < n1; i++) h1[i] = sc.nextInt();
        for (int i = 0; i < n2; i++) h2[i] = sc.nextInt();
        for (int i = 0; i < n3; i++) h3[i] = sc.nextInt();
        System.out.println(solve(h1, h2, h3));
    }
}
