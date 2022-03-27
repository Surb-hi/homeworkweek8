package javahomeworkweek7;

import java.util.Scanner;

public class Program5_PalindromeNumber {
    //Static method
    public static boolean isPalindrome(int number) {
        int sum = 0;
        boolean message;
        int temp = number;
        while (number != 0) {
            int a = number % 10;
            sum = (sum * 10) + a;
            number = number / 10;
        }
        if (temp == sum) {
            message = true;
        } else {
            message = false;
        }
        return message;
    }
//Main method
    public static void main(String[] args) {
        Scanner OBJ=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int Userinpute= OBJ.nextInt();
        System.out.println(isPalindrome(Userinpute));
    }
}
