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
            throw new Exception("Your gear is not one");
        }
        if (speedLimit >= 0 && speedLimit <= 20) {
            speedLimit++;
        }
        if (speedLimit > 20 || speedLimit < 0) {
            throw new Exception("Invalid limit");
        }
        return speedLimit;
    }

    public int gearTwo(int gear, int speedLimit) throws Exception {
        if (gear == 2) {
            System.out.println("Hello your on gear two");
        } else {
            throw new Exception("Your gear is is not 2");
        }
        if (speedLimit >= 21 && speedLimit <= 30) {
            speedLimit += 2;
        }
        if (speedLimit > 30 || speedLimit < 21) {
            throw new Exception("invalid limit");
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
            speedLimit += 4;
        }
        if (speedLimit > 50 || speedLimit < 41){
            throw new Exception("invalid limit");
        }
        return speedLimit;
    }

    public int gearMinusOne(int gear, int speedLimit) throws Exception {
        if (gear == -1) {
            System.out.println("Hello your on gear inus one");
        } else {
            throw new Exception("Your gear is not one");
        }
        if (speedLimit >= 0 && speedLimit <= 20) {
            speedLimit--;
        }
        if (speedLimit > 20 || speedLimit < 0) {
            throw new Exception("Invalid limit");
        }
        return speedLimit;
    }

}
