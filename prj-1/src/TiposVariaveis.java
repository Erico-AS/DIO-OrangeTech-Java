public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500;

        byte idade = 123;
        short ano = 2021;
        int cep = 21891070;
        long cpf = 10023456721l;
        final float PI = 3.14F; // 'final' indica que seu valor não muda, semelhante a uma 'const'

        System.out.println(idade + " " + ano + " " + cep);
        System.out.println(cpf + " " + PI + " " + salarioMinimo);

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        //Adição do 'short' para pegar um valor abrangete e diminuir para um mais específico
        short numeroCurto2 = (short) numeroNormal;
    }
}
