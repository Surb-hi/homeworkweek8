package javahomeworkweek7;

import java.util.Scanner;

public class Program11_EvenDigitSum {
    //Static method
    public static int getEvenDigitsSum(int a) {
        int lastdigits;
        int sum = 0;
        if (a > 0) {
            while (a > 0) {
                lastdigits = a % 10;
                if (lastdigits % 2 == 0) {
                    sum = sum + lastdigits;
                }
                a = a / 10;
            }
        } else
            sum = -1;
        return sum;
    }
    //main method
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int inputenum = obj.nextInt();
        if (getEvenDigitsSum(inputenum)!=-1){
            System.out.println("The sum of even digits : "+getEvenDigitsSum(inputenum));
        }else {
            System.out.println("Invalid Input ");
        }

    }


    }


