package Ptterns;

import java.util.Scanner;

public class Loop2 {//mirror of right angled triangle with border and with space b/w
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value For N : ");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--)
        {
            for (int j = n; j > i; j--)
            {
                System.out.print(" ");
            }
                    for (int k = 1; k <= i; k++)
                    {
                        if(k==1 || i==n || i==k)
                        {
                            System.out.print(i);
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                }
                System.out.println();
            }
        }
    }
