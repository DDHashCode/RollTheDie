import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Roll {
    public static void main(String[] args) throws InputMismatchException {
        Scanner input = new Scanner(System.in);
        String txt = getInput(input);
        if (txt.contains("d")) {
            String[] tabz = txt.split("d");
            String dieAmount = tabz[0];
            String dieSides = tabz[1];
            int dices = Integer.parseInt(dieAmount);
            int sides = Integer.parseInt(dieSides);
            if (dices < 1 || dices > 100) {
                throw new InputMismatchException("Your input is wrong. Amount of dices cannot be less than 1 and higher than 100.");
            }
            if (sides < 2 || sides > 100)
                throw new InputMismatchException("Wrong input. Amount of sides cannot be less than 2 and higher than 100.");
            Random generator = new Random();
            int[] tries = new int[dices];
            int sum = 0;

            for (int i = 0; i < dices ; i++) {
                tries[i] = generator.nextInt(sides) + 1;
                sum += tries[i];
            }
            System.out.println("Wynik rzutów kostką: " + Arrays.toString(tries) + "Suma: " + sum);
            System.out.print(sum + ": ");
            for (int x : tries) {System.out.print(x + " "); }

        } else
            throw new InputMismatchException("You input " + txt + " not contains 'd' letter.");


    }

    private static String getInput(Scanner in){
        System.out.println("Please provide your input:");
        return in.next();
    }

}

