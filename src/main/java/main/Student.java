package main;

public class Student {
    private String name;
    private String studentNumber;

    public void newStudent(String newName, String newStudentNumber){
        this.name = newName;
        this.studentNumber = newStudentNumber;
    }

    public void printInfo(){
        System.out.println(this.studentNumber + ": "+ this.name);
    }

    //public void addGrade(String course, int grade){
        
    //}
}
