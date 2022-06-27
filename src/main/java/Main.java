import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // initialize the array with length of 10
        String[] studentNames = new String[10];

        // intialize Scanner object
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student's name: ");
        studentNames[0] = sc.nextLine();

        System.out.println("Enter student's name: ");
        studentNames[1] = sc.nextLine();
        
        System.out.println("Enter student's name: ");
        studentNames[2] = sc.nextLine();

        System.out.println("Enter student's name: ");
        studentNames[3] = sc.nextLine();

        System.out.println("Enter student's name: ");
        studentNames[4] = sc.nextLine();

        System.out.println("Enter student's name: ");
        studentNames[5] = sc.nextLine();

        System.out.println("Enter student's name: ");
        studentNames[6] = sc.nextLine();

        System.out.println("Enter student's name: ");
        studentNames[7] = sc.nextLine();

        System.out.println("Enter student's name: ");
        studentNames[8] = sc.nextLine();

        System.out.println("Enter student's name: ");
        studentNames[9] = sc.nextLine();

        // print out the student names in the array
        System.out.println("You have entered the following names: ");
        for (String studentName: studentNames)
            System.out.println(studentName);

    }

}
