import java.util.Scanner;
import java.util.Arrays;

public class QueueUsingTwoStacks {
    static class IntStack {
        Integer[] a = new Integer[8];
        int n = 0;
        boolean isEmpty(){ return n==0; }
        void push(Integer x){
            if(n==a.length) a = Arrays.copyOf(a, a.length*2);
            a[n++] = x;
        }
        Integer pop(){ return a[--n]; }
        Integer peek(){ return a[n-1]; }
    }

    static class Q {
        IntStack in = new IntStack(), out = new IntStack();
        void move(){ if(out.isEmpty()) while(!in.isEmpty()) out.push(in.pop()); }
        void enqueue(Integer x){ in.push(x); }
        Integer dequeue(){ move(); return out.pop(); }
        Integer front(){ move(); return out.peek(); }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt(); Q qu = new Q();
        while(q-- > 0){
            int t = sc.nextInt();
            if(t==1) qu.enqueue(sc.nextInt());
            else if(t==2) qu.dequeue();
            else System.out.println(qu.front());
        }
    }
}
