/*02. A polícia rodoviária resolveu fazer cumprir a lei e vistoriar veículos para cobrar
dos motoristas o DUT. Sabendo-se que o mês em que o emplacamento do carro deve ser renovado
é determinado pelo último número da placa do mesmo, faça um programa que, a partir da leitura
da placa do carro, informe o mês em que o emplacamento deve ser renovado.
*/

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>


int main()
{
    setlocale(LC_ALL,"Portuguese");

    int placa;

    printf("Digite o final da sua placa ");
    scanf("%d",&placa);

    if(placa == 0){
        printf("o mês de pagamento do DUT é em OUTUBRO");
    } else if (placa == 1){
        printf("o mês de pagamento do DUT é em MARCO");
    } else if (placa == 2){
        printf("o mês de pagamento do DUT é em MARCO");
    } else if (placa == 3){
        printf("o mês de pagamento do DUT é em ABRIL");
    } else if (placa == 4){
        printf("o mês de pagamento do DUT é em ABRIL");
    } else if (placa == 5){
        printf("o mês de pagamento do DUT é em MAIO");
    } else if (placa == 6){
        printf("o mês de pagamento do DUT é em JUNHO");
    } else if (placa == 7){
        printf("o mês de pagamento do DUT é em JULHO");
    } else if (placa == 8){
        printf("o mês de pagamento do DUT é em AGOSTO");
    } else if (placa == 9){
        printf("o mês de pagamento do DUT é em SETEMBRO");
    }
}

