import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        String operation;
        double result;

        System.out.println("Bienvenue sur l'interface Calculatrice !");

        while (true) {
            System.out.print("Entrez votre premier nombre : ");
            num1 = scanner.nextDouble();
            System.out.print("Entrez votre opération (+, -, *, /, %, ^, sqrt, square): ");
            operation = scanner.next();
            System.out.print("Entrez votre second nombre : ");
            num2 = scanner.nextDouble();

            switch (operation) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
                case "%":
                    result = num1 * num2 / 100;
                    break;
                case "^":
                    result = Math.pow(num1, num2);
                    break;
                case "sqrt":
                    result = Math.sqrt(num1);
                    break;
                case "square":
                    result = num1 * num1;
                    break;
                default:
                    System.out.println("Opération invalide !");
                    continue;
            }

            System.out.println("Résultat : " + result);
            System.out.print("Voulez-vous continuer ? (y/n): ");
            if (scanner.next().equalsIgnoreCase("n")) {
                break;
            }
        }
        scanner.close();
    }
}
