import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float M=scanner.nextFloat();
        float P=scanner.nextFloat();
        float K=scanner.nextFloat();
        int year=0;
        while (M<K){
            M+=M*(P/100f);
            year++;
        }
        System.out.println(year);
    }
}
