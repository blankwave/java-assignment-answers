//|4| WAP to ask gender from user. Use if…else condition to print if that use is male, female, gay, lesbian or invalid.
//WAP to solve same questions using switch case.
package Assignment2;
import java.util.Scanner;
public class IfElseSwitchCase {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
        System.out.println("Enter your gender \nMale\t(m)\nFemale\t(f)\nGay\t(g)\nLesbian\t(l)");
        String gender = inp.nextLine();
        if(gender.equals("M")||gender.equals("m")){System.out.println("Gender is Male");}
        else if(gender.equals("F")||gender.equals("f")){System.out.println("Gender is Female");}
        else if(gender.equals("G")||gender.equals("g")){System.out.println("Gender is Gay");}
        else if(gender.equals("L")||gender.equals("l")){System.out.println("Gender is Lesbian");}
        else{System.out.println("Invalid input");}
        switch(gender){
            case "m":
                System.out.println("Gender is Male");
                break;
            case "M":
                System.out.println("Gender is Male");
                break;
            case "f":
                System.out.println("Gender is Female");
                break;
            case "F":
                System.out.println("Gender is Female");
                break;
            case "g":
                System.out.println("Gender is Gay");
                break;
            case "G":
                System.out.println("Gender is Gay");
                break;
            case "l":
                System.out.println("Gender is Lesbian");
                break;
            case "L":
                System.out.println("Gender is Lesbian");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
/*
switch(gender){
    case "m":System.out.println("Gender is Male");break;
    case "M":System.out.println("Gender is Male");break;
    case "f":System.out.println("Gender is Female");break;
    case "F":System.out.println("Gender is Female");break;
    case "g":System.out.println("Gender is Gay");break;
    case "G":System.out.println("Gender is Gay");break;
    case "l":System.out.println("Gender is Lesbian");break;
    case "L":System.out.println("Gender is Lesbian");break;
    default:System.out.println("Invalid input");
}
*/


