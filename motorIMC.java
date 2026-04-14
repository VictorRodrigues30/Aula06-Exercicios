// Nome: Victor GUimarães Rodrigues
// RA: 1261946761

import java.util.Scanner;
public class motorIMC {

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static String classificarIMC(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25) {
            return "Normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else if (imc < 35) {
            return "Obesidade grau I";
        } else if (imc < 40) {
            return "Obesidade grau II";
        } else {
            return "Obesidade grau III";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso em kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a altura em metros: ");
        double altura = scanner.nextDouble();

        double imc = calcularIMC(peso, altura);
        String classificacao = classificarIMC(imc);

        System.out.printf("IMC: %.2f%n", imc);
        System.out.println("Classificação: " + classificacao);

        scanner.close();
    }
}