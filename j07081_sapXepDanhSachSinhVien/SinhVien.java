package j07081_sapXepDanhSachSinhVien;

public class SinhVien implements Comparable<SinhVien>{
    private String maSV, tenSV, sdt, email;

    public SinhVien(String maSV, String tenSV, String sdt, String email) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.sdt = sdt;
        this.email = email;
    }

    @Override
    public String toString() {
        return maSV+" "+tenSV+" "+sdt+" "+email;
    }

    @Override
    public int compareTo(SinhVien o) {
        String[] arr1 = this.tenSV.trim().split("\\s+");
        String ten1 = arr1[arr1.length-1].trim()
                , ho1 = arr1[0].trim(), tenDem1 = "";
        for (int i = 1; i < arr1.length-1; i++)
            tenDem1 += arr1[i]+ " ";
        tenDem1.trim();
        String[] arr2 = o.tenSV.trim().split("\\s+");
        String ten2 = arr2[arr2.length-1].trim()
                , ho2 = arr2[0].trim(), tenDem2 = "";
        for (int i = 1; i < arr2.length-1; i++)
            tenDem2 += arr2[i]+ " ";
        tenDem2.trim();
        if (ten1.compareTo(ten2) != 0) return ten1.compareTo(ten2);
        else if (ho1.compareTo(ho2) != 0) return ho1.compareTo(ho2);
        else if(tenDem1.compareTo(tenDem2) != 0) return tenDem1.compareTo(tenDem2);
        else return this.maSV.compareTo(o.maSV);
    }
}
