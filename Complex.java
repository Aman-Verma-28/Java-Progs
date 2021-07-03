//import java.util.Scanner;
//
//public class Complex {
//    int real;
//    int imag;
//
//    Complex() {
//
//    }
//
//    Complex(int treal, int timag) {
//        real = treal;
//        imag = timag;
//    }
//
//    Complex addComp(Complex c1, Complex c2) {
//        Complex c3 = new Complex();
//        c3.real = c1.real + c2.real;
//        c3.imag = c1.imag + c2.imag;
//        return c3;
//    }
//
//    Complex subComp(Complex c1, Complex c2) {
//        Complex c3 = new Complex();
//        c3.real = c1.real - c2.real;
//        c3.imag = c1.imag - c2.imag;
//        return c3;
//
//    }
//
//    void printComp(Complex c) {
//        System.out.println("Complex Number is of the form {real} + {imaginary} * i ");
//
//
//        System.out.println(c.real + " + (" + (c.imag) + ")i");
//
//
//    }
//
//    public static void main(String args[]) {
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            int ch;
//            System.out.println("Enter the first Complex number");
//
//            int r1 = scanner.nextInt();
//            int i1 = scanner.nextInt();
//            System.out.println("Enter the second Complex Number");
//            int r2 = scanner.nextInt();
//            int i2 = scanner.nextInt();
//            Complex c1 = new Complex(r1, i1);
//            Complex c2 = new Complex(r2, i2);
//            System.out.println("1.Add \n2.Sub \n3.Exit");
//            System.out.println("Enter choice");
//            ch = scanner.nextInt();
//
//            switch (ch) {
//                case 1 -> {
//                    Complex c3 = new Complex();
//                    c3 = c3.addComp(c1, c2);
//                    System.out.println("Complex Number after addition");
//                    c3.printComp(c3);
//                }
//                case 2 -> {
//                    Complex c4 = new Complex();
//                    c4 = c4.subComp(c1, c2);
//                    System.out.println("Complex Number after substraction");
//                    c4.printComp(c4);
//                }
//                default -> System.exit(0);
//            }
//    }
//
//}
//}
//
//class Name{
//
//}

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Complex {
    public static void main(String[] args) {
        int [] arr = new int[10] ;
        System.out.println("Enter the size of the array");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=0;i<n;i++)
            arr[i]=scanner.nextInt();
        boolean isSorted = true;
        for(int i =0;i<n-1;i++)
            if(arr[i]>arr[i+1]) {
                isSorted = false;
                break;
            }
        if(isSorted)
            System.out.println("Array is sorted");
        else
            System.out.println("Array is not sorted");


//        System.out.println(Arrays.toString(arr));
    }
}