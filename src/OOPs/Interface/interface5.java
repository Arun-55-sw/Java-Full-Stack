package OOPs.Interface;
interface pgm
        {
           void add(int p, int q);
           void multi(int a, int b);
        }
 interface pgm1
 {
     void sub(int s, int t);
     void div(int h, int i);
 }
 class airth implements pgm,pgm1
 {
     public void add(int p, int q)
     {
         System.out.println(" Using multiple inheritance ");
         System.out.println(p+q);
     }
     public void multi(int a, int b)
     {
         System.out.println(a*b);
     }
     public void sub(int s, int t)
     {
         System.out.println(s-t);
     }
     public void div(int h, int i)
     {
         System.out.println(h/i);
     }
 }
public class interface5 {
    static void main(String[] args) {

        airth obj = new airth();
        obj.add(8,3);
        obj.multi(4,2);
        obj.sub(3,5);
        obj.div(7,4);

    }
}
