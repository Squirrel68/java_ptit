package j06004_quanLyBaiTapNhom;

public class SinhVien implements Comparable<SinhVien> {
    private String id, ten, sdt, de;
    private int stt;


    public SinhVien(String id, String ten, String sdt, int stt) {
        this.id = id;
        this.ten = ten;
        this.sdt = sdt;
        this.stt = stt;
    }

    public int getStt() {
        return stt;
    }

    public void setDe(String de) {
        this.de = de;
    }

    @Override
    public int compareTo(SinhVien b) {
        return this.id.compareTo(b.id);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %d %s",
                this.id, this.ten, this.sdt, this.stt, this.de);
    }
}