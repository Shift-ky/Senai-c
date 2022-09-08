import java.util.Scanner;

/*04. Para  cada produto informado (nome,     preço     e     quantidade),  escreva o  nome  do  produto comprado  e o valor total a ser pago,  considerando que são oferecidos descontos pelo número de unidades compradas, segundo a  tabela abaixo:
a. Até    10    unidades: valor    total
b. de    11 a    20    unidades: 10%    de    desconto
c. de    21    a    50    unidades: 20%    de    desconto
d. acima    de    50    unidades: 25%    de    desconto*/
public class ATIVIDADE4 {
    public static void main(String[] args) {
        String nome;
        double preco, precoTotal, desconto = 0;
        int quantidade, opc;

        Scanner entrada = new Scanner(System.in);
        do {


            System.out.print("Qual o produto a ser comprado: -> ");
            nome = entrada.next();

            System.out.print("Qual o preço do produto: ");
            preco = entrada.nextDouble();

            System.out.print("Qual a quantidade: ");
            quantidade = entrada.nextInt();

            precoTotal = preco * quantidade;

            if (quantidade >= 11 && quantidade <= 20) {
                desconto = (precoTotal * 0.10);
            } else if (quantidade >= 21 && quantidade <= 50) {
                desconto = precoTotal * 0.20;
            } else if (quantidade > 50) {
                desconto = precoTotal * 0.25;
            }
            System.out.print("Quer continuar? [1] - sim [0] - não ");
            opc = entrada.nextInt();

            System.out.printf("Produto.................%s", nome);
            System.out.printf("Valor Total.............%.2n\n", precoTotal - desconto);
        }while(opc != 0);

        entrada.close();
    }
}
