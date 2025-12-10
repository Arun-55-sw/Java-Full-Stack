import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Userinput {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter The Student Name :");
        String name = sc.nextLine();
        System.out.println("Enter The Student Age :");
        int n= sc.nextInt();
        System.out.println(" Student name is : " +name+ " \n "+" Student age is : " +n);

    }
}
