
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");

        // Write your program here
        int first = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        
        int second = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the third number:");
        
        int third = Integer.valueOf(scanner.nextLine());
        
        int total = first + second + third;
        
        double average = (double) total / 3;
        
        System.out.println("The average is " + average);


    }
}
