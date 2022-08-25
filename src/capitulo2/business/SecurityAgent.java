package capitulo2.business;

public class SecurityAgent extends Employee{
    private boolean martialArts;

    public SecurityAgent(){

    }

    public boolean getMartialArts(){
        return martialArts;
    }
    public void setMartialArts(boolean martialArts){
        this.martialArts = martialArts;
    }

    public void  patrol (){
        System.out.println( " Start the patrol ");

    }
}
