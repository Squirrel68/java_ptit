package j07081_sapXepDanhSachSinhVien;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> l = new ArrayList<>();
        while (n-->0) {
            String ma = sc.nextLine(), ten = sc.nextLine(),sdt = sc.nextLine(), email = sc.nextLine();
            l.add(new SinhVien(ma, ten, sdt, email));
        }
        Collections.sort(l);
        for (SinhVien i : l)
            System.out.println(i);
    }
}
