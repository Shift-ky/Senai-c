/*04. Faça um programa que permita entrar com valores em uma matriz A de tamanho 3 X 4. Gerar e imprimir uma matriz B que é o triplo da matriz A.
*/

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>


int main()
{
    setlocale(LC_ALL,"Portuguese");

    
 int A[3][4],B[3][4],i,j;
    printf("\nDigite os 12 numeros da matriz:\n");
    for(i=0;i<3;i++){
        for(j=0;j<4;j++){
            scanf("%i",&A[i][j]);
            B[i][j]=A[i][j]*3;
        }
    }
    for(i=0;i<3;i++){
        for(j=0;j<4;j++){
            printf("%i ",B[i][j]);
        }
        printf("\n");
    }

}




