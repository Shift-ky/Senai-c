/*03. A prefeitura contratou uma firma especializada para manter os níveis
de poluição considerados ideais para um país do 1º mundo. As indústrias, 
maiores responsáveis pela poluição, foram classificadas em três grupos. 
Sabendo-se que a escala utilizada varia de 0,05 e que o índice de poluição 
aceitável é até 0,25, fazer um programa que possa imprimir intimações de acordo 
com o índice e a tabela a seguir:
Índice        Indústrias que receberão intimação 
0,3            1º grupo 
0,4            1º e 2º grupos 
0,5            1º, 2º e 3º grupos  
*/

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>


int main()
{
    setlocale(LC_ALL,"Portuguese");
    float indice;

    printf("==================================\n");
    printf("===== FISCALIZAÇÃO AMBIENTAL =====\n");
    printf("==================================\n");

    printf("Digite o índice de pluição: ");
    scanf("%f",&indice);

    if(indice > 0.5){
        printf("SUSPENDER AS ATIVIDADES INDUSTRIAIS DO 1º 2º E DO 3º GRUPO");
    } else if(indice >= 4){
        printf("SUSPENDER AS ATIVIDADES INDUSTRIAIS DO 1º E 2º GRUPO");
    } else if(indice >= 0.3){
        printf("SUSPENDER AS ATIVIDADES INDUSTRIAIS DO 1º GRUPO");
    } else {
        printf("ATIVIDADES INDUSTRIAIS PODEM FUNCIONAR NORMALMENTE");
    }
}

