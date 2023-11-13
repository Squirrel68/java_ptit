package j05003_DanhSachDoiTuongSV_1;

public class SinhVien {
    private String maSV, hoTen, ngaySinh, lop;
    private double diemGPA;
    private static int cnt = 1;

    public SinhVien(String hoTen, String lop,String ngaySinh, double diemGPA) {
        this.maSV = String.format("B20DCCN%03d", cnt++); // B20DCCN001
//        chuan hoa hoTen
        String[] tmp1 = hoTen.split("\\s+");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < tmp1.length; i++) {
            res.append(Character.toUpperCase(tmp1[i].charAt(0))).append(tmp1[i].substring(1).toLowerCase());
            if (i < tmp1.length - 1) {
                res.append(" ");
            }
        }
        this.hoTen = res.toString();

//        xu ly ngaySinh
        String[] tmp = ngaySinh.split("/");
        this.ngaySinh = String.format("%02d/%02d/%04d", Integer.parseInt(tmp[0]), Integer.parseInt(tmp[1]), Integer.parseInt(tmp[2]));
        this.lop = lop;
        this.diemGPA = diemGPA;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %.2f", maSV, hoTen,lop, ngaySinh, diemGPA);
    }
}
