package OOPs;

class KVGCE
{
    String name = "Arun Kumar A";
    int age = 22;
    String branch = "Computer Science and Engineering";
    String mailid ="arunkumara1367@gmail.com";
    long ph_no=8296193021l;

}

public class Collegedetails {
    static void main(String[] args) {
        KVGCE obj =new KVGCE();
        System.out.println("Student Name Is :"+obj.name);
        System.out.println(obj.name+ " Age IS : "+obj.age);
        System.out.println(obj.name+ " Branch Is : "+obj.branch);
        System.out.println(obj.name+ " Mail Id Is :"+obj.mailid);
        System.out.println(obj.name+ " Phone No : "+obj.ph_no);

    }
}
//We Can Create Multiple Object For The Class
//We Can Create Multiple Class For Single Program