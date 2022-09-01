package dietel.Chapter9;

class CommissionEmployeeTest {
    public static void main(String[] args) {
        CommissionEmployee employee = new CommissionEmployee("Ibrahim", "Gana", "22-222-22", 10_000, .06);

        System.out.println("Employee information obtained by get methods: ");
        System.out.printf("%n%s %s%n", "First name is", employee.getFirstName());
        System.out.printf("%s %s%n", "Last name is", employee.getLastName());
        System.out.printf("%s %s%n", "Social Security Number is", employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Gross sales is", employee.getGrossSales());
        System.out.printf("%s %.2f%n", "Commission Rate is", employee.getCommissionRate());

        employee.setGrossSales(5_000);
        employee.getCommissionRate();

        System.out.printf("%n%s:%n%n%s%n", "Updated employee information obtained by toString", employee);
    }


}