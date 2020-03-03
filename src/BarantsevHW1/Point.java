package BarantsevHW1;

public class Point {
    public double x;
    public double y;

    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public static double bigX(Point p1, Point p2) {
        if (p1.x >= p2.x) {
            return (p1.x - p2.x);
        } else {
            return (p2.x - p1.x);
        }
    }

    public static double bigY(Point p1, Point p2) {
        if (p1.y >= p2.y) {
            return (p1.y - p2.y);
        } else {
            return (p2.y - p1.y);
        }
    }

    public static double distant(Point p1, Point p2) {
        return Math.sqrt(Math.pow((bigX(p1, p2)), 2) + Math.pow((bigY(p1, p2)), 2));
    }
}
