//|5| WAP to display ASCII value of given character & print from a to z;
package Assignment1;
import java.util.Scanner;
public class ASCII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char value;
        int asciiValue,a;
        System.out.println("Enter a character ");
        value = in.next().charAt(0);
        asciiValue = value;
        System.out.println("ASCII value of "+value+" is "+asciiValue);
        for(a=97;a<123;a++){System.out.print((char)a+" ");}
    }
}
