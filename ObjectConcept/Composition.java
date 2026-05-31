

public class Composition {
    public static void main(String[] args) {
        //it represent a "part-of" relationship between objects. 
        // In composition, one class contains a reference to another class, 
        // and the contained class is considered a part of the containing class. 
        // The lifecycle of the contained class is typically tied to the lifecycle of the containing class.
        // Create a Car object
        Car car = new Car("Toyota", "Camry", "Red", 2020, "V6");

        // Display car information
        car.displayCarInfo();
    }
    
}
