package Basic;

import java.util.Scanner;

public class Swapping {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value For A :");
        int a=sc.nextInt();
        System.out.println("Enter The Value For B :");
        int b= sc.nextInt();

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("The value of A is : " +a);
        System.out.println("The value of B is : " +b);

    }
}


