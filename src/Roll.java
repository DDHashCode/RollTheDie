import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Roll {
    public static void main(String[] args) throws InputMismatchException {
       Scanner input = new Scanner(System.in);
       String txt = getInput(input);
       if ( txt.contains("d")){
           System.out.println("Wynik rzutów kostką: " + compute(txt));

       }
       else
           throw new InputMismatchException("You input " + txt + " not contains 'd' letter.");



    }
    private static int compute(String inputieren){
        String[] tabz = inputieren.split("d");
        String dieAmount = tabz[0];
        String dieSides = tabz[1];
        int dices = Integer.parseInt(dieAmount);
        int sides = Integer.parseInt(dieSides);
        Random generator = new Random();
        int sum = 0;
        for (int i=0; i<dices; i++){
            sum += generator.nextInt(sides);
        }

        return sum;

    }

    private static String getInput(Scanner in){
        System.out.println("Please provide your input:");
        return in.next();
    }

}

