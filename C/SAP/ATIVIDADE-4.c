/* 04. Construa um programa que armazene o código, a quantidade, o valor de compra e o valor de venda de 30 produtos. A listagem pode ser de todos os produtos ou somente de um ao se digitar o código.
*/

#include <stdio.h>
#include <stdlib.h>

void main(){
    int i, cod[3], qtde[3], resposta;
    float vcompra[3], venda[3];

    for (i=0; i<3; i++) {
        printf("\nDigite o codigo do produto:\n");
        scanf("%d", &cod[i]);
        printf("\nDigite a quantidade do produto:\n");
        scanf("%d", &qtde[i]);
        printf("\nDigite o valor de compra do produto:\n");
        scanf("%f", &vcompra[i]);
        printf("\nDigite o valor de venda do produto:\n");
        scanf("%f", &vvenda[i]);
    }

        printf("\n1 - Verificar todos os produtos\n");
        printf("\n2 - Verificar um produto por codigo\n");
        scanf("%d", &resposta);
        if (resposta == 1) {
            printf("\nCodigo \t Quantidade \t Valor Compra \t Valor Venda \n");
                for (i=0; i<3; i++) {
                    printf("%d \t",cod[i]);
                    printf("%d \t\t",qtde[i]);
                    printf("%f \t",vcompra[i]);
                    printf("%f \n",vvenda[i]);
                }
        }else if (resposta == 2) {
            printf("\nDigite o codigo do produto:\n");
            scanf("%d", &resposta);
            printf("\nCodigo \t Quantidade \t Valor Compra \t Valor Venda \n");
                for (i=0; i<3; i++) {
                    if (codigo[i] == resposta) {
                        printf("%d \t",cod[i]);
                        printf("%d \t\t",qtde[i]);
                        printf("%f \t",vcompra[i]);
                        printf("%f \n",vvenda[i]);
                        break;
                    }
                }
        }else
            printf("Opcao invalida! \n");
 }