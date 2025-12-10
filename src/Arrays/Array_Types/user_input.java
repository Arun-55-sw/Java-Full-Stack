package Arrays.Array_Types;

import java.util.Scanner;

public class user_input {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Row Size : ");
        int row= sc.nextInt();
        System.out.println("Enter The Column Size : ");
        int col= sc.nextInt();
        int [][] a= new int[row][col];

        System.out.println("Enter The Array Elements :");
        for(int i=0;i< a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                a[i][j]= sc.nextInt();
            }
        }
        System.out.println("The Matrix Elements Are: ");
        for(int i=0;i< a.length;i++)
        {
            for(int j=0;j< a.length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
