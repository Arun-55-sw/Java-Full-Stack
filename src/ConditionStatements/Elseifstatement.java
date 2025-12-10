package ConditionStatements;

import java.util.Scanner;

public class Elseifstatement {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number : ");
        int num = sc.nextInt();

        if(num>0)
        {
            System.out.println(num+ " Number Is Positive : ");
        }
        else if (num<0)
        {
            System.out.println(num+ " Number Is Negative: ");
        }
        else
        {
            System.out.println(num+ " Number Is 0 : ");
        }

    }

}
