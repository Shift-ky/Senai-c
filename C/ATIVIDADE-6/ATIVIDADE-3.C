/*03. Faça um programa em C que leia dois valores numéricos inteiros e efetue a adição,caso o resultado seja maior que 10, apresentá-lo.
*/
#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL,"Portuguese");

   int numero1,numero2,soma;

   printf("Digite um valor inteiro: ");
   scanf("%i",&numero1);

   printf("Digite outro valor inteiro: ");
   scanf("%i",&numero2);

   soma = numero1 + numero2;

   if(soma > 10){
        printf("%d",soma);
   }
}
