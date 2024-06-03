public class MinhaCLasse {

    public static void main (String [] args) {
        //declaracao de variaveis
        String primeiroNome = "Lucas";
        String segundoNome = "Damiani";
        
        //declarando um metodo
        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
        
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "o nome desse metodo eh " + primeiroNome.concat(" ").concat(segundoNome);

    }

}