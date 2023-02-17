
import java.util.Scanner;

class CalculateG {

    // get multiplication of two numbers
    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    // get square of a single numbeer
    public static double square(double num) {
        return num * num;
    }

    // get summation of two numbers
    public static double summation(double num1, double num2) {
        return num1 + num2;
    }

    // print result
    public static void outline(String message, double result) {
        System.out.println(message + result);
    }

    // main method
    public static void main(String[] arguments) {

        // creating scanner object
        Scanner input = new Scanner(System.in);

        // original variables provided in the question
        double gravity = -9.81; // Earth's gravity in m/s^2
        double fallingTime = 30;
        double initialVelocity = 0.0;
        double finalVelocity;
        double initialPosition = 0.0;
        double finalPosition;

        // Add the formulas for position and velocity
        // 𝑥(𝑡) = 0.5 ∗𝑎𝑡2 + 𝑣𝑖𝑡 + 𝑥𝑖
        // 𝑣(𝑡) = 𝑎𝑡 + 𝑣𝑖

        finalPosition = (0.5 * gravity * fallingTime * fallingTime + initialVelocity * fallingTime + initialPosition)
                / fallingTime;
        finalVelocity = (gravity * fallingTime + initialVelocity) / fallingTime;

        // outputting final position and velocity
        System.out.println("The object's position after " + fallingTime + " seconds is "
                + finalPosition + " m.");
        // Add output line for velocity (similar to position)
        System.out.println("The object's velocity after " + fallingTime + " seconds is "
                + Math.abs (finalVelocity)+ " m/s.");


        // variables to store user input
        double num1, num2;

        // request user input
        System.out.println("Enter first number");
        num1 = input.nextDouble();
        System.out.println("Enter second number");
        num2 = input.nextDouble();

        // creating variables, and calling static methods that are outside main method 
        double resultMultiplication = multiplication(num1, num2);
        double resultsquare1 = square(num1);
        double resultsquare2 = square(num2);
        double resultSummation = summation(num1, num2);

        // outputting results by calling the outline method
        outline("Multiplication result: ", resultMultiplication);
        outline("Square result for " + num1 + " :", resultsquare1);
        outline("Square result for " + num2 + " :", resultsquare2);
        outline("Summation result: ", resultSummation);

        // close scanner object
        input.close();
    }
}