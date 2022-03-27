package javahomeworkweek7;

import java.util.Scanner;

public class Program6_Patterntriangle {
    //Static metthod
    public void tringlepattern(int a){
        for(int i=1;i<=a;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }System.out.println();
        }
    }
//Main method
    public static void main(String[] args) {
        Scanner OBJ=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num= OBJ.nextInt();
        Program6_Patterntriangle OBJ1=new Program6_Patterntriangle();
        OBJ1.tringlepattern(10);
    }

}
