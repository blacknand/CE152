import java.text.DecimalFormat;

public class Programmer extends Employee {
    private String language;
    private String name;
    private double monthlySalary;

    Programmer(String name, double monthlySalary, String language) {
        super(name, monthlySalary);
        this.language = language;
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    @Override
    public void printEmployeeDetails() {
        System.out.println("Employee name: " + name);
        System.out.println("Gross annual salary: " + String.format("%.2f", getAnnualSalary()));
        System.out.println("Income tax: " + String.format("%.2f", getIncomeTax()));
        System.out.println("Programming language: " + language);
    }
}
