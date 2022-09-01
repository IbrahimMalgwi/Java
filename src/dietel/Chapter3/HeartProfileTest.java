package dietel.Chapter3;

class HeartProfileTest {
    public static void main(String[] args) {
        HeartProfile heartRates = new HeartProfile("Ibrahim", "Gana", 3, 27, 2000);

        System.out.printf("Maximum heart rate: %s bpm%n", heartRates.getMaximumHeartRate());
        System.out.printf("Targe heart rate: %s bpm%n", heartRates.getTargetHeartRate());
    }

}