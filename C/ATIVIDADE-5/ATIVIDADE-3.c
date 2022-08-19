/*03. Leia duas strings. Se as strings forem iguais escreva “strings iguais”. Caso contrário, concatene as duas strings e imprima a string resultante.*/

#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL,"Portuguese");
   char nome[20];
   char nome2[50];
   int i;

   printf("Digite uma palavra: ");
   gets(nome);

   printf("Digite outra palavra: ");
   gets(nome2);

    i = strcmp(nome,nome2);

   if(i ==0){
    printf("Os valores são iguais");
   } else {
   printf("os valores são diferentres");
   }
}