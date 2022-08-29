package capitulo2.institute;

public class Professor extends Person {

    private int courses;

    private String turn;

    public Professor (){
    }

    public Professor(String name, String lastName, String identityCard, String email, int telephone) {
        super(name, lastName, identityCard, email, telephone);
    }

    public int getCourses() {
        return courses;
    }
    public void setCourses(int courses) {
        this.courses = courses;
    }

    public String getTurn (){
        return turn;
    }
    public void setTurn(String turn) {
        this.turn = turn;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "courses=" + courses +
                ", turn='" + turn + '\'' +
                "} " + super.toString();
    }
}
