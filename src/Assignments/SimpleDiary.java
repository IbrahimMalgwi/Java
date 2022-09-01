package Assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class SimpleDiary {

    public static void view(){
        Scanner input = new Scanner(System.in);
        ArrayList<String> diary = new ArrayList<>();

        while (true){
            System.out.println("Enter Entry to your diary or 'Clear' to CLEAR or 'END' to End");
            diary.add(input.nextLine());

            if ((diary.get(diary.size()-1).equals("CLEAR")))
                diary.clear();
            else {
                    if (diary.get(diary.size()-1).equals("END"))
                        break;
            }
            System.out.println(diary.toString());
        }
    }

    public static void main(String[] args) {
        view();
    }
}
