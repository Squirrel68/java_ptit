package j04019_lopTriangle;
import java.util.Scanner;
public class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x; this.y = y;
    }

    public static Point nextPoint(Scanner sc) {
        return new Point(sc.nextInt(), sc.nextInt());
    }

    public double distance(Point p) {
        return Math.sqrt((this.x-p.x)*(this.x-p.x) + (this.y-p.y)*(this.y-p.y));
    }
}
