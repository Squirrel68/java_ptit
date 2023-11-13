package j05021_sapXepTheoMaSinhVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> l = new ArrayList<>();
        while (sc.hasNext()){
            String id = sc.nextLine();
            String name = sc.nextLine(),
                    cls=sc.nextLine(),email=sc.nextLine();
            l.add(new SinhVien(id,name,cls,email));
        }
        Collections.sort(l);
        for(SinhVien i : l){
            System.out.println(i);
        }
    }
}
