package javahomeworkweek7;

import java.util.Scanner;

public class Program13_SharedDigit {
    //Static method with pera with return
    public static String hasSharedDigit(int a, int b) {
        String msg;
        if ((a >= 10 && a <= 99) && (b >= 10 && b <= 99)) {
            int a_lastdigit = a % 10;
            int b_lastdigit = b % 10;
            a = a / 10;
            b = b / 10;
            int a_firstdigit = a;
            int b_firstdigit = b;
            if ((a_firstdigit == b_firstdigit) || (a_firstdigit == b_lastdigit) || (a_lastdigit == b_firstdigit) || (a_lastdigit == b_lastdigit)) {
                msg = "Given numbers has a shared digits.";
            } else {
                msg = "Given numbers hasn't a shared digits.";
            }
        } else
            msg = "Invalid input";
        return msg;
    }
//Main method
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a First number: ");
        int inputenum = obj.nextInt();
        System.out.println("Enter a Second number: ");
        int inputenum1 = obj.nextInt();
        System.out.println(hasSharedDigit(inputenum,inputenum1));

    }
}

