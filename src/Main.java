import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
int y = 32;
double x = 10.9127;
String nome = "Maria";
int idade = 31;
double renda = 4000.0;

        System.out.print("Hello world!");
        System.out.println("Good morning!");
        System.out.println(y);
        System.out.println(x);
        System.out.printf("%.1f%n",x); // %.1f = uma casa depois da virugla. %n = quebra de linha
        Locale.setDefault(Locale.US);  // troca a virgula pelo ponto.
        System.out.printf("%.1f%n",x);
        System.out.println("Resultado " + x + " metros"); // "+" seve pra concatenar
        System.out.printf("Resultado = %.2f metros%n", x); // a variavel "x" entra no luar do %.2f

        // &f = ponto flutuante
        // &d = inteiro
        // &s = texto
        // &n = quebra de linha

        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
        }
    }
