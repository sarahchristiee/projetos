import java.util.Scanner;
public class exer3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um int: ");
        int inteiro = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite um byte: ");
        byte oitobitis = Byte.parseByte(scanner.nextLine());

        System.out.print("Digite um short: ");
        short dezeseisbits = Short.parseShort(scanner.nextLine());

        System.out.print("Digite um long: ");
        long sessentaequatrobits = Long.parseLong(scanner.nextLine());

        System.out.print("Digite um float: ");
        float trintaedoisbits = Float.parseFloat(scanner.nextLine());

        System.out.print("Digite um double: ");
        double numeroponto = Double.parseDouble(scanner.nextLine());

        System.out.print("Digite um boolean: ");
        boolean umbit = Boolean.parseBoolean(scanner.nextLine());

        System.out.print("Digite um string: ");
        String texto = scanner.nextLine();

        System.out.println(inteiro);
        System.out.println(oitobitis);
        System.out.println(dezeseisbits);
        System.out.println(sessentaequatrobits);
        System.out.println(trintaedoisbits);
        System.out.println(numeroponto);
        System.out.println(umbit);
        System.out.println(texto);



    }
}
