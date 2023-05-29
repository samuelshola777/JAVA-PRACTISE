package chapter9.OopEmployee;

public class CommissionEmployeeTest {
    public static void main(String[] args) throws samuelShola {
        CommissionEmployee employee = new CommissionEmployee(
                "Sue", "Jones", "222-22-2222", 10000, .06);
        System.out.println("Employee information obtained by get methods:");
         System.out.printf("%n%s %s%n", "First name is",
                12 );
         System.out.printf("%s %s%n", "Last name is",
                14 );
         System.out.printf("%s %s%n", "Social security number is",
                16 );
         System.out.printf("%s %.2f%n", "Gross sales is",
                18 );
         System.out.printf("%s %.2f%n", "Commission rate is", employee.getGrossSales());

        employee.setGrossSales(5000);
        employee.setCommissionRate(.1);


         System.out.printf("%n%s:%n%n %n",
         "Updated employee information obtained by toString", employee );
         }
}

