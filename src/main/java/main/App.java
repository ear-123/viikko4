package main;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {

        boolean exit = false;
        Scanner scan = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList();

        while (!exit) {

            System.out.println("1) Lisää opiskelija, 2) Listaa opiskelijat, 3) Lisää opiskelijalle suorite, 4) Listaa opiskelijan suoritteet, 5) Laske opiskelijan suoritusten keskiarvo, 6) Laske opiskelijan suoritusten mediaani, 7) Tallenna opiskelijat tiedostoon, 8) Lataa opiskelijat tiedostosta, 0) Lopeta ohjelma");

            String strininput = scan.nextLine();
            int option = 0;
            option = Integer.parseInt(strininput);

            if (option == 0) {
                exit = true;
                continue;
            }
            if (option == 1) {
                System.out.println("Anna opiskelijan nimi?");
                String studentName = scan.nextLine();
                System.out.println("Anna opiskelijan opiskelijanumero:");
                String studentNumber = scan.nextLine();

                Student newStudent = new Student();
                newStudent.newStudent(studentName, studentNumber);
                students.add(newStudent);

                continue;
            }
            if (option == 2) {
                System.out.println("Opiskelijat:");
                for(Student student : students) {
                    student.printInfo();
                }
                continue;
            }
            if (option == 3) {
                System.out.println("");
                continue;
            }
            else {
                System.out.println("Syöte oli väärä");
                continue;
            }
        }
        scan.close();
        System.out.println("Kiitos ohjelman käytöstä.");

    }
}
