package ConditionStatements;

import java.util.Scanner;

public class Conditionstatements {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Value For Age : ");
       int age = sc.nextInt();

       if(age>=22)
       {
           System.out.println("Congratulations You Are Eligible For Vote...  ");
       }
       else
       {
           System.out.println("Please Wait Until You Turn 18... ");
       }
    }
}