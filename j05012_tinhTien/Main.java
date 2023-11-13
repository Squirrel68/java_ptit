package j05012_tinhTien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<MatHang> l = new ArrayList<>();
        while(n-->0){
            String id = sc.next();
            sc.nextLine();
            String name = sc.nextLine();
            long qtt = sc.nextLong(), price = sc.nextLong(), discount = sc.nextLong();
            l.add(new MatHang(id,name,qtt, price, discount));
        }
        Collections.sort(l);
        for(MatHang i : l){
            System.out.println(i);
        }
    }
}
