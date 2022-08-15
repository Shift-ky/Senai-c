/*03. Faça um programa em C que leia o saldo de uma conta poupança e imprima o novo saldo, 
considerando um reajuste de 2%.*/

#include <stdio.h>
#include <locale.h>

void main()
{
    setlocale(LC_ALL,"Portuguese");
    float saldo, reajuste;

    printf("Digite o saldo da sua conta: ");
    scanf("%f",&saldo);

    reajuste = saldo * 1.02;

    printf("O seu saldo com o reajuste é de R$%2.f",reajuste);
}
