package capitulo2.disguisePrivate;
// disguise = ocultar
public class Person {
    private String firstName;
    private String secondName;
    private String surname;
    private String document;

    public Person (){

    }
    public Person (String firstName, String secondName, String surname, String document){
        this.firstName = firstName;
        this.secondName = secondName;
        this.surname = surname;
        this.document = document;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName (String firstName){
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    public String getSurname (){
        return surname;
    }
    public void setSurname (String surname){
        this.surname = surname;
    }
    public String getDocument(){
        return document;
    }
    public void setDocument(String document){
        this.document = document;
    }
}

