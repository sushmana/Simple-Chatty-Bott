import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int n, rev = 0, remainder;
        while (n != 0) {
            remainder = n % 10;
            rev = rev * 10 + remainder;
            n /= 10;
        }
        System.out.println(rev);
    }
}