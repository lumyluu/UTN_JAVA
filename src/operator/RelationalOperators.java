package operator;

public class RelationalOperators {
    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        int c = 3;
        boolean result ;
        result = a == b;
        System.out.println("If a=2 y b=2, a == b : " + result);
        result = a == c;
        System.out.println("If a=2 y c=3, a == c : " + result);
        System.out.println("-----------------------------------------------");
        result = a != b;
        System.out.println("If a=2 y b=2, a != b : " + result);
        result = a != c;
        System.out.println("If a=2 y c=3, a != c : " + result);
        System.out.println("-----------------------------------------------");
        result = a < b;
        System.out.println("If a=2 y b=2, a < b : " + result);
        result = a < c;
        System.out.println("If a=2 y c=3, a < c : " + result);
        System.out.println("-----------------------------------------------");
        result = a <= b;
        System.out.println("If a=2 y b=2, a <= b : " + result);
        result = a <= c;
        System.out.println("If a=2 y c=3, a <= c : " + result);
        System.out.println("-----------------------------------------------");
        result = a > b;
        System.out.println("If a=2 y b=2, a > b : " + result);
        result = a > c;
        System.out.println("If a=2 y c=3, a > c : " + result);
        System.out.println("-----------------------------------------------");
        result = a >= b;
        System.out.println("If a=2 y b=2, a >= b : " + result);
        result = a >= c;
        System.out.println("If a=2 y c=3, a >= c : " + result);
    }
}
