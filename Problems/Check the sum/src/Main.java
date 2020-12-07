import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      int a=scanner.nextInt();
      int b=scanner.nextInt();
      int c=scanner.nextInt();

        if((a+b)==20){
            System.out.println("true");
        }
        else if((b+c)==20){
            System.out.println("true");
        }
        else if((a+c)==20){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}