package capitulo2.institute;

import java.util.Arrays;

public class Course {
    private String name;
    private Classroom classroom;
    private Professor professor;
    private Student [] student;

    public  Course (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Student[] getStudent() {
        return student;
    }

    public void setStudent(Student[] student) {
        this.student = student;
    }


    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", classroom=" + classroom +
                ", professor=" + professor +
                ", student=" + Arrays.toString(student) +
                '}';
    }
}
