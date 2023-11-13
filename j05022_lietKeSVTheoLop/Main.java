package j05022_lietKeSVTheoLop;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<SinhVien> list = new ArrayList<>();
        while (n-- > 0) {
            String maSV = sc.next();
            sc.nextLine();
            String tenSV = sc.nextLine(), lop = sc.next(), email = sc.next();
            list.add(new SinhVien(maSV, tenSV, lop, email));
        }
        int q = sc.nextInt();
        while (q-- > 0) {
            String lop = sc.next();
            System.out.println("DANH SACH SINH VIEN LOP " + lop + ":");
            for (SinhVien sv : list) {
                if (sv.getLop().equals(lop)) {
                    System.out.println(sv);
                }
            }
        }
    }
}
