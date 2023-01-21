package chapter9.OopEmployee;

public class CommissionEmployee {
    private  String firstName;
    private  String lastName;
    private  String socialSecurityNumber;
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName,
                              String lastName,
                              String socialSecurityNumber,
                              double grossSales,
                              double commissionRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public CommissionEmployee(String name,
                              String lastName,
                              String socialSecurityNumber) {
        firstName = name;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales)
        throws samuelShola {
            if (grossSales < 0.0) {
                throw new samuelShola("invalid grossSales inputted");
            }
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) throws  samuelShola{
        if ( commissionRate <= 0.0 || commissionRate >= 1.0 )throw new samuelShola("commission muse be > 0.0 and < 1.0");
        this.commissionRate = commissionRate;
    }
    public double earning(){
        return commissionRate * grossSales;
    }

    @Override
    public String toString() {
        return "CommissionEmployee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", grossSales=" + grossSales +
                ", commissionRate=" + commissionRate +
                '}';
    }
}
