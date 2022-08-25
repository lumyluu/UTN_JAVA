package business;

public class Manager extends Employee {
    private int corporateCard;

    public Manager (){

    }

    public int getCorporateCard(){
        return corporateCard;
    }
    public void setCorporateCard( int corporateCard){
        this.corporateCard = corporateCard;
    }

    public void pay (){

        System.out.println( " ¿Can I pay you with my corporate card?");
    }
}
