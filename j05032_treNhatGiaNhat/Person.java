package j05032_treNhatGiaNhat;

import java.util.Date;

public class Person implements Comparable<Person>{
    private String name, dob;
    private int y, m, d;

    public Person(String name, String dob) {
        this.name = name;
        this.dob = dob;
        String[] s = dob.split("/");
        this.y = Integer.parseInt(s[2]);
        this.m = Integer.parseInt(s[1]);
        this.d = Integer.parseInt(s[0]);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " " +dob;
    }

    @Override
    public int compareTo(Person o) {
        if (this.y!=o.y) return this.y-o.y;
        if (this.m!=o.m) return this.m-o.m;
        return this.d-o.d;
    }
}
