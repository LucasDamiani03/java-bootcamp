package operadores;
public class Operadores_5 {
    public static void main(String[] args) {

        int numberOne = 1;
        int numberTwo = 2;

        /* 
            ==
            !=
            >
            >=
            <
            <=
        */

        //EQUALS

        boolean simNao = numberOne == numberTwo;

        System.out.println("numberOne equals numberTwo? \n" +  simNao)  ;



        //DIFFERENT

        simNao = numberOne != numberTwo;

        System.out.println("numberOne is different than numberTwo? \n" +  simNao);


        //GREATER THAN

        simNao = numberOne > numberTwo;

        System.out.println("Is numberOne greater than numberTwo? \n" + simNao);


        //TERNARY OPERATION (LESS THAN)
        
        if (numberOne < numberTwo){
            System.out.println("condition is true, numberOne is Less than numberTwo");
        }
    

        //FUNCION "EQUALS"

        String name1 = "Lucas";
        String name2 = "Lucas";

        System.out.println(name1.equals(name2));
    }
}
