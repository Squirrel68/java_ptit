package j05013_tuyenDung;

public class Person implements Comparable<Person> {
   private String id, name,rank;
    private double lt,th, TB;
    private static int cnt=1;

    public Person(String name, double lt, double th) {
        this.id = String.format("TS%02d",cnt++);
        this.name = name;
        if (lt >10) lt /= 10;
        if (th >10) th /= 10;
        this.lt = lt;
        this.th = th;
        this.TB = (lt+th)/2;
        if (TB > 9.5) this.rank = "XUAT SAC";
        else if (TB >= 8) this.rank = "DAT";
        else if (TB >= 5) this.rank = "CAN NHAC";
        else this.rank = "TRUOT";
    }

    @Override
    public String toString() {
        return id + " " + name + " " +String.format("%.2f",TB)+" "+rank;
    }

    @Override
    public int compareTo(Person o) {
        return Double.compare(o.TB, this.TB);
    }
}
