package javahomeworkweek7;

import java.util.Scanner;

public class Program12_Primenumber {
//Instane method with noperawithreturn
    public boolean Prime() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = obj.nextInt();
        int rem;
        boolean isPrime = true;
        int a;
        for (int i = 2; i <=num1 ; i++) {
            rem = num1 % i;
            if (rem == 0) {
                isPrime = false;
                break;
            }
        }
        if (!isPrime) {
            System.out.println(num1 + " is a Prime number");
        } else {
            System.out.println(num1 + " is not a Prime number");
        }
        return isPrime;

    }

//main method
    public static void main(String[] args) {

        Program12_Primenumber OBJ1=new Program12_Primenumber();
        OBJ1.Prime();


    }
}