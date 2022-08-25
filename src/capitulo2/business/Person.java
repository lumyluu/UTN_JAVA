package capitulo2.business;

public class Person {

    private String name;
    private String lastname;
    private String email;
    private Address address;
    public Person (){

    }

    public Person ( String name, String lastname, String email){
        this.name = name;
        this.lastname = lastname;
        this.email = email;
    }

    public String getName (){
        return name;
    }
    public void setName ( String name){
        this.name = name;
    }


    public String getLastname (){
        return lastname;
    }
    public void setLastname ( String lastname){
        this.lastname = lastname;
    }

   public String getEmail () {
        return lastname;
   }
   public void setEmail ( String email){
        this.lastname = lastname;
   }

    public Address getAddress(){
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
