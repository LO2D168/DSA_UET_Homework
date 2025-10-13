package DSA.W7;

import edu.princeton.cs.algs4.StdOut;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class JavaStringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();

        Stack<Character> st = new Stack<>();
        Queue<Character> q = new LinkedList<>();

        for (char c : s.toCharArray()) {
            st.push(c);
            q.add(c);
        }

        boolean isPalindrome = true;
        while (!st.isEmpty()) {
            if (!st.pop().equals(q.remove())) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) StdOut.println("YES - Day la palindrome");
        else StdOut.println("NO - Khong phai palindrome");
    }
}
