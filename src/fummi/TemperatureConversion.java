package fummi;

import java.util.Scanner;

public class TemperatureConversion {

    //Methode for converting celsius to kelvin
    public static float celsiusToKelvin(float celsius){
        return (float)(celsius + 273.15);
    }

    //methode to convert kelvin to celsius
    public static float kelvinToCelsius(float kelvin) {
        return (float)(kelvin -273.15);
    }


    // Driver function
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        // variable to hold the
        // temperature in Celsius

        System.out.print("Enter Temp");
        float temp = input.nextFloat();
        float t = temp;

        System .out.println ( "Temperature in Kelvin ( K ) = " + celsiusToKelvin(t));
        System.out.println ( "Temperature in Celsius (C) = " + kelvinToCelsius(t));
    }
}

