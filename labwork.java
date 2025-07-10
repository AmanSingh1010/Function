import java.util.*;
public class labwork {

        public void display(){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter number of students: ");
            int n = sc.nextInt();


            String[] names = new String[n];
            String[] addresses = new String[n];
            int[][] marks = new int[n][5];
            float[] percentage = new float[n];
            char[] grade = new char[n];

            for (int i = 0; i < n; i++) {
                sc.nextLine(); // Clear buffer

                System.out.println("Student " + (i + 1));

                System.out.print("Enter Name: ");
                names[i] = sc.nextLine();

                System.out.print("Enter Address: ");
                addresses[i] = sc.nextLine();

                int total = 0;
                for (int j = 0; j < 5; j++) {
                    System.out.print("Enter marks for subject " + (j + 1) + ": ");
                    marks[i][j] = sc.nextInt();
                    total += marks[i][j];
                }

                percentage[i] = total / 5;


                if (percentage[i] >= 90)
                    grade[i] = 'A';
                else if (percentage[i] >= 75)
                    grade[i] = 'B';
                else if (percentage[i] >= 60)
                    grade[i] = 'C';
                else if (percentage[i] >= 45)
                    grade[i] = 'D';
                else
                    grade[i] = 'F';
            }
            System.out.println("--- Student Report ---");
            for (int i = 0; i < n; i++) {
                System.out.println("Student " + (i + 1));
                System.out.println("Name: " + names[i]);
                System.out.println("Address: " + addresses[i]);
                System.out.println("Percentage: " + percentage[i]);
                System.out.println("Grade: " + grade[i]);
            }

        }

        public static void main(String[] args) {
            labwork a=new labwork();
            a.display();

        }
    }

