/**02. Faça um programa que permita entrar com o salário de uma pessoa e imprima o desconto do INSS segundo a tabela seguir: 
Salário                                                                                                     Faixa de Desconto
Menor ou igual à R$600,00                                                                  Isento
Maior que R$600,00 e menor ou igual a R$1200,00                         20%
Maior que R$1200,00 e menor ou igual a R$2000,00                       25%
Maior que R$2000,00                                                                            30%
 */

 import java.ultil.Scanner;

 public class atividade2 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        double salario,desconto;

        System.out.prinln("Digite o valor do seu salario: ");
        salario = entrada.nextDouble();

        if(salario <= 600){
            System.out.println("Insento do desconto");
        }else if("Salario <= 1200"){
            desconto = salario * 0.20;
            System.out.printf("O desconto é de R$%.2f \n",desconto);
            System.out.printf("O seu salario com o desconto é R$%.2f",salario-desconto);
        }else if("salario <= 2000"){
            desconto = salario*0.25;
            System.out.printf("O desconto é de R$%.2f \n",desconto);
            System.out.printf("O seu salario com o desconto é R$%.2f",salario-desconto);
        } else{
            desconto = salario*0.30;
            System.out.printf("O desconto é de R$%.2f \n",desconto);
            System.out.printf("O seu salario com o desconto é R$%.2f",salario-desconto);
        }
        entrada.close();
    }
 }