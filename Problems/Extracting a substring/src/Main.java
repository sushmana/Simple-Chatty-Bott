import java.util.Scanner;

class Main {
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
      String s=scanner.next();
      int a=scanner.nextInt();
      int b=scanner.nextInt();
        System.out.println(s.substring(a,b+1));
    }
}