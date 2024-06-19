import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao{
    public static void main(String[] args) {
        //as classes que representam exceções são organizadas de forma hierárquica: as exceções checadas e não checadas

        //checked: ao usar um método a IDE retorna que voce precisa tratar a execção;
        Number valor;
        try{
            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);
        } catch(ParseException e ){
            e.printStackTrace();
        }
        /*unchecked: ele não retorna, pois é uma coisa que precisaria acontecer pra vc tratar já que n é recorrente;
        Number valor = Double.valueOf("a1.75");
        System.out.println(valor);*/
    }
}