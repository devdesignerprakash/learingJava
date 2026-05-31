public class WrapperClasses {


    public static void main(String[] args) {
        // Wrapper classes in Java are used to convert primitive data types into objects. 
        // Each primitive type has a corresponding wrapper class. 
        // For example, int has Integer, double has Double, and boolean has Boolean. 
        // Wrapper classes provide methods for converting between strings and primitive types, 
        // as well as other utility methods.

        Integer a= 10; // Autoboxing: converting primitive to wrapper
        a.toString(); // Using a method from the wrapper class

        // Example of using wrapper classes
        int primitiveInt = 10;
        Integer wrapperInt = Integer.valueOf(primitiveInt); // Boxing: converting primitive to wrapper
        int unboxedInt = wrapperInt.intValue(); // Unboxing: converting wrapper back to primitive

        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Wrapper Integer: " + wrapperInt);
        System.out.println("Unboxed int: " + unboxedInt);
        
    }
    
}
