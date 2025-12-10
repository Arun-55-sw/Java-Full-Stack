package Arrays;

import java.util.Scanner;

public class Someof_array_elements {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter The Array Size: ");
    int size = sc.nextInt();
    int[] arr=new int[size];
    System.out.println("Enter The Array Elements: ");
    for(int i=0;i<arr.length;i++)
    {
        arr[i]=sc.nextInt();
    }
    int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i]; // or sum=sum+arr[i]
        }
        System.out.println(" Sum Of Array Elements Is: "+sum);
        int avg=sum/size;
        System.out.println(" Avg Of Array Elements Is: "+avg);

    }
}
