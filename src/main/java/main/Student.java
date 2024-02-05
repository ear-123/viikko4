package main;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String name;
    private String studentNumber;
    private ArrayList<Grade> courses = new ArrayList<>();

    public void newStudent(String newName, String newStudentNumber){
        this.name = newName;
        this.studentNumber = newStudentNumber;
    }

    public String getName(){
        return this.name;
    }

    public void printInfo(){
        System.out.println(this.studentNumber + ": "+ this.name);
    }

    public void addGrade(String course, int grade){
        courses.add(new Grade(course, grade));
    }

    public void printCourses(){
        int i = 0;
        while (true) {
            if (i>= courses.size()) {
                break;
            }
            System.out.println(courses.get(i).getCourse()+ ": "+ courses.get(i).getGrade());
            
            i++;
        } 

        
    }
}
