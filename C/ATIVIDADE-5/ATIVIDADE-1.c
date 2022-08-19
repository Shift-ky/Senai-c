/*01. Faça um programa em C que imprima o seu nome.
*/

#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL,"Portuguese");
   char nome[13] = "Robson Paiva";

   printf("%s",nome);
}