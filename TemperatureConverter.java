import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        //Code to address the User to choose a conversion
        System.out.println("Please Choose Between the following Options: \n1. Celsius to Fahrenheit\n2. Fahrenheit to Celsius");

        //This takes the option value and performs operations based on conversion choice
        Scanner input = new Scanner(System.in);
        int optionValue = input.nextInt();

        //This converts the User's Celsius temperature to fahrenheit(Option 1)
        if (optionValue == 1){
            System.out.println("Enter your Celsius Temperature: ");
            double celsiusTemp = input.nextDouble();
            double fahrenheitTemp = (celsiusTemp * 9/5) + 32;
            System.out.printf("The conversion is " + fahrenheitTemp + " Fahrenheit");

            //This converts the User's Fahrenheit temperature to Celsius(Option 2)
        } else if (optionValue == 2) {
            System.out.println("Enter your Fahrenheit Temperature: ");
            double fahrenheitTemp = input.nextDouble();
            double celsiusTemp = (fahrenheitTemp - 32) * 5/9;
            System.out.printf("The conversion is " + celsiusTemp + " Celsius");

            //This code prevents the user from entering either of the options provided
        } else {
            System.out.println("This is an invalid choice. Enter either of the options.\nThank you.");
        }

        input.close();

    }
}
