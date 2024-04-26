package ex313;


public class EmployeeTest {
    public static void main(String[] args) {
        Employee cathyEmployee = new Employee("Cathy", "C", 2000.00);
        Employee jeffreyEmployee = new Employee("Jeffrey", "D", 4000.00);
    
        System.out.printf("The employee first name is %s%n", cathyEmployee.getFirstName());

        System.out.printf("The employee last name is %s%n", cathyEmployee.getLastName());

        System.out.printf("The employee monthly salary is %.2f%n", cathyEmployee.getMonthlySalary());

        System.out.printf("Cathy yearly salary is %.2f%n", cathyEmployee.getYearlySalary());

        System.out.printf("Jeffrey yearly salary is %.2f%n", jeffreyEmployee.getYearlySalary());

        System.out.printf("Cathy yearly salary after raise is %.2f%n", cathyEmployee.raiseYearlySalary());

        System.out.printf("Jeffrey yearly salary after raise is %.2f%n", jeffreyEmployee.raiseYearlySalary());
    }
}