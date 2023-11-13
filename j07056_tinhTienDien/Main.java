package j07056_tinhTienDien;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> l = new ArrayList<>();
        while(n-->0) {
            String ten = sc.nextLine();
            String inp = sc.nextLine();
            String[] tmp = inp.split(" ");
            String loai = tmp[0];
            int dau = Integer.parseInt(tmp[1]);
            int cuoi = Integer.parseInt(tmp[2]);
            l.add(new KhachHang(ten, loai, dau, cuoi));
        }
        Collections.sort(l);
        for(KhachHang i : l) {
            System.out.println(i);
        }
    }
}
