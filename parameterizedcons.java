class Student {
    String name;
    int age;

    // Parameterized Constructor
    Student(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;
    }

    // Method to display student details
    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }

    public static void main(String[] args) {
        // Creating objects using parameterized constructor
        Student s1 = new Student("Aman", 20);
        Student s2 = new Student("Priya", 22);

        // Displaying values
        s1.display();
        s2.display();
    }
}
