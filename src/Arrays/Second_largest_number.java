package Arrays;

import java.util.Scanner;

public class Second_largest_number {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Array Size : ");
        int size= sc.nextInt();
        System.out.println("Enter The Array Elements : ");
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The Array Elements Are: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
        int large=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>large)
            {
                large =arr[i];
            }
        }
        System.out.println(large + " Is The First Largest Number In The Array Elements...!");

        int sec_large=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=large)
            {
                if(arr[i]>sec_large)
                {
                    sec_large=arr[i];
                }
            }
        }
        System.out.println(sec_large+ " Is The Second Largest Number In Array Elements...!");
    }
}
