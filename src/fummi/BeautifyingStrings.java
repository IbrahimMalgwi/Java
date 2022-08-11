package fummi;
import java.util.Scanner;

public class BeautifyingStrings {


    public static String capitalize(String capital) {
        if(capital == null || capital.isEmpty()) {
            return capital;
        }
        return capital.substring(0, 1).toUpperCase() + capital.substring(1);
    }

    public void addFullStopToText(String text){
        int textNumber = text.length();
        if ((text.charAt(textNumber - 1)) !='.'){
            String textWithFullStop = text + '.';
            System.out.printf("Beautified text is: %s%n", textWithFullStop);
        }
        else System.out.print(text);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter words to capitalize the firs word ");
        String userInput = input.nextLine();

        System.out.println(capitalize(userInput));

    }
}
