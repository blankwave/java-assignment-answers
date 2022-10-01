//|1| WAP to take input from user for each primitive and non primitive data types and print those varaiables.
package Assignment3;
import java.util.Scanner;
public class DataTypes {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
        System.out.println("Enter a byte value.\nStores whole numbers from -128 to 127, 1 byte");
        byte inpByte = inp.nextByte();
        System.out.println("Enter a short value.\nStores whole numbers from -32,768 to 32,767, 2 byte");
        short inpShort = inp.nextShort();
        System.out.println("Enter a int value.\nStores whole numbers from -2,147,483,648 to 2,147,483,647, 4 byte");
        int inpInt = inp.nextInt();
        System.out.println("Enter a long value.\nStores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807, 8 byte");
        long inpLong = inp.nextLong();
        System.out.println("Enter a float value.\nStores fractional numbers. Sufficient for storing 6 to 7 decimal digits, 4 byte");
        float inpFloat = inp.nextFloat();
        System.out.println("Enter a double value.\nStores fractional numbers. Sufficient for storing 15 decimal digits, 8 byte");
        double inpDouble = inp.nextDouble();
        System.out.println("Enter a boolean value.\nStores true or false values, 1 byte");
        boolean inpBoolean = inp.nextBoolean();
        System.out.println("Enter a char value.\nStores a single character/letter or ASCII values, 2 byte");
        char inpChar = inp.next().charAt(0);
        System.out.println("Enter a String value.\nStores word or sentence");
        String inpString = inp.nextLine();
        inpString = inp.nextLine();
        System.out.println("Primitive data types");
        System.out.println("Data Types \t\tValues");
        System.out.println("Byte\t\t\t"+inpByte);
        System.out.println("short\t\t\t"+inpShort);
        System.out.println("int\t\t\t"+inpInt);
        System.out.println("long\t\t\t"+inpLong);
        System.out.println("float\t\t\t"+inpFloat);
        System.out.println("double\t\t\t"+inpDouble);
        System.out.println("boolean\t\t\t"+inpBoolean);
        System.out.println("char\t\t\t"+inpChar);
        System.out.println("Non-primitive data types");
        System.out.println("String\t\t\t"+inpString);
        
    }
}
