package j05042_bangXepHang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<SinhVien> list = new ArrayList<>();
        while (n-- >0){
            sc.nextLine();
            String name = sc.nextLine();
            int AC = sc.nextInt(), submit = sc.nextInt();
            list.add(new SinhVien(name, AC, submit));
        }
        Collections.sort(list);
        for(SinhVien i : list){
            System.out.println(i);
        }
    }
}
