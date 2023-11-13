package j05032_treNhatGiaNhat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Person> list = new ArrayList<>();
        while (n-- > 0) {
            String name = sc.next(), dob = sc.next();
            list.add(new Person(name, dob));
        }
        Collections.sort(list);
        System.out.println(list.get(list.size()-1).getName());
        System.out.println(list.get(0).getName());
    }
}
