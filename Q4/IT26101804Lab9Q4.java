import java.util.Scanner;

public class IT26101804Lab9Q4 {
    // Part (a)
    public static double calcFinalMark(double assignmentMark,
                                       double examMark) {
        return assignmentMark * 0.30 + examMark * 0.70;
    }

    // Part (b)
    public static char findGrades(double finalMark) {
        if (finalMark >= 75) {
            return 'A';
        } else if (finalMark >= 60) {
            return 'B';
        } else if (finalMark >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }

    // Part (c)
    public static void printDetails(String name, double finalMark,
                                    char grade) {
        System.out.printf("%-20s %-15.2f %c%n", name, finalMark, grade);
    }

    // Part (d)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = new String[5];
        double[] finalMarks = new double[5];
        char[] grades = new char[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = input.nextLine();

            System.out.print("Enter Assignment Mark (out of 100) for "
                    + names[i] + ": ");
            double assignmentMark = input.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for "
                    + names[i] + ": ");
            double examMark = input.nextDouble();

            input.nextLine(); // Consume the remaining newline.

            finalMarks[i] = calcFinalMark(assignmentMark, examMark);
            grades[i] = findGrades(finalMarks[i]);

            System.out.println();
        }

        System.out.printf("%-20s %-15s %s%n",
                "Name", "Final Mark", "Grade");

        for (int i = 0; i < 5; i++) {
            printDetails(names[i], finalMarks[i], grades[i]);
        }

        input.close();
    }
}