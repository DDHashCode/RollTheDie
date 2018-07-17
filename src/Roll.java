import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Roll {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        Pattern pat = Pattern.compile("\\d\\dd\\d\\d");
        System.out.println(pat.matcher("1d3").find());

       //System.out.println("You have provided: " + getInput(input));

    }

    public static String getInput(Scanner in){
        System.out.println("Please provide your input:");
        return in.next();
    }

}

