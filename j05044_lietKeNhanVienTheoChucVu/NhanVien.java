package j05044_lietKeNhanVienTheoChucVu;

public class NhanVien {
    private String id, name, level;
    private static int cnt =1;
    private double base, days, phuCap, salary, tamUng, conLai;

    public NhanVien(String name, String level, double base, double days) {
        this.name = name;
        this.level = level;
        this.base = base;
        this.days = days;
        this.id = "NV" + String.format("%02d", cnt++);
        if (level.equals("GD")) this.phuCap = 500;
        else if (level.equals("PGD")) this.phuCap = 400;
        else if (level.equals("TP")) this.phuCap = 300;
        else if (level.equals("KT")) this.phuCap = 250;
        else this.phuCap = 100;
        this.salary = base*days;
        if (((this.phuCap+this.salary)*2/3)<25000) this.tamUng = Math.round((this.phuCap+this.salary)*2/3000)*1000;
        else this.tamUng = 25000;
        this.conLai = this.salary+this.phuCap-this.tamUng;
    }

    public String getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.0f %.0f %.0f %.0f", id, name, phuCap, salary, tamUng, conLai);
    }
}
