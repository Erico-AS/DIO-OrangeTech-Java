public class Operadores {
    public static void main(String [] args) {
        int numero = 10;
        boolean variavel = true;
        System.out.println(numero);

        numero = - numero;
        System.out.println(numero); // Inverte negativamente

        numero = - numero;
        System.out.println(numero); // '-' significa multiplicar por -1 e '+' significa multiplicar por +1

        numero -= 1;
        System.out.println(numero);

        numero += 1;
        System.out.println(numero);

        System.out.println(!variavel);
        
        //-------------------------------------------------
        String nomeUm = "érico";
        String nomeDois = new String("érico");

        Boolean situacao = nomeUm == nomeDois;
        System.out.println(situacao);

        situacao = nomeUm.equals(nomeDois);
        System.out.println(situacao);

        // 'equal' serve para comparar conteúdo
        //-------------------------------------------------


    }
}
