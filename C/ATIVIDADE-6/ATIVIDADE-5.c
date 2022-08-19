/*05. Faça um programa em C que leia um número e informe se ele é divisível por 3 e por 7.*/

#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL,"Portuguese");

   int numero;

   printf("Digite um valor inteiro: ");
   scanf("%i",&numero);



   if(numero % 3 == 0 && numero % 7 == 0){
        printf("Divisível por 3 e 7 ");
   } else{
       printf("Não divisível por 3 e 7");
   }
}
