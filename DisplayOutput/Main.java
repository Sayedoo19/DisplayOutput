import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //this program to calculate rectangle area

        int length, width, area;

        System.out.println("Enter rectangle length");
        length = input.nextInt();
        System.out.println("Enter rectangle width");
        width = input.nextInt();
        area = length * width ;
        System.out.println(area);
        System.out.printf("The Rectangle area is %d",area);

    }

}