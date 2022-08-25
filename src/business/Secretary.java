package business;

public class Secretary extends Employee{
    private int telephone;

    public Secretary (){

    }

    public int getTelephone(){
        return telephone;
    }
    public void setTelephone ( int telephone){
        this.telephone = telephone;
    }

    public void dateAppointment (){
        System.out.println( "Hello, I´m Helen ¿Can I schedule an appointment?");
    }

}
