/**
 * @author Robson Paiva (robson-costa@outlook.com.br)
 * @version 0.1
 *
 */

/*
06. Faça um programa em C que calcule o valor de uma prestação em atraso. Para isso, o programa deve ler o valor da prestação vencida, a taxa periódica de juros e o período de atraso. Ao final, o programa deve imprimir o valor da prestação atrasada, o período de atraso, os juros que serão cobrados pelo período de atraso, o valor da prestação acrescido dos juros. Considere juros simples.
*/

#include <stdio.h>
#include <stdlib.h>
# include <locale.h>

int main()
{
    setlocale(LC_ALL,"");
    float prestacao,juros;
    int taxa,dias;

        printf("Informe o valor da pretação: ");
        scanf("%f",&prestacao);

        printf("Qual a taxa periótica: ");
        scanf("%d",&taxa);

        printf("Quantos dias de atraso: ");
        scanf("%i",&dias);
    
        juros = prestacao * (dias*(prestacao*taxa/100));

        printf("O novo valor da prestação para pagar é de %.2f",juros);


}
