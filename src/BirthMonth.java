import java.util.Scanner;



public class BirthMonth {

    public static void main(String[] args) {

        // Create a Scanner object for console input

        Scanner in = new Scanner(System.in);



        // Prompt the user to enter their birth month as an integer

        System.out.print("Enter your birth month (1 - 12): ");



        // Check if the input is a valid integer

        if (in.hasNextInt()) {

            // Read the valid integer into month

            int month = in.nextInt();

            in.nextLine(); // Clear the input buffer newline



            // Check if the month is within the valid range of 1 to 12 inclusive

            if (month >= 1 && month <= 12) {

                // If in range, echo the entered birth month

                System.out.println("Your birth month is: " + month);

            }

            // If the integer is out of range, output the required error message

            else {

                System.out.println("You entered an incorrect month value: " + month);

            }

        }

        // If the user did not input an integer, handle the error gracefully

        else {

            String trash = in.nextLine(); // Read the non-integer input as a String

            System.out.println("You entered an incorrect month value: " + trash);

        }

    }

}



