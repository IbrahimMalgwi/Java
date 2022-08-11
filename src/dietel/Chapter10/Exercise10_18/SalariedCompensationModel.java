package dietel.Chapter10.Exercise10_18;

public class SalariedCompensationModel implements  CompensationModel{
    private double weeklySalary;

    public SalariedCompensationModel(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double earnings() {
        return weeklySalary;
    }
}
