public class MyFirstProgram {
    public static void main(String[] args) {
        Point p1 = new Point(0.0, 0.0);
        Point p2 = new Point(3.0, 4.0);
        System.out.println(Point.distance(p1, p2));
        System.out.println(p1.distance(p2));
    }
}
