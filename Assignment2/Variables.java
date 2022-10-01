//|1| WAP to Print out a persons name, age, height, gender and is that person below age 18 using different variable types.
package Assignment2;
import java.util.Scanner;
public class Variables {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String heshe;
        System.out.println("Enter your name ");
        String name = inp.nextLine();
        System.out.println("Enter your age ");
        int age = inp.nextInt();
        System.out.println("Enter your height ");
        float height = inp.nextFloat();
        System.out.println("Enter your gender (M/F) ");
        char gender = inp.next().charAt(0);
        boolean teenage=false;
        if(age<19){teenage=true;}
        System.out.println("Name: "+name+"\nAge: "+age+"\nHeight: "+height+"\nGender:"+gender+"\nTeenage: "+teenage);
    }
}
