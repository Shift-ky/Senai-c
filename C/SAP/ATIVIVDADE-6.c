/*06. Construa um programa que leia um valor inteiro e retorne se a raiz desse número é exata ou não. Escreva uma função para fazer a validação. Ao final imprima o resultado.*/

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int raiz(int n)
{
    float aux = sqrt(n);
    int a = aux;
    aux = aux - a;
    if (aux > 0)
        return 0;
    else
        return 1;
}

void main()
{
    int n, i;

    printf("\nDigite o numero para verificar a raiz:");
    scanf("%d", &n);

    i = raiz(n);

    if (i == 1)
        printf("\nRaiz inteira");
    else
        printf("\nRaiz nao inteira");
}
