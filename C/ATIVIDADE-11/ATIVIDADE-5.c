/*
5. Escreva um programa em C que lê 15 valores reais, encontra o maior e o menor deles e mostra o resultado.
*/
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>


int main()
    {
        setlocale(LC_ALL, "Portuguese");

        int op = 0;
        int valor, maior,menor;

        while(op <15){
            printf("Digite o %d valor: ",op+1);
            scanf("%d",&valor);
            if (op == 0){
                maior = valor;
                menor = valor;
            }
            if(valor > maior){
                maior = valor;
            } else if(valor < menor){
                menor = valor;
            }
            op++;
        }
        printf("O maior valor digitado foi: %d\n",maior);
        printf("O menor valor digitado foi: %d\n",menor);


    }

