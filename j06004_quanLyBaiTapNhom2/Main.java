package j06004_quanLyBaiTapNhom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<SinhVien> a = new ArrayList<>();
        String[] deTai = new String[m];
        for(int i=0; i<n; i++){
            sc.nextLine();
            String id = sc.nextLine();
            String ten = sc.nextLine();
            String sdt = sc.nextLine();
            int stt = sc.nextInt();
            a.add(new SinhVien(id, ten, sdt, stt));
        }
        sc.nextLine();
        for(int i=0; i<m; i++){
            deTai[i] = sc.nextLine();
        }
        Collections.sort(a);
        for(SinhVien i : a){
            i.setDe(deTai[i.getStt()-1]);
            System.out.println(i);
        }
    }
}
