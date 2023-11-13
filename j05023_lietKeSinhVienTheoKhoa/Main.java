package j05023_lietKeSinhVienTheoKhoa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<SinhVien> list = new ArrayList<>();
        while (n-- > 0) {
            String id = sc.next();
            sc.nextLine();
            String name = sc.nextLine(), cls = sc.next(), mail = sc.next();
            list.add(new SinhVien(id, name, cls, mail));
        }
        int q = sc.nextInt();
        while (q-- > 0) {
            String khoa = sc.next();
            System.out.println("DANH SACH SINH VIEN KHOA " + khoa + ":");
            khoa = khoa.substring(2);
            for (SinhVien sv : list) {
                if (sv.getCls().substring(1,3).equals(khoa)) {
                    System.out.println(sv);
                }
            }
        }
    }
}
