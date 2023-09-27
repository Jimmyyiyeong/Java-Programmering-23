
public class E3L3 {
    
    public static void main(String[] args) {

    Car volvo = new Car("Volvo", "V60", 2012, "Black");
    Car ferrari = new Car ("LaFerrari", 2023);
    Car lamborghini = new Car("Lamborghini", "Aventador", 2023);

        System.out.println(lamborghini.color);
        System.out.println(ferrari.make + ferrari.color);
        System.out.println(volvo.model);
    }   
}

class Car {
    String make;
    String model;
    int year;
    String color;

    Car(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }
    Car(String make, String model, int year) {
        this(make,model,year,"Black");
    }
    Car(String model, int year) {
        this("ferrari",model, year,"red");
    }


}
