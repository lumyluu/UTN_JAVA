package capitulo2.institute;

public class Person {
    private String name;
    private String lastName;
    private String identityCard;
    private String email;


    public Person (){

    }

    public Person (String name, String lastName, String identityCard, String email, int telephone){
        this.name = name;
        this.lastName = lastName;
        this.identityCard = identityCard;
        this.email = email;

    }


    public String getName (){
        return name;
    }
    public void setName (String name){
        this.name = name;
    }

    public String getLastName (){
        return lastName;
    }
    public void setLastName ( String lastName){
        this.lastName = lastName;
    }

    public String getIdentityCard (){
        return identityCard;
    }
    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", identityCard='" + identityCard + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

