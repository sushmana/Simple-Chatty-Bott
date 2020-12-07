import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            if (n % 2 != 0) {
                System.out.println("odd");
            } else {
                System.out.println("even");
            }
        }while (n != 0);
    }
}