package j07025_danhSachKhachHangTrongFile;

public class KhachHang implements Comparable<KhachHang> {
    private String maKH, tenKH, gt, birth, address;
    private static int cnt =1;

    private String chuanHoaTen (String s) {
        s = s.trim().toLowerCase();
        String [] arr = s.split("\\s+");
        s = "";
        for (int i = 0; i < arr.length; i++)
            s += String.valueOf(arr[i].charAt(0)).toUpperCase() + arr[i].substring(1)+" ";
        return s.trim();
    }

    private String chuanHoaNgaySinh (String s) {
        s = s.trim();
        String [] arr = s.split("/");
        s = "";
        while (arr[0].length() < 2) arr[0] = "0" + arr[0];
        while (arr[1].length() < 2) arr[1] = "0" + arr[1];
        while (arr[2].length() < 4) arr[2] = "0" + arr[2];
        s = arr[0] + "/" + arr[1] + "/" + arr[2];
        return s;
    }

    public KhachHang(String tenKH, String gt, String birth, String address) {
        this.maKH = "KH" + String.format("%03d", cnt++);
        this.tenKH = chuanHoaTen(tenKH);
        this.gt = gt;
        this.birth = chuanHoaNgaySinh(birth);
        this.address = address;
    }

    @Override
    public String toString() {
        return maKH + " " + tenKH + " " + gt + " " + address+ " " + birth;
    }

    @Override
    public int compareTo(KhachHang o) {
        String [] arr1 = this.birth.split("/");
        String [] arr2 = o.birth.split("/");
        int year1 = Integer.parseInt(arr1[2]),
            year2 = Integer.parseInt(arr2[2]),
            month1 = Integer.parseInt(arr1[1]),
            month2 = Integer.parseInt(arr2[1]),
            day1 = Integer.parseInt(arr1[0]),
            day2 = Integer.parseInt(arr2[0]);
        if (year1 != year2) return year1 - year2;
        if (month1 != month2) return month1 - month2;
        return day1 - day2;
    }
}
