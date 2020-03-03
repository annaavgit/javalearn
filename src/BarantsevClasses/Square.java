package BarantsevClasses;

public class Square {

    public double length;

    //конструктор
   /* public Square(double len)
    {
        length = len;
    }*/

    //конструктор
    public Square(double length)
    {
        this.length = length;
    }

    public double area()
    {
        return this.length * this.length;
    }
}
