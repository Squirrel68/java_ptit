package j05047_bangKeNhapKhoSapXepTheoChietKhau;

import j05046_bangKeNhapKho.MatHang;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> list = new ArrayList<>();
        while (n-->0){
            String tenHang = sc.nextLine();
            long soLuong = Long.parseLong(sc.nextLine());
            long donGia = Long.parseLong(sc.nextLine());
            list.add(new MatHang(tenHang, soLuong, donGia));
        }
        for (MatHang i: list){
            System.out.println(i);
        }
    }
}
