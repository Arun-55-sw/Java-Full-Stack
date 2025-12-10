package Arrays.Array_Types;

import java.util.Scanner;

public class Addition_matrix {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The A Row Size : ");
        int row1= sc.nextInt();
        System.out.println("Enter The A Column Size : ");
        int col1= sc.nextInt();
        System.out.println("Enter The B Row Size : ");
        int row2= sc.nextInt();
        System.out.println("Enter The B Column Size : ");
        int col2= sc.nextInt();
        int [][] A= new int[row1][col1];
        int [][] B= new int[row2][col2];
       int [][] C=new int[row1][col2];

        System.out.println("Enter The Matrix A Elements :");
        for(int i=0;i< row1;i++)
        {
            for(int j=0;j<col1;j++)
            {
                A[i][j]= sc.nextInt();
            }
        }
        System.out.println("Enter The Matrix B Elements :");
        for(int i=0;i< row2;i++)
        {
            for(int j=0;j<col2;j++)
            {
                B[i][j]= sc.nextInt();
            }
        }
        System.out.println("The A Matrix Elements Are: ");
       for(int i=0;i< row1;i++)
        {
            for(int j=0;j< col1;j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("The A Matrix Elements Are: ");
        for(int i=0;i< row2;i++)
        {
            for(int j=0;j< col2;j++)
            {
                System.out.print(B[i][j]+" ");
            }
            System.out.println();
        }
       // System.out.println("The Addition Of A And B Matrix Are :");
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col2;j++)
            {
                C[i][j]= A[i][j]+B[i][j];
            }
        }
        System.out.println("The Addition Of A And B Matrix Are :");
        for(int i=0;i< row1;i++)
        {
            for(int j=0;j< col1;j++)
            {
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }


    }
}
