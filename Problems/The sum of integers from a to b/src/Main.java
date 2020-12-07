import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    int result=0;

    for(;num1<=num2;num1++){
        result+=num1;
    } System.out.println(result);

}
}