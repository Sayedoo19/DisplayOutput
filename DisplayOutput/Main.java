import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number1, number2;
        System.out.println("Enter 2 numbers to see Which number is Greater");
        number1 = input.nextInt();
        number2 = input.nextInt();

        if (number1==number2)
            System.out.println("Equal");
        else if (number1>number2)
            System.out.println("Number1 is greater");
        else
            System.out.println("Number2 is greater");

    }
}
