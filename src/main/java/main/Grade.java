package main;

public class Grade {
    private String course;
    private int grade;
    
    public Grade(String newCourse, int newGrade){
        this.course = newCourse;
        this.grade = newGrade;
    }

    public String getCourse(){
     return course;
    }

    public int getGrade(){
        return grade;
    }
}
