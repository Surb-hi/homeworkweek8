package javahomeworkweek7;

import java.util.Scanner;

public class Program15_Angletriangle {
    //static method
    public static void triangle(){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a pattannumber");
        int num=obj.nextInt();
        for (int i=0; i<num+1 ; i++) {
            for (int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
//main method
    public static void main(String[] args) {
        triangle();
    }
}
