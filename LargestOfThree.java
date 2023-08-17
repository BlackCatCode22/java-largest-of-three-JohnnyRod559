// LargestOfThree.java

// John Rodriguez 08/17/2023


// input: three ints from user
// processing: find the largest of the three ints with the decision structures
// output: the largest of the three ints, the sum of the three ints




// Get scanner class
import java.util.Scanner;


public class LargestOfThree {

    public static void main(String[] args) {
        // Get three ints from user.
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int total = 0;
        int largest =0;

        // Create a scanner object for the user input.
        Scanner scanner = new Scanner(System.in);

        // prompt user to enter name
        System.out.println("\n\n Please enter your name: ");
        // Input user reply to "enter name"
        String username = scanner.nextLine();


        // Prompt user for the first integer.
        System.out.println("\n\n Please enter your first integer: ");
        // Input user reply to num1
        num1 = scanner.nextInt();
        System.out.println(" You entered: " + num1);

        // Prompt user for the second integer
        System.out.println("\n\n Please enter your second integer: ");
        // Input user reply to num2
        num2 = scanner.nextInt();
        System.out.println(" You entered: " + num2);

        // Prompt user for third integer
        System.out.println("\n\n Please enter your third integer: ");
        // Input user reply for num3
        num3 = scanner.nextInt();
        System.out.println(" You entered: " + num3);

        System.out.println("\n\n You entered: " + num1 + " and " + num2 + " and " + num3);

        // Decision statements to find largest
        if (num1 > num2 & num1 > num3) {
            largest = num1;

        } if (num2 > num1 & num2 > num3) {
            largest = num2;

        } if (num3 > num1 & num3 > num2) {
            largest = num3;
        }
        // Output the largest number
       System.out.println("\n\n The largest number of " + num1 + " and " + num2 + " and " + num3 + " is " + largest);


        System.out.println("\n\n The sum of the integers combined is: " + total );
        //
        System.out.println("\n\n Thanks for participating. Come back soon!");


        }

























    }
