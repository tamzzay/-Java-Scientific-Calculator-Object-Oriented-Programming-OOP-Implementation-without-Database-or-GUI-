import java.util.Scanner;
import java.lang.Math;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Engineering Calculator Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square Root");
            System.out.println("6. Sine");
            System.out.println("7. Cosine");
            System.out.println("8. Tangent");
            System.out.println("9. Logarithm (base 10)");
            System.out.println("10. Natural Logarithm (ln)");
            System.out.println("11. Exponentiation");
            System.out.println("12. Factorial");
            System.out.println("13. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            if (choice == 13) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

            double result = 0.0;

            switch (choice) {
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.print("Enter the first number: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    double num2 = scanner.nextDouble();

                    if (choice == 1) {
                        result = num1 + num2;
                    } else if (choice == 2) {
                        result = num1 - num2;
                    } else if (choice == 3) {
                        result = num1 * num2;
                    } else if (choice == 4) {
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            System.out.println("Division by zero is not allowed.");
                            continue;
                        }
                    }
                    break;

                case 5:
                    System.out.print("Enter the number: ");
                    double sqrtNum = scanner.nextDouble();
                    result = Math.sqrt(sqrtNum);
                    break;

                case 6:
                case 7:
                case 8:
                    System.out.print("Enter the angle (in radians): ");
                    double angle = scanner.nextDouble();
                    if (choice == 6) {
                        result = Math.sin(angle);
                    } else if (choice == 7) {
                        result = Math.cos(angle);
                    } else if (choice == 8) {
                        result = Math.tan(angle);
                    }
                    break;

                case 9:
                    System.out.print("Enter the number: ");
                    double logNum = scanner.nextDouble();
                    result = Math.log10(logNum);
                    break;

                case 10:
                    System.out.print("Enter the number: ");
                    double lnNum = scanner.nextDouble();
                    result = Math.log(lnNum);
                    break;

                case 11:
                    System.out.print("Enter the base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter the exponent: ");
                    double exponent = scanner.nextDouble();
                    result = Math.pow(base, exponent);
                    break;

                case 12:
                    System.out.print("Enter a non-negative integer: ");
                    int n = scanner.nextInt();
                    if (n < 0) {
                        System.out.println("Factorial is defined for non-negative integers only.");
                        continue;
                    }
                    result = factorial(n);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    continue;
            }

            System.out.println("Result: " + result);
        }
    }

    private static double factorial(int n) {
        if (n == 0) {
            return 1;
        }
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}