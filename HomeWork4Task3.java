import java.util.Scanner;

public class HomeWork4Task3 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter natural number n:");
        int n = scanner.nextInt();
        int result = 1;
        if (n > 0) {
            for (int i = n; i > 0; i--) {
                result = result * i;
            }
            System.out.println("The factorial of the number " + n + " is " + result);
        } else {
            System.out.println("This number is not natural");
        }

        scanner.close();
    }

}
