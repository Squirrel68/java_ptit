package j05006_danhSachDoiTuongNhanVien;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<NhanVien> a = new ArrayList<>();
        sc.nextLine();
        for(int i=0; i<n; i++){
            String hoTen = sc.nextLine();
            String gioiTinh = sc.nextLine();
            String ngaySinh = sc.nextLine();
            String diaChi = sc.nextLine();
            String maSoThue = sc.nextLine();
            String ngayKy = sc.nextLine();
            a.add(new NhanVien(i+1, hoTen, gioiTinh, ngaySinh, diaChi, maSoThue, ngayKy));
        }
        for(NhanVien i : a){
            System.out.println(i);
        }
    }
}
