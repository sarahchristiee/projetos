import java.util.Scanner;
public class exer5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um texto:");
        String texto = scanner.nextLine();

        System.out.println("Digite um caractere para saber sua primeira ocorrência:");
        String caractere = scanner.nextLine();

        System.out.println("A primeira ocorrência do caractere "+caractere+" é na posição "+(texto.indexOf(caractere)+1));


    }
}
