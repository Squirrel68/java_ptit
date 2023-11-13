package j05022_lietKeSVTheoLop;

public class SinhVien {
    private String maSV, tenSV, lop, email;

    public SinhVien(String maSV, String tenSV, String lop, String email) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.lop = lop;
        this.email = email;
    }

    public String getLop() {
        return lop;
    }

    @Override
    public String toString() {
        return maSV + " " + tenSV + " " + lop + " " + email;
    }
}
