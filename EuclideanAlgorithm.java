import java.util.Scanner;

class EuclideanAlgorithm {
    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        int prime = a % b;
        return gcd(b, prime);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(gcd(a, b));
    }
}