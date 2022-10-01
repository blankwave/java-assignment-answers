//|5| WAP to program to declare array with 5 diffrent variable types and insert value by yourself and print out all values.
package Assignment2;
public class ArrayAndVariables {
    public static void main(String[] args) {
        int a;
        String[] arrString = {"apple","ball","cat","dog","elephant"};
        int[] arrInt = {1,3,5,6,7};
        float[] arrFloat = {10.11f,20.22f,30.33f,40.44f,50.55f};
        char[] arrChar = {'a','e','i','o','u'};
        boolean[] arrBoolean = {false,true,false,false,true};
        System.out.println("Displaying string array values");
        for(a=0;a<arrString.length;a++){System.out.print(arrString[a]+" ");}
        System.out.println("\nDisplaying int array values");
        for(a=0;a<arrInt.length;a++){System.out.print(arrInt[a]+" ");}
        System.out.println("\nDisplaying float array values");
        for(a=0;a<arrFloat.length;a++){System.out.print(arrFloat[a]+" ");}
        System.out.println("\nDisplaying char array values");
        for(a=0;a<arrChar.length;a++){System.out.print(arrChar[a]+" ");}
        System.out.println("\nDisplaying boolean array values");
        for(a=0;a<arrBoolean.length;a++){System.out.print(arrBoolean[a]+" ");}
    }
}
