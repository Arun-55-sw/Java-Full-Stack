package Ptterns;

import java.util.Scanner;

public class Loop1 { // mirror image of right angled triangle
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value For N : ");
        int n =sc.nextInt();

        for(int i=1; i>=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(i);
            }

            System.out.println();
        }
    }
}

// for reversing just change in for loop "for(int i=n; i>=1;i--)" like this
