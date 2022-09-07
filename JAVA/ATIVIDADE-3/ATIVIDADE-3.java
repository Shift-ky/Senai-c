/**03. Depois da liberação do governo para as mensalidades dos planos de saúde, as pessoas começaram a fazer pesquisas para descobrir um bom plano, não muito caro. Um vendedor de um plano de saúde apresentou a tabela a seguir. Faça um programa que entre com o nome e a idade de uma pessoa e imprima o nome e o valor que ela deverá pagar.
Idade                                                            Valor
Até 10 anos                                                 R$30,00
Acima de 10 até 29 anos                          R$60,00
Acima de 29 até 45 anos                          R$120,00
Acima de 45 até 59 anos                          R$150,00
Acima de 59 até 65 anos                          R$250,00
Maior que 65 anos                                     R$400,00
 */

import java.util.Scanner;

public class atividade3{
    public static void main(string[] args){

        String nome;
        int idade;

        Scanner entrada = new Scanner(System.in);

        System.out.prinln("Digite o seu nome: ");
        nome = entrada.nextLine();

        System.out.print("Digite a sua idade: ");
        idade = entrada.nextInt();

        if(idade < 10){
            System.out.println("O plano ideal para o SR(A) %s \nsera de 30 reais ao mes",nome);
        } else if(idade < 45){
            System.out.println("O plano ideal para o SR(A) %s \nsera de 45 reais ao mes",nome);
        }else if(idade < 59){
            System.out.println("O plano ideal para o SR(A) %s \nsera de 150 reais ao mes",nome);
        }else if(idade < 65){
            System.out.println("O plano ideal para o SR(A) %s \nsera de 250 reais ao mes",nome);
        }else{
            System.out.println("O plano ideal para o SR(A) %s \nsera de 400 reais ao mes",nome);
        }
        entrada.close();
    }
}