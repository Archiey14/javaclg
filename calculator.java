import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a:");
        int a = in.nextInt();

        System.out.println("Enter b:");
        int b = in.nextInt();

        System.out.println("Enter operator (+, -, *, /, %):");
        char o = in.next().charAt(0);

        switch (o) {
            case '+':
                System.out.println("Result: " + (a + b));
                break;
            case '-':
                System.out.println("Result: " + (a - b));
                break;
            case '*':
                System.out.println("Result: " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;
            case '%':
                if (b != 0) {
                    System.out.println("Result: " + (a % b));
                } else {
                    System.out.println("Cannot find modulus with zero");
                }
                break;
            default:
                System.out.println("Enter valid operator");
        }
    }
}
