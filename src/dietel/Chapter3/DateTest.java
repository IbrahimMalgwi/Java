package dietel.Chapter3;

class DateTest {
    public static void main(String[] args) {
        Date date = new Date(7, 16, 2022);

        date.displayDate();

        date.setMonth(02);
        date.setDay(29);
        date.setYear(1988);

        date.displayDate();
    }

}