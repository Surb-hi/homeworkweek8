package javahomeworkweek7;

import java.util.Scanner;

public class Program14 {
//instance method
    public void diamond() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = obj.nextInt();
        System.out.println("Enter a Symbol: ");

        char C = obj.next().charAt(0);
        int i = 1;
        int j;
        while (i <= num) {
            j = 1;

            while (j++ <= num - i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print(C);
            }
            System.out.println();
            i++;
        }

        i = num - 1;

        while (i > 0) {


            j = 1;
            while (j++ <= num - i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2-1) {
                System.out.print(C);
            }
            System.out.println();
            i--;
        }

    }
//Main method
    public static void main(String[] args) {
        Program14 OBJ1 = new Program14();
        OBJ1.diamond();
    }
    }

