import java.util.Scanner;
public class exer4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao cadastro do paciente!");

        System.out.print("Digite o nome do paciente: ");
        String paciente = scanner.nextLine();

        System.out.print("Digite o CPF do paciente: ");
        long cpf = Long.parseLong(scanner.nextLine());

        System.out.print("Digite a idade do paciente: ");
        short idade = Short.parseShort(scanner.nextLine());

        System.out.print("Digite a altura do paciente: ");
        double altura = Double.parseDouble(scanner.nextLine());

        System.out.print("Digite o peso do paciente: ");
        float peso = Float.parseFloat(scanner.nextLine());

        System.out.printf("\nPaciente %s,", paciente);
        System.out.printf(" CPF: %d", cpf);
        System.out.println("\n----------------------------------------------------------");
        System.out.printf("Idade: %d; \n", idade);
        System.out.printf("Altura: %.2f; \n", altura);
        System.out.printf("Peso: %.2f; \n", peso);
        
    }
}
