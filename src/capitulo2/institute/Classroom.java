package capitulo2.institute;

public class Classroom {
    private int blackboard;
    private int desk;
    private int chair;
    private int computer;

    public Classroom(){
    }

    public Classroom(int blackboard, int desk, int chair, int computer){
        this.blackboard = blackboard;
        this.desk = desk;
        this.chair = chair;
        this.computer = computer;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "blackboard=" + blackboard +
                ", desk=" + desk +
                ", chair=" + chair +
                ", computer=" + computer +
                '}';
    }
}
