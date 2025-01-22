import java.text.DecimalFormat;

public class Employee {
    // Exericse 2B
    private String name;
    private double monthlySalary;

    Employee(String name, double monthlySalary) {
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    public String getName() {
        return name;
    }

    public double getAnnualSalary() {
        return 12 * monthlySalary;
    }

    // Exercise 2C
    public double getIncomeTax() {
        /*
         * UK Income Tax Brackets:
         * – 0%: up to £12,570 (personal allowance)
         * – 20%: from £12,571 up to £50,270 (basic rate)
         * – 40%: from £50,271 up to £125,140 (higher rate)
         * – 45%: from £125,141 (additional rate)
         */
        double annualSalary = getAnnualSalary(); // Replace with your getter method
        double tax = 0.0;

        // Personal allowance: No tax on the first £12,570
        if (annualSalary > 12_570) {
            // Basic rate: 20% on income between £12,571 and £50,270
            double basicRateUpperLimit = Math.min(annualSalary, 50_270);
            tax += (basicRateUpperLimit - 12_570) * 0.2;

            // Higher rate: 40% on income between £50,271 and £125,140
            if (annualSalary > 50_270) {
                double higherRateUpperLimit = Math.min(annualSalary, 125_140);
                tax += (higherRateUpperLimit - 50_270) * 0.4;

                // Additional rate: 45% on income above £125,140
                if (annualSalary > 125_140) {
                    tax += (annualSalary - 125_140) * 0.45;
                }
            }
        }

        return tax;
    }


    public void printEmployeeDetails() {
        System.out.println("Employee name: " + name);
        System.out.println("Gross annual salary: " + String.format("%.2f", getAnnualSalary()));
        System.out.println("Income tax: " + String.format("%.2f", getIncomeTax()));
    }
}
