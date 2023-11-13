import java.util.Scanner;
public class j03023_soLaMa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0) {
            String s = sc.next();
            int n = s.length();
            int[] a = new int[n];
            for (int i=0; i<n; i++) {
                switch (s.charAt(i)) {
                    case 'I': a[i] = 1; break;
                    case 'V': a[i] = 5; break;
                    case 'X': a[i] = 10; break;
                    case 'L': a[i] = 50; break;
                    case 'C': a[i] = 100; break;
                    case 'D': a[i] = 500; break;
                    case 'M': a[i] = 1000; break;
                }
            }
            int res = 0;
            for (int i=0; i<n; i++) {
                if (i == n-1 || a[i] >= a[i+1]) {
                    res += a[i];
                } else {
                    res += a[i+1] - a[i];
                    i++;
                }
            }
            System.out.println(res);
        }

    }
}
