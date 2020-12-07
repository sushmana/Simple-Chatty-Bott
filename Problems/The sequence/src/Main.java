import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1;
        System.out.print(1 + " ");
        while (n != 1) {

            System.out.print(((1) + (int) Math.sqrt(1 + (8 * i))) / 2 + " ");
            n--;
            i++;
        }
    }
}
