package j06003_quanLyBaiTapNhom1;

public class SinhVien {
    private String id, ten, sdt;
    private int stt;

    public SinhVien(String id, String ten, String sdt, int stt) {
        this.id = id;
        this.ten = ten;
        this.sdt = sdt;
        this.stt = stt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", this.id, this.ten, this.sdt);
    }
}
