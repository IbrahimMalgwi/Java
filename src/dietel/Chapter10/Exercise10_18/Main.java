package dietel.Chapter10.Exercise10_18;

public class Main {
    public static void main(String[] args) {
        // create four-element Payable array
        Payable[] payableObjects = new Payable[] { new Invoice("01234", "seat", 2, 375.00),
                new Invoice("56789", "tire", 4, 79.95),
                new Employee("John", "Smith", "111-11-1111", new SalariedCompensationModel(200)),
                new Employee("Lisa", "Barnes", "888-88-8888", new SalariedCompensationModel(200)) };

        System.out.println("Invoices and Employees processed polymorphically:");

        // generically process each element in array payableObjects
        for (Payable currentPayable : payableObjects) {
            // output currentPayable and its appropriate payment amount
            System.out.printf("%n%s %npayment due: $%,.2f%n", currentPayable.toString(), // could invoke implicitly
                    currentPayable.getPaymentAmount());
        }
    }
}
