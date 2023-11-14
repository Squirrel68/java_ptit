package j05026_danhSachGiangVienTheoBoMon;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<GiangVien> list = new ArrayList<>();
        while (n-- >0) {
            list.add(new GiangVien(sc.nextLine(), sc.nextLine()));
        }
        int q = Integer.parseInt(sc.nextLine());
        while (q-- >0) {
            String nganh = sc.nextLine();
            String[] tmp = nganh.trim().split(" ");
            nganh = "";
            for (String s : tmp)
                nganh += Character.toUpperCase(s.charAt(0));
            System.out.println("DANH SACH GIANG VIEN BO MON " + nganh + ":");
            for (GiangVien giangVien : list) {
                if (giangVien.getNganh().equals(nganh)) {
                    System.out.println(giangVien);
                }
            }
        }
    }
}
