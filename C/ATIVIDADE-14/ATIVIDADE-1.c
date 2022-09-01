/*1. Escreva um programa que leia do teclado um vetor de 10 posições. Escreva na tela
quantos valores pares foram armazenados nesse vetor.
*/

#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL,"Portuguese");

    int numeros[10],cont = 0;

    for(int i = 0; i < 10; i++)
    {
        printf("Digite o %d valor: ",i+1);
        scanf("%d",&numeros[i]);
    }

    for(int i = 0; i < 10; i ++)
    {
        if(numeros[i] % 2 == 0)
        {
            cont++;
        }
    }
    printf("Foram digitados %d valores pares",cont);
