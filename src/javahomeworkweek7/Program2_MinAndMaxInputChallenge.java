package javahomeworkweek7;

import java.util.Scanner;

public class Program2_MinAndMaxInputChallenge {
    // instance method
    public void MinMax() {
        Scanner obj = new Scanner(System.in);
        int count = 0;
        int min = 0;
        int max = 0;
        boolean result = true;

        while (true) {
            int b = count++;
            System.out.println("Enter Number" + (b) + ":");
            boolean isValid = obj.hasNextInt();
            if (isValid) {//Condition
                int num = obj.nextInt();
                if (result) {
                    result = false;
                    min = num;
                    max = num;
                }

                if (num < min) {
                    min = num;
                } else if (num > max) {
                    max = num;
                }
            } else {
                System.out.println("Invalid input ");
                break;
            }
            obj.nextLine();

        }
        System.out.println("Min Number :" + min);
        System.out.println("Max Number :" + max);

    }
//Main method
    public static void main(String[] args) {
        Program2_MinAndMaxInputChallenge obj1 = new Program2_MinAndMaxInputChallenge();
        obj1.MinMax();
    }
}
