package javahomeworkweek7;

import java.util.Scanner;

public class Program10_Armstrongnumber {
    //instance method with withperawithreturn
    public String isArmstrongNumber(int a){
        double sum=0;
        int Digit=0;
        int Last=0;
        String message;

        int temp=a;
        while (temp>0){
            temp=temp/10;
            Digit++;
        }
        temp=a;
        while (temp>0){
            Last=temp%10;
            sum=sum+(Math.pow(Last,Digit));
            temp=temp/10;
        }
        if(a==sum){
            message="Given number is Armstrong Number ";
        }else {
            message="Given number is not Armstrong Number";
        }return message;

    }
//Main method
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int inputenum = obj.nextInt();
        Program10_Armstrongnumber OBJ1=new Program10_Armstrongnumber();
        System.out.println(OBJ1.isArmstrongNumber(inputenum));
    }
}
