/*01. Faça um programa em C que leia os elementos de uma matriz do tipo inteiro comtamanho 10 X 10. Ao final, imprima todos os elementos.
*/

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>


int main()
{
    setlocale(LC_ALL,"Portuguese");

    int vetorA[10][10];

    for(int i = 0; i < 3; i++)
    {
        for(int j = 0; j < 3; j++)
        {
            printf("Digite o valor para a matriz [%d][%d]",i,j);
            scanf("%d",&vetorA[i][j]);
        }
    }
    printf("\t\t\tMATRIZ\n");
    for(int i = 0; i < 3; i++)
    {
        for(int j = 0; j < 3; j++)
        {
            printf("\t%d\t",vetorA[i][j]);
        }
        printf("\n");
    }

}
