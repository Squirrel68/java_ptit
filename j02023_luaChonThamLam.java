import java.util.Scanner;
public class j02023_luaChonThamLam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), s = sc.nextInt();
        if (s == 0 && n == 1) {
            System.out.println("0 0");
            return;
        }
        if (s == 0 || s > 9 * n) {
            System.out.println("-1 -1");
            return;
        }
        int[] min = new int[n];
        int[] max = new int[n];
        int sum = s;
        for (int i = 0; i < n; i++) {
            if (sum > 9) {
                max[i] = 9;
                sum -= 9;
            } else {
                max[i] = sum;
                sum = 0;
            }
        }

        for (int i=0; i<n; i++)
            min[i] = max[n-i-1];

        if (min[0] == 0) {
            min[0] = 1;
            for (int i = 1; i < n; i++) {
                if (min[i] != 0) {
                    min[i]--;
                    break;
                }
            }
        }


        //in
        for (int i = 0; i < n; i++) {
            System.out.print(min[i]);
        }
        System.out.print(" ");
        for (int i = 0; i < n; i++) {
            System.out.print(max[i]);
        }
    }
}
