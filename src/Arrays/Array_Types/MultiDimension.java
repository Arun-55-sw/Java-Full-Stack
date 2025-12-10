package Arrays.Array_Types;

public class MultiDimension {
    static void main(String[] args) {
        int [][] a={
                {4,2,3,5},
                {8,5,9,2},
                {9,5,22,1},
                {74,4,21,5}
        };
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
