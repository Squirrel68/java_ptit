package j05043_tinhThuNhapChoGV;

public class NhanVien implements Comparable<NhanVien>{
    private static int cnt =1;
    private String id, name, level;
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

    @Override
    public String toString() {
        return String.format("%s %s %.0f %.0f %.0f %.0f", id, name, phuCap, salary, tamUng, conLai);
    }

    @Override
    public int compareTo(NhanVien o) {
        if (Double.compare((phuCap+salary),(o.phuCap+o.salary))!=0)
            return Double.compare((o.phuCap+o.salary),(phuCap+salary));
        else return this.id.compareTo(o.id);
    }
}
