import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //this program to calculate rectangle area
        String fname="";
        float salary;
        float net_salary;
        System.out.println("Enter your first name");
        fname = input.next();

        int length, width, area;
        System.out.println("Enter your salary");
        salary = input.nextFloat();
        net_salary = salary - (salary * 0.10f);

        System.out.println("Enter rectangle length");
        length = input.nextInt();
        System.out.println("Enter rectangle width");
        width = input.nextInt();
        area = length * width ;
        System.out.println(area);
        System.out.printf("The Rectangle area is %d",area);

        System.out.printf("your Net salary is %f",net_salary);
    }

}