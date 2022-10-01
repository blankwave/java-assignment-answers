//|3| WAP to take a positive integer from user and print sum upto that number using for loop.
//    WAP to take a positive integer from user and find out numbers divisiable by 3 upto that number using while loop.
//    WAP to print fibonacci series upto 2584 using do while
package Assignment3;
import java.util.Scanner;
public class ForWhileDoLoop {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
        int num,a,b=1,sum=0;
        System.out.println("Enter a positive integer");
        num=inp.nextInt();
        if(num>0){
            for(a=0;a<=num;a++){sum+=a;}
            System.out.println("Sum upto "+num+" is "+sum);
            System.out.println("Number divisable by 3 upto "+num+" are ");
            while(b<=num){
                if(b%3==0){System.out.print(b+" ");}
                b++;
            }
        }
        System.out.println("\nTo print fibonacci series upto 2584");
        int n1=0,n2=1,n3=0;
        do{
            System.out.print(n1+" ");
            n3=n1+n2;
            n1=n2;
            n2=n3;
        }
        while(n1<=2584);
    }
}
