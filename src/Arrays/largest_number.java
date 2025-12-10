package Arrays;

import java.awt.*;

public class largest_number {
    static void main(String[] args) {
        int abc[]={12,4,45,15,85,4,95};
        int large = abc[0];
        int small = abc[0];
        for(int i=1;i<abc.length;i++)//this code is for smallest number
        {
            if(abc[i]<small)
            {
                small=abc[i];
            }
        }

        for(int i=1;i<abc.length;i++)
        {
            if(abc[i]>large) // this code is for largest number
            {
               large =abc[i];
            }
        }
        System.out.println("The Largest Number Is:"+large);
        System.out.println("The smallest Number Is: "+small);
    }
}
