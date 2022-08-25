package capitulo2.moduloUno_Cap2;

public class UseStrings {
    public static void main (String[] args ) {
        String string1 = "This is a string created by assignment. ";
        String string2 =  new String (
                " This is another string created by assignment"); /*assignment = asignación*/
        String string3;

        System.out.println (string1);
        System.out.println(string2);
        string3 = string1 + string2;

        System.out.println ("The result of the concatenation with + is : " + string3);
    }
}
// The double bar used for each line
// the comment

/* begin the comment
The bar combination is used if the comment has more the one line
 */