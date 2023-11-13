package j05030_bangDiemThanhPhan_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stt = 1;
        int n = sc.nextInt();
        ArrayList<SinhVien> list = new ArrayList<>();
        while (n--> 0) {
            String id = sc.next();
            sc.nextLine();
            String name = sc.nextLine();
            String cls = sc.nextLine();
            double d1 = Double.parseDouble(sc.nextLine());
            double d2 = Double.parseDouble(sc.nextLine());
            double d3 = Double.parseDouble(sc.nextLine());
            list.add(new SinhVien(id, name, cls, d1, d2, d3));
        }
        Collections.sort(list);
        for (SinhVien sv : list) {
            System.out.println((stt++) + " " + sv);
        }
    }
}
