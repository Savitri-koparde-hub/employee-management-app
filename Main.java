public class Main {

    static class Employee {
        int id;
        String name;
        String department;

        Employee(int id, String name, String department) {
            this.id = id;
            this.name = name;
            this.department = department;
        }

        void display() {
            System.out.println(id + " | " + name + " | " + department);
        }
    }

    public static void main(String[] args) {
        System.out.println("Employee Management System");
        System.out.println("--------------------------");

        Employee e1 = new Employee(101, "Amit", "IT");
        Employee e2 = new Employee(102, "Neha", "HR");

        e1.display();
        e2.display();

        System.out.println("Application executed successfully!");
    }
}
