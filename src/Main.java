import java.util.Scanner;

abstract class Shape {
//    The abstract class can have a constructor
    public Shape() {
        System.out.println("Shape(Abstract Class) constructor is called.");
    }

    int width;
    abstract void area();
    void sayHi() {
        System.out.println("Hi from Shape");
    }
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

abstract class DuplicateShape {
    abstract void test();
//    void demo();
}

//class Circle extends Shape, DuplicateShape {//<- Cannot extend multiple classes because Java does not support multiple inheritance
class Circle extends Shape {//<- Concrete class extending abstract class Shape

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

//        Shape s = new Shape();//<- Error: We cannot instantiate the abstract class in java
//        s.sayHi();

        Square a = new Square(x);
        Circle b = new Circle(y);
        a.area();
        b.area();
    }
}