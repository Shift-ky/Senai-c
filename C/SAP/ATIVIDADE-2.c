/*02. No dia da estréia do filme "Procurando Dory", uma grande emissora de TV realizou uma pesquisa logo após o encerramento do filme. Cada espectador respondeu a um questionário no qual constava sua idade e a sua opinião em relação ao filme: excelente - 3; bom - 2; regular - 1. Criar um programa que receba a idade e a opinião de 20 espectadores, calcule e imprima:• A média das idades das pessoas que responderam excelente;• A quantidade de pessoas que responderam regular;• A percentagem de pessoas que responderam bom entre todos os expectadores analisados.
 */

#include <stdio.h>
#include <stdlib.h>

void main()
{
    int idade, bom = 0, regular = 0, excelente = 0, opcao, i;
    float mediaIdade = 0, percBom;

    for (i = 1; i <= 20; i++)
    {
        printf("Digite a idade: ");
        scanf("%d", &idade);
        printf("Responda sua opniao sobre o filme: \n");
        printf("1 - regular \t");
        printf("2 - bom \t");
        printf("3 - excelente \n");
        scanf("%d", &opcao);
        if (opcao == 1)
            regular++;
        else if (opcao == 2)
            bom++;
        else
        {
            mediaIdade += idade;
            excelente++;
        }
    }
    mediaIdade = mediaIdade / excelente;
    printf("Media de idades das pessoas que responderam excelente: %f \n",
           mediaIdade);
    printf("Quantidade de pessoas que respondeream regular: %d \n", regular);
    percBom = bom;
    percBom = percBom / (i - 1);
    printf("Porcentagem de pessoas que responderam bom: %f \n", percBom);
}
