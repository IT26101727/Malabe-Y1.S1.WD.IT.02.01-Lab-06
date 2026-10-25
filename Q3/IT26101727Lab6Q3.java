import java.util.Scanner;

public class IT26101727Lab6Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int count = 0;
        double sumSquares = 0;
        double rms;

        System.out.print("Enter a positive integer (-99 to stop): ");
        number = input.nextInt();

        while (number != -99) {

            if (number < 0) {
                System.out.println("Invalid input! Enter a positive integer.");
            } else {
                sumSquares = sumSquares + (double) number * number;
                count++;
            }

            System.out.print("Enter a positive integer (-99 to stop): ");
            number = input.nextInt();
        }

        if (count > 0) {
            rms = Math.sqrt(sumSquares / count);
            System.out.println("Number of values entered: " + count);
            System.out.printf("Root Mean Square = %.2f%n", rms);
        } else {
            System.out.println("No valid numbers were entered.");
        }

        
    }
}