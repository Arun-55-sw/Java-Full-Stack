package LoopingStatements;

import java.util.Scanner;

public class Dowhileloop {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value For N :");
        int n=sc.nextInt();

        do {
            System.out.println(n);
            n--;
        }
        while (n>0);
    }
}
