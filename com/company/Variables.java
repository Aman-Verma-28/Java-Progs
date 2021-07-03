package com.company;
import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
//        byte age=19;
//        System.out.println(age);
//        System.out.println("Now we will discuss taking inputs");
//        float f1=5.90f;
//        long l1=8785;
//        int a=56;
//        short s=45;
//        double d=987.985;

//     String name;
//     Scanner sc= new Scanner(System.in);
//        System.out.println("Enter your name");
//     name=sc.nextLine(); // just like gets

//        // sc.next() is like scanf("%s")
//        System.out.println("Hello " + name + " have a good day");

        // refrence data types uses new keyword to allocate the memory and if we assign another variable with the same address then any change in the old variable will be affected in the new variable.
        Point point = new Point(1,2);
        Point point2= point;
        point.x=2;
        point2.y=1;
//        System.out.println(point2);

        String st= "Hello \" Aman \" this is windows c:\\ drive \n into the new line \t after a tab space\n these all are mostly used escape sequence used in java";
        System.out.println(st);
        // Strings are immutable in java so any method of the string if it is changing the string it will not affect the older string rather it will return a new string
        // Methods can be accessed by using the . operator


        // Arrays are also reference data types i.e we need to allocate the memory to the array by using the new keyword

        int[] numbers= new int[5];
        numbers[1]=3; // Old method to intialize
        int[] roll={14,2,19,-1,5};  // New method
        System.out.println(Arrays.toString(numbers));
        // Arrays in java are of fixed type and there is boundary check in java unlike C
        Arrays.sort(roll);
        System.out.println("the element is found at");
        System.out.println(Arrays.binarySearch(roll,9));
        System.out.println(Arrays.toString(roll));
        System.out.println(roll.length);

        // Multidimensional Array

        //Old method to initialize
        int[][] number2 = new int [2][3];
        number2[0][1]=6;
        // The uninitialized elements in the array are initialized with the 0

        // new method

        int [][] number3={{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(number3));  // To print a multidimensional Array we use .deepToSting whereas for the single dimension we use .toString method of the array
        System.out.println(Arrays.deepToString(number2));


        // CONSTANTS ---> variables whose value we don't want to change ever
        // final keyword is used after this we can't change the value of the assigned variable

        final float pi= 3.14f;  // Value of the variable is fixed  and can't be changed after this






    }
}

// byte int short doesn't requires anything
// long requires l after the number for specification
// by default every decimal value is double
// for float we need to specify the f after decimal