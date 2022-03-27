package javahomeworkweek7;

import java.util.Scanner;

public class Program8_RightAngleTriangle {
//Instance method
    public void triangle(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j=1; j<=i; j++){
                System.out.print("@");
            }
            System.out.println();
        }
    }
//Main method
    public static void main(String[] args) {
        Scanner OBJ=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num= OBJ.nextInt();
        Program8_RightAngleTriangle obj1=new Program8_RightAngleTriangle();
        obj1.triangle(5);
    }
}