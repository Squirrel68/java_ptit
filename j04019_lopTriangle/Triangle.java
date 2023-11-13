package j04019_lopTriangle;

public class Triangle {
    private Point a, b, c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a; this.b = b; this.c = c;
    }

    public String getPerimeter() {
        return String.format("%.3f", (a.distance(b) + b.distance(c) + c.distance(a)));
    }

    public boolean valid() {
        double ab = a.distance(b), bc = b.distance(c), ca = c.distance(a);
        return ab + bc > ca && bc + ca > ab && ca + ab > bc;
    }
}
