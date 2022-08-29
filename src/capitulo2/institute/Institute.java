package capitulo2.institute;

import java.util.Arrays;

public class Institute {
    private String instituteName;
    private Student [] studentList;
    private Professor[] professorList;
    private Classroom[] classrooms;
    private Course[] courses;

    private int professorPos = 0;

    public String getInstituteName() {
        return instituteName;
    }

    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }

    public Student[] getStudentList() {
        return studentList;
    }

    public void setStudentList(Student[] studentList) {
        this.studentList = studentList;
    }

    public Professor[] getProfessorList() {
        return professorList;
    }

    public void setProfessorList(Professor[] professorList) {
        this.professorList = professorList;
    }

    public Classroom[] getClassrooms() {
        return classrooms;
    }

    public void setClassrooms(Classroom[] classrooms) {
        this.classrooms = classrooms;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    public void setProfessor (Professor professor ){
        professorList[professorPos++] = professor;
    }

    @Override
    public String toString() {
        return "Institute{" +
                "instituteName='" + instituteName + '\'' +
                ",\n studentList=" + Arrays.toString(studentList) +
                ",\n professorList=" + Arrays.toString(professorList) +
                ",\n classrooms=" + Arrays.toString(classrooms) +
                ",\n courses=" + Arrays.toString(courses) +
                '}';
    }
}
