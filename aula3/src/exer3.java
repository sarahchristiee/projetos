import java.util.Scanner;
public class exer3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um texto: ");
        String texto = scanner.nextLine();

        System.out.println("Digite um número do caractere do seu texto (0 = primeiro caractere e total-1 = último caractere):");
        int num = Integer.parseInt(scanner.nextLine());

        System.out.println("O caractere de número "+num+" é "+texto.charAt(num));


    }
}
