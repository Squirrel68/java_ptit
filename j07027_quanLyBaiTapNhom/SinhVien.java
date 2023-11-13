package j07027_quanLyBaiTapNhom;

public class SinhVien {
    String id = "";
    String name = "";
    String phoneNum = "";
    int nhom = 0;
    String baiTap = "";

    SinhVien(String id, String name, String phoneNum, int nhom) {
        this.id = id;
        this.name = name;
        this.phoneNum = phoneNum;
        this.nhom = nhom;
    }


    @Override
    public String toString() {
        return id + " " + name + " " + phoneNum + " " + nhom + " " + baiTap;
    }
}