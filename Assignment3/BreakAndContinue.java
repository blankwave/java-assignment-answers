//|5| WAP to for loop upto 10 times, use break when loop reaches reaches 4.
//    WAP to for loop upto 10 times, use continue when loop reaches reaches 4.
package Assignment3;
public class BreakAndContinue {
    public static void main(String[] args) {
        int a;
        System.out.println("Using break; in 4th loop");
        for(a=1;a<=10;a++){
            if(a==4){break;}
            System.out.print(a+" ");
        }
        System.out.println("\nUsing continue; in 4th loop");
        for(a=1;a<=10;a++){
            if(a==4){continue;}
            System.out.print(a+" ");
        }
    }
}
