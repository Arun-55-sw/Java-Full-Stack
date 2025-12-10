package ConditionStatements;

import java.util.Scanner;

public class Swithcase {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number 1 to 7 : ");
        int day = sc.nextInt();

        switch (day)
        {
            case 1:
                System.out.println("This Day Is Monday ");
                break;
            case  2:
            System.out.println("This Day Is Tuesday ");
                 break;
            case  3:
                System.out.println("This Day Is Wednesday ");
                break;
            case  4:
                System.out.println("This Day Is Thursday ");
                break;
            case  5:
                System.out.println("This Day Is Friday ");
                break;
            case  6:
                System.out.println("This Day Is Saturday ");
                break;
            case  7:
                System.out.println("This Day Is Sunday ");
                break;
            default:
                System.out.println("Enter The Valid Number : ");
                break;
        }
    }
}
