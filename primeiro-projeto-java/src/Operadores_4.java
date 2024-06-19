public class Operadores_4 {
    public static void main(String[] args) {

        //TERNARY OPERATORS

        int a, b;
        a = 5;
        b = 6;

        String resultado = "";
            if (a==b)
                resultado = "true";
            else
                resultado = "false";
            
        System.out.println(resultado);  
        
        //ANOTHER WAY OF WRITING IT
    
        resultado = a==b ? "true" : "false";

        System.out.println(resultado);

        //Also, ternary operators doesn't limit itself to String types
        int x,y;
        x = 5;
        y = 5;

        int result = x==y ? 1 : 0;

        System.out.println(result);


    }

}
