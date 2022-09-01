package dietel.chapter14;
//String methods startWith and endWith

public class StringStartEnd {
    public static void main(String[] args) {
        String[] strings = {"started", "starting", "ended", "ending"};

//        test method startWith
        for (String string : strings) {
            if (string.startsWith("st")) {
                System.out.printf("\"%s\" starts with \"st\"%n", string);
            }
        }

        System.out.println();

//        test method startWith starting from position 2 of string
        for(String string : strings) {
            if (string.startsWith("art", 2)) {
                System.out.printf("\"%s\" starts with \"art\" at position 2%n", string);
            }
        }

        System.out.println();

//        test endWith
        for (String string : strings) {
            if (string.endsWith("ed")) {
                System.out.printf("\"%s\" end with \"ed\"%n", string);
            }
        }
    }
}
