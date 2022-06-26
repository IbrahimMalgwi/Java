package bike;

public class Bike {
    public String isOn(String on) throws Exception {        if (on == "on"){
            System.out.println("Bike is one");
        }
        else {
            throw new Exception("Please on the bike well");
        }
        return on;
    }

    public String isOff(String off) throws Exception {
        if (off == "off"){
            System.out.println("Bike is off");
        }
        else {
            throw new Exception("Please off the bike well");
        }
        return off;
    }


    public int gearOne(int gear, int speedLimit) throws Exception {
        if (gear == 1) {
            System.out.println("Hello your on gear one");
        } else {
            throw new Exception("Not on gear 1");
        }
        if (speedLimit >= 0 && speedLimit <= 20) {
            speedLimit++;
        }
        if (speedLimit > 20 || speedLimit < 0) {
            throw new Exception("Your within your limit");
        }
        return speedLimit;
    }

    public int gearTwo(int gear, int speedLimit) throws Exception {
        if (gear == 2) {
            System.out.println("Hello your on gear two");
        } else {
            throw new Exception("Your should be on gear 2");
        }
        if (speedLimit >= 21 && speedLimit <= 30) {
            speedLimit += 2;
        }
        if (speedLimit > 30 || speedLimit < 21) {
            throw new Exception("Your outside your limit");
        }
        return speedLimit;
    }

    public int gearThree(int gear, int speedLimit) throws Exception {
        if (gear == 3) {
            System.out.println("Hello your on gear Three");
        } else {
            throw new Exception("Your should be on gear 3");
        }
        if (speedLimit >= 31 && speedLimit <= 40) {
            speedLimit += 3;
        }
        if (speedLimit > 40 || speedLimit < 31) {
            throw new Exception("INVALID LIMIT");
        }
        return speedLimit;
    }

    public int gearFour(int gear, int speedLimit) throws Exception{
        if (gear == 4){
            System.out.println("Hello your on four one");
        }
        else {
            throw new Exception("Not on gear 4");
        }
        if (speedLimit >= 41 && speedLimit <= 50) {
            speedLimit++;
        }
        if (speedLimit > 41 || speedLimit < 30){
            throw new Exception("your within your limit");
        }
        return speedLimit;

    }
}
