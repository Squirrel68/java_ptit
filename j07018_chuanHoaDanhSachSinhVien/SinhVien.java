package j07018_chuanHoaDanhSachSinhVien;

public class SinhVien {
    private String maSV, tenSV, lop, ngaySinh;
    private double gpa;
    private static int cnt =1;

    public SinhVien() {
    }

    private String chuanHoaTen(String s) {
        s = s.trim();
        String res = "";
        String[] tmp = s.split("\\s+");
        for (int i = 0; i < tmp.length; ++i)
            res += tmp[i].substring(0, 1).toUpperCase() + tmp[i].substring(1).toLowerCase()+" ";
        res = res.trim();
        return res;
    }

    private String chuanHoaNgayThang(String y) {
        String[] tmp = y.split("/");
        String res = "";
        while (tmp[0].length() < 2) tmp[0] = "0" + tmp[0];
        while (tmp[1].length() < 2) tmp[1] = "0" + tmp[1];
        while (tmp[2].length() < 4) tmp[2] = "0" + tmp[2];
        res = tmp[0] + "/" + tmp[1] + "/" + tmp[2];
        return res;
    }

    public SinhVien(String tenSV, String lop, String ngaySinh, double gpa) {
        this.maSV = String.format("B20DCCN%03d", cnt++);
        this.tenSV = chuanHoaTen(tenSV);
        this.lop = lop;
        this.ngaySinh = chuanHoaNgayThang(ngaySinh);
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format(maSV + " " + tenSV + " " + lop + " " + ngaySinh + " " + "%.2f", gpa);
    }
}
