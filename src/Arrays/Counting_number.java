package Arrays;

import java.util.Scanner;

public class Counting_number {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Array Size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter The Array Elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The Array Elements Are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Enter The Count Number: ");
        int elem = sc.nextInt();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elem) {
                count++;

            }
        }
        if (count == 0) {
            System.out.println("Enter The Valid Number");
        } else {
            System.out.println(elem + " Number Is Repeated " + count + " Time ");
        }

    }
}