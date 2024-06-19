public class SistemaIBGE {
    public static void main(String[] args) {
        /* 
        for(EstadoBrasileiro e: EstadoBrasileiro.values()) { // mostra todos os estados 
            System.out.println(e.getSigla() +  " - " + e.getNome());
        }*/
        EstadoBrasileiro eb = EstadoBrasileiro.MARANHAO; // mostra o estado específico
        System.out.println(eb.getNome());
        System.out.println(eb.getSigla());
        System.out.println(eb.getNomeMaiusculo());
        System.out.println(eb.getIbge());
    }
}
