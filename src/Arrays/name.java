package Arrays;

public class name {
    static void main(String[] args) {
        char abc[]={'A','R','K','N'};
        for (int i=0;i< abc.length;i++)
        {
            System.out.print(abc[i]+" ");
        }
        abc[2]='U';
        for (int i=0;i< abc.length;i++)
        {
            System.out.print(abc[i]+" ");
        }
    }
}
