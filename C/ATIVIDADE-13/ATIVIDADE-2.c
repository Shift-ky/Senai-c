/*2. Faça um programa que apresente o menu de opções a seguir, que permita ao usuário escolher a 
opção desejada, receba os dados necessários para executar a operação e mostre o resultado. Verificar
 a possibilidade de opção inválida e não se preocupar com as restrições, como salário inválido.  
Menu de opções:  
1. Novo salário
2. Férias
3. Décimo terceiro
4. Sair  
Digite a opção desejada:
Na Opção 1: receber o salário de um funcionário, calcular e mostrar o novo salário usando as regras da tabela em anexo.
Na opção 2: receber o salário de um funcionário, calcular e mostrar o valor de suas férias. Sabe-se que as férias equivale  ( salário Bruto + ⅓ de salário bruto).
Na opção 3: receber o salário de um funcionário e o número de meses de trabalho na empresa, no máximo 12, calcular e mostrar o valor do décimo terceiro. Sabe-se que o décimo terceiro equivale ao seu salário multiplicado pelo número de meses de trabalho dividido por 12.  
Na opção 4: sair do programa.*/

#include <stdio.h>
#include <stdlib.h>

int main(){

    system("color f0");

    int op =0,meses;
    float salario,nSalario;

    for(;op != 4;){

        printf("[1] - NOVO SALARIO \n[2] - FERIAS \n[3] - DECIMO TERCEIRO \n[4] - SAIR\n -> ");
        scanf("%d",&op);

        if(op < 4){
            switch(op){
            case 1:
                printf("Digite o valor do seu salario atual: ");
                scanf("%f",&salario);

                if(salario <= 350.00){
                    nSalario = salario*1.15;
                }else if(salario <= 600.00){
                    nSalario = salario*1.10;

                } else{
                    nSalario = salario*1.05;
                }
                printf("Seu novo salário é: R$%.2f\n",nSalario);

                system("pause");
                system("cls");
                break;
            case 2:

                printf("Digite o valor do seu salario: ");
                scanf("%f",&salario);

                nSalario = salario+(salario*33.33/100);

                printf("O valor a resceber nas suas férias é: R$%.2f\n",nSalario);


                system("pause");
                system("cls");
                break;

            case 3:

                printf("Digite o valor do seu salario:\n-> ");
                scanf("%f",&salario);

                printf("Digite a quantidade de messes trabalhado: \n->");
                scanf("%d",&meses);

                nSalario = (meses* salario)/12;

                printf("Seu decimo terceiro sera de: R$%.2f \n",nSalario);
                break;

            default:
                printf("OPÇAO INVALIDA!!!\n");
                system("pause");
                system("cls");

        }
        }


    }
}