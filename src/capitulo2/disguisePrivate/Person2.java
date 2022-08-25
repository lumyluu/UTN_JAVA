package capitulo2.disguisePrivate;

public class Person2 {

    private String firstName;
    private String secondName;
    private String surname;
    private String document;
    private String details;

    public Person2 (){

    }
    public Person2 (String firstName, String secondName, String surname, String document){
        this.firstName = firstName;
        this.secondName = secondName;
        this.surname = surname;
        this.document = document;
    }

    public void createDetails () {
        details = "Persona [ firstName=" + firstName
                    + " , secondName =" + secondName
                    + " . surname=" + surname
                    + " , document=" + document + "]";


    }
    // A method is used to access the person´s  information.
}
