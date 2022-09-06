/*05. Crie um programa que armazene dados inteiros em uma matriz de ordem 5 e imprima: Todos os elementos que se encontram em posições cuja linha mais coluna formam um número par.
*/

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>


int main()
{
    setlocale(LC_ALL,"Portuguese");

    
int m[5][5], i, j;

    printf("\nDigite os 25 valores da matriz:\n");
    for (i=0; i<5; i++) {
       for (j=0; j<5; j++) {
          scanf("%i", &m[i][j]);
       }
    }
    printf("\nElementos cuja linha + coluna = par:\n");
    for (i=0; i<5; i++) {
       for (j=0; j<5; j++) {
           if (((j+i) % 2) == 0)
              printf("%d \n",m[i][j]);
       }
    }
}



