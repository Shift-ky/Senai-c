/*02. Faça um programa em C que leia o nome o endereço e o telefone de um cliente e ao final, imprima esses dados.
*/

#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL,"Portuguese");
   char nome[20];
   char endereco[50];
   char telefone[20];

   printf("Digite o seu nome: ");
   gets(nome);

   printf("Digite o seu endereco: ");
   gets(endereco);

   printf("Digite o seu telefone: ");
   gets(telefone);

   printf("%s\n",nome);
   printf("%s\n",endereco);
   printf("%s\n",telefone);
}