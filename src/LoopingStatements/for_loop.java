package LoopingStatements;

import java.util.Scanner;

public class for_loop {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number How Many Times Printing");
        int n= sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            System.out.println("...!");
        }
    }
}
