/*02. Faça um programa que leia os elementos de uma matriz do tipo inteiro com tamanho 3 X 3 e imprima os elementos multiplicando por 2.
*/

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>


int main()
{
    setlocale(LC_ALL,"Portuguese");

    int vetorA[3][3],vetorB[3][3];

    for(int i = 0; i < 3; i++)
    {
        for(int j = 0; j < 3; j++)
        {
            printf("Digite o valor para a matriz [%d][%d]",i,j);
            scanf("%d",&vetorA[i][j]);
            vetorB[i][j] = vetorA[i][j]*2;
        }

    }
    printf("\tMATRIZ DIGITADA\n");
    for(int i = 0; i < 3; i++)
    {
        for(int j = 0; j < 3; j++)
        {
            printf("\t%d\t",vetorA[i][j]);
        }
        printf("\n");
    }
    printf("\n");
    printf("MATRIZ MULTIPLICADA POR 2\n");
    for(int i = 0; i < 3; i++)
    {
        for(int j = 0; j < 3; j++)
        {
            printf("\t%d\t",vetorB[i][j]);
        }
        printf("\n");
    }
}
