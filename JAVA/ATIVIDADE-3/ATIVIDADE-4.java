/*04. Escreva um programa que leia o código de um determinado produto e mostre a sua classificação. Utilize a tabela abaixo como referência:
Código               Descrição
1                         Alimento não-perecível
2                         Alimento perecível
3                         Vestuário
4                         Limpeza
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