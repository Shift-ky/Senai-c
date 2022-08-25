/*
01. Faça um programa que permita entrar com o nome, a nota da prova 1 e a nota da prova 2 
de um aluno. O programa deve imprimir o nome, a nota da prova 1, a nota da prova 2, a média
das notas e uma das mensagens: "Aprovado", "Reprovado" ou "em Prova Final"(a média é 7 para 
aprovação, menor que 3 para reprovação e as demais em prova final).
*/

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>


int main()
{
    setlocale(LC_ALL,"Portuguese");

   float num1, num2, media;

   printf("Digite a primeira nota: ");
   scanf("%f",&num1);

   printf("Digite a segunda nota: ");
   scanf("%f",&num2);

   media = (num1 + num2) / 2;

   if (media <= 3){
    printf("NOTA 1: %.1f\n",num1);
    printf("NOTA 2: %.1f\n",num2);
    printf("MEDIA: %.1f\n",media);
    printf("O aluno está Reprovado\n");
   } else if(media <= 7){
    printf("NOTA 1: %.1f\n",num1);
    printf("NOTA 2: %.1f\n",num2);
    printf("MEDIA: %.1f",media);
    printf("O aluno está Recuperação\n");
   } else{
    printf("NOTA 1: %.1f\n",num1);
    printf("NOTA 2: %.1f\n",num2);
    printf("MEDIA: %.21\n",media);
    printf("O aluno está APROVADO\n");
   }

}
