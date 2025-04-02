import java.util.Locale;
import java.util.Scanner;
public class exer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite sua cidade:");
        String cidade = scanner.nextLine();

        System.out.println("Digite seu Estado:");
        String estado = scanner.nextLine();

        System.out.println("Nome: "+nome.toUpperCase());
        System.out.println("Cidade: "+cidade.toLowerCase());
        System.out.println("Estado: "+estado.toUpperCase());



    }
}