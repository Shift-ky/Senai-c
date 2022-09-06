/*02. Faça um programa em C que armazene as 3 notas de 4 alunos. Após a leitura o programa deve calcular a nota final com o somatório das três notas. Ao final deve imprimir as notas e a nota final para cada aluno.*/

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>


int main()
{
    setlocale(LC_ALL,"Portuguese");

    float notas[4][4];
    char nome[15][15];
    int i, j;

    for (i = 0; i < 4; i++)
    {
        printf("Digite o nome do aluno: ");
        scanf(" %s",&nome[i]);

        for(j = 0; j < 3; j++)
        {
            printf("Digite a %d nota do %s: ",i+1,nome[i]);
            scanf("%f",&notas[i][j]);
        }
        notas[i][3] = notas[i][0] + notas[i][1] + notas[i][2];
        system("cls");
    }

    for(i = 0; i < 4; i++)
    {
        printf("\n\tALUNO(A): %s",nome[i]);
        for(j = 0; j < 3; j++)
        {
            printf("\nNota %d foi %.1f\n\n",i+1,notas[i][3]);
        }
        printf("\n\t A media do %d aluno foi de %.2f\n\n",i+1,notas[i][3]);
    }
}


