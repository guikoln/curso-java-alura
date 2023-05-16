import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int nuemroGerado = new Random().nextInt(100); // gera um numero aleatorio entre 0 e 100
        int tentativas = 0;

        while (tentativas < 5 ){
            System.out.println("Digite um número entre 0 e 100: ");
            int numeroDigitado = leitor.nextInt();
            tentativas++;

            if  (numeroDigitado == nuemroGerado){
                System.out.println("Parabéns, você acertou o número em "+ tentativas + " Tentativas!");
                break;
            } else if (numeroDigitado < nuemroGerado) {
                System.out.println("O número digitado é menor que o numero gerado.");
            } else {
                System.out.println("O número digitado é maior que o numero gerado.");
            }

        }

        if (tentativas == 5 ){
            System.out.println("Você não conseguiu adivinhar o número em 5 tentativas. O número era " + nuemroGerado);
        }
    }
}
