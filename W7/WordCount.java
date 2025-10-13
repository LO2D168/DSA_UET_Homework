package DSA.W7;

import edu.princeton.cs.algs4.StdOut;

import java.util.Scanner;

public class WordCount {
    static class TrieNode {
        TrieNode[] child = new TrieNode[36];
        int count = 0;
        boolean isEnd = false;
    }

    static TrieNode root = new TrieNode();

    static void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int idx = charIndex(c);
            if (idx == -1) continue;
            if (node.child[idx] == null) node.child[idx] = new TrieNode();
            node = node.child[idx];
        }
        node.isEnd = true;
        node.count++;
    }

    static int charIndex(char c) {
        if (c >= 'a' && c <= 'z') return c - 'a';
        if (c >= '0' && c <= '9') return 26 + (c - '0');
        return -1;
    }

    static void dfs(TrieNode node, StringBuilder sb) {
        if (node == null) return;
        if (node.isEnd) StdOut.println(sb + ": " + node.count);
        for (int i = 0; i < 36; i++) {
            if (node.child[i] != null) {
                char c = (i < 26) ? (char) ('a' + i) : (char) ('0' + i - 26);
                sb.append(c);
                dfs(node.child[i], sb);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder text = new StringBuilder();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.isEmpty()) break;
            text.append(line).append(" ");
        }

        String cleaned = text.toString().toLowerCase().replaceAll("[^a-z0-9\\s]", " ");
        String[] words = cleaned.split("\\s+");

        for (String w : words) {
            if (!w.isEmpty()) insert(w);
        }

        StdOut.println("\nTan suat xuat hien (theo thu tu tu dien):");
        dfs(root, new StringBuilder());
    }
}
