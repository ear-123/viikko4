package main;

import java.util.HashMap;

public class Student {
    private String name;
    private String studentNumber;
    private HashMap<String, Integer> courses = new HashMap<>();

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
        courses.put(course, grade);
    }
}
