package j07084_thoiGianOnlLienTuc;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("ONLINE.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> list = new ArrayList<>();
        while (n-- >0) {
            String name = sc.nextLine(),
             start = sc.nextLine(),
             end = sc.nextLine();
            list.add(new SinhVien(name, start, end));
        }
        Collections.sort(list);
        for (SinhVien i : list)
            System.out.println(i);
    }
}
