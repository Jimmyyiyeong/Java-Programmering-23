public class Geometry {
    
}
class Circle {
    double area() {
        int radius = 5; 
        double area = Math.pow(radius, 2) * Math.PI;
    return area;
    }
        
        double circumference() {
        int diameter = 12;
        double circumference1 = diameter * Math.PI;
        return circumference1;
    }
}

    


class Rectangle {
    int rectangle() {
        int a = 5;
        int b = 3;
    int area = a * b;
    return area;
    }

    int circumference() {
        int c = 5;
        int d = 3;
    int circumference = c*2 + d*2;
    return circumference;
    }


}

class GeometryTester {
    public static void main(String[] args) {

    Circle circle1 = new Circle();

    System.out.println("Area of circle is " + circle1.area());

    System.out.println("Circumference of circle is " + circle1.circumference());

    Rectangle r = new Rectangle();

    System.out.println("Area of rectangle is " + r.rectangle());

    System.out.println("Circumference of rectangle is " + r.circumference());
    }
}