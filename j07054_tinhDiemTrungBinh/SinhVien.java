package j07054_tinhDiemTrungBinh;

public class SinhVien implements Comparable<SinhVien>{
    private String maSV, tenSV;
    private double d1,d2,d3, diemTB;
    private static int cnt =1;

    public SinhVien(String ten, double d1, double d2, double d3) {
        this.maSV = String.format("SV%02d", cnt++);
        this.tenSV = ten;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.diemTB = (d1+d2+d3)/3;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.1f %.1f %.1f %.1f", maSV, tenSV, d1, d2, d3, diemTB);
    }

    @Override
    public int compareTo(SinhVien o) {
        return 0;
    }
}
