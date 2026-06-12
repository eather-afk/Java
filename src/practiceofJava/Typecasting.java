package practiceofJava;
import java.sql.SQLOutput;
import java.util.Scanner;

import java.util.Scanner;

public class Typecasting {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       /* System.out.println("enter the number");
        float num = input.nextInt();
        System.out.println(num);

        //integer to float --- Type Casting  converting the bigger number into smaller number by providing types explicitly
        int spec = (int)(43.543f);
        System.out.println(spec);*/

        //automatic type promotion in expressions
      /*  int a = 257;
        byte b = (byte)(a);//  257 % 256 = 1
        System.out.println(b);*/


       /* byte a = 40;
        byte b = 50;
        byte c = 100;
        int d = (a * b) / c;
        System.out.println(d);// during the a*b , byte cannot store 2000 so java automatically promotes them as integer when evaluating.
        */

         /*byte b = 50;
         b = b * 2;*/


        /*int num = 'a';
        System.out.println(num);*/

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f*b) + (i / c) - (d - s);
        System.out.println((f*b) +"  "+ (i / c) +"  "+ (d - s));
        System.out.println(result);
    }
}
