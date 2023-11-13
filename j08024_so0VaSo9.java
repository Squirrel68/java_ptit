import java.util.Queue;
import java.util.Scanner;
import java.util.Vector;

public class j08024_so0VaSo9 {
    static int n;
    static Vector<String> v = new Vector<>();

    static void Try(String s, int k) {
        if (s.length() == k) {
            v.add(s);
            return;
        }
        Try(s + "0", k);
        Try(s + "9", k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= 16; i++)
            Try("", i);
        while (t-- > 0) {
            int n = sc.nextInt();
            for (String i:v) {
                if (Integer.parseInt(i)==0) continue;
                if (Integer.parseInt(i) % n == 0){
                    System.out.println(i);
                    break;
                }
            }
        }
        sc.close();
    }
}
