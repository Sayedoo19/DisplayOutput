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

        System.out.println(2+3 *5);
        System.out.println(  (2+3) *5);


        double x = 5.0, y = 2;

        System.out.println(x/y);

        System.out.println("Enter your salary");
        salary = input.nextFloat();
        net_salary = salary - (salary * 0.10f);
        int i = 9, j = 2;
        // System.out.println( (float) i/j);
        //i++;
        //j--;

        System.out.printf("your Net salary is %f",net_salary);
        //i+=5;
        //j*=5;
        System.out.println(i);
        System.out.println(j);

        System.out.println(++i * --j * 2);

    }

}