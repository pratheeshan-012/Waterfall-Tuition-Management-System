import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class StudentManagement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Tuition Class Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter Student ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Student Name: ");
                String name = sc.nextLine();

                students.add(new Student(id, name));
                System.out.println("Student added successfully.");

            } else if (choice == 2) {
                System.out.println("\n--- Student List ---");
                for (Student s : students) {
                    System.out.println(s.id + " - " + s.name);
                }

            } else if (choice == 3) {
                System.out.println("Exiting system.");
                break;

            } else {
                System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}
