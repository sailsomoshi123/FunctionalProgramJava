package com.function;
import java.util.Scanner;
public class WindChill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Value of wind speed");
        double windSpeed=sc.nextDouble();
        System.out.println("Enter Value of temprature");
        double teamprture=sc.nextDouble();
        windchill(windSpeed, teamprture);
    }
    static void windchill(double v, double t) {
        double w = (35.74) + (0.6215 * t) + ((0.4275 * t) - (35.75)) * Math.pow(v, 0.16);
        System.out.println("wind chill is " +w);
    }
}
