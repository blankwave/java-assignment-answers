//|4| WAP to find out palindrome in the given array using for each.
//array1 = [123,45,66,788,898,101101,1221,234];
//array2 = ['apple','madam','short','deed','city','malayalam'];
package Assignment3;
public class PalindromeAndArray {
    public static void main(String[] args) {
        int[] array1 = {123,45,66,788,898,101101,1221,234};
        String[] array2 = {"apple","madam","short","deed","city","malayalam"};
        int a,b,tempInt,remInt,sumInt=0;
        String revStr="";
        System.out.println("To find palindrome number");
        for(int numInt : array1){
            tempInt=numInt;
            sumInt=0;
            while(numInt>0){
                remInt=numInt%10;
                sumInt=(sumInt*10)+remInt;
                numInt=numInt/10;
            }
            if(tempInt==sumInt){System.out.println(tempInt+" is a palindrome number");}
            else{System.out.println(tempInt+" is not a palindrome number");}
        }
        System.out.println("\nTo find palindrome word");
        for(String wordStr : array2){
            revStr="";
            for(b=wordStr.length()-1;b>=0;b--) {
                revStr=revStr+wordStr.charAt(b);
            }
            if (wordStr.equals(revStr)){System.out.println(wordStr+" is a palindrome word");}
            else{System.out.println(wordStr+" is not a palindrome word");}
        }
    }
}
