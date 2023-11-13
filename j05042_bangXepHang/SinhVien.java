package j05042_bangXepHang;

public class SinhVien implements Comparable<SinhVien> {
    private String name;
    private int AC, submit;

    public SinhVien(String name, int AC, int submit) {
        this.name = name;
        this.AC = AC;
        this.submit = submit;
    }

    @Override
    public String toString() {
        return name + " " + AC + " " + submit;
    }

    @Override
    public int compareTo(SinhVien o) {
        if (this.AC!=o.AC) return o.AC-this.AC;
        if (this.submit!=o.submit) return this.submit-o.submit;
        return this.name.compareTo(o.name);
    }
}
