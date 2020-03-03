package BarantsevHW1;

public class DisstanceClass {
    public static void main(String[] args) {
        Point p1 = new Point(1, 0);
        Point p2 = new Point(5, 3);

        //----------- отсюда -----------
        //double dist = distance(p1, p2);
        //System.out.println("Расстояние между двумя точками (" + p1.x + ", " + p1.y + ") и (" + p2.x + ", " + p2.y + ") равно " + dist);

        // ------ из класса Point -------
        double d = p1.distant(p1, p2);
        System.out.println("Расстояние между двумя точками " + printPoint(p1) + " и " + printPoint(p2) + " равно " + d);
    }
    public static String printPoint(Point p)
    {
       return ("(" + p.x + ", " + p.y + ")");
    }

    //----------- отсюда -----------
/*
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

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow((bigX(p1, p2)), 2) + Math.pow((bigY(p1, p2)), 2));
    }*/
}