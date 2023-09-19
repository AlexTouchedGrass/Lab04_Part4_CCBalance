import java.util.Scanner;

public class Lab04_Part4_CCBalance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Going to do some extra variables for fun, I am stuck at home after all.
        // Sike, I tried to add a start and quit and realized I'd probably have to do a if or while statement so never-mind.
        //Normal Variables now

        int intBalance = 5000;
        double doubleInterestRate = 1.17;
        double doubleFirstMonth;
        double doubleSecondMonth;

        System.out.println("Welcome to Credit Balance Simulator 3. The simulation will start after you enter the word 'Start' and you may end the simulation at any time with the word 'Quit'.");
        doubleFirstMonth = intBalance * doubleInterestRate;

        System.out.println("Starting with a $5000 balance and assuming no payments are made your new balance after 1 month is $" + doubleFirstMonth);
        doubleSecondMonth = doubleFirstMonth * doubleInterestRate;



        System.out.println("Starting with a $5000 balance and assuming no payments are made your new balance after 2 months is $" + doubleSecondMonth);
    }
}