package BarantsevClasses;

public class LeraningClasses {
    public static void main(String[] args) {
        Square s = new Square(5); //через конструктор
        Rectangle r = new Rectangle(11, 9);

        System.out.println("Площадь квадрата со стороной " + s.length + " = " + s.area());

        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
    }
}
