package capitulo2.moduloUno_Cap2;

// builder declaration
public class ExampleBuilder {
    public ExampleBuilder (int v) { var1= v;} // this is same that (int var1) { this.var1 = var1;}
    private int var1;
    private int var2;

    public int getVar2() {
        return var2;
    }
    public void setVar2 (int var2) {
        this.var2 = var2;
    }
    public int getVar1 () {
        return var1;
    }

    //Use of an object

    //  Declaration of an object in Java wearing the builder by default

    //ExampleBuilder obj1 = new ExampleBuilder();

    // Creation of an object wearing the builder

    ExampleBuilder obj = new ExampleBuilder(8);

    //Example of a builder that uses the package name without the "import"
    // without = sin

    capitulo2.moduloUno_Cap2.ExampleOverload obj2 = new capitulo2.moduloUno_Cap2.ExampleOverload('a' );


}
