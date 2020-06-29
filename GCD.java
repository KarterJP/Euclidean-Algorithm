import java.util.*;

public class GCD {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double opt;

        if (a != 0 && b != 0) {
            opt = gcd(a, b);
        } else {
            opt = 1;
        }

        System.out.printf("%.0f\n", opt);
    }

    private static double gcd(double a, double b) {
        if (b == 0) {
            return a;
        }
        double prime = a % b;

        return gcd(b, prime);
    }
}