package dietel.Chapter10.Exercise10_17;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ibrahim", "Gana", "222-333-444", new SalariedCompensationModel(300));
        Employee employee2 = new Employee("Judith", "Gana", "333-444-555", new HourlyCompensationModel(15, 45));
        Employee employee3 = new Employee("Jane", "Mike", "444-555-666", new CommissionCompensationModel(10000, .06));
        Employee employee4 = new Employee("Celina", "Banks", "555-666-777", new BasePlusCommissionCompensationModel(10000, .06, 200));

        System.out.printf("%s%n%n", employee1);
        System.out.printf("%s%n%n", employee2);
        System.out.printf("%s%n%n", employee3);
        System.out.printf("%s%n%n", employee4);

        employee2.setCompensationModel(new CommissionCompensationModel(10000, .06));

        System.out.printf("%s%n%n", employee2);
    }
}
