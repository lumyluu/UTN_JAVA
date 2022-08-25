package capitulo2.moduloUno_Cap2;

// overload = sobrecarga
public class ExampleOverload {
    private int  atrib1;
    private char atrib2;

    public ExampleOverload (int a) { atrib1 = a;}
    public ExampleOverload (char b) { atrib2 = b;}
    public ExampleOverload (char atrib2, int atrib1){
        this.atrib1 = atrib1;
        this.atrib2 = atrib2;
    }

    public void method (){
        atrib2 = 'a';
    }

    public int getAtrib1(){
        return atrib1;
    }
    public char getAtrib2(){
        return atrib2;
    }
}
