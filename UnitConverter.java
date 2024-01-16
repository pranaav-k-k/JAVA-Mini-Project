import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        char category;
        int tempChoice;
        int currencyChoice;
        int massChoice;
        int userinputF; // User inputted Fahrenheit;
        int userinputC; // User inputted Celsius;
        int userinputINRtoEuro; // User inputted for INR to Euro;
        int userinputINRtoJPY; // User inputted for INR to JPY;
        int userinputINRtoUSD; // User inputted for INR to USD;
        int userinputOunce; // User inputted for Ounce;
        int userinputGram; // User inputted for Gram;
        int fahrenheitToCelsius; // variable that stores the converted F->C;
        int celsiusToFahrenheit; // variable that stores the converted C->F;
        float INRtoEuro; // variable that stores the converted INR->Euro;
        float INRtoJPY; // stores the converted INR->JPY;
        float INRtoUSD; // stores the converted INR->USD;
        float ounceToPounds; // stores the converted Ounce->Pounds;
        float gramsToPounds; // stores the converted Grams->Pounds;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Unit Converter!");
        System.out.println("Here is a list of conversions to choose from:");
        System.out.println("Temperature(T), Currency(C), Mass(M)");
        System.out.println("Please enter the letter you want to convert.");
        category = scanner.next().charAt(0);

        if (category == 'T') {
            System.out.println("Welcome to Temperature Converter!");
            System.out.println("Here is a list of conversions to choose from:");
            System.out.println("Enter 1 for Fahrenheit to Celsius.");
            System.out.println("Enter 2 for Celsius to Fahrenheit.");
            tempChoice = scanner.nextInt();

            if (tempChoice == 1) {
                System.out.println("Please enter the Fahrenheit degree:");
                userinputF = scanner.nextInt();
                fahrenheitToCelsius = (int) ((userinputF - 32) * (5.0 / 9.0));
                System.out.println("Celsius: " + fahrenheitToCelsius);
            } else if (tempChoice == 2) {
                System.out.println("Please enter the Celsius degree:");
                userinputC = scanner.nextInt();
                celsiusToFahrenheit = (int) ((9.0 / 5.0) * userinputC + 32);
                System.out.println("Fahrenheit: " + celsiusToFahrenheit);
            } else {
                System.out.println("Please enter the correct choice.");
            }
        } else if (category == 'C') {
            System.out.println("Welcome to Currency Converter!");
            System.out.println("Here is a list of conversions to choose from:");
            System.out.println("Enter 1 for INR to Euro.");
            System.out.println("Enter 2 for INR to JPY.");
            System.out.println("Enter 3 for INR to USD.");
            currencyChoice = scanner.nextInt();

            if (currencyChoice == 1) {
                System.out.println("Please enter the INR amount:");
                userinputINRtoEuro = scanner.nextInt();
                INRtoEuro = userinputINRtoEuro * 0.0111646666666667f;
                System.out.printf("Euro: %.2f%n", INRtoEuro);
            } else if (currencyChoice == 2) {
                System.out.println("Please enter the INR amount:");
                userinputINRtoJPY = scanner.nextInt();
                INRtoJPY = userinputINRtoJPY * 1.615056666666667f;
                System.out.printf("JPY: %.2f%n", INRtoJPY);
            } else if (currencyChoice == 3) {
                System.out.println("Please enter the INR amount:");
                userinputINRtoUSD = scanner.nextInt();
                INRtoUSD = userinputINRtoUSD * 0.012178f;
                System.out.printf("USD: %.2f%n", INRtoUSD);
            } else {
                System.out.println("Please enter correct choice.");
            }
        } else if (category == 'M') {
            System.out.println("Welcome to Mass Converter!");
            System.out.println("Here is a list of conversions to choose from:");
            System.out.println("Enter 1 for ounces to pounds.");
            System.out.println("Enter 2 for grams to pounds.");
            massChoice = scanner.nextInt();

            if (massChoice == 1) {
                System.out.println("Please enter the ounce amount:");
                userinputOunce = scanner.nextInt();
                ounceToPounds = userinputOunce * 0.0625f;
                System.out.printf("Pounds: %.2f%n", ounceToPounds);
            } else if (massChoice == 2) {
                System.out.println("Please enter the gram amount:");
                userinputGram = scanner.nextInt();
                gramsToPounds = userinputGram * 0.00220462f;
                System.out.printf("Pounds: %.2f%n", gramsToPounds);
            } else {
                System.out.println("Please enter the correct choice.");
            }
        } else {
            System.out.println("Invalid category. Please enter T, C, or M.");
        }

        scanner.close();
    }
}
