//|3| WAP to find the length of array and sum of numbers inside an array. array = [12,22,32,42,52,62,72]
package Assignment1;
public class Array {
    public static void main(String[] args) {
        int[] array = {12,22,32,42,52,62,72};
        System.out.println("Array length is "+array.length);
        int a,sum=0;
        for(a=0;a<array.length;a++){sum+=array[a];}
        System.out.println("Sum of numbers in array is "+sum);
    }
}
