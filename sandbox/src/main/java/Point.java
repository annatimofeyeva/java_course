/**
 * Created by IEUser on 2/21/2016.
 */
public class Point {
    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static double distance(Point p1, Point p2) {
        double d2 = (p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y);
        return Math.sqrt(d2);

    }

    public double distance(Point p) {
        double d2 = (x - p.x) * (x - p.x) + (y - p.y) * (y - p.y);
        return Math.sqrt(d2);


    }
}
