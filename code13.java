class Employee {
    private int salary;
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        if (salary > 0) {
            this.salary = salary;
            System.out.println("Salary of the employee is: " + salary);
        } else {
            System.out.println("Salary cannot be negative or zero.");
        }
    }
}

public class code13 {
    public static void main(String[] args) {
        Employee em = new Employee();
        em.setSalary(20000);
    }
}
