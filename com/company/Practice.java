package com.company;
import java.text.NumberFormat;
import java.util.Scanner;
public class Practice {
    static int fact(int n){
        if(n==0 || n==1)
            return 1;
        int i,res=n;
        for(i=n-1;i>1;i--)
            res*=i;
        return res;
    }

    static int fib(int n){
        if(n==0||n==1) {
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long principal;
        System.out.print("Enter the principal: ");
        principal = scanner.nextLong();
        System.out.print("Enter Annual Rate: ");
        float rate;
        rate = scanner.nextFloat();
        float monthlyRate = rate / 1200;
        double val;
        int period;
        System.out.print("Enter period in year: ");
        period = scanner.nextInt();
        period *= 12;
        System.out.println("Mortgage:");
/*        val = Math.pow(1 + monthlyRate, period);
        double mortgage;
        mortgage = monthlyRate * val * principal / (val - 1);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println(currency.format(mortgage)); */  // It will return a string formatted in the currency format

//        boolean isTrue;
//        isTrue= true;
//        boolean myName=true;
//        if(isTrue){
//            System.out.println("If is true");
//        }
//        else if(myName){
//            System.out.println("My Name is implemented");
//        }
//        else{
//            System.out.println("Else part implemented");
//        }
//
//
//
//    }
    }
}
