import java.util.Scanner;

public class Grademarks {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Grade Of The Student : ");
        int grade = sc.nextInt();

        switch (grade)
        {
            case 90:
                System.out.println("He Got A+ Grade  ");
                break;
            case  80:
                System.out.println("She Got A Grade ");
                break;
            case  70:
                System.out.println("She Got B+ Grade ");
                break;
            case  60:
                System.out.println("He Got B Grade ");
                break;
            case  50:
                System.out.println("She Got C+ Grade ");
                break;
            case  45:
                System.out.println("He Just Passes ");
                break;
            default:
                System.out.println("He/She Got failed ");
                break;
        }



    }
}

