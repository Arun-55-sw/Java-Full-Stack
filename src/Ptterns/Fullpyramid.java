package Ptterns;

public class Fullpyramid {//full Square pyramid program using without user input
    static void main(String[] args)
    {
        int i,k,j;
        for ( i = 1; i <= 5; i++)
        {
            for ( j = 1; j<=i; j++)
            {
                System.out.print("");
            }

            for (k=1;k>=(2*-1);k--)
            {
                System.out.print(" * ");

            }
            {
                System.out.println(" ");
            }
        }
    }
}