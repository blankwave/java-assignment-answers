//WAP to find maximum, minimum, square root, absolute and random number using a math class.
package Assignment2;
public class MathClass {
    public static void main(String[] args) {
        int a=9,b=4;
        float c=-69.420f;
        System.out.println("Using Math.max("+a+","+b+") is "+Math.max(a,b));
        System.out.println("Using Math.min("+a+","+b+") is "+Math.min(a,b));
        System.out.println("Using Math.sqrt("+a+") is "+Math.sqrt(a));
        System.out.println("Using Math.abs("+c+") is "+String.format("%.3f",c));
        System.out.println("Using Math.random() is "+(int)(Math.random()*101));
    }
}