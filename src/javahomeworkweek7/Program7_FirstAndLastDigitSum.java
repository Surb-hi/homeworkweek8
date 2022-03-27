package javahomeworkweek7;

import java.util.Scanner;

public class Program7_FirstAndLastDigitSum {
    //Static result
    public static int sumFirstAndLastDigit(int number) {
        int First_Digit = 0;
        int Last_Digit = number % 10;
        int Sum = 0;
        while (number != 0) {
            int a = number % 10;
            Sum = a;
            number = number / 10;
        }
        return Last_Digit+Sum;
    }
    //Main method
    public static void main(String[] args) {
        Scanner OBJ=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num= OBJ.nextInt();
        System.out.println(sumFirstAndLastDigit(num));

    }
}
