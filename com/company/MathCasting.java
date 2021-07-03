package com.company;



public class MathCasting {
    public static void main(String[] arg) {
        // Implicit Casting is done whenever there is no data loss i.e we can typecast a datatype whose size is smaller into a dataType of larger size automatically by java compiler
        // Float and double are more precise than all of integer family so
        // byte -> short -> int -> long -> float -> double    ----> Automatically or implicit typecasting

//        long num = 598483L;
//        int y =6;
//        long z= y + 12;
//        double x = num + 4.3;
//        double d =3.4;
//        double d1 = d +2; // 2.0 int -> double
//        System.out.println(x);
//        System.out.println(z);
//        System.out.println(d1);


        // Explicit casting can cause the data loss but if we forcefully want to change the data type than we go for explicit casting

//        int i = (int)d + 2;
//        System.out.println(i);

        // The Explicit casting can occur only between compatible data types
        // You can't convert a string to integer as they are not compatible
        // the data types mentioned in the line 9 are compatible to each other

        // We can convert a data String to integer by using a wrapper class

        String s = "123";
        System.out.println(Integer.parseInt(s));
        // Float.parseFloat     Byte.parseByte     Double.parseDouble


        //     MATH CLASS   ---> Its in java.lang so no need to import anything

//        System.out.println(Math.round(1.8));
//        double d2 = Math.random();  // It returns a value in between 0 and 1 ( a double value is returned)
            int x = 123;
            String y= Integer.toString(x);
            String z = " ";


    }
}
