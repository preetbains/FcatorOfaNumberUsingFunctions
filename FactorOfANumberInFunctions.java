package javaclass;

import java.util.Scanner;

public class FactorOfANumberInFunctions {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter number to find factor: ");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        factor(a);
    }
    static void factor(int a){
        int i;
        System.out.println("Factor of a Number is: ");
        for(i=1;i<=a;i++){
            if(a%i==0){
               System.out.println(i);
            }
        }
    }
}