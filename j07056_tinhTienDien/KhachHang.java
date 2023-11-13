package j07056_tinhTienDien;

public class KhachHang implements Comparable<KhachHang>{
    private String maKH, tenKH, loaiKH;
    private int soDau, soCuoi, base, vuotMuc, VAT,tongTiendien;
    private static int cnt=1;

    public int getDinhMuc() {
        if (this.loaiKH.equals("A")) {
            return 100;
        } else if (this.loaiKH.equals("B")) {
            return 500;
        } else {
            return 200;
        }
    }

    public KhachHang(String ten, String loai, int dau, int cuoi) {
        this.maKH = "KH" + String.format("%02d", cnt++);
        String[] tmp = ten.trim().split("\\s+");
        ten = "";
        for(String i : tmp) {
            ten += i.substring(0, 1).toUpperCase() + i.substring(1).toLowerCase() + " ";
        }
        this.tenKH = ten.trim();
        this.loaiKH = loai;
        this.soDau = dau;
        this.soCuoi = cuoi;
        if (soCuoi-soDau<=this.getDinhMuc()) {
            this.tongTiendien = (soCuoi-soDau)*450;
            this.base = tongTiendien;
        } else {
            base = this.getDinhMuc()*450;
            vuotMuc =(soCuoi-soDau-this.getDinhMuc())*1000;
            VAT = vuotMuc*5/100;
            this.tongTiendien = base + vuotMuc + VAT;
        }
    }

    @Override
    public int compareTo(KhachHang o) {
        return o.tongTiendien - this.tongTiendien;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %d %d %d", maKH, tenKH, base, vuotMuc, VAT, tongTiendien);
    }
}
