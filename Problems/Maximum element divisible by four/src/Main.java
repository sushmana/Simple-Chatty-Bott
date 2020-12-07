import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int max=0;

        for(int i=0;i<n;i++) {
            int l=scanner.nextInt();
            max=(l%4==0)&&(max<l)? l:max;

        }
        System.out.println(max);
    }
}