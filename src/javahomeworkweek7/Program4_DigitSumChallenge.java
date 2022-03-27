package javahomeworkweek7;

import java.util.Scanner;

public class Program4_DigitSumChallenge {
//Static method
    public static int sumDigits(int number) {
        int sum = 0;
        if (number >= 10) {
            while (number > 0) {
                int num = number % 10;
                sum = num + sum;
                number = number / 10;
            }
        } else {
            sum=-1;
        }

        return sum;
    }
//Main method
    public static void main(String[] args) {
        Scanner OBJ=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int Userinpute= OBJ.nextInt();
        System.out.println(sumDigits(Userinpute));
    }
}

