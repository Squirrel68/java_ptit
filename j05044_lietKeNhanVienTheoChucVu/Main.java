package j05044_lietKeNhanVienTheoChucVu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        ArrayList<NhanVien> list = new ArrayList<>();
        while (n-- >0) {
            sc.nextLine();
            String name = sc.nextLine(), level = sc.next();
            double base = sc.nextDouble(), days = sc.nextDouble();
            list.add(new NhanVien(name, level, base, days));
        }
        String s = sc.next();
        for (NhanVien nv : list) {
            if (nv.getLevel().equals(s)) System.out.println(nv);
        }
    }
}
