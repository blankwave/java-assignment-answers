//|1| WAP to print the multiplication of given number
package Assignment1;
import java.util.Scanner;
class Multiplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num,a;
        System.out.println("Enter a  number ");
        num = in.nextInt();
        System.out.println("Multiplication of " + num);
        for(a=1;a<=10;a++){
            System.out.println(num+" * "+a+"\t= "+(num*a));
        }
    }
}