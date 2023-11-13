package j05014_tuyenGiaoVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<GiaoVien> list = new ArrayList<>();
        while(n-- > 0) {
            sc.nextLine();
            String name = sc.nextLine();
            String maXT=sc.nextLine();
            double th = sc.nextDouble(), cm = sc.nextDouble();
            list.add(new GiaoVien(name, maXT, th, cm));
        }
        Collections.sort(list);
        for(GiaoVien i : list) {
            System.out.println(i);
        }
    }
}
