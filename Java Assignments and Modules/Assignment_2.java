package JavaAssignments;
import java.util.Scanner;

class Course {
    int courseCode;
    String courseName;
    double marks;

    Course(String courseName, double marks, int courseCode) {
        this.marks = marks;
        this.courseName = courseName;
        this.courseCode = courseCode;
    }
}

class Student {
    int roll_no;
    String Name;
    double total_marks;
    static double highest_marks = 0;

    Course course_c[] = new Course[3];

    Student(int roll_no, String name, String courseName[], double marks[], int courseCode[]) {

        this.Name = name;
        this.roll_no = roll_no;
        total_marks = 0;

        for (int i=0; i<3; i++) {
            course_c[i] = new Course(courseName[i], marks[i], courseCode[i]);
            total_marks += marks[i];
        }
    }
}

class Assignment_2 {

    static double get_highest_marks(Student students[]) {
        double highest_marks=0;

        for (int i= 0; i<10; i++ ) {

//            System.out.print(students[i].total_marks + " ");
            if (students[i].total_marks > highest_marks) {
                highest_marks = students[i].total_marks;
            }
        }
        return (highest_marks);
    }

    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);

        double marks[][] = new double[10][3];
        Student student[] = new Student[10];

        // Inputing all the values
        String name;
        int rollNumber=0;
        String CourseName[] = new String[3];
        int CourseCode[] = new int[3];

        for (int i=0; i<10; i++) {
            System.out.println("\n_________________________________________________________________");
            System.out.print("\n > Enter student-" + (i+1) + " Name : ");
            name = myscan.next();
            System.out.print(" > Enter student's Roll Number: ");
            rollNumber = myscan.nextInt();

            for (int j=0; j<3; j++) {
                System.out.print(" > Enter Course Name: ");
                CourseName[j] = myscan.next();
                System.out.print(" > Enter Course Code: ");
                CourseCode[j] = myscan.nextInt();

                System.out.print("    -> Enter the " + CourseName[j] + " marks of student-" + (i+1) + " : " );
                marks[i][j] = myscan.nextDouble();
                System.out.println("");
            }
            student[i] = new Student(rollNumber, name, CourseName, marks[i], CourseCode); //Assigning values...
        }

        // Printing all the values
        for (int i=0; i<10; i++) {

            System.out.println("\n______________________________________________________________________________________________________");
            System.out.println("______________________________________________________________________________________________________");
            System.out.print("\n > Name: " + student[i].Name);
            System.out.print("\n > Roll Number: " + student[i].roll_no);

            for (int j=0; j<3; j++){
                System.out.print("\n   -> Subject: " + student[i].course_c[j].courseName);
                System.out.print("   -> Subject Code: " + student[i].course_c[j].courseCode);
                System.out.print("   -> Subject Marks: " + student[i].course_c[j].marks);
            }
            System.out.print("\n   -> Total Subject Marks: " + student[i].total_marks);
        }

        System.out.println("\n______________________________________________________________________________________________________");
        System.out.println("\nThe highest total marks out of 10 student is: " + get_highest_marks(student));

    }
}
