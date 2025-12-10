package Arrays;

public class simple_pgm {
    static void main(String[] args) {
        int arr[]={5,2,5,2,4,5};
        // for finding array index
        System.out.println(arr[4]);

        // for changing the index value
        //  arr[1]=9;

        /* for (int i=0;i<arr.length;i++) using normal for loop,this
       {
           System.out.println(arr[i]);

      }
      }
        */
        for(int i:arr) // using foreach loop
        {
            System.out.println(i);
        }
    }
}
