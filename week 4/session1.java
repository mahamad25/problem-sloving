import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== CONSTRAINT-DRIVEN SOLUTION DESIGN =====");

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        System.out.print("Enter attendance percentage: ");
        double attendance = sc.nextDouble();

        System.out.print("Enter number of pending subjects: ");
        int pendingSubjects = sc.nextInt();

        // Constraints
        boolean ageConstraint = age >= 18;
        boolean marksConstraint = marks >= 50;
        boolean attendanceConstraint = attendance >= 75;
        boolean subjectConstraint = pendingSubjects == 0;

        System.out.println("\n----- Constraint Checking -----");

        System.out.println("Age >= 18              : " + ageConstraint);
        System.out.println("Marks >= 50            : " + marksConstraint);
        System.out.println("Attendance >= 75%      : " + attendanceConstraint);
        System.out.println("No pending subjects    : " + subjectConstraint);

        // Final decision
        if (ageConstraint &&
            marksConstraint &&
            attendanceConstraint &&
            subjectConstraint) {

            System.out.println("\nSolution: ELIGIBLE");
            System.out.println("All constraints are satisfied.");

        } else {

            System.out.println("\nSolution: NOT ELIGIBLE");
            System.out.println("One or more constraints are violated.");
        }

        sc.close();
    }
}
