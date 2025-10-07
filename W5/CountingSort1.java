import java.util.*;

public class CountingSort1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] count = new int[n];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            count[x]++;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(count[i] + " ");
        }
    }
}
