package business;

public class BusinessTest {
    public static void main (String [] args){

        Secretary secretary1 = new Secretary();
        System.out.println( " Method example: Secretary");
        secretary1.dateAppointment();
        System.out.println( "-------------------------------");

        Manager manager1 = new Manager();
        System.out.println( " Method example: Manager");
        manager1.pay();
        System.out.println( "-------------------------------");

        SecurityAgent securityAgent1 = new SecurityAgent();
        System.out.println( " Method example: Security Agent ");
        securityAgent1.patrol();
        System.out.println( "-------------------------------");


        Address address1 = new Address();
        address1.setStreet("Tiger ");
        address1.setNumber(345);
        System.out.println( " Method example: Address");
        address1.getFullAddress();
        System.out.println( "-------------------------------");

        Book book1 = new Book( "Dead poets Society \n ","Tom Schulman \n", "Snow");
        System.out.println("Title: " + book1.getTitle() + " Writer: " + book1.getWriter() + "Editorial: " + book1.getEditorial());
        System.out.println( "-------------------------------");


        Car car1 = new Car( "Renault ", " JFT2312");
        System.out.println( " Erik´s car: \n Model: " + car1.getModel() + "Patent: " +  car1.getPatent());


    }
}
