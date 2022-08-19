/*01. Faça um programa em C que leia um número inteiro e imprima o seu antecessor
e o seu sucessor.
*/
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL,"");
    int numero;
    printf("Digite um valor: ");
    scanf("%i",&numero);

    printf("O antecessor é: %i\n",numero-1);
    printf("O sucecessor é: %i\n",numero+1);


}
