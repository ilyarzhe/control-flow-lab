import javax.swing.*;
import java.util.Scanner;

public class WhatShouldIWear {
    public static void main(String[] args) {
        System.out.println("What's the weather like today? (rainy or sunny)");
        Scanner inputWeather = new Scanner(System.in);
        System.out.println("What's the temperature like?");
        Scanner inputTemperature = new Scanner(System.in);
        String weather = inputWeather.nextLine();
        int temp = Integer.parseInt(inputTemperature.nextLine());
        
        if (weather.equalsIgnoreCase("rainy")|| temp<=15){
            System.out.println("Bring an Umbrella!");
        
        } else if (weather.equalsIgnoreCase("sunny")&&temp >=25) {
            System.out.println("You'll be fine with a T-shirt");
            
        } else {
            System.out.println("You might want to have a jumper in case!");
        }
            
        }

    }

