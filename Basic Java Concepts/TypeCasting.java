public class TypeCasting {
    public static void main(String[] args) {

        // Implicit Type Casting (Widening)
        // byte>short>int>long>float>double
        int a = 10;
        double b = a; // int to double
        System.out.println("Implicit Type Casting: " + b);

        // Explicit Type Casting (Narrowing)
        double c = 20.5;
        int d = (int) c; // double to int
        System.out.println("Explicit Type Casting: " + d);

        String number = "100";
        int e = Integer.parseInt(number);
        System.out.println("String to Integer: " + e);
    }

}
