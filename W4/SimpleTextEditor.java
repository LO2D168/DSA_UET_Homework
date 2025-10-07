import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Q = Integer.parseInt(sc.nextLine().trim());
        StringBuilder s = new StringBuilder();
        Deque<String> hist = new ArrayDeque<>();
        StringBuilder out = new StringBuilder();

        while (Q-- > 0) {
            String line = sc.nextLine();
            String[] t = line.split(" ");
            int k = Integer.parseInt(t[0]);
            if (k == 1) {
                hist.push(s.toString());
                s.append(t[1]);
            } else if (k == 2) {
                hist.push(s.toString());
                int del = Integer.parseInt(t[1]);
                s.setLength(s.length() - del);
            } else if (k == 3) {
                int idx = Integer.parseInt(t[1]);
                out.append(s.charAt(idx - 1)).append('\n');
            } else {
                s = new StringBuilder(hist.pop());
            }
        }

        System.out.print(out.toString());
    }
}
