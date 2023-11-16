package j05047_bangKeNhapKhoSapXepTheoChietKhau;

import java.util.Map;

public class MatHang {
    private String maHang, tenHang;
    private long soLuong, donGia;
    private static Map<String, Long> map = new java.util.HashMap<>();

    public MatHang(String tenHang, long soLuong, long donGia) {
        String tienTo = "";
        String[] arr = tenHang.trim().split(" ");
        tienTo += arr[0].substring(0, 1).toUpperCase()+arr[1].substring(0, 1).toUpperCase();
//        map[tienTo] += 1;
        if (!map.containsKey(tienTo)) map.put(tienTo, 0L);
        map.put(tienTo, map.get(tienTo)+1);
        this.maHang = tienTo + String.format("%02d", map.get(tienTo));
        this.tenHang = tenHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public Long getChietKhau() {
        Long tienCK = this.soLuong * this.donGia;
        double phanTramCK = 0;
        if (soLuong>10) phanTramCK=0.05;
        else if (soLuong>=8) phanTramCK=0.02;
        else if (soLuong>=5) phanTramCK=0.01;
        else phanTramCK=0;
        return this.soLuong * (long)(this.donGia*phanTramCK);
    }

    @Override
    public String toString() {
        Long thanhTien = this.soLuong * this.donGia - this.getChietKhau();
        return this.maHang + " " + this.tenHang + " " + this.getChietKhau()+ " " + thanhTien;
    }
}
