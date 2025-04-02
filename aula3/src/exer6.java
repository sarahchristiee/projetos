import java.util.Scanner;
public class exer6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String texto = "Eu gosto de maçã, maçã é gostosa!";
        System.out.println("Leia o texto: "+texto+"\nA seguir digite um caractere para saber o índice de sua última ocorrência");
        String caractere = scanner.nextLine();

        System.out.println("O índice da última ocorrência do caractere "+caractere+" é na posição "+(texto.lastIndexOf(caractere)+1));

    }
}