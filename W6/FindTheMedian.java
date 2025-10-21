package DSA.W6;

import java.util.*;

public final class FindTheMedian {
    private static final Random RNG = new Random();

    private static int partition(List<Integer> a, int lo, int hi) {
        int pivot = a.get(hi);
        int i = lo;
        for (int j = lo; j < hi; j++) {
            if (a.get(j) <= pivot) {
                Collections.swap(a, i, j);
                i++;
            }
        }
        Collections.swap(a, i, hi);
        return i;
    }

    private static int quickselect(List<Integer> a, int k) {
        int lo = 0, hi = a.size() - 1;
        while (lo <= hi) {
            int pIdx = lo + RNG.nextInt(hi - lo + 1);
            Collections.swap(a, pIdx, hi);

            int p = partition(a, lo, hi);
            if (p == k) return a.get(p);
            if (p < k)  lo = p + 1;
            else        hi = p - 1;
        }
        return -1;
    }

    public static int findMedian(List<Integer> arr) {
        int k = arr.size() / 2;
        return quickselect(arr, k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.hasNextInt() ? sc.nextInt() : 0;
        List<Integer> arr = new ArrayList<>(n);
        for (int i = 0; i < n; i++) arr.add(sc.nextInt());
        System.out.println(findMedian(arr));
    }
}
