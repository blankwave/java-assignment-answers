//WAP to print your name using not returning function
//WAP to find sum using returning function
//WAP to find division using returning function which can also return decimal value
package Assignment1;
public class Functions {
    public static void myName(){
        System.out.println("Kritesh Thapa Magar");
    }
    public static int sum(int x,int y){
        return x+y;
    }
    public static float division(float x,float y){
        return x/y;
    }
    public static void main(String[] args) {
        myName();
        System.out.println("Sum of two numbers is "+sum(69,420));
        System.out.println("Division of two numbers is "+division(420,69));
    }
}
