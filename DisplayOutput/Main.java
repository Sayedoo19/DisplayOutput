import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Enter number to test");
        number = input.nextInt();
        if (number >=0)
        {

                    if (number%2 == 0) {
                        System.out.println("Positive Number");
                        System.out.println("Even another Number");
                    }
                    else System.out.println("Odd Number");
        }
        else
            System.out.println("Negative Number");

    }
}
