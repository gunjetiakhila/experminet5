```java
import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks in Subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter marks in Subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter marks in Subject 3: ");
        int m3 = sc.nextInt();

        int total = m1 + m2 + m3;
        double percentage = total / 3.0;

        System.out.println("\n--- Student Result ---");
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.printf("Percentage: %.2f%%\n", percentage);

        if (m1 < 0 || m1 > 100 || m2 < 0 || m2 > 100
                || m3 < 0 || m3 > 100) {
            System.out.println("Invalid marks! Enter marks between 0 and 100.");
        } else if (percentage >= 90) {
            System.out.println("Grade: A");
        } else if (percentage >= 75) {
            System.out.println("Grade: B");
        } else if (percentage >= 60) {
            System.out.println("Grade: C");
        } else if (percentage >= 35) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Result: Fail");
        }

        sc.close();
    }
}
```
