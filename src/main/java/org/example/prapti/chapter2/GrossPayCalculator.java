package org.example.prapti.chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String Sarg[]){
        //1, Get the number of hours workes
        System.out.println("Enter the number of hour employee worked");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        //2. Get the hourly pay rate
        System.out.println("Enter the employee's pay rate");
        double rate = scanner.nextDouble();
        scanner.close();

        //3. Multiply hours and pay rate
        double grossPay = hours * rate;

       //4. Display result
        System.out.println("The employee's gross pay is $" + grossPay);


    }
}
