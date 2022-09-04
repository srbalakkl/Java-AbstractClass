import java.util.Scanner;

abstract class Shape {
    int width;
    abstract void area();
}

class Square extends Shape {
//    double area;
    public Square(int x) {
        this.width = (int) Math.pow(x,2);
    }

    @Override
    void area() {
        System.out.println(width);
    }
}

class Circle extends Shape {

    public Circle(int y) {
        this.width = y;
    }

    @Override
    void area() {
        System.out.println(Math.PI * width * width);
    }
}


public class Main {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        Square a = new Square(x);
        Circle b = new Circle(y);
        a.area();
        b.area();
    }
}