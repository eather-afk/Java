package practiceofJava;

import java.util.Scanner;

public class Temperatureconversion {
    static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("temp1");
        float tempC = input.nextFloat();
        float tempF = (tempC*(9f/5) + 32);

        System.out.println("Temp in Farhenite: " + tempF);


    }
}
