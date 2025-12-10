package OOPs.Methods;

import java.util.Scanner;

class Company
{
    public void employee(String name, int salary,String role)
    {
        System.out.println("Employee Name Is : "+name +" his salary is "+salary+" and his role is "+role);
    }
    public void depart(String dept_name,int dept_id)
    {
        System.out.println("and He working in "+dept_name +" and his id is : "+dept_id);
    }
}
public class user2 {
    static void main(String[] args) {
        Company obj = new Company();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Employee Name:");
        String name=sc.nextLine();
        System.out.println("Enter The Employee Role:");
        String role=sc.nextLine();
        System.out.println("Enter The Department Name:");
        String dept_name=sc.nextLine();
        System.out.println("Enter The Employee Salary:");
        int salary = sc.nextInt();
        System.out.println("Enter The Department Id :");
        int dept_id=sc.nextInt();

        obj.employee(name,salary, role);
        obj.depart(dept_name,dept_id);


    }
}
