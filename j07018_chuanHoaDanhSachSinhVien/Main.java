package j07018_chuanHoaDanhSachSinhVien;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> list = new ArrayList<>();
        while (n-- >0){
            String tenSV = sc.nextLine(),
                    lop = sc.nextLine(),
                    ngaySinh = sc.nextLine();
            double gpa = Double.parseDouble(sc.nextLine());
            list.add(new SinhVien(tenSV, lop, ngaySinh, gpa));
        }
        for (SinhVien i : list)
            System.out.println(i);
    }
}
