import java.util.*;

public class InsertionSortPart2 {

    static void printArray(int[] ar) {
        for (int x : ar) System.out.print(x + " ");
        System.out.println();
    }

    static void insertionSortPart2(int[] ar) {
        for (int i = 1; i < ar.length; i++) {
            int key = ar[i];
            int j = i - 1;
            while (j >= 0 && ar[j] > key) {
                ar[j + 1] = ar[j];
                j--;
            }
            ar[j + 1] = key;
            printArray(ar);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) ar[i] = sc.nextInt();
        insertionSortPart2(ar);
    }
}
