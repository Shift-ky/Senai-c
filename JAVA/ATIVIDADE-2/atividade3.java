import java.util.Scanner;

/*03. Faça um programa em Java que efetue a apresentação do valor da conversão em real (R$) de um valor lido em dólar
(US$). Para isso, será necessário também ler o valor da cotação do dólar.
*/
public class atividade3 {
    public static void main(String[] args) {

        double dinheiro, converter;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor que quer converter: ");
        dinheiro = entrada.nextDouble();

        converter = dinheiro *4.80;

        System.out.printf("Com US$ %.2f da para trocar por R$ %.2f",dinheiro,converter);

        entrada.close();
    }
}
