import java.sql.SQLOutput;
import java.util.Scanner;
public class exer4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.println("Digite um número de 1 a 26: ");
        int posicao = Integer.parseInt(scanner.nextLine());

        System.out.println("A letra do alfabeto na posição "+posicao+" é a letra "+alfabeto.charAt(posicao-1));

    }
}
