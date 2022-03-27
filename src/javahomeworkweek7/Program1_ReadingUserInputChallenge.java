package javahomeworkweek7;

import java.util.Scanner;

public class Program1_ReadingUserInputChallenge {
// A method sum1 check and calculate the int number sum.
    public void sum1() {
        Scanner obj = new Scanner(System.in);
        int sum = 0;
        int i = 1;
        while (i <= 10) {
            System.out.println("Enter number #x:");
            boolean validateNumber = obj.hasNextInt();
            if (validateNumber) {
                int n = obj.nextInt();
                sum =   sum+n;
                i++;
            } else {
                System.out.println("Invalid input");
            }
            obj.nextLine();
        }
        System.out.println("SUM OF NUMBER IS " + sum);

    }
//Main method
    public static void main(String[] args) {
        Program1_ReadingUserInputChallenge OBJ1 = new Program1_ReadingUserInputChallenge();
        OBJ1.sum1();
    }
}



