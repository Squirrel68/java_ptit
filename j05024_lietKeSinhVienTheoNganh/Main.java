package j05024_lietKeSinhVienTheoNganh;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> list = new ArrayList<>();
        while (n-- >0) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            SinhVien sv = new SinhVien(ma, ten, lop, email);
            list.add(sv);
        }
        int q = Integer.parseInt(sc.nextLine());
        while (q-- >0) {
            String nganh = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN NGANH " + nganh.toUpperCase() + ":");
            String key="";
            if (nganh.equalsIgnoreCase("ke toan")) key = "DCKT";
            else if (nganh.equalsIgnoreCase("cong nghe thong tin")) key = "DCCN";
            else if (nganh.equalsIgnoreCase("dien tu")) key = "DCDT";
            else if (nganh.equalsIgnoreCase("an toan thong tin")) key = "DCAT";
            else if (nganh.equalsIgnoreCase("vien thong")) key = "DCVT";
            for (SinhVien sv : list) {
                if (key=="DCCN" || key=="DCAT") {
                    // masv bat dau = "E" thi continue
                    if (sv.getLop().charAt(0) == 'E') continue;
                    if (sv.getMaSV().substring(3, 7).equalsIgnoreCase(key)) {
                        System.out.println(sv);
                    }
                }
                else {
                    if (sv.getMaSV().substring(3, 7).equalsIgnoreCase(key)) {
                        System.out.println(sv);
                    }
                }
            }
        }

    }
}
