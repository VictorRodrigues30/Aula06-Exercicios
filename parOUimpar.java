// Nome: Victor GUimarães Rodrigues
// RA: 1261946761

import java.util.Scanner;
public class parOUimpar {

public static boolean ehPar(int numero) {
if (numero % 2 == 0) {
return true;
} else {
return false;
}
}
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

System.out.print("Digite um número inteiro: ");
int numero = scanner.nextInt();

if (ehPar(numero)) {
System.out.println("O número " + numero + " é PAR.");
} else {
System.out.println("O número " + numero + " é ÍMPAR.");
}

scanner.close();
}
}