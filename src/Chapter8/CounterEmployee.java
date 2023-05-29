package Chapter8;

public class CounterEmployee {
    private static int count = 0;
    private String firstName;
    private String lastName;

    public CounterEmployee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        ++count;
        System.out.printf("Employee constructor: %s %s; count = %d%n",
           firstName, lastName, count   );
    }

    public static int getCount() {
        return count;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

        public static void main(String[] args) {

            System.out.printf("Employees before instantiation: %d%n",
                CounterEmployee.getCount());

            CounterEmployee e1 = new CounterEmployee("samuel","Shola");
            CounterEmployee e2 = new CounterEmployee("boneShaker","alexPhaker");

            System.out.printf("%nEmployees after instantiation:%n");
            System.out.printf("Via e1.getCount(): %d%n", e1.getCount());
            System.out.printf("Via e1.getCount(): %d%n", e2.getCount());
            System.out.printf("via Employee.getCount(): %d%n",CounterEmployee.getCount());

            System.out.printf("%nEmployee 1: %s %s%nEmployee 2: %s %s%n",
                e1.getFirstName(), e1.getLastName(),
                    e2.getFirstName(), e2.getLastName());



        
    }
}
