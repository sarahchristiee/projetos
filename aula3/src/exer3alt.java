import java.util.Scanner;
public class exer3alt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um texto: ");
        String texto = scanner.nextLine();

        System.out.println("Digite um número do caractere do seu texto (Entre 1 e "+texto.length()+")");
        int num = Integer.parseInt(scanner.nextLine());

        System.out.println("O caractere de número "+num+" é "+texto.charAt(num-1));


    }
}