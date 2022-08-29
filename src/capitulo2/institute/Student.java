package capitulo2.institute;

import java.util.Arrays;

public class Student extends Person {
    private Course[] courses;
    private String studentCard;

    public Course[] getCourses() {
        return courses;
    }

    public Student(String name, String lastName, String identityCard, String email, int telephone, String studentCard) {
        super(name, lastName, identityCard, email, telephone);
        this.studentCard = studentCard;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    public String getStudentCard() {
        return studentCard;
    }

    public void setStudentCard(String studentCard) {
        this.studentCard = studentCard;
    }

    @Override
    public String toString() {
        return "Student{" +
                "courses=" + Arrays.toString(courses) +
                ", studentCard='" + studentCard + '\'' +
                "} " + super.toString();
    }
}
