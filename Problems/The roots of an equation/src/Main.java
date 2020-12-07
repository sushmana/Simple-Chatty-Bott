import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x3 = sc.nextInt();
        int x2 = sc.nextInt();
        int x1 = sc.nextInt();
        int x0 = sc.nextInt();

        for (int i = 0; i <= 1000; i++) {
            int count = 0;
            int x = x3 * (int) Math.pow(i, 3) +
                    x2 * (int) Math.pow(i, 2) +
                    x1 * i +
                    x0;
            if (x == 0) {
                count += 1;
                System.out.println(i);
            }

            if (count == 3) {
                break;
            }
        }

    }
}