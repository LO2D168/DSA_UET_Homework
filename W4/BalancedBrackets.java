import java.util.*;

public class BalancedBrackets {
    static boolean ok(String s){
        Deque<Character> st = new ArrayDeque<>();
        for(char c: s.toCharArray()){
            if(c=='('||c=='['||c=='{') st.push(c);
            else if(c==')'||c==']'||c=='}'){
                if(st.isEmpty()) return false;
                char o = st.pop();
                if(o=='('&&c!=')' || o=='['&&c!=']' || o=='{'&&c!='}') return false;
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()) System.out.println(ok(sc.nextLine())?"YES":"NO");
    }
}