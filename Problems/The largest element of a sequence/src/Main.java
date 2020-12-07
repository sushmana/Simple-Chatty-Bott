import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int max=Integer.MIN_VALUE;
        do {
            n = sc.nextInt();
            if(max<n){
                max=n;
            }
        }while(n!=0);
        System.out.println(max);
    }
}