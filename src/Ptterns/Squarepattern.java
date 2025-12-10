package Ptterns;

import java.util.Scanner;

public class Squarepattern {
    static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value for N :");
        int n=sc.nextInt();
        for(int i =1;i<=n;i++)
        {
            for (int j=1;j<=n;j++)
            {
                System.out.print(" * ");

            }
            System.out.println();

        }
    }
}
//for printing sqaure same logic but changes in for j loop j<=n,rest of all it same
// next printing square with the space the logic is use the if else statements
//                if (i==1 || i==n || i == 3 || j==1 || j==n)
//                {
//                    System.out.print(" * ");
//                }
//                else
//                {
//                    System.out.print("   ");
//                }