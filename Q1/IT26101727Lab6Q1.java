import java.util.Scanner;

public class IT26101727Lab6Q1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double number, square, squareRoot;

        System.out.print("Enter a number: ");
        number = input.nextDouble();

        square = number * number;

        if (number >= 0) {
            squareRoot = Math.sqrt(number);

            System.out.println("Square: " + square);
            System.out.println("Square root: " + squareRoot);
        } else {
            System.out.println("Square: " + square);
            System.out.println("Square root is not a real number.");
        }

        
    }
}
