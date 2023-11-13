package j05020_sapXepSinhVienTheoLop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<SinhVien> l = new ArrayList<>();
        while (n-- >0) {
            String id = sc.next();
            sc.nextLine();
            String name = sc.nextLine(), cls = sc.next(), email = sc.next();
            l.add(new SinhVien(id, name, cls, email));
        }
        Collections.sort(l);
        for(SinhVien i : l){
            System.out.println(i);
        }
    }
}
