import java.util.Scanner;

public class Comparacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int primeiro = scanner.nextInt();

        System.out.print("Digite o segundo numero: ");
        int segundo = scanner.nextInt();

        if (primeiro == segundo) {
            System.out.println("Os numeros são iguais!");
        } else if (primeiro > segundo) {
            System.out.println("O primeiro número é maior que o segundo!");
        } else {
            System.out.println("O segundo numero é maior que o primeiro");
        }
    }
}