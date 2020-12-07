import java.util.Scanner;
import java.math.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        boolean isAscending = false;
        boolean initialized = false;
        boolean memHolder = false;
        boolean flag = false;
        do {
            int m = scanner.nextInt();
            if(m==0)break;
            if (n < m) {
                if(!initialized){
                    memHolder = true;
                }
                initialized = true;
                isAscending = true;
            } else if(n > m) {
                if(!initialized){
                    memHolder = false;
                }
                initialized = true;
                isAscending = false;
            }
            if(initialized == true){
                if(memHolder != isAscending)
                {
                    flag = true;
                    System.out.println("false");
                    break;
                }
                memHolder = isAscending;
            }
            n = m;
        } while (true);
        if(!flag){
            System.out.println("true");
        }

    }
}



