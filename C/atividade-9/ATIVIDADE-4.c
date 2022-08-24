/*04. A confederação brasileira de natação irá promover eliminatórias para o próximo mundial.
 Faça um programa em C que receba a idade de um nadador e imprima a sua categoria segundo a tabela a seguir: 

Categoria                 Idade
Infantil A               5 - 7 anos 
Infantil B               8 - 10 anos 
Juvenil A               11 - 13 anos 
Juvenil B               14 - 17 anos 
Sênior                   maiores de 18 anos
*/

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>


int main()
{
    setlocale(LC_ALL,"Portuguese");

    int idade;

    printf("==================================\n");
    printf("==== CONFEDERAÇÃO DE NATAÇÃO ====\n");
    printf("==================================\n");

    printf("Digite a idade do competidor: ");
    scanf("%d", &idade);

    if(idade < 5) {
        printf("Idade abaixo do limite permitidop que é 5 anos");
    } else if( idade <=7){
        printf("CATEGORIA INFANTIL A");
    } else if(idade <= 10){
        printf("CATEGORIA INFANTIL B");
    } else if(idade <= 13){
        printf("CATEGORIA JUVENIL A");
    } else if(idade <= 18){
        printf("CATEGORIA JUVENIL B");
    } else {
        printf("SENIOR");
    }

}