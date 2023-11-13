package j05014_tuyenGiaoVien;

public class GiaoVien implements Comparable<GiaoVien> {
    private String id, name, maXT, monHoc,res;
    private double th,cm, total, diemUT;
    private static int cnt=1;

    public GiaoVien(String name, String maXT,double th, double cm) {
        this.id = String.format("GV%02d",cnt++);
        this.name = name;
        this.maXT = maXT;
        if (maXT.charAt(0)=='A') this.monHoc = "TOAN";
        else if (maXT.charAt(0)=='B') this.monHoc="LY";
        else if (maXT.charAt(0)=='C') this.monHoc="HOA";
        if (maXT.charAt(1)=='1') this.diemUT = 2;
        else if (maXT.charAt(1)=='2') this.diemUT = 1.5;
        else if (maXT.charAt(1)=='3') this.diemUT = 1;
        else if (maXT.charAt(1)=='4') this.diemUT = 0;
        this.th = th;
        this.cm = cm;
        this.total = th*2 + cm + diemUT;
        if (this.total>18) this.res="TRUNG TUYEN";
        else this.res="LOAI";
    }

    @Override
    public String toString() {
        return id + " " + name + " " + monHoc + " " + String.format("%.1f",total)+" "+res;
    }

    @Override
    public int compareTo(GiaoVien o) {
        return Double.compare(o.total, this.total);
    }
}
