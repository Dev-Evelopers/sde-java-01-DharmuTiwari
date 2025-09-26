
import java.util.Scanner;

// Abstract Calculator class
abstract class Calculator {
    abstract int add(int a, int b);
}

// Adder class that extends Calculator
class Adder extends Calculator {
    @Override
    int add(int a, int b) {
        System.out.println("Adding integers: " + a + " " + b);
        return a + b;
    }
}

// Multiplier class
class Multiplier {
    int multiply(int a, int b, Calculator calculator) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            result = calculator.add(result, a);
        }
        return result;
    }
}

// Solution class to test the implementation
public class AlexCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read inputs
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        Adder adder = new Adder();
        Multiplier multiplier = new Multiplier();
        
        // Testing addition
        System.out.println("Testing Addition");
        int sum = adder.add(a, b);
        System.out.println("Sum = " + sum);
        
        // Testing multiplication
        System.out.println("\nTesting Multiplication");
        int product = multiplier.multiply(a, b, adder);
        System.out.println("Product = " + product);
        sc.close();
    }
}
