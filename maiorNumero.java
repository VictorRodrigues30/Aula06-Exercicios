// Nome: Victor GUimarães Rodrigues
// RA: 1261946761

public class maiorNumero {

public static int maior(int a, int b) {
if (a > b) {
return a;
} else {
return b;
}
}
public static void main(String[] args) {

int maximo = maior(10, 42);

System.out.println("O maior número é: " + maximo);

}
}