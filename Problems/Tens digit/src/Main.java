import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number=scanner.nextInt();
        int second_number;
        second_number=((number/10)%10);
        System.out.println(second_number);

    }
}
