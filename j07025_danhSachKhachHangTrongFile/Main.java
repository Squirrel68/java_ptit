package j07025_danhSachKhachHangTrongFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> list = new ArrayList<>();
        while(n-- > 0) {
            String tenKH = sc.nextLine(),
                   gt = sc.nextLine(),
                   birth = sc.nextLine(),
                   address = sc.nextLine();
            list.add(new KhachHang(tenKH, gt, birth, address));
        }
        Collections.sort(list);
        for (KhachHang kh : list)
            System.out.println(kh);

    }
}
