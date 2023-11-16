package j05048_bangTheoDoiNhapXuatHang;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<MaHang> list = new ArrayList<>();
        while (n-->0){
            String maHang = sc.next();
            long soLuongNhap = sc.nextLong();
            list.add(new MaHang(maHang, soLuongNhap));
        }
        for (MaHang i: list){
            System.out.println(i);
        }
    }
}
