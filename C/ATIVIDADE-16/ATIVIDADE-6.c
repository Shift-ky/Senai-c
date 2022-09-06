/*06. A gerente do cabeleireiro Sempre Bela tem uma tabela em que registra as quantidades de serviços executados nos "pes", nas "mãos"e o serviço de podologia das cinco manicures. Sabendo-se que cada uma ganha 50% do que faturou ao mês, criar um programa que possa calcular e imprimir quanto cada uma vai receber, uma vez que não têm carteiras assinadas, os valores, respectivamente,
são: R$10,00, R$15,00 e R$30,00.*/

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>


int main()
{
    setlocale(LC_ALL,"Portuguese");

    int manicure=0, servico;
    int servicos[5][3], i, j, soma;
    //zerando a tabela de servicos
    for (i=0; i<5; i++) {
        for (j=0; j<3; j++){
            servicos[i][j]=0;
        }
    }
    //fazendo a leitura dos servicos
    do {
       printf("Informe a manicure <1-5>:\n");
       scanf("%d", &manicure);
       printf("Informe o servico <1-pe 2-mao 3-podologia>:\n");
       scanf("%d", &servico);
       if (manicure >= 1 && manicure <=5) {
          if (servico >= 1 && servico <= 3)
             servicos[manicure-1][servico-1]++;
          else
             printf("Servico invalido!\n");
       }else{
           printf("Manicure invalida!\n");
       }
    } while (manicure != 0);
    //calculando e imprimindo o faturamento
    printf("\nFaturamento das manicures:\n");
    for (i=0; i<5; i++) {
      soma = servicos[i][0] * 10;
      soma += servicos[i][1] * 15;
      soma += servicos[i][2] * 30;
      printf("\nManicure %d: %d\n", i+1, soma);
    }
}
