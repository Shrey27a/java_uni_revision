class Student1 {
    String name;
    int id;
    int age;

    // Constructor
    Student1(String n, int i, int a) {
        name = n;
        id = i;
        age = a;
    }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Student Age: " + age);
    }

    public static void main(String[] args) {
        Student1 s1 = new Student1("Aanya", 101, 20);
        s1.display();
    }
}

