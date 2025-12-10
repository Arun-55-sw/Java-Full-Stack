import java.util.Scanner;

public class Largestnumber {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Value For A : ");
        int a = sc.nextInt();
        System.out.println("Enter The Value For B : ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("A is Larger Than B : "+a);
                    }
        else {
            System.out.println("A is Smaller Than B : "+a);
        }
    }
}
