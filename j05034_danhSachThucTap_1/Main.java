package j05034_danhSachThucTap_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<SinhVien> list = new ArrayList<>();
        while (n-- > 0) {
            String id = sc.next();
            sc.nextLine();
            String name = sc.nextLine(), className = sc.next(), email = sc.next(), company = sc.next();
            list.add(new SinhVien(id, name, className, email, company));
        }
        Collections.sort(list);
        int q = sc.nextInt();
        while (q-- > 0) {
            String s = sc.next();
            for (SinhVien i : list) {
                if (i.getCompany().equals(s)) {
                    System.out.println(i);
                }
            }
        }
    }
}
