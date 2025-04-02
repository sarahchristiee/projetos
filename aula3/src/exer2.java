import java.util.Scanner;
public class exer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um texto:");
        String texto = scanner.nextLine();


        System.out.println("Quantidade de caracteres: "+texto.length());
        System.out.println("Primeiro caractere: "+texto.charAt(0));
        System.out.println("Último caractere: "+texto.charAt(texto.length()-1));

    }
}
