package j04018_SoPhuc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            SoPhuc A = new SoPhuc(sc.nextInt(), sc.nextInt());
            SoPhuc B = new SoPhuc(sc.nextInt(), sc.nextInt());
            SoPhuc tmp = A.cong(B);
            SoPhuc C = tmp.nhan(A), D=tmp.nhan(tmp);
            System.out.println(C+", "+D);
        }
    }
}
