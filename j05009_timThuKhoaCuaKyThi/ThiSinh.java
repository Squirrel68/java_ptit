package j05009_timThuKhoaCuaKyThi;

public class ThiSinh implements Comparable<ThiSinh>{
    private String name, birth;
    private double d1,d2,d3, sumD;
    private int id;
    private static int cnt =1;

    public ThiSinh(String name, String birth, double d1, double d2, double d3) {
        this.id = cnt++;
        this.name = name;
        this.birth = birth;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.sumD = d1+d2+d3;
    }

    public double getSumD() {
        return sumD;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+birth+" "+sumD;
    }


    @Override
    public int compareTo(ThiSinh o) {
        if (this.sumD!=o.sumD)
            return Double.compare(o.sumD, this.sumD);
        else
            return this.id - o.id;
    }
}
