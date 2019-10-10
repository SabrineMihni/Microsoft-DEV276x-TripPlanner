import java.util.Scanner;

public class TripPlanner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        greet(input);
        input = new Scanner(System.in);
        timeAndBudget(input);
        input = new Scanner(System.in);
        time(input);
        input = new Scanner(System.in);
        countryArea(input);
    }

    public static void greet(Scanner input) {

        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("Nice to meet you "+ name + ", where are you travelling to? ");
        String destination = input.nextLine();
        System.out.println("Great! "+ destination + " sounds like a great trip");
        System.out.println("***********\n");

    }

    public static void timeAndBudget(Scanner input) {

        System.out.print("How many days are you going to spend travelling? ");
        int days = input.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip? ");
        double money = input.nextDouble();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String currency = input.next();
        System.out.print("How many " + currency + " are there in 1 USD? ");
        input.nextLine();
        double rate = input.nextDouble();
        int hours = days * 24;
        int min = hours * 60;
        double spentPerDay = roundNumber( money / days);
        double moneyRated = money * rate;
        double moneyRatedPerDay = roundNumber(moneyRated / days);

        System.out.println("If you are travelling for " + days +  " days that is the same as "+ hours + " hours"
                    + " or " + min + " minutes");
        System.out.println("If you are going to spend $"+ money + " USD that means per day you can spend up to $" + spentPerDay + " USD");
        System.out.println("Your total budget in "+ currency + " is " + moneyRated + " " + currency + ", which per day is "+ moneyRatedPerDay + " " + currency);
        System.out.println("***********\n");

    }

    public static void time(Scanner input) {
        System.out.print("What is the time difference, in hours, between your home and your destination? ");
        int hours = input.nextInt();
        int midnight = hours % 24;
        int noon = ( 12 + hours ) % 24;
        System.out.println("That means that when it is midnight at home ot will be "+ midnight + ":00 in your travel destination");
        System.out.println("and when it is noon at home it will be "+ noon + ":00");
        System.out.println("***********\n");
    }

    public static void countryArea(Scanner input) {

        System.out.print("What is the square area of your destination country in km2? ");
        int area = input.nextInt();
        double inMiles = roundNumber(area * 0.38610);
        System.out.println("In miles2 that is "+ inMiles);
        System.out.println("***********\n");
    }

    public static double roundNumber(double number) {

        int num = (int) (number * 100);
        return num / 100.0;
    }

}
