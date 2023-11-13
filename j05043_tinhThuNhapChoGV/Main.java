package j05043_tinhThuNhapChoGV;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<NhanVien> list = new ArrayList<>();
        while (n-- >0) {
            sc.nextLine();
            String name = sc.nextLine(),level = sc.next();
            double base = sc.nextDouble(), days = sc.nextDouble();
            list.add(new NhanVien(name, level, base, days));
        }
        Collections.sort(list);
        for (NhanVien nv : list) System.out.println(nv);
    }
}
