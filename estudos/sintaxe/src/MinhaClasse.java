
public class MinhaClasse {
    public static void main (String [] args) {
        String primeiroNome = "Giovana";
        String segundoNome = "Albanês";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
        System.out.print (nomeCompleto); /* determinamos uma variável nomeCompleto que possui o método nomeCompleto que contém parâmetros que são variáveis declaradas anteriormente. por fim pedimos para o sistema sair essa variável nomeCompleto. */

    }

    public static String nomeCompleto (String priemiroNome, String segundoNome){
        return "Resultado do método " +  priemiroNome.concat(" ").concat(segundoNome);
    }
}
/** main: método executável 
 *  void: retorna algum valor
 *  public static: função
 *  string: retorna valores string em arrays[]
 *  {}: onde o bloco de código é escrito
 *  dentro serão os métodos
 *  System: é uma classe padrão que usa uma saída para o método     print com o parâmetro olá mundo
 *  concat: concatenar; possui outras formas de contatenar, por exemplo somar;
*/

/* SUBSTIA DENTRO DO MÉTODO MAIN PARA TESTAR
 * System.out.print ("Olá turma");
 */