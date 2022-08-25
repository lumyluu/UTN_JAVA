package business;

public class Car {
    private String model;
    private String patent;

    public Car (){

    }

    public Car ( String model, String patent){
        this.model = model;
        this.patent = patent;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPatent() {
        return patent;
    }

    public void setPatent(String patent) {
        this.patent = patent;
    }
}
