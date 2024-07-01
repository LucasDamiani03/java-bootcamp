package operadores;
public class Operadores_6 {
    public static void main(String[] args) {

        System.out.println("LOGICAL OPERATORS");

        boolean condition1 = true;

        boolean condition2 = true;   //switch to see the difference in results 

        if (condition1 && condition2) {
            System.out.println("Both condiitons are true!");
        }
        
        if (condition1 || condition2 ) {
            System.out.println("One of the conditions is true...");
        }

        if (condition1 && (7 > 4)) {
            System.out.println("Both condiitons are true!");
        }
        
        System.out.println("end...");

    }
}
