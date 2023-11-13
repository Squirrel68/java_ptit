package j05011_tinhGio;

public class Time {
    private int h, m;

    public Time(String s) {
        // s: 12:30
        String[] tmp = s.split(":");
        h = Integer.parseInt(tmp[0]);
        m = Integer.parseInt(tmp[1]);
    }

    public Time(int h, int m) {
        this.h = h;
        this.m = m;
    }

    public int getH() {
        return h;
    }

    public int getM() {
        return m;
    }
    public Time tru (Time o){
        Time res = null;
        int h = this.h - o.h;
        int m = this.m - o.m;
        if (m < 0) {
            m += 60;
            h--;
        }
        if (h < 0) {
            h += 24;
        }
        res = new Time(h,m);
        return res;
    }

    @Override
    public String toString() {
        return h+" gio "+m+" phut";
    }
}
