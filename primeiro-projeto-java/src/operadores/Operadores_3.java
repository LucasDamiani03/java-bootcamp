package operadores;
public class Operadores_3 {
    public static void main (String [] args) {    
        //declaring variables
        int numero = 5;

        System.out.println(numero ++);

        System.out.println(++ numero); //iterating before var is printed

        System.out.println(numero);

        System.out.println(numero ++); //iterating after var is printed

        System.out.println(numero);     //final var

// testing on boolean values

        boolean variavel = true;

        System.out.println(!variavel); //still does not change its value

        System.out.println(variavel);

        variavel = !variavel;       //changing value of variavel

        System.out.println(variavel);

    }
}