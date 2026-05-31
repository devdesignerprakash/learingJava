
public class Car {
    String make;
    String model;
    String color;
    int year;
    double price=25000.0;
    Engine engine;

    public Car(String make, String model, String color, int year, String engineType) {
        this.make = make;
        this.model = model;
        this.engine = new Engine(engineType);
    }
    public void displayCarInfo(){
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("Engine Type: " + engine.type);
    }

}