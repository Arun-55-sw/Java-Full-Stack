package Arrays;

import java.util.Scanner;

public class User{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array: ");
        int size= sc.nextInt();
        int[] array=new int[size];
        System.out.println("Enter The Array Elements: ");
        for(int i=0;i< array.length;i++)
        {
             array[i]=sc.nextInt();
        }
        System.out.println("The Array Elements Are : ");
        for(int i=0;i< array.length;i++)
        {
            System.out.println(array[i]);
        }

    }
}
