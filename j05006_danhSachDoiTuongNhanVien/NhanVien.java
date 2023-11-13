package j05006_danhSachDoiTuongNhanVien;

public class NhanVien {
    private String id;
    private String hoTen;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;
    private String maSoThue;
    private String ngayKy;

    public NhanVien(int id, String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maSoThue, String ngayKy) {
        this.id = String.format("%05d", id);
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.maSoThue = maSoThue;
        this.ngayKy = ngayKy;
    }

    @Override
    public String toString() {
        return this.id + " " + this.hoTen + " " + this.gioiTinh + " " + this.ngaySinh
                + " " + this.diaChi + " " + this.maSoThue + " " + this.ngayKy;
    }
}
