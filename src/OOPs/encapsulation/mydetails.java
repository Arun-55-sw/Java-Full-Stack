package OOPs.encapsulation;

class details
{
    private String name="Arun";
    private String clg_name="KVGCE";
    private String address="Mysore";
    private String mail_id="arun@123";
    private int roll_no=169;

    public String getname()
    {
        return name;

    }
    public String getClg_name()
    {
        return clg_name;

    }
    public String getAddress()
    {
        return address;

    }
    public String getMail_id()
    {
        return mail_id;

    }
    public int getRoll_no()
    {
        return roll_no;

    }

}
public class mydetails {
    static void main(String[] args) {

        details obj = new details();
        System.out.println(obj.getname()+" "+obj.getClg_name()+" "+obj.getAddress()+" "+obj.getMail_id()+" "+obj.getRoll_no());
    }
}
