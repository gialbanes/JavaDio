public class operadores{
    public static void main (String[] args){
        /*STRING
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);





        ARITMÉTICO
        String concatenacao ="?"; 
        System.out.println(concatenacao);

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);
        concatenacao = "1"+1+1+1;

        System.out.println(concatenacao);
        concatenacao = "1"+(1+1+1); */

        /* a partir do momento que ele identifica uma string, para de realizar a operação aritmética e apenas faz a contatenação */






        /* UNÁRIO
        int numero = 5;
        System.out.println(- numero);  assim não funciona pq o numero em si nao ficou negativo, ele so fica quando eu peço para imprimir 

        int numero = 5;
        numero = - numero;
        System.out.println(numero); assim funciona pq o numero em si é negativo

        numero = numero * -1;
        System.out.println(numero); tornei ele positivo denovo*/

        /* ABREVIATURA - 2 EXEMPLOS
        int numero =5;
        numero++;
        System.out.println(numero);

        int numero = 5;
        System.out.println(++ numero); primeiro pega o 5 para fazer a operação 
        System.out.println(numero);  imprime a operação */

        /*boolean variavel = true;
        System.out.println(!variavel);  inverte o valor boolean mesmo ele estando definido como true */




        /* TERNÁRIO é o mesmo q if else, mas é mais fácil por ser executado em uma única linha, o resultado dos ternários deve ser compatível com o tipo da variável resultado
        int a, b;
        a = 5;
        b = 6;

        String resultado = a==b ? "verdadeiro" : "falso";
        System.out.println(resultado);*/





        /* RELACIONAIS 
        String nomeUm = "Giovana";
        String nomeDois = "Giovana";

        System.out.println(nomeUm == nomeDois);*/


        /* LÓGICOS */

        boolean condicao1 = true;
        boolean condicao2 = true;

            if(condicao1 && condicao2){
                System.out.println("As duas condições são verdadeiras");
            } if(condicao1 || condicao2){
                System.out.println("Uma das condições é verdadeira");
            }

        System.out.println("Fim");
        
    }
}