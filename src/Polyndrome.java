import java.util.Scanner;

public class Polyndrome {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number :");
        int num = sc.nextInt();
        int n = num;
        int r = 0;

        while (num != 0) {
            int a = num % 10;
            r = r * 10 + a;
            num = num / 10;
        }
        if (n == r)
        {
            System.out.println(n + " Is The Palindrome ");
        }
        else
            {
                System.out.println("The Given Number Is Not A Palindrome ");
            }
        }
    }
