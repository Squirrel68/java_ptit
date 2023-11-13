package j05013_tuyenDung;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Person> list = new ArrayList<>();
        while (n-- > 0) {
            sc.nextLine();
            String name = sc.nextLine();
            double lt = sc.nextDouble(), th = sc.nextDouble();
            list.add(new Person(name, lt, th));
        }
        Collections.sort(list);
        for (Person i : list) {
            System.out.println(i);
        }
    }
}
