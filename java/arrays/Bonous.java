package arrays;
import java.util.Scanner;

public class Bonous{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int EMPLOYEE_COUNT = 10;

        // Step 2: Arrays for input
        double[] salaries = new double[EMPLOYEE_COUNT];
        double[] yearsOfService = new double[EMPLOYEE_COUNT];

        // Step 3: Arrays for results
        double[] bonuses = new double[EMPLOYEE_COUNT];
        double[] newSalaries = new double[EMPLOYEE_COUNT];

        // Variables for totals
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Step 4: Input loop with validation
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            System.out.println("\nEmployee " + (i + 1) + ":");

            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();
            if (salary <= 0) {
                System.out.println("Invalid salary. Try again.");
                i--; continue;
            }

            System.out.print("Enter years of service: ");
            double service = sc.nextDouble();
            if (service < 0) {
                System.out.println("Invalid years of service. Try again.");
                i--; continue;
            }

            salaries[i] = salary;
            yearsOfService[i] = service;
        }

        // Step 5: Calculate bonuses and new salaries
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            double bonusRate = yearsOfService[i] > 5 ? 0.05 : 0.02;
            bonuses[i] = salaries[i] * bonusRate;
            newSalaries[i] = salaries[i] + bonuses[i];

            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        // Step 6: Display final summary
        System.out.println("\n--- Bonus Report ---");
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            System.out.printf("Employee %d: Old Salary = %.2f, Bonus = %.2f, New Salary = %.2f%n",
                    (i + 1), salaries[i], bonuses[i], newSalaries[i]);
        }

        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}
