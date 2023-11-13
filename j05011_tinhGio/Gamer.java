package j05011_tinhGio;

public class Gamer implements Comparable<Gamer>{
    private String id,name;
    private Time timeIn, timeOut, timePlay;

    public Gamer(String id, String name, String in, String out) {
        this.id = id;
        this.name = name;
        this.timeIn = new Time(in);
        this.timeOut = new Time(out);
        this.timePlay = this.timeOut.tru(this.timeIn);
    }

    @Override
    public String toString() {
        return id+" "+name+" "+timePlay;
    }

    @Override
    public int compareTo(Gamer o) {
        if (this.timePlay.getH()!=o.timePlay.getH())
            return o.timePlay.getH()-this.timePlay.getH();
        else return o.timePlay.getM()-this.timePlay.getM();
    }
}
