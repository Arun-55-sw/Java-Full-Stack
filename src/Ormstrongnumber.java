import java.util.Scanner;

public class Ormstrongnumber {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number :");
        int num = sc.nextInt();
        int n = num;
        int r = 0;

        while (num != 0)
        {
            int a = num % 10;
            r = r+a*a*a;
            num = num / 10;
        }
        if (r == n)
        {
            System.out.println(n + " OrmStrong Number ");
        }
        else
        {
            System.out.println("The Given Number Is Not A OrmStrong ");
        }
    }
}
