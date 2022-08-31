/*6. Escreva um programa em C que imprima uma sequência de números separados por vírgula. Deve ser fornecido pelo usuário o início e o fim da sequência.*/

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>


int main() {

        setlocale(LC_ALL, "Portuguese");

        int inicio, fim;

       printf("Digite o valor inicial: ");
       scanf("%d",&inicio);

       printf("Digite o valor final: ");
       scanf("%d",&fim);

       if(inicio <= fim){
            while(inicio < fim){
                if(inicio< fim){
                    printf("%d, ",inicio);
                }else{
                    printf("%d. ",fim);
                }
                ++inicio;
            }

       } else {
            while(inicio > fim){
                if(inicio >= fim) {
                    printf("%d, ",inicio);
                }
                if(inicio > fim){
                printf("%d. ",fim);
                }
                --inicio;
            }


       }


}
