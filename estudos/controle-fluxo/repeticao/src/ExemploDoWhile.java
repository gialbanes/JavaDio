import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");
		
		do {
			//excutando repetidas vezes até alguém atender
			System.out.println("Telefone tocando");
		
		}while(tocando());
		
		System.out.println("Alô !!!");
	}
	private static boolean tocando() {
		boolean atendeu = new Random().nextInt(3)==1;
		System.out.println("Atendeu? " + atendeu);
		//negando o ato de continuar tocando
		return ! atendeu; // nega que atendeu
    }

    // primeiro vai discar e aparecer que o telefone ta tocando enqaunto a segundo método for verdadeiro, a partir do momento que se torna falso, executa o while
}
