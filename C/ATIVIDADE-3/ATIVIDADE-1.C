/**
 * @author Robson Paiva (robson-costa@outlook.com.br)
 * @version 0.1
 */
/*01. Faça um programa em C que efetue a apresentação do valor da conversão em real (R$) de um valor lido em dólar (US$). Para isso, será necessário também ler o valor da cotação do dólar.*/

#include <stdio.h>
#include <stdlib.h>
# include <locale.h>

int main()
{
    setlocale(LC_ALL,"");
    float cotacao, dolar;
    
    printf("Digite a quantidade de dolar que que converter: ");
    scanf("%f",&dolar);
    
    printf("Qual a cotação do dolar: ");
    scanf("%f",&cotacao);
    
    printf("com %.2f e com a cotação de %.2f da R$%.2f",dolar,cotacao, dolar*cotacao);
    
    

}