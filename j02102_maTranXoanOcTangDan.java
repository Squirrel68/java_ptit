import java.util.ArrayList;
import java.util.Scanner;

public class j02102_maTranXoanOcTangDan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<n; i++)
            for (int j=0; j<n; j++)
                list.add(sc.nextInt());
        // sort list
        list.sort(Integer::compareTo);
        int x = 0, y = 0, cnt = 0;
        while (cnt < n*n) {
            for (int i=y; i<n-y; i++) a[x][i] = list.get(cnt++);
            for (int i=x+1; i<n-x; i++) a[i][n-y-1] = list.get(cnt++);
            for (int i=n-y-2; i>=y; i--) a[n-x-1][i] = list.get(cnt++);
            for (int i=n-x-2; i>x; i--) a[i][y] = list.get(cnt++);
            x++; y++;
        }
        for (int i=0; i<n; i++) {
            for(int j=0; j<n; j++)
                System.out.printf("%d ", a[i][j]);
            System.out.println();
        }
    }
}
