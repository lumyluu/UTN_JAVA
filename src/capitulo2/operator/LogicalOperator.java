package capitulo2.operator;

public class LogicalOperator {
    public static void main(String[] args) {
        boolean result;
        System.out.println("-----------------------------------------------");
        System.out.println("Truth table: AND (Y)");
        System.out.println("-----------------------------------------------");
        result = true && true;
        System.out.println("True AND  True = " + result);
        result = true && false;
        System.out.println("True AND False = " + result);
        result = false && true;
        System.out.println("False AND True = " + result);
        result = false && false;
        System.out.println("False AND False = " + result);
        System.out.println("-----------------------------------------------");
        System.out.println("-----------------------------------------------");
        System.out.println("Truth table :  OR (O inclusive)");
        System.out.println("-----------------------------------------------");
        result = true || true;
        System.out.println("True O True = " + result);
        result = true || false;
        System.out.println("True O False = " + result);
        result = false || true;
        System.out.println("False O True = " + result);
        result = false || false;
        System.out.println("False O False = " + result);
        System.out.println("-----------------------------------------------");
    }
}