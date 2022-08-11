package africa.semicolon.Assignments.diary;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Dairy {

    private String date;
    private String title;
    private String reference;
    private String note;

    public Dairy(String date, String title, String reference, String note){
        this.date = date;
        this.title = title;
        this.reference = reference;
        this.note = note;
    }

        private static void entries(){
            ArrayList<Dairy> dairyEntries = new ArrayList<>();

            Scanner input = new Scanner(System.in);

            String selection;
            selection = input.nextLine();

            while (Objects.equals(selection, "yes")) {
                System.out.println(" Enter Title for your Entry");
                String title = input.nextLine();

                System.out.println("Enter reference of entry");
                String reference = input.nextLine();

                System.out.println("Enter diary note");
                String note = input.nextLine();

                LocalDateTime localDateTime = LocalDateTime.now();
                DateTimeFormatter dateTimeFormatter  = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
                String date = localDateTime.format(dateTimeFormatter);


                dairyEntries.add(new Dairy(date, title, reference, note));
            }
            if (Objects.equals(selection, "no")){
                System.out.println("Thank you");
            }
//            return dairyEntries;
        }

        public String toString(){
        return date + title + reference + note;
        }

    public static void main(String[] args) {
        entries();
    }
}
