package j05030_bangDiemThanhPhan_1;

public class SinhVien implements Comparable<SinhVien> {
    private String id, name, cls;
    private double d1,d2,d3;

    public SinhVien(String id, String name, String cls, double d1, double d2, double d3) {
        this.id = id;
        this.name = name;
        this.cls = cls;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + cls + " " + String.format("%.1f", d1) + " " + String.format("%.1f", d2) + " " + String.format("%.1f", d3);
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.name.compareTo(o.name);
    }
}
