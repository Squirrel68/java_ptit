package j02013_tichMaTrixVoiChuyenViCuaNo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  t = sc.nextInt();
        for (int i=1; i<=t; i++) {
            System.out.println("Test " + i + ":");
            int n = sc.nextInt(), m = sc.nextInt();
            Matrix a = new Matrix(n,m);
            a.input(sc);
            Matrix b = a.chuyenVi();
            Matrix c = a.nhan(b);
            System.out.println(c);
        }
    }
}
