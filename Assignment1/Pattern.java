//|4| WAP to print the following pattern
//    1
//    1 2
//    1 2 3
//    1 2 3 4
//    1 2 3 4 5
package Assignment1;
public class Pattern {
    public static void main(String[] args) {
        int a,b;
        for(a=1;a<=5;a++){
            for(b=1;b<a+1;b++){System.out.print(b+" ");}
            System.out.println("");
        }
    }
}
