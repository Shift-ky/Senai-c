/*1. Faça um programa que apresente o menu de opções a seguir:  
Menu de opções:  
1. Média aritmética
2. Média ponderada
3. Sair  
Digite a opção desejada:
Na opção 1: receber duas notas, calcular e mostrar a média aritmética.
Na opção 2: receber três notas e seus respectivos pesos, calcular e mostrar a média ponderada.
Na opção 3: sair do programa.  
Verifique a possibilidade de opção inválida, mostrando uma mensagem.  

*/

#include <stdio.h>
#include <stdlib.h>

int main(){

    int op =0;
    float media,num1,num2,num3;

    for(;op != 3;){
            system("color 0f");
        printf("[1] - MEDIA ARITMETICA \n[2] - MEDIA PONDERADA \n[3] - SAIR\n -> ");
        scanf("%d",&op);
        switch(op){
            case 1:
                system("color 17");
                printf("Digite a primeira nota: \n-> ");
                scanf("%f",&num1);

                printf("Digite a segunda nota: \n-> ");
                scanf("%f",&num2);

                media = (num1 + num2) / 2;

                printf("A média é: %f",media);
                system("pause");
                system("cls");
                break;
            case 2:
                system("color f0");

                printf("Digite a primeira nota: ");
                scanf("%f",&num1);

                printf("Digite a segunda nota: ");
                scanf("%f",&num2);

                printf("Digite a Terceira nota: ");
                scanf("%f",&num3);

                media = ((num1 * 3)+(num2*2)+(num3*1))/6;

                printf("A média é : %f",media);
                system("pause");
                system("cls");
                break;

            default:
                printf("OPÇAO INVALIDA!!!");
                system("pause");
                system("cls");

        }


    }
}