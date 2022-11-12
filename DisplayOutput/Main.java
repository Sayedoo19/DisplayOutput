import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int marks;
        System.out.println("Enter You Mark");
        marks = input.nextInt();
        if (marks >=90)
            System.out.println("You Got A");
        else if (marks >=80)
            System.out.println("You Got B");
        else if (marks >=70)
            System.out.println("You Got C");
        else if (marks >=60)
            System.out.println("You Got D");
        else
            System.out.println("You Got F");



    }
}
