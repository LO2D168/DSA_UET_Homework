import java.util.*;

public class InsertionSortPart1 {

    static void printArray(int[] ar) {
        for (int x : ar) System.out.print(x + " ");
        System.out.println();
    }

    static void insertIntoSorted(int[] ar) {
        int n = ar.length;
        int key = ar[n - 1];
        int i = n - 2;

        while (i >= 0 && ar[i] > key) {
            ar[i + 1] = ar[i];
            printArray(ar);
            i--;
        }
        ar[i + 1] = key;
        printArray(ar);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) ar[i] = sc.nextInt();
        insertIntoSorted(ar);
    }
}
