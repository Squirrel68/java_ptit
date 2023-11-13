package j05011_tinhGio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        ArrayList<Gamer> l = new ArrayList<>();
        while(n-- >0){
            String id = sc.next();
            sc.nextLine();
            String name = sc.nextLine(), in=sc.nextLine(), out = sc.nextLine();
            l.add(new Gamer(id,name,in,out));
        }
        Collections.sort(l);
        for(Gamer i:l){
            System.out.println(i);
        }
    }
}
