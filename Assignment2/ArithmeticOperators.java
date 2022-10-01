//WAP to find addition, subtraction, multiplication, division, reminder and greater number, input by user.
//Hint make user input two number.
package Assignment2;
import java.util.Scanner;
public class ArithmeticOperators {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
        int a,b;
        System.out.println("Enter two numbers ");
        a=inp.nextInt();
        b=inp.nextInt();
        System.out.println("Addition is "+(a+b));
        System.out.println("Subtraction is "+(a-b));
        System.out.println("Multiplication is "+(a*b));
        System.out.println("Division is "+(a/b));
        System.out.println("Reminder is "+(a%b));
    }
}
