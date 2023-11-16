package j05049_lietKeNhapXuatHangTheoNhom;

import java.util.ArrayList;
import java.util.Collections;
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
        Collections.sort(list);
        char c = sc.next().charAt(0);
        for (MaHang i: list)
            if (i.getMaHang().charAt(0)==c)
                System.out.println(i);

    }
}
