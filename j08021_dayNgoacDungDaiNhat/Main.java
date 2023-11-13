package j08021_dayNgoacDungDaiNhat;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            Stack<Pair<Character, Integer>> st = new Stack<>();
            int ans = 0, n = s.length();
            int[] f = new int[n];
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == ')' && st.empty() == false && st.peek().first() == '(') {
                    f[i] = f[i - 1];
                    if (st.peek().second() != 0) {
                        f[i] += f[st.peek().second() - 1];
                    }
                    f[i] += 2;
                    st.pop();
                } else {
                    st.push(new Pair(s.charAt(i), i));
                }
                if(ans < f[i]) ans = f[i];
            }
            System.out.println(ans);
        }

    }

}
