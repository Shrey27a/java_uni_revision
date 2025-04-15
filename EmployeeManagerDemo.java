// Base class
class Employee {
    String name;
    double salary;

    // Constructor to initialize name and salary
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}

// Derived class
class Manager extends Employee {
    String department;

    // Constructor to initialize name, salary, and department
    Manager(String name, double salary, String department) {
        super(name, salary); // Calling the parent class constructor
        this.department = department;
    }

    // Method to display manager details (overridden)
    @Override
    void display() {
        super.display(); // Calling parent class method
        System.out.println("Manager's Department: " + department);
    }
}

// Main class
public class EmployeeManagerDemo {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp = new Employee("John", 50000);
        emp.display();

        // Creating a Manager object
        Manager mgr = new Manager("Alice", 80000, "HR");
        mgr.display();
    }
}
