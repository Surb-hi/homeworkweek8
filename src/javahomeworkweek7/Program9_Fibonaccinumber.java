package javahomeworkweek7;

import java.util.Scanner;

public class Program9_Fibonaccinumber {
//Instance method
    public  void Fibonaaci(int num) {
        int n1 = 0;//0+1=1,1+1=2,2+1=3....n
        int n2 = 1;
        int num1;
        System.out.print(n1+"\t" +n2);
        if (num < 40) {
            for (int i = 0; i <= num; i++) {
                num1 = n1 + n2;
                System.out.print("\t"+num1);
                n1 = n2;
                n2 = num1;
            }
        } else {
            System.out.println("Given number is out of scoop");
        }
    }
//Main method
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int inputenum = obj.nextInt();
        Program9_Fibonaccinumber OBJ=new Program9_Fibonaccinumber();
        OBJ.Fibonaaci(inputenum);
    }
}

