package LoopingStatements;

import java.util.Scanner;

public class Forloop {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value For N :");
        int n=sc.nextInt();


        for(int i=0;i<=n;i++)
        {
            System.out.println("The Value Is "+i);
        }
    }
}
