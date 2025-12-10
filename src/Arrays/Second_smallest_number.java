package Arrays;

import java.util.Scanner;

public class Second_smallest_number {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array: ");
        int size= sc.nextInt();
        System.out.println("Enter The Array Elements: ");
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The Array Elements Are:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        int small=arr[0];
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]<small)
            {
                small=arr[i];
            }
        }
        System.out.println(small+ " Is The Smallest Elements In The Array...!");

        int sec_small=arr[1];
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]!=small)
            {
                if (arr[i]<sec_small)
                {
                    sec_small=arr[i];
                }
            }
        }
        System.out.println(sec_small+ " Is The Second Smallest Elements In The Array");
    }

}
