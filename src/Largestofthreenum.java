import java.util.Scanner;

public class Largestofthreenum {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Marks Of The Student : ");
        int a = sc.nextInt();

        if(a>100)
        {
            System.out.println( " Student A Got A Distinction : ");
        }
        else if (a>90)
        {
            System.out.println( " Student B Got A First Class : ");
        }
        else if (a>80)
        {
            System.out.println( " Student C Got A Second Class : ");
        }
        else if (a>60)
        {
            System.out.println( " Student D Got A Average Class : ");
        }
        else
        {
            System.out.println( " Student Got A Just Pass : ");
        }

    }
}
