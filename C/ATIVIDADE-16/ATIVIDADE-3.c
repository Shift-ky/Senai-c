/*03. Construa um programa que armazene dados em uma matriz de ordem 4 e imprima: Todos os elementos com números ímpares.
*/

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>


int main()
{
    setlocale(LC_ALL,"Portuguese");

    int vetor[4][4];

    for(int i =0; i < 4; i++)
    {
        for(int j = 0; j < 4; j++)
        {
            printf("Digite o valor da matriz [%d][%d]: ",i,j);
            scanf("%d",&vetor[i][j]);
        }
    }
    printf("\tTODOS OS VALORES ÍMPARES DA MATRIZ\n");
    for(int i =0; i <4; i++)
    {
        for(int j = 0; j < 4; j++)
        {
            if(vetor[i][j] %2 == 1)
            {
                printf("\t%d\t",vetor[i][j]);
            }
        }
        printf("\n");
    }
}

