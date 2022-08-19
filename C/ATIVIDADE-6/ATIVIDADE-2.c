/*02. Faça um programa em C que leia dois valores inteiros e efetue a adição. Caso o valor somado seja maior que 20, este deverá ser apresentado somando-se a ele mais 8, caso o valor somado seja menor ou igual a 20, este deverá ser apresentado subtraindo-se 5.
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

   if(soma > 20){
        printf("Maior que 20\n");
        printf("Soma + 8 = %d",soma+8);
   } else{
        printf("Menor ou iqual a 20\n");
        printf("Subtrai 5 = %d",soma-5);
   }
}