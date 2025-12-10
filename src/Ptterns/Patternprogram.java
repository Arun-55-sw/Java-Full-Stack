package Ptterns;

public class Patternprogram {

    static void main(String[] args) {
        int n=5;

        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                if (i==n || i==j || j==1)
                {
                    System.out.print("*");
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

//this above code for space b/w right angle triangle
// to get full right angle triangle use remove if else statement
// changing no and star just change in print statement like print(i),or print(j)
// mirror code for that just change in for loop for(i=n;i>=1;i--) like this